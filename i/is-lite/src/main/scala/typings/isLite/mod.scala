package typings.isLite

import org.scalablytyped.runtime.Instantiable1
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(value: Any): TypeName = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[TypeName]
    
    @JSImport("is-lite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("is-lite", "default._a")
    @js.native
    def a: js.Function1[/* value */ Any, /* is std.Function */ Boolean] = js.native
    
    inline def a_=(x: js.Function1[/* value */ Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_a")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.array")
    @js.native
    def array: js.Function1[/* arg */ Any, /* is std.Array<any> */ Boolean] = js.native
    
    @JSImport("is-lite", "default.arrayOf")
    @js.native
    def arrayOf: js.Function2[
        /* target */ js.Array[Any], 
        /* predicate */ js.Function1[/* v */ Any, Boolean], 
        Boolean
      ] = js.native
    inline def arrayOf_=(
      x: js.Function2[
          /* target */ js.Array[Any], 
          /* predicate */ js.Function1[/* v */ Any, Boolean], 
          Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayOf")(x.asInstanceOf[js.Any])
    
    inline def array_=(x: js.Function1[/* arg */ Any, /* is std.Array<any> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("array")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.asyncFunction")
    @js.native
    def asyncFunction: js.Function1[/* value */ Any, /* is std.Function */ Boolean] = js.native
    inline def asyncFunction_=(x: js.Function1[/* value */ Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.asyncGeneratorFunction")
    @js.native
    def asyncGeneratorFunction: js.Function1[/* value */ Any, Boolean] = js.native
    inline def asyncGeneratorFunction_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncGeneratorFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default._b")
    @js.native
    def b: js.Function1[/* value */ Any, /* is null */ Boolean] = js.native
    
    inline def b_=(x: js.Function1[/* value */ Any, /* is null */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_b")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.bigint")
    @js.native
    def bigint: js.Function1[/* value */ Any, /* is bigint */ Boolean] = js.native
    inline def bigint_=(x: js.Function1[/* value */ Any, /* is bigint */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bigint")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.boolean")
    @js.native
    def boolean: js.Function1[/* value */ Any, /* is boolean */ Boolean] = js.native
    inline def boolean_=(x: js.Function1[/* value */ Any, /* is boolean */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boolean")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.date")
    @js.native
    def date: js.Function1[/* value */ Any, /* is std.Date */ Boolean] = js.native
    inline def date_=(x: js.Function1[/* value */ Any, /* is std.Date */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.defined")
    @js.native
    def defined: js.Function1[/* value */ Any, Boolean] = js.native
    inline def defined_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defined")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.domElement")
    @js.native
    def domElement: js.Function1[/* value */ Any, /* is std.HTMLElement */ Boolean] = js.native
    inline def domElement_=(x: js.Function1[/* value */ Any, /* is std.HTMLElement */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domElement")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.empty")
    @js.native
    def empty: js.Function1[/* value */ Any, Boolean] = js.native
    inline def empty_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.error")
    @js.native
    def error: js.Function1[/* value */ Any, /* is std.Error */ Boolean] = js.native
    inline def error_=(x: js.Function1[/* value */ Any, /* is std.Error */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.generator")
    @js.native
    def generator: js.Function1[/* value */ Any, /* is std.Generator<unknown, any, unknown> */ Boolean] = js.native
    
    @JSImport("is-lite", "default.generatorFunction")
    @js.native
    def generatorFunction: js.Function1[/* value */ Any, /* is std.GeneratorFunction */ Boolean] = js.native
    inline def generatorFunction_=(x: js.Function1[/* value */ Any, /* is std.GeneratorFunction */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generatorFunction")(x.asInstanceOf[js.Any])
    
    inline def generator_=(x: js.Function1[/* value */ Any, /* is std.Generator<unknown, any, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("generator")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.instanceOf")
    @js.native
    def instanceOf: js.Function2[/* instance */ Any, /* class_ */ Class[Any], /* is any */ Boolean] = js.native
    inline def instanceOf_=(x: js.Function2[/* instance */ Any, /* class_ */ Class[Any], /* is any */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instanceOf")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.iterable")
    @js.native
    def iterable: js.Function1[/* value */ Any, /* is std.IterableIterator<unknown> */ Boolean] = js.native
    inline def iterable_=(x: js.Function1[/* value */ Any, /* is std.IterableIterator<unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iterable")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.map")
    @js.native
    def map: js.Function1[/* value */ Any, /* is std.Map<unknown, unknown> */ Boolean] = js.native
    inline def map_=(x: js.Function1[/* value */ Any, /* is std.Map<unknown, unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.nan")
    @js.native
    def nan: js.Function1[/* value */ Any, Boolean] = js.native
    inline def nan_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nan")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.nullOrUndefined")
    @js.native
    def nullOrUndefined: js.Function1[/* value */ Any, Boolean] = js.native
    inline def nullOrUndefined_=(x: js.Function1[/* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullOrUndefined")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.number")
    @js.native
    def number: js.Function1[/* value */ Any, /* is number */ Boolean] = js.native
    inline def number_=(x: js.Function1[/* value */ Any, /* is number */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("number")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.numericString")
    @js.native
    def numericString: js.Function1[/* value */ Any, /* is string */ Boolean] = js.native
    inline def numericString_=(x: js.Function1[/* value */ Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numericString")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.object")
    @js.native
    val `object`: js.Function1[/* value */ Any, /* is object */ Boolean] = js.native
    
    @JSImport("is-lite", "default.oneOf")
    @js.native
    def oneOf: js.Function2[/* target */ js.Array[Any], /* value */ Any, Boolean] = js.native
    inline def oneOf_=(x: js.Function2[/* target */ js.Array[Any], /* value */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oneOf")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.plainFunction")
    @js.native
    def plainFunction: js.Function1[/* value */ Any, /* is std.Function */ Boolean] = js.native
    inline def plainFunction_=(x: js.Function1[/* value */ Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plainFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.plainObject")
    @js.native
    def plainObject: js.Function1[/* value */ Any, /* is is-lite.is-lite.PlainObject */ Boolean] = js.native
    inline def plainObject_=(x: js.Function1[/* value */ Any, /* is is-lite.is-lite.PlainObject */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plainObject")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.primitive")
    @js.native
    def primitive: js.Function1[/* value */ Any, /* is is-lite.is-lite.Primitive */ Boolean] = js.native
    inline def primitive_=(x: js.Function1[/* value */ Any, /* is is-lite.is-lite.Primitive */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primitive")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.promise")
    @js.native
    def promise: js.Function1[/* value */ Any, /* is std.Promise<unknown> */ Boolean] = js.native
    inline def promise_=(x: js.Function1[/* value */ Any, /* is std.Promise<unknown> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promise")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.propertyOf")
    @js.native
    def propertyOf: js.Function3[
        /* target */ PlainObject, 
        /* key */ String, 
        /* predicate */ js.UndefOr[js.Function1[/* v */ Any, Boolean]], 
        Boolean
      ] = js.native
    inline def propertyOf_=(
      x: js.Function3[
          /* target */ PlainObject, 
          /* key */ String, 
          /* predicate */ js.UndefOr[js.Function1[/* v */ Any, Boolean]], 
          Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propertyOf")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.regexp")
    @js.native
    def regexp: js.Function1[/* value */ Any, /* is std.RegExp */ Boolean] = js.native
    inline def regexp_=(x: js.Function1[/* value */ Any, /* is std.RegExp */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.set")
    @js.native
    def set: js.Function1[/* value */ Any, /* is std.Set<is-lite.is-lite.PlainObject> */ Boolean] = js.native
    inline def set_=(x: js.Function1[/* value */ Any, /* is std.Set<is-lite.is-lite.PlainObject> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.string")
    @js.native
    def string: js.Function1[/* value */ Any, /* is string */ Boolean] = js.native
    inline def string_=(x: js.Function1[/* value */ Any, /* is string */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.symbol")
    @js.native
    def symbol: js.Function1[/* value */ Any, /* is symbol */ Boolean] = js.native
    inline def symbol_=(x: js.Function1[/* value */ Any, /* is symbol */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.undefined")
    @js.native
    def undefined: js.Function1[/* value */ Any, /* is undefined */ Boolean] = js.native
    inline def undefined_=(x: js.Function1[/* value */ Any, /* is undefined */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.weakMap")
    @js.native
    def weakMap: js.Function1[
        /* value */ Any, 
        /* is std.WeakMap<is-lite.is-lite.PlainObject, unknown> */ Boolean
      ] = js.native
    inline def weakMap_=(
      x: js.Function1[
          /* value */ Any, 
          /* is std.WeakMap<is-lite.is-lite.PlainObject, unknown> */ Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weakMap")(x.asInstanceOf[js.Any])
    
    @JSImport("is-lite", "default.weakSet")
    @js.native
    def weakSet: js.Function1[/* value */ Any, /* is std.WeakSet<is-lite.is-lite.PlainObject> */ Boolean] = js.native
    inline def weakSet_=(x: js.Function1[/* value */ Any, /* is std.WeakSet<is-lite.is-lite.PlainObject> */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weakSet")(x.asInstanceOf[js.Any])
  }
  
  inline def getObjectType(value: Any): js.UndefOr[ObjectTypes] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectType")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ObjectTypes]]
  
  type Class[T] = Instantiable1[/* arguments_ (repeated) */ Any, T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.isLite.isLiteStrings.Array
    - typings.isLite.isLiteStrings.ArrayBuffer
    - typings.isLite.isLiteStrings.AsyncFunction
    - typings.isLite.isLiteStrings.AsyncGenerator
    - typings.isLite.isLiteStrings.AsyncGeneratorFunction
    - typings.isLite.isLiteStrings.Date
    - typings.isLite.isLiteStrings.Error
    - typings.isLite.isLiteStrings.Function
    - typings.isLite.isLiteStrings.Generator
    - typings.isLite.isLiteStrings.GeneratorFunction
    - typings.isLite.isLiteStrings.HTMLElement
    - typings.isLite.isLiteStrings.Map
    - typings.isLite.isLiteStrings.Object
    - typings.isLite.isLiteStrings.Promise
    - typings.isLite.isLiteStrings.RegExp
    - typings.isLite.isLiteStrings.Set
    - typings.isLite.isLiteStrings.WeakMap
    - typings.isLite.isLiteStrings.WeakSet
  */
  trait ObjectTypes
    extends StObject
       with TypeName
  
  type PlainObject = Record[Double | String | js.Symbol, Any]
  
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
  
  /* Rewritten from type alias, can be one of: 
    - typings.isLite.isLiteStrings.bigint
    - typings.isLite.isLiteStrings.boolean
    - typings.isLite.isLiteStrings.`null`
    - typings.isLite.isLiteStrings.number
    - typings.isLite.isLiteStrings.string
    - typings.isLite.isLiteStrings.symbol
    - typings.isLite.isLiteStrings.undefined
  */
  trait PrimitiveTypes
    extends StObject
       with TypeName
  
  /* Rewritten from type alias, can be one of: 
    - typings.isLite.mod.ObjectTypes
    - typings.isLite.mod.PrimitiveTypes
  */
  trait TypeName extends StObject
}
