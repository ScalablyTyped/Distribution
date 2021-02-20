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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
    
    /** The current time in milliseconds since the epoch. */
    @JSImport("@hapi/hoek", "Bench.now")
    @js.native
    def now(): Double = js.native
  }
  
  object applyToDefaults {
    
    @JSImport("@hapi/hoek", "applyToDefaults")
    @js.native
    def apply[T /* <: js.Object */](defaults: Partial[T]): Partial[T] = js.native
    @JSImport("@hapi/hoek", "applyToDefaults")
    @js.native
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Boolean): Partial[T] = js.native
    @JSImport("@hapi/hoek", "applyToDefaults")
    @js.native
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Boolean, options: Options): Partial[T] = js.native
    @JSImport("@hapi/hoek", "applyToDefaults")
    @js.native
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Null, options: Options): Partial[T] = js.native
    @JSImport("@hapi/hoek", "applyToDefaults")
    @js.native
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Partial[T]): Partial[T] = js.native
    @JSImport("@hapi/hoek", "applyToDefaults")
    @js.native
    def apply[T /* <: js.Object */](defaults: Partial[T], source: Partial[T], options: Options): Partial[T] = js.native
    
    @js.native
    trait Options extends StObject {
      
      /**
        * When true, null value from `source` overrides existing value in `target`.
        *
        * @default true
        */
      val nullOverride: js.UndefOr[Boolean] = js.native
      
      /**
        * Shallow clone the specified keys.
        *
        * @default undefined
        */
      val shallow: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
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
  
  @JSImport("@hapi/hoek", "assert")
  @js.native
  def assert(
    condition: js.Any,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
  @JSImport("@hapi/hoek", "assert")
  @js.native
  def assert(condition: js.Any, error: Error): Unit = js.native
  
  @JSImport("@hapi/hoek", "block")
  @js.native
  def block(): js.Promise[Unit] = js.native
  
  object clone_ {
    
    @JSImport("@hapi/hoek", "clone")
    @js.native
    def apply[T](obj: T): T = js.native
    @JSImport("@hapi/hoek", "clone")
    @js.native
    def apply[T](obj: T, options: Options): T = js.native
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Shallow clone the specified keys.
        *
        * @default undefined
        */
      val shallow: js.UndefOr[(js.Array[js.Array[String] | String]) | Boolean] = js.native
      
      /**
        * Include symbol properties.
        *
        * @default true
        */
      val symbols: js.UndefOr[Boolean] = js.native
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
    
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: String, values: String): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: String, values: String, options: Options): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: String, values: js.Array[String]): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: String, values: js.Array[String], options: Options): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: js.Array[_], values: js.Any): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: js.Array[_], values: js.Any, options: Options): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: js.Object, values: String): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: js.Object, values: String, options: OmitOptionsonce): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: js.Object, values: js.Array[String]): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: js.Object, values: js.Array[String], options: OmitOptionsonce): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: js.Object, values: js.Object): Boolean = js.native
    @JSImport("@hapi/hoek", "contain")
    @js.native
    def apply(ref: js.Object, values: js.Object, options: OmitOptionsonce): Boolean = js.native
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Perform a deep comparison.
        *
        * @default false
        */
      val deep: js.UndefOr[Boolean] = js.native
      
      /**
        * Allow only one occurrence of each value.
        *
        * @default false
        */
      val once: js.UndefOr[Boolean] = js.native
      
      /**
        * Allow only values explicitly listed.
        *
        * @default false
        */
      val only: js.UndefOr[Boolean] = js.native
      
      /**
        * Allow partial match.
        *
        * @default false
        */
      val part: js.UndefOr[Boolean] = js.native
      
      /**
        * Include symbol properties.
        *
        * @default true
        */
      val symbols: js.UndefOr[Boolean] = js.native
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
    
    @JSImport("@hapi/hoek", "deepEqual")
    @js.native
    def apply(obj: js.Any, ref: js.Any): Boolean = js.native
    @JSImport("@hapi/hoek", "deepEqual")
    @js.native
    def apply(obj: js.Any, ref: js.Any, options: Options): Boolean = js.native
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Compare functions with difference references by comparing their internal code and properties.
        *
        * @default false
        */
      val deepFunction: js.UndefOr[Boolean] = js.native
      
      /**
        * Allow partial match.
        *
        * @default false
        */
      val part: js.UndefOr[Boolean] = js.native
      
      /**
        * List of object keys to ignore different values of.
        *
        * @default null
        */
      val skip: js.UndefOr[js.Array[String | js.Symbol]] = js.native
      
      /**
        * Compare symbol properties.
        *
        * @default true
        */
      val symbols: js.UndefOr[Boolean] = js.native
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
  
  @JSImport("@hapi/hoek", "escapeHeaderAttribute")
  @js.native
  def escapeHeaderAttribute(attribute: String): String = js.native
  
  @JSImport("@hapi/hoek", "escapeHtml")
  @js.native
  def escapeHtml(string: String): String = js.native
  
  @JSImport("@hapi/hoek", "escapeJson")
  @js.native
  def escapeJson(string: String): String = js.native
  
  @JSImport("@hapi/hoek", "escapeRegex")
  @js.native
  def escapeRegex(string: String): String = js.native
  
  @JSImport("@hapi/hoek", "flatten")
  @js.native
  def flatten[T](array: ArrayLike[T | js.Array[T]]): js.Array[T] = js.native
  @JSImport("@hapi/hoek", "flatten")
  @js.native
  def flatten[T](array: ArrayLike[T | js.Array[T]], target: ArrayLike[T | js.Array[T]]): js.Array[T] = js.native
  
  @JSImport("@hapi/hoek", "ignore")
  @js.native
  def ignore(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ignore because its type any is not an array type */ ignore: js.Any
  ): Unit = js.native
  
  object intersect {
    
    @JSImport("@hapi/hoek", "intersect")
    @js.native
    def apply[T1, T2](array1: Array[T1], array2: Array[T2]): js.Array[T1 | T2] = js.native
    @JSImport("@hapi/hoek", "intersect")
    @js.native
    def apply[T1, T2](array1: Array[T1], array2: Array[T2], options: Options): js.Array[T1 | T2] = js.native
    
    type Array[T] = ArrayLike[T] | Set[T] | Null
    
    @js.native
    trait Options extends StObject {
      
      /**
        * When true, return the first overlapping value.
        *
        * @default false
        */
      val first: js.UndefOr[Boolean] = js.native
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
  
  @JSImport("@hapi/hoek", "isPromise")
  @js.native
  def isPromise(promise: js.Any): Boolean = js.native
  
  object merge {
    
    @JSImport("@hapi/hoek", "merge")
    @js.native
    def apply[T1 /* <: js.Object */, T2 /* <: js.Object */](target: T1, source: T2): T1 with T2 = js.native
    @JSImport("@hapi/hoek", "merge")
    @js.native
    def apply[T1 /* <: js.Object */, T2 /* <: js.Object */](target: T1, source: T2, options: Options): T1 with T2 = js.native
    
    @js.native
    trait Options extends StObject {
      
      /**
        * When true, array value from `source` is merged with the existing value in `target`.
        *
        * @default false
        */
      val mergeArrays: js.UndefOr[Boolean] = js.native
      
      /**
        * When true, null value from `source` overrides existing value in `target`.
        *
        * @default true
        */
      val nullOverride: js.UndefOr[Boolean] = js.native
      
      /**
        * Compare symbol properties.
        *
        * @default true
        */
      val symbols: js.UndefOr[Boolean] = js.native
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
  
  @JSImport("@hapi/hoek", "once")
  @js.native
  def once[T /* <: js.Function */](method: T): T = js.native
  
  object reach {
    
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object, chain: js.UndefOr[scala.Nothing], options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object, chain: String): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object, chain: String, options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object, chain: js.Array[String | Double]): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object, chain: js.Array[String | Double], options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object, chain: Null, options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object, chain: `false`): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: js.Object, chain: `false`, options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: Null, chain: js.UndefOr[scala.Nothing], options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: Null, chain: String): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: Null, chain: String, options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: Null, chain: js.Array[String | Double]): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: Null, chain: js.Array[String | Double], options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: Null, chain: Null, options: Options): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: Null, chain: `false`): js.Any = js.native
    @JSImport("@hapi/hoek", "reach")
    @js.native
    def apply(obj: Null, chain: `false`, options: Options): js.Any = js.native
    
    @js.native
    trait Options extends StObject {
      
      /**
        * Value to return if the path or value is not present. No default value.
        *
        * @default false
        */
      val default: js.UndefOr[js.Any] = js.native
      
      /**
        * If true, allows traversing functions for properties. false will throw an error if a function is part of the chain.
        *
        * @default true
        */
      val functions: js.UndefOr[Boolean] = js.native
      
      /**
        * If true, allows traversing Set and Map objects for properties. false will return undefined regardless of the Set or Map passed.
        *
        * @default false
        */
      val iterables: js.UndefOr[Boolean] = js.native
      
      /**
        * String to split chain path on. Defaults to '.'.
        *
        * @default false
        */
      val separator: js.UndefOr[String] = js.native
      
      /**
        * If true, will throw an error on missing member in the chain. Default to false.
        *
        * @default false
        */
      val strict: js.UndefOr[Boolean] = js.native
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
  
  @JSImport("@hapi/hoek", "reachTemplate")
  @js.native
  def reachTemplate(obj: js.Object, template: String): String = js.native
  @JSImport("@hapi/hoek", "reachTemplate")
  @js.native
  def reachTemplate(obj: js.Object, template: String, options: Options): String = js.native
  @JSImport("@hapi/hoek", "reachTemplate")
  @js.native
  def reachTemplate(obj: Null, template: String): String = js.native
  @JSImport("@hapi/hoek", "reachTemplate")
  @js.native
  def reachTemplate(obj: Null, template: String, options: Options): String = js.native
  
  @JSImport("@hapi/hoek", "stringify")
  @js.native
  def stringify(value: js.Any): String = js.native
  @JSImport("@hapi/hoek", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: String): String = js.native
  @JSImport("@hapi/hoek", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.UndefOr[scala.Nothing], space: Double): String = js.native
  @JSImport("@hapi/hoek", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Any): String = js.native
  @JSImport("@hapi/hoek", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Any, space: String): String = js.native
  @JSImport("@hapi/hoek", "stringify")
  @js.native
  def stringify(value: js.Any, replacer: js.Any, space: Double): String = js.native
  
  @JSImport("@hapi/hoek", "wait")
  @js.native
  def wait_[T](): js.Promise[T] = js.native
  @JSImport("@hapi/hoek", "wait")
  @js.native
  def wait_[T](timeout: js.UndefOr[scala.Nothing], returnValue: T): js.Promise[T] = js.native
  @JSImport("@hapi/hoek", "wait")
  @js.native
  def wait_[T](timeout: Double): js.Promise[T] = js.native
  @JSImport("@hapi/hoek", "wait")
  @js.native
  def wait_[T](timeout: Double, returnValue: T): js.Promise[T] = js.native
  
  object internals {
    
    type Without[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in std.Exclude<keyof T, keyof U> ]:? never}
      */ typings.hapiHoek.hapiHoekStrings.Without with TopLevel[js.Any]
  }
  
  object ts {
    
    /**
      * Defines a type that can must be one of T or U but not both.
      */
    type XOR[T, U] = T | U | ((Without[T, U]) with U) | ((Without[U, T]) with T)
  }
}
