package typings.jsDashData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  def array(value: js.Any): Boolean
  def boolean(value: js.Any): Boolean
  def integer(value: js.Any): Boolean
  def `null`(value: js.Any): Boolean
  def number(value: js.Any): Boolean
  def `object`(value: js.Any): Boolean
  def string(value: js.Any): Boolean
}

object Anon_Array {
  @scala.inline
  def apply(
    array: js.Any => Boolean,
    boolean: js.Any => Boolean,
    integer: js.Any => Boolean,
    `null`: js.Any => Boolean,
    number: js.Any => Boolean,
    `object`: js.Any => Boolean,
    string: js.Any => Boolean
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), boolean = js.Any.fromFunction1(boolean), integer = js.Any.fromFunction1(integer), number = js.Any.fromFunction1(number), string = js.Any.fromFunction1(string))
    __obj.updateDynamic("null")(js.Any.fromFunction1(`null`))
    __obj.updateDynamic("object")(js.Any.fromFunction1(`object`))
    __obj.asInstanceOf[Anon_Array]
  }
}

