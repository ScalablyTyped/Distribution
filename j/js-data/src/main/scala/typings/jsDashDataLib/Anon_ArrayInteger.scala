package typings
package jsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayInteger extends js.Object {
  def array(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def integer(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def number(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def numeric(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def `object`(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def string(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
}

object Anon_ArrayInteger {
  @scala.inline
  def apply(
    array: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    integer: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    number: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    numeric: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    `object`: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    string: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]]
  ): Anon_ArrayInteger = {
    val __obj = js.Dynamic.literal(array = array, integer = integer, number = number, numeric = numeric, string = string)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_ArrayInteger]
  }
}

