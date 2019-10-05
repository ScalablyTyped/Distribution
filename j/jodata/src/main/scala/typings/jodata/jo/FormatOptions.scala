package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  def atom(): typings.jodata.jo
  def custom(value: String): typings.jodata.jo
  def json(): typings.jodata.jo
  def xml(): typings.jodata.jo
}

object FormatOptions {
  @scala.inline
  def apply(
    atom: () => typings.jodata.jo,
    custom: String => typings.jodata.jo,
    json: () => typings.jodata.jo,
    xml: () => typings.jodata.jo
  ): FormatOptions = {
    val __obj = js.Dynamic.literal(atom = js.Any.fromFunction0(atom), custom = js.Any.fromFunction1(custom), json = js.Any.fromFunction0(json), xml = js.Any.fromFunction0(xml))
  
    __obj.asInstanceOf[FormatOptions]
  }
}

