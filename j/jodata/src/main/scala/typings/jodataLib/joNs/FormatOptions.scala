package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  def atom(): jodataLib.jo
  def custom(value: java.lang.String): jodataLib.jo
  def json(): jodataLib.jo
  def xml(): jodataLib.jo
}

object FormatOptions {
  @scala.inline
  def apply(
    atom: () => jodataLib.jo,
    custom: java.lang.String => jodataLib.jo,
    json: () => jodataLib.jo,
    xml: () => jodataLib.jo
  ): FormatOptions = {
    val __obj = js.Dynamic.literal(atom = js.Any.fromFunction0(atom), custom = js.Any.fromFunction1(custom), json = js.Any.fromFunction0(json), xml = js.Any.fromFunction0(xml))
  
    __obj.asInstanceOf[FormatOptions]
  }
}

