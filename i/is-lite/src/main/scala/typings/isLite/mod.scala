package typings.isLite

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.isLite.isLiteStrings.Array
import typings.isLite.isLiteStrings.AsyncFunction
import typings.isLite.isLiteStrings.Date
import typings.isLite.isLiteStrings.Error
import typings.isLite.isLiteStrings.Function
import typings.isLite.isLiteStrings.Generator
import typings.isLite.isLiteStrings.GeneratorFunction
import typings.isLite.isLiteStrings.Iterable
import typings.isLite.isLiteStrings.Map
import typings.isLite.isLiteStrings.Object
import typings.isLite.isLiteStrings.Promise
import typings.isLite.isLiteStrings.RegExp
import typings.isLite.isLiteStrings.Set
import typings.isLite.isLiteStrings.WeakMap
import typings.isLite.isLiteStrings.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @scala.inline
    def apply(value: js.Any): Types = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Types]
    
    @JSImport("is-lite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def array(arg: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
    
    @scala.inline
    def arrayOf(target: js.Array[js.Any], predicate: js.Function1[/* v */ js.Any, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def asyncFunction(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    @scala.inline
    def boolean(value: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(value.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
    
    @scala.inline
    def date(value: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
    
    @scala.inline
    def defined(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def domElement(value: js.Any): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("domElement")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
    
    @scala.inline
    def empty(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def error(value: js.Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
    
    @scala.inline
    def function(value: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("function")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
    
    @scala.inline
    def generator(value: js.Any): /* is std.Generator<unknown, any, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("generator")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Generator<unknown, any, unknown> */ Boolean]
    
    @scala.inline
    def generatorFunction(value: js.Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("generatorFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
    
    @scala.inline
    def instanceOf[T](instance: js.Any, class_ : Class[T]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("instanceOf")(instance.asInstanceOf[js.Any], class_.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
    
    @scala.inline
    def iterable(value: js.Any): /* is std.IterableIterator<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("iterable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.IterableIterator<unknown> */ Boolean]
    
    @scala.inline
    def map(value: js.Any): /* is std.Map<unknown, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Map<unknown, unknown> */ Boolean]
    
    @scala.inline
    def nan(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nan")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def `null`(value: js.Any): /* is null */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("null")(value.asInstanceOf[js.Any]).asInstanceOf[/* is null */ Boolean]
    
    @scala.inline
    def nullOrUndefined(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def number(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    @scala.inline
    def numericString(value: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("numericString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    @scala.inline
    def `object`(value: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
    
    @scala.inline
    def oneOf(target: js.Array[js.Any], value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(target.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def plainObject(value: js.Any): /* is is-lite.is-lite.IPlainObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("plainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is is-lite.is-lite.IPlainObject */ Boolean]
    
    @scala.inline
    def promise(value: js.Any): /* is std.Promise<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<unknown> */ Boolean]
    
    @scala.inline
    def propertyOf(target: js.Object, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyOf")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def propertyOf(target: js.Object, key: String, predicate: js.Function1[/* v */ js.Any, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyOf")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def regexp(value: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
    
    @scala.inline
    def set(value: js.Any): /* is std.Set<object> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Set<object> */ Boolean]
    
    @scala.inline
    def string(value: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    @scala.inline
    def symbol(value: js.Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(value.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
    
    @scala.inline
    def undefined(value: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("undefined")(value.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
    
    @scala.inline
    def weakMap(value: js.Any): /* is std.WeakMap<object, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("weakMap")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.WeakMap<object, unknown> */ Boolean]
    
    @scala.inline
    def weakSet(value: js.Any): /* is std.WeakSet<object> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("weakSet")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.WeakSet<object> */ Boolean]
  }
  
  @scala.inline
  def getObjectType(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectType")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Class[T] = Instantiable1[/* args (repeated) */ js.Any, T]
  
  type IPlainObject = StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.isLite.isLiteStrings.Array
    - typings.isLite.isLiteStrings.AsyncFunction
    - typings.isLite.isLiteStrings.bigint
    - typings.isLite.isLiteStrings.boolean
    - typings.isLite.isLiteStrings.Date
    - typings.isLite.isLiteStrings.Error
    - typings.isLite.isLiteStrings.Function
    - typings.isLite.isLiteStrings.Generator
    - typings.isLite.isLiteStrings.GeneratorFunction
    - typings.isLite.isLiteStrings.Iterable
    - typings.isLite.isLiteStrings.Map
    - typings.isLite.isLiteStrings.`null`
    - typings.isLite.isLiteStrings.number
    - typings.isLite.isLiteStrings.Object
    - typings.isLite.isLiteStrings.Promise
    - typings.isLite.isLiteStrings.RegExp
    - typings.isLite.isLiteStrings.Set
    - typings.isLite.isLiteStrings.string
    - typings.isLite.isLiteStrings.symbol
    - typings.isLite.isLiteStrings.undefined
    - typings.isLite.isLiteStrings.WeakMap
    - typings.isLite.isLiteStrings.WeakSet
  */
  trait Types extends StObject
  object Types {
    
    @scala.inline
    def array: Array = "Array".asInstanceOf[Array]
    
    @scala.inline
    def asyncFunction: AsyncFunction = "AsyncFunction".asInstanceOf[AsyncFunction]
    
    @scala.inline
    def bigint: typings.isLite.isLiteStrings.bigint = "bigint".asInstanceOf[typings.isLite.isLiteStrings.bigint]
    
    @scala.inline
    def boolean: typings.isLite.isLiteStrings.boolean = "boolean".asInstanceOf[typings.isLite.isLiteStrings.boolean]
    
    @scala.inline
    def date: Date = "Date".asInstanceOf[Date]
    
    @scala.inline
    def error: Error = "Error".asInstanceOf[Error]
    
    @scala.inline
    def function: Function = "Function".asInstanceOf[Function]
    
    @scala.inline
    def generator: Generator = "Generator".asInstanceOf[Generator]
    
    @scala.inline
    def generatorFunction: GeneratorFunction = "GeneratorFunction".asInstanceOf[GeneratorFunction]
    
    @scala.inline
    def iterable: Iterable = "Iterable".asInstanceOf[Iterable]
    
    @scala.inline
    def map: Map = "Map".asInstanceOf[Map]
    
    @scala.inline
    def `null`: typings.isLite.isLiteStrings.`null` = "null".asInstanceOf[typings.isLite.isLiteStrings.`null`]
    
    @scala.inline
    def number: typings.isLite.isLiteStrings.number = "number".asInstanceOf[typings.isLite.isLiteStrings.number]
    
    @scala.inline
    def `object`: Object = "Object".asInstanceOf[Object]
    
    @scala.inline
    def promise: Promise = "Promise".asInstanceOf[Promise]
    
    @scala.inline
    def regExp: RegExp = "RegExp".asInstanceOf[RegExp]
    
    @scala.inline
    def set: Set = "Set".asInstanceOf[Set]
    
    @scala.inline
    def string: typings.isLite.isLiteStrings.string = "string".asInstanceOf[typings.isLite.isLiteStrings.string]
    
    @scala.inline
    def symbol: typings.isLite.isLiteStrings.symbol = "symbol".asInstanceOf[typings.isLite.isLiteStrings.symbol]
    
    @scala.inline
    def undefined: typings.isLite.isLiteStrings.undefined = "undefined".asInstanceOf[typings.isLite.isLiteStrings.undefined]
    
    @scala.inline
    def weakMap: WeakMap = "WeakMap".asInstanceOf[WeakMap]
    
    @scala.inline
    def weakSet: WeakSet = "WeakSet".asInstanceOf[WeakSet]
  }
}
