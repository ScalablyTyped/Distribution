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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternatives extends StObject {
  
  var alternatives: AlternativesSchema
  
  var any: AnySchema[Any]
  
  var array: ArraySchema
  
  var binary: BinarySchema
  
  var boolean: BooleanSchema
  
  var date: DateSchema
  
  var function: FunctionSchema
  
  var link: LinkSchema
  
  var number: NumberSchema
  
  var `object`: ObjectSchema[Any]
  
  var string: StringSchema
  
  var symbol: SymbolSchema
}
object Alternatives {
  
  inline def apply(
    alternatives: AlternativesSchema,
    any: AnySchema[Any],
    array: ArraySchema,
    binary: BinarySchema,
    boolean: BooleanSchema,
    date: DateSchema,
    function: FunctionSchema,
    link: LinkSchema,
    number: NumberSchema,
    `object`: ObjectSchema[Any],
    string: StringSchema,
    symbol: SymbolSchema
  ): Alternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternatives]
  }
  
  extension [Self <: Alternatives](x: Self) {
    
    inline def setAlternatives(value: AlternativesSchema): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAny(value: AnySchema[Any]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setArray(value: ArraySchema): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setBinary(value: BinarySchema): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBoolean(value: BooleanSchema): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setDate(value: DateSchema): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: FunctionSchema): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setLink(value: LinkSchema): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: NumberSchema): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObjectSchema[Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setString(value: StringSchema): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: SymbolSchema): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
