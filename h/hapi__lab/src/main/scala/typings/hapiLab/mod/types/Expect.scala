package typings.hapiLab.mod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expect extends js.Object {
  /**
    * Assert the value to throw an argument error
    * 
    * @param value - the value being asserted.
    */
  def error[T](value: T): Unit = js.native
  /**
    * Assert the type of the value expected
    * 
    * @param value - the value being asserted.
    */
  def `type`[T](value: T): Unit = js.native
}

object Expect {
  @scala.inline
  def apply(error: js.Any => Unit, `type`: js.Any => Unit): Expect = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Expect]
  }
  @scala.inline
  implicit class ExpectOps[Self <: Expect] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: js.Any => Unit): Self = this.set("type", js.Any.fromFunction1(value))
  }
  
}

