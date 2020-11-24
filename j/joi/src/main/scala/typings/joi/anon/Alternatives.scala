package typings.joi.anon

import typings.joi.mod.AlternativesSchema
import typings.joi.mod.AnySchema
import typings.joi.mod.ArraySchema
import typings.joi.mod.BinarySchema
import typings.joi.mod.BooleanSchema
import typings.joi.mod.DateSchema
import typings.joi.mod.FunctionSchema
import typings.joi.mod.LinkSchema
import typings.joi.mod.NumberSchema
import typings.joi.mod.ObjectSchema
import typings.joi.mod.StringSchema
import typings.joi.mod.SymbolSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alternatives extends js.Object {
  
  var alternatives: AlternativesSchema = js.native
  
  var any: AnySchema = js.native
  
  var array: ArraySchema = js.native
  
  var binary: BinarySchema = js.native
  
  var boolean: BooleanSchema = js.native
  
  var date: DateSchema = js.native
  
  var function: FunctionSchema = js.native
  
  var link: LinkSchema = js.native
  
  var number: NumberSchema = js.native
  
  var `object`: ObjectSchema[_] = js.native
  
  var string: StringSchema = js.native
  
  var symbol: SymbolSchema = js.native
}
object Alternatives {
  
  @scala.inline
  def apply(
    alternatives: AlternativesSchema,
    any: AnySchema,
    array: ArraySchema,
    binary: BinarySchema,
    boolean: BooleanSchema,
    date: DateSchema,
    function: FunctionSchema,
    link: LinkSchema,
    number: NumberSchema,
    `object`: ObjectSchema[_],
    string: StringSchema,
    symbol: SymbolSchema
  ): Alternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternatives]
  }
  
  @scala.inline
  implicit class AlternativesOps[Self <: Alternatives] (val x: Self) extends AnyVal {
    
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
    def setAlternatives(value: AlternativesSchema): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAny(value: AnySchema): Self = this.set("any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArray(value: ArraySchema): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinary(value: BinarySchema): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: BooleanSchema): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: DateSchema): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: FunctionSchema): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: LinkSchema): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: NumberSchema): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObjectSchema[_]): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: StringSchema): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: SymbolSchema): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
