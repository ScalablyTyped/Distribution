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
    atom: js.Function0[jodataLib.jo],
    custom: js.Function1[java.lang.String, jodataLib.jo],
    json: js.Function0[jodataLib.jo],
    xml: js.Function0[jodataLib.jo]
  ): FormatOptions = {
    val __obj = js.Dynamic.literal(atom = atom, custom = custom, json = json, xml = xml)
  
    __obj.asInstanceOf[FormatOptions]
  }
}

