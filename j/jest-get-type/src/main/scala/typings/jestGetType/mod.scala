package typings.jestGetType

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-get-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getType(value: Any): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(value.asInstanceOf[js.Any]).asInstanceOf[ValueType]
  
  inline def isPrimitive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestGetType.jestGetTypeStrings.array
    - typings.jestGetType.jestGetTypeStrings.bigint
    - typings.jestGetType.jestGetTypeStrings.boolean
    - typings.jestGetType.jestGetTypeStrings.function
    - typings.jestGetType.jestGetTypeStrings.`null`
    - typings.jestGetType.jestGetTypeStrings.number
    - typings.jestGetType.jestGetTypeStrings.`object`
    - typings.jestGetType.jestGetTypeStrings.regexp
    - typings.jestGetType.jestGetTypeStrings.map
    - typings.jestGetType.jestGetTypeStrings.set
    - typings.jestGetType.jestGetTypeStrings.date
    - typings.jestGetType.jestGetTypeStrings.string
    - typings.jestGetType.jestGetTypeStrings.symbol
    - typings.jestGetType.jestGetTypeStrings.undefined
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def array: typings.jestGetType.jestGetTypeStrings.array = "array".asInstanceOf[typings.jestGetType.jestGetTypeStrings.array]
    
    inline def bigint: typings.jestGetType.jestGetTypeStrings.bigint = "bigint".asInstanceOf[typings.jestGetType.jestGetTypeStrings.bigint]
    
    inline def boolean: typings.jestGetType.jestGetTypeStrings.boolean = "boolean".asInstanceOf[typings.jestGetType.jestGetTypeStrings.boolean]
    
    inline def date: typings.jestGetType.jestGetTypeStrings.date = "date".asInstanceOf[typings.jestGetType.jestGetTypeStrings.date]
    
    inline def function: typings.jestGetType.jestGetTypeStrings.function = "function".asInstanceOf[typings.jestGetType.jestGetTypeStrings.function]
    
    inline def map: typings.jestGetType.jestGetTypeStrings.map = "map".asInstanceOf[typings.jestGetType.jestGetTypeStrings.map]
    
    inline def `null`: typings.jestGetType.jestGetTypeStrings.`null` = "null".asInstanceOf[typings.jestGetType.jestGetTypeStrings.`null`]
    
    inline def number: typings.jestGetType.jestGetTypeStrings.number = "number".asInstanceOf[typings.jestGetType.jestGetTypeStrings.number]
    
    inline def `object`: typings.jestGetType.jestGetTypeStrings.`object` = "object".asInstanceOf[typings.jestGetType.jestGetTypeStrings.`object`]
    
    inline def regexp: typings.jestGetType.jestGetTypeStrings.regexp = "regexp".asInstanceOf[typings.jestGetType.jestGetTypeStrings.regexp]
    
    inline def set: typings.jestGetType.jestGetTypeStrings.set = "set".asInstanceOf[typings.jestGetType.jestGetTypeStrings.set]
    
    inline def string: typings.jestGetType.jestGetTypeStrings.string = "string".asInstanceOf[typings.jestGetType.jestGetTypeStrings.string]
    
    inline def symbol: typings.jestGetType.jestGetTypeStrings.symbol = "symbol".asInstanceOf[typings.jestGetType.jestGetTypeStrings.symbol]
    
    inline def undefined: typings.jestGetType.jestGetTypeStrings.undefined = "undefined".asInstanceOf[typings.jestGetType.jestGetTypeStrings.undefined]
  }
}
