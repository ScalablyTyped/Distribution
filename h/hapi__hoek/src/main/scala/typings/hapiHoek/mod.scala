package typings.hapiHoek

import typings.hapiHoek.anon.OmitOptionsonce
import typings.hapiHoek.hapiHoekBooleans.`false`
import typings.hapiHoek.mod.reach.Options
import typings.std.ArrayLike
import typings.std.Partial
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/hoek", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/hoek", "Bench")
  @js.native
  open class Bench () extends StObject {
    
    /** The time in milliseconds since the object was created. */
    def elapsed(): Double = js.native
    
    /** Reset the `ts` value to now. */
    def reset(): Unit = js.native
    
    /** The starting timestamp expressed in the number of milliseconds since the epoch. */
    var ts: Double = js.native
  }
  /* static members */
  object Bench {
    
    @JSImport("@hapi/hoek", "Bench")
    @js.native
    val ^ : js.Any = js.native
    
    /** The current time in milliseconds since the epoch. */
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  }
  
  object applyToDefaults {
    
    inline def apply[T /* <: js.Object */](defaults: Partial[T]): Partial[T] = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[Partial[T]]
    inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Boolean): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Boolean, options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Null, options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Partial[T]): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Partial[T], options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    
    @JSImport("@hapi/hoek", "applyToDefaults")
    @js.native
    val ^ : js.Any = js.native
    
    trait Options extends StObject {
      
      /**
        * When true, null value from `source` overrides existing value in `target`.
        *
        * @default true
        */
      val nullOverride: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Shallow clone the specified keys.
        *
        * @default undefined
        */
      val shallow: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setNullOverride(value: Boolean): Self = StObject.set(x, "nullOverride", value.asInstanceOf[js.Any])
        
        inline def setNullOverrideUndefined: Self = StObject.set(x, "nullOverride", js.undefined)
        
        inline def setShallow(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
        
        inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
        
        inline def setShallowVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "shallow", js.Array(value*))
      }
    }
  }
  
  inline def assert(
    condition: Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  inline def assert(condition: Any, error: js.Error): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  
  inline def block(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("block")().asInstanceOf[js.Promise[Unit]]
  
  object clone_ {
    
    inline def apply[T](obj: T): T = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def apply[T](obj: T, options: Options): T = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @JSImport("@hapi/hoek", "clone")
    @js.native
    val ^ : js.Any = js.native
    
    trait Options extends StObject {
      
      /**
        * Shallow clone the specified keys.
        *
        * @default undefined
        */
      val shallow: js.UndefOr[(js.Array[js.Array[String] | String]) | Boolean] = js.undefined
      
      /**
        * Include symbol properties.
        *
        * @default true
        */
      val symbols: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setShallow(value: (js.Array[js.Array[String] | String]) | Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
        
        inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
        
        inline def setShallowVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "shallow", js.Array(value*))
        
        inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      }
    }
  }
  
  object contain {
    
    inline def apply(ref: String, values: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: String, values: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: String, values: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: String, values: js.Array[String], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: js.Array[Any], values: Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: js.Array[Any], values: Any, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: js.Object, values: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: js.Object, values: String, options: OmitOptionsonce): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: js.Object, values: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: js.Object, values: js.Array[String], options: OmitOptionsonce): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: js.Object, values: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(ref: js.Object, values: js.Object, options: OmitOptionsonce): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@hapi/hoek", "contain")
    @js.native
    val ^ : js.Any = js.native
    
    trait Options extends StObject {
      
      /**
        * Perform a deep comparison.
        *
        * @default false
        */
      val deep: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Allow only one occurrence of each value.
        *
        * @default false
        */
      val once: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Allow only values explicitly listed.
        *
        * @default false
        */
      val only: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Allow partial match.
        *
        * @default false
        */
      val part: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Include symbol properties.
        *
        * @default true
        */
      val symbols: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
        
        inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
        
        inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
        
        inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
        
        inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
        
        inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
        
        inline def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
        
        inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
        
        inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      }
    }
  }
  
  object deepEqual {
    
    inline def apply(obj: Any, ref: Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(obj: Any, ref: Any, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@hapi/hoek", "deepEqual")
    @js.native
    val ^ : js.Any = js.native
    
    trait Options extends StObject {
      
      /**
        * Compare functions with difference references by comparing their internal code and properties.
        *
        * @default false
        */
      val deepFunction: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Allow partial match.
        *
        * @default false
        */
      val part: js.UndefOr[Boolean] = js.undefined
      
      /**
        * List of object keys to ignore different values of.
        *
        * @default null
        */
      val skip: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
      
      /**
        * Compare symbol properties.
        *
        * @default true
        */
      val symbols: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setDeepFunction(value: Boolean): Self = StObject.set(x, "deepFunction", value.asInstanceOf[js.Any])
        
        inline def setDeepFunctionUndefined: Self = StObject.set(x, "deepFunction", js.undefined)
        
        inline def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
        
        inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
        
        inline def setSkip(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        inline def setSkipVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "skip", js.Array(value*))
        
        inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      }
    }
  }
  
  inline def escapeHeaderAttribute(attribute: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHeaderAttribute")(attribute.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeHtml(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeJson(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeJson")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeRegex(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def flatten[T](array: ArrayLike[T | js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def flatten[T](array: ArrayLike[T | js.Array[T]], target: ArrayLike[T | js.Array[T]]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def ignore(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ignore because its type any is not an array type */ ignore: Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignore")(ignore.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object intersect {
    
    inline def apply[T1, T2](array1: Array[T1], array2: Array[T2]): T1 | T2 = (^.asInstanceOf[js.Dynamic].apply(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[T1 | T2]
    inline def apply[T1, T2](array1: Array[T1], array2: Array[T2], options: Options): T1 | T2 = (^.asInstanceOf[js.Dynamic].apply(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T1 | T2]
    
    @JSImport("@hapi/hoek", "intersect")
    @js.native
    val ^ : js.Any = js.native
    
    type Array[T] = ArrayLike[T] | Set[T] | Null
    
    trait Options extends StObject {
      
      /**
        * When true, return the first overlapping value.
        *
        * @default false
        */
      val first: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
        
        inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      }
    }
  }
  
  inline def isPromise(promise: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object merge {
    
    inline def apply[T1 /* <: js.Object */, T2 /* <: js.Object */](target: T1, source: T2): T1 & T2 = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
    inline def apply[T1 /* <: js.Object */, T2 /* <: js.Object */](target: T1, source: T2, options: Options): T1 & T2 = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
    
    @JSImport("@hapi/hoek", "merge")
    @js.native
    val ^ : js.Any = js.native
    
    trait Options extends StObject {
      
      /**
        * When true, array value from `source` is merged with the existing value in `target`.
        *
        * @default false
        */
      val mergeArrays: js.UndefOr[Boolean] = js.undefined
      
      /**
        * When true, null value from `source` overrides existing value in `target`.
        *
        * @default true
        */
      val nullOverride: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Compare symbol properties.
        *
        * @default true
        */
      val symbols: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setMergeArrays(value: Boolean): Self = StObject.set(x, "mergeArrays", value.asInstanceOf[js.Any])
        
        inline def setMergeArraysUndefined: Self = StObject.set(x, "mergeArrays", js.undefined)
        
        inline def setNullOverride(value: Boolean): Self = StObject.set(x, "nullOverride", value.asInstanceOf[js.Any])
        
        inline def setNullOverrideUndefined: Self = StObject.set(x, "nullOverride", js.undefined)
        
        inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      }
    }
  }
  
  inline def once[T /* <: js.Function */](method: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(method.asInstanceOf[js.Any]).asInstanceOf[T]
  
  object reach {
    
    inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
    inline def apply(obj: js.Object): Any = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def apply(obj: js.Object, chain: String): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: js.Object, chain: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: js.Object, chain: js.Array[String | Double]): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: js.Object, chain: js.Array[String | Double], options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: js.Object, chain: Null, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: js.Object, chain: Unit, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: js.Object, chain: `false`): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: js.Object, chain: `false`, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: Null, chain: String): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: Null, chain: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: Null, chain: js.Array[String | Double]): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: Null, chain: js.Array[String | Double], options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: Null, chain: Null, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: Null, chain: Unit, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: Null, chain: `false`): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(obj: Null, chain: `false`, options: Options): Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("@hapi/hoek", "reach")
    @js.native
    val ^ : js.Any = js.native
    
    trait Options extends StObject {
      
      /**
        * Value to return if the path or value is not present. No default value.
        *
        * @default false
        */
      val default: js.UndefOr[Any] = js.undefined
      
      /**
        * If true, allows traversing functions for properties. false will throw an error if a function is part of the chain.
        *
        * @default true
        */
      val functions: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If true, allows traversing Set and Map objects for properties. false will return undefined regardless of the Set or Map passed.
        *
        * @default false
        */
      val iterables: js.UndefOr[Boolean] = js.undefined
      
      /**
        * String to split chain path on. Defaults to '.'.
        *
        * @default false
        */
      val separator: js.UndefOr[String] = js.undefined
      
      /**
        * If true, will throw an error on missing member in the chain. Default to false.
        *
        * @default false
        */
      val strict: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setFunctions(value: Boolean): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
        
        inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
        
        inline def setIterables(value: Boolean): Self = StObject.set(x, "iterables", value.asInstanceOf[js.Any])
        
        inline def setIterablesUndefined: Self = StObject.set(x, "iterables", js.undefined)
        
        inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
        
        inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
  
  inline def reachTemplate(obj: js.Object, template: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reachTemplate(obj: js.Object, template: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reachTemplate(obj: Null, template: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reachTemplate(obj: Null, template: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Any, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Any, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def wait_[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")().asInstanceOf[js.Promise[T]]
  inline def wait_[T](timeout: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def wait_[T](timeout: Double, returnValue: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeout.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def wait_[T](timeout: Unit, returnValue: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeout.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  object internals {
    
    /** NOTE: Mapped type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      {[ P in std.Exclude<keyof T, keyof U> ]:? never}
      }}}
      */
    @js.native
    trait Without[T, U] extends StObject
  }
  
  object ts {
    
    /**
      * Defines a type that can must be one of T or U but not both.
      */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      T | U extends object ? @hapi/hoek.@hapi/hoek.internals.Without<T, U> & U | @hapi/hoek.@hapi/hoek.internals.Without<U, T> & T : T | U
      }}}
      */
    @js.native
    trait XOR[T, U] extends StObject
  }
}
