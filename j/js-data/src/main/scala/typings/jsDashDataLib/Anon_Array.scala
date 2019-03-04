package typings
package jsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  def array(value: js.Any): scala.Boolean
  def boolean(value: js.Any): scala.Boolean
  def integer(value: js.Any): scala.Boolean
  def `null`(value: js.Any): scala.Boolean
  def number(value: js.Any): scala.Boolean
  def `object`(value: js.Any): scala.Boolean
  def string(value: js.Any): scala.Boolean
}

object Anon_Array {
  @scala.inline
  def apply(
    array: js.Function1[js.Any, scala.Boolean],
    boolean: js.Function1[js.Any, scala.Boolean],
    integer: js.Function1[js.Any, scala.Boolean],
    `null`: js.Function1[js.Any, scala.Boolean],
    number: js.Function1[js.Any, scala.Boolean],
    `object`: js.Function1[js.Any, scala.Boolean],
    string: js.Function1[js.Any, scala.Boolean]
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(array = array, boolean = boolean, integer = integer, number = number, string = string)
    __obj.updateDynamic("null")(`null`)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_Array]
  }
}

