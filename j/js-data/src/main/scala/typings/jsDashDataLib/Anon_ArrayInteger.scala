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
    array: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    integer: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    number: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    numeric: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    `object`: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    string: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  ): Anon_ArrayInteger = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction3(array), integer = js.Any.fromFunction3(integer), number = js.Any.fromFunction3(number), numeric = js.Any.fromFunction3(numeric), string = js.Any.fromFunction3(string))
    __obj.updateDynamic("object")(js.Any.fromFunction3(`object`))
    __obj.asInstanceOf[Anon_ArrayInteger]
  }
}

