package typings.jsDashData

import typings.jsDashData.jsDashDataMod.SchemaValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayInteger extends js.Object {
  def array(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def integer(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def number(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def numeric(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def `object`(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def string(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
}

object Anon_ArrayInteger {
  @scala.inline
  def apply(
    array: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    integer: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    number: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    numeric: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    `object`: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    string: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]
  ): Anon_ArrayInteger = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction3(array), integer = js.Any.fromFunction3(integer), number = js.Any.fromFunction3(number), numeric = js.Any.fromFunction3(numeric), string = js.Any.fromFunction3(string))
    __obj.updateDynamic("object")(js.Any.fromFunction3(`object`))
    __obj.asInstanceOf[Anon_ArrayInteger]
  }
}

