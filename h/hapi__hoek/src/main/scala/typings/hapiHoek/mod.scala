package typings.hapiHoek

import org.scalablytyped.runtime.TopLevel
import typings.hapiHoek.anon.OmitOptionsonce
import typings.hapiHoek.hapiHoekBooleans.`false`
import typings.hapiHoek.mod.internals.Without
import typings.hapiHoek.mod.reach.Options
import typings.std.ArrayLike
import typings.std.Error
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
  class Bench () extends StObject {
    
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
    @scala.inline
    def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  }
  
  object applyToDefaults {
    
    @scala.inline
    def apply[T /* <: js.Object */](defaults: Partial[T]): Partial[T] = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[Partial[T]]
    @scala.inline
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Boolean): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    @scala.inline
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Boolean, options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    @scala.inline
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Null, options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    @scala.inline
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Partial[T]): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    @scala.inline
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Partial[T], options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
    
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
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNullOverride(value: Boolean): Self = StObject.set(x, "nullOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNullOverrideUndefined: Self = StObject.set(x, "nullOverride", js.undefined)
        
        @scala.inline
        def setShallow(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
        
        @scala.inline
        def setShallowVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "shallow", js.Array(value :_*))
      }
    }
  }
  
  @scala.inline
  def assert(
    condition: js.Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def assert(condition: js.Any, error: Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def block(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("block")().asInstanceOf[js.Promise[Unit]]
  
  object clone_ {
    
    @scala.inline
    def apply[T](obj: T): T = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def apply[T](obj: T, options: Options): T = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
    
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
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setShallow(value: (js.Array[js.Array[String] | String]) | Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
        
        @scala.inline
        def setShallowVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "shallow", js.Array(value :_*))
        
        @scala.inline
        def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      }
    }
  }
  
  object contain {
    
    @scala.inline
    def apply(ref: String, values: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: String, values: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: String, values: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: String, values: js.Array[String], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: js.Array[js.Any], values: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: js.Array[js.Any], values: js.Any, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: js.Object, values: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: js.Object, values: String, options: OmitOptionsonce): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: js.Object, values: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: js.Object, values: js.Array[String], options: OmitOptionsonce): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: js.Object, values: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(ref: js.Object, values: js.Object, options: OmitOptionsonce): Boolean = (^.asInstanceOf[js.Dynamic].apply(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
        
        @scala.inline
        def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
        
        @scala.inline
        def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
        
        @scala.inline
        def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
        
        @scala.inline
        def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      }
    }
  }
  
  object deepEqual {
    
    @scala.inline
    def apply(obj: js.Any, ref: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(obj: js.Any, ref: js.Any, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeepFunction(value: Boolean): Self = StObject.set(x, "deepFunction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeepFunctionUndefined: Self = StObject.set(x, "deepFunction", js.undefined)
        
        @scala.inline
        def setPart(value: Boolean): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
        
        @scala.inline
        def setSkip(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        @scala.inline
        def setSkipVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "skip", js.Array(value :_*))
        
        @scala.inline
        def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      }
    }
  }
  
  @scala.inline
  def escapeHeaderAttribute(attribute: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHeaderAttribute")(attribute.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeHtml(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeJson(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeJson")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeRegex(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegex")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def flatten[T](array: ArrayLike[T | js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def flatten[T](array: ArrayLike[T | js.Array[T]], target: ArrayLike[T | js.Array[T]]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def ignore(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ignore because its type any is not an array type */ ignore: js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignore")(ignore.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object intersect {
    
    @scala.inline
    def apply[T1, T2](array1: Array[T1], array2: Array[T2]): js.Array[T1 | T2] = (^.asInstanceOf[js.Dynamic].apply(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[T1 | T2]]
    @scala.inline
    def apply[T1, T2](array1: Array[T1], array2: Array[T2], options: Options): js.Array[T1 | T2] = (^.asInstanceOf[js.Dynamic].apply(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T1 | T2]]
    
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
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      }
    }
  }
  
  @scala.inline
  def isPromise(promise: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object merge {
    
    @scala.inline
    def apply[T1 /* <: js.Object */, T2 /* <: js.Object */](target: T1, source: T2): T1 & T2 = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
    @scala.inline
    def apply[T1 /* <: js.Object */, T2 /* <: js.Object */](target: T1, source: T2, options: Options): T1 & T2 = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T1 & T2]
    
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
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMergeArrays(value: Boolean): Self = StObject.set(x, "mergeArrays", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeArraysUndefined: Self = StObject.set(x, "mergeArrays", js.undefined)
        
        @scala.inline
        def setNullOverride(value: Boolean): Self = StObject.set(x, "nullOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNullOverrideUndefined: Self = StObject.set(x, "nullOverride", js.undefined)
        
        @scala.inline
        def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      }
    }
  }
  
  @scala.inline
  def once[T /* <: js.Function */](method: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(method.asInstanceOf[js.Any]).asInstanceOf[T]
  
  object reach {
    
    @scala.inline
    def apply(): js.Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object, chain: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object, chain: String, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object, chain: js.Array[String | Double]): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object, chain: js.Array[String | Double], options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object, chain: Null, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object, chain: Unit, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object, chain: `false`): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: js.Object, chain: `false`, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: Null, chain: String): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: Null, chain: String, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: Null, chain: js.Array[String | Double]): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: Null, chain: js.Array[String | Double], options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: Null, chain: Null, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: Null, chain: Unit, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: Null, chain: `false`): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def apply(obj: Null, chain: `false`, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], chain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("@hapi/hoek", "reach")
    @js.native
    val ^ : js.Any = js.native
    
    trait Options extends StObject {
      
      /**
        * Value to return if the path or value is not present. No default value.
        *
        * @default false
        */
      val default: js.UndefOr[js.Any] = js.undefined
      
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
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setFunctions(value: Boolean): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
        
        @scala.inline
        def setIterables(value: Boolean): Self = StObject.set(x, "iterables", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIterablesUndefined: Self = StObject.set(x, "iterables", js.undefined)
        
        @scala.inline
        def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
        
        @scala.inline
        def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      }
    }
  }
  
  @scala.inline
  def reachTemplate(obj: js.Object, template: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def reachTemplate(obj: js.Object, template: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def reachTemplate(obj: Null, template: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def reachTemplate(obj: Null, template: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reachTemplate")(obj.asInstanceOf[js.Any], template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def stringify(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Any, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Any, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def wait_[T](): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")().asInstanceOf[js.Promise[T]]
  @scala.inline
  def wait_[T](timeout: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def wait_[T](timeout: Double, returnValue: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeout.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def wait_[T](timeout: Unit, returnValue: T): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wait")(timeout.asInstanceOf[js.Any], returnValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  object internals {
    
    type Without[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in std.Exclude<keyof T, keyof U> ]:? never}
      */ typings.hapiHoek.hapiHoekStrings.Without & TopLevel[js.Any]
  }
  
  object ts {
    
    /**
      * Defines a type that can must be one of T or U but not both.
      */
    type XOR[T, U] = T | U | ((Without[T, U]) & U) | ((Without[U, T]) & T)
  }
}
