package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends js.Object {
  def array(arg: js.Any): /* is std.Array<any> */ scala.Boolean
  def boolean(value: js.Any): scala.Boolean
  def integer(value: js.Any): scala.Boolean
  def `null`(value: js.Any): scala.Boolean
  def number(value: js.Any): scala.Boolean
  def `object`(value: js.Any): scala.Boolean
  def string(value: js.Any): scala.Boolean
}

object Boolean {
  @scala.inline
  def apply(
    array: js.Any => /* is std.Array<any> */ scala.Boolean,
    boolean: js.Any => scala.Boolean,
    integer: js.Any => scala.Boolean,
    `null`: js.Any => scala.Boolean,
    number: js.Any => scala.Boolean,
    `object`: js.Any => scala.Boolean,
    string: js.Any => scala.Boolean
  ): Boolean = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), boolean = js.Any.fromFunction1(boolean), integer = js.Any.fromFunction1(integer), number = js.Any.fromFunction1(number), string = js.Any.fromFunction1(string))
    __obj.updateDynamic("null")(js.Any.fromFunction1(`null`))
    __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
    __obj.asInstanceOf[Boolean]
  }
}

