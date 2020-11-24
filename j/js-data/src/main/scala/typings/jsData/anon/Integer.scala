package typings.jsData.anon

import typings.jsData.mod.SchemaValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Integer extends js.Object {
  
  def array(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def integer(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def number(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def numeric(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def `object`(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
  
  def string(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
}
object Integer {
  
  @scala.inline
  def apply(
    array: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    integer: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    number: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    numeric: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    `object`: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    string: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]
  ): Integer = {
    val __obj = js.Dynamic.literal(array = js.Any.fromFunction3(array), integer = js.Any.fromFunction3(integer), number = js.Any.fromFunction3(number), numeric = js.Any.fromFunction3(numeric), string = js.Any.fromFunction3(string))
    __obj.updateDynamic("object")(js.Any.fromFunction3(`object`))
    __obj.asInstanceOf[Integer]
  }
  
  @scala.inline
  implicit class IntegerOps[Self <: Integer] (val x: Self) extends AnyVal {
    
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
    def setArray(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("array", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInteger(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("integer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNumber(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("number", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNumeric(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("numeric", js.Any.fromFunction3(value))
    
    @scala.inline
    def setObject(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("object", js.Any.fromFunction3(value))
    
    @scala.inline
    def setString(value: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError]): Self = this.set("string", js.Any.fromFunction3(value))
  }
}
