package typings.atHapiLab.atHapiLabMod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expect extends js.Object {
  /**
    * Assert the value to throw an argument error
    * 
    * @param value - the value being asserted.
    */
  def error[T](value: T): Unit
  /**
    * Assert the type of the value expected
    * 
    * @param value - the value being asserted.
    */
  def `type`[T](value: T): Unit
}

object Expect {
  @scala.inline
  def apply(error: js.Any => Unit, `type`: js.Any => Unit): Expect = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Expect]
  }
}

