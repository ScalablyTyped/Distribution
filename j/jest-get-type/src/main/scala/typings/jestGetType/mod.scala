package typings.jestGetType

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: js.Any): ValueType = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[ValueType]
  
  @JSImport("jest-get-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jest-get-type", "isPrimitive")
  @js.native
  def isPrimitive: js.Function1[/* value */ js.Any, Boolean] = js.native
  @scala.inline
  def isPrimitive_=(x: js.Function1[/* value */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPrimitive")(x.asInstanceOf[js.Any])
  
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
    
    @scala.inline
    def array: typings.jestGetType.jestGetTypeStrings.array = "array".asInstanceOf[typings.jestGetType.jestGetTypeStrings.array]
    
    @scala.inline
    def bigint: typings.jestGetType.jestGetTypeStrings.bigint = "bigint".asInstanceOf[typings.jestGetType.jestGetTypeStrings.bigint]
    
    @scala.inline
    def boolean: typings.jestGetType.jestGetTypeStrings.boolean = "boolean".asInstanceOf[typings.jestGetType.jestGetTypeStrings.boolean]
    
    @scala.inline
    def date: typings.jestGetType.jestGetTypeStrings.date = "date".asInstanceOf[typings.jestGetType.jestGetTypeStrings.date]
    
    @scala.inline
    def function: typings.jestGetType.jestGetTypeStrings.function = "function".asInstanceOf[typings.jestGetType.jestGetTypeStrings.function]
    
    @scala.inline
    def map: typings.jestGetType.jestGetTypeStrings.map = "map".asInstanceOf[typings.jestGetType.jestGetTypeStrings.map]
    
    @scala.inline
    def `null`: typings.jestGetType.jestGetTypeStrings.`null` = "null".asInstanceOf[typings.jestGetType.jestGetTypeStrings.`null`]
    
    @scala.inline
    def number: typings.jestGetType.jestGetTypeStrings.number = "number".asInstanceOf[typings.jestGetType.jestGetTypeStrings.number]
    
    @scala.inline
    def `object`: typings.jestGetType.jestGetTypeStrings.`object` = "object".asInstanceOf[typings.jestGetType.jestGetTypeStrings.`object`]
    
    @scala.inline
    def regexp: typings.jestGetType.jestGetTypeStrings.regexp = "regexp".asInstanceOf[typings.jestGetType.jestGetTypeStrings.regexp]
    
    @scala.inline
    def set: typings.jestGetType.jestGetTypeStrings.set = "set".asInstanceOf[typings.jestGetType.jestGetTypeStrings.set]
    
    @scala.inline
    def string: typings.jestGetType.jestGetTypeStrings.string = "string".asInstanceOf[typings.jestGetType.jestGetTypeStrings.string]
    
    @scala.inline
    def symbol: typings.jestGetType.jestGetTypeStrings.symbol = "symbol".asInstanceOf[typings.jestGetType.jestGetTypeStrings.symbol]
    
    @scala.inline
    def undefined: typings.jestGetType.jestGetTypeStrings.undefined = "undefined".asInstanceOf[typings.jestGetType.jestGetTypeStrings.undefined]
  }
}
