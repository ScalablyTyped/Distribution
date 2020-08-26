package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boolean extends js.Object {
  def array(arg: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def boolean(value: js.Any): scala.Boolean = js.native
  def integer(value: js.Any): scala.Boolean = js.native
  def `null`(value: js.Any): scala.Boolean = js.native
  def number(value: js.Any): scala.Boolean = js.native
  def `object`(value: js.Any): scala.Boolean = js.native
  def string(value: js.Any): scala.Boolean = js.native
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
  @scala.inline
  implicit class BooleanOps[Self <: Boolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArray(value: js.Any => /* is std.Array<any> */ scala.Boolean): Self = this.set("array", js.Any.fromFunction1(value))
    @scala.inline
    def setBoolean(value: js.Any => scala.Boolean): Self = this.set("boolean", js.Any.fromFunction1(value))
    @scala.inline
    def setInteger(value: js.Any => scala.Boolean): Self = this.set("integer", js.Any.fromFunction1(value))
    @scala.inline
    def setNull(value: js.Any => scala.Boolean): Self = this.set("null", js.Any.fromFunction1(value))
    @scala.inline
    def setNumber(value: js.Any => scala.Boolean): Self = this.set("number", js.Any.fromFunction1(value))
    @scala.inline
    def setObject(value: js.Any => scala.Boolean): Self = this.set("object", js.Any.fromFunction1(value))
    @scala.inline
    def setString(value: js.Any => scala.Boolean): Self = this.set("string", js.Any.fromFunction1(value))
  }
  
}

