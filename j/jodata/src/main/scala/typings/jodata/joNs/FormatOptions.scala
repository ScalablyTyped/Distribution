package typings.jodata.joNs

import typings.jodata.jo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  def atom(): jo
  def custom(value: String): jo
  def json(): jo
  def xml(): jo
}

object FormatOptions {
  @scala.inline
  def apply(atom: () => jo, custom: String => jo, json: () => jo, xml: () => jo): FormatOptions = {
    val __obj = js.Dynamic.literal(atom = js.Any.fromFunction0(atom), custom = js.Any.fromFunction1(custom), json = js.Any.fromFunction0(json), xml = js.Any.fromFunction0(xml))
  
    __obj.asInstanceOf[FormatOptions]
  }
}

