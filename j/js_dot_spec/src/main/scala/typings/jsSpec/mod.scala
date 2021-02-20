package typings.jsSpec

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js.spec", "assert")
  @js.native
  def assert(spec: SpecInput, value: js.Any): Unit = js.native
  
  @JSImport("js.spec", "conform")
  @js.native
  def conform(spec: SpecInput, value: js.Any): js.Any = js.native
  
  @JSImport("js.spec", "explain")
  @js.native
  def explain(spec: SpecInput, value: js.Any): Unit = js.native
  
  @JSImport("js.spec", "explainData")
  @js.native
  def explainData(spec: SpecInput, value: js.Any): js.Array[Problem] = js.native
  
  @JSImport("js.spec", "explainStr")
  @js.native
  def explainStr(spec: SpecInput, value: js.Any): String = js.native
  
  @JSImport("js.spec", "problemStr")
  @js.native
  def problemStr(problem: Problem): String = js.native
  
  object spec {
    
    /**
      * Data must conform to every provided spec.
      * @param name the name of the spec
      * @param specs the array of specs that must all match
      * @returns the constructed Spec
      */
    @JSImport("js.spec", "spec.and")
    @js.native
    def and(name: String, specs: SpecInput*): Spec_ = js.native
    
    /**
      * Returns true if data is an Array.
      */
    @JSImport("js.spec", "spec.array")
    @js.native
    val array: PredFn = js.native
    
    /**
      * Returns true if data is a boolean.
      */
    @JSImport("js.spec", "spec.bool")
    @js.native
    val bool: PredFn = js.native
    
    /**
      * Returns true if data is a boolean.
      */
    @JSImport("js.spec", "spec.boolean")
    @js.native
    val boolean: PredFn = js.native
    
    /**
      * Returns true if data is an Array or Set.
      */
    @JSImport("js.spec", "spec.coll")
    @js.native
    val coll: PredFn = js.native
    
    // Cannot specify 'symbol' as a key type: https://github.com/Microsoft/TypeScript/issues/7660
    /**
      * Used to define collections with items of the same type. Works with Arrays and Sets.
      * Accepts an option map as optional second parameter.
      * NOTE: the keys in this option map are symbols but Typescript will not allow 'symbol' to be specified
      * as a key type but the TS compiler will allow it.
      * @param name the name of the spec
      * @param spec the spec to apply to values in the collection
      * @param options symbol.count or symbol.minCount / symbol.maxCount
      */
    @JSImport("js.spec", "spec.collection")
    @js.native
    def collection(name: String, spec: SpecInput): Spec_ = js.native
    @JSImport("js.spec", "spec.collection")
    @js.native
    def collection(name: String, spec: SpecInput, options: StringDictionary[Double]): Spec_ = js.native
    
    /**
      * Returns true if data is a Date.
      */
    @JSImport("js.spec", "spec.date")
    @js.native
    val date: PredFn = js.native
    
    /**
      * Returns true if data is an even number.
      */
    @JSImport("js.spec", "spec.even")
    @js.native
    val even: PredFn = js.native
    
    /**
      * Returns true if data is a finite number.
      */
    @JSImport("js.spec", "spec.finite")
    @js.native
    val finite: PredFn = js.native
    
    /**
      * Returns true if data is a function.
      */
    @JSImport("js.spec", "spec.fn")
    @js.native
    val fn: PredFn = js.native
    
    // Predicates
    /**
      * Returns true if data is an integer.
      */
    @JSImport("js.spec", "spec.int")
    @js.native
    val int: PredFn = js.native
    
    /**
      * Returns true if data is an integer.
      */
    @JSImport("js.spec", "spec.integer")
    @js.native
    val integer: PredFn = js.native
    
    /**
      * Used to define the shape of maps. By default all keys are required. Use {symbol.optional} key to define
      * optional keys. Shape map can contain nested key specs.
      * @param name the name of the spec
      * @param shape the shape map with keys and associated specs
      * @returns the constructed spec
      */
    @JSImport("js.spec", "spec.map")
    @js.native
    def map(name: String, shape: js.Object): Spec_ = js.native
    
    /**
      * Returns true if data is a number smaller than zero.
      */
    @JSImport("js.spec", "spec.negative")
    @js.native
    val negative: PredFn = js.native
    
    /**
      * Returns true if data is null or undefined.
      */
    @JSImport("js.spec", "spec.nil")
    @js.native
    val nil: PredFn = js.native
    
    /**
      * By default no spec accepts null or undefined as valid input. Wrap your spec in nilable() to change this.
      * @param name the name of the spec
      * @param spec the spec to apply if a value is non-nil
      * @returns the constructed spec
      */
    @JSImport("js.spec", "spec.nilable")
    @js.native
    def nilable(name: String, spec: SpecInput): Spec_ = js.native
    
    /**
      * Returns true if data is a number (can be double or integer).
      */
    @JSImport("js.spec", "spec.number")
    @js.native
    val number: PredFn = js.native
    
    /**
      * Returns true if data is a plain object.
      */
    @JSImport("js.spec", "spec.obj")
    @js.native
    val obj: PredFn = js.native
    
    /**
      * Returns true if data is an odd number.
      */
    @JSImport("js.spec", "spec.odd")
    @js.native
    val odd: PredFn = js.native
    
    /**
      * Used to define "one out of these values", like an enum. (It's called oneOf because enum is a reserved word.)
      * @param name the name of the spec
      * @param values the emum of values
      * @returns the constructed spec
      */
    @JSImport("js.spec", "spec.oneOf")
    @js.native
    def oneOf(name: String, values: js.Any*): Spec_ = js.native
    
    /**
      * Data must conform to at least one provided spec. The order in which they are validated is not defined.
      * The conform() function returns matched branches along with input data.
      * @param name the name of the spec
      * @param alts map of alternative keys with their respective SpecInputs
      * @returns the constructed Spec
      */
    @JSImport("js.spec", "spec.or")
    @js.native
    def or(name: String, alts: StringDictionary[SpecInput]): Spec_ = js.native
    
    /**
      * Returns true if data is a number greater than zero.
      */
    @JSImport("js.spec", "spec.positive")
    @js.native
    val positive: PredFn = js.native
    
    /**
      * Used to define a predicate function as a Spec.
      * @param name the name of the spec
      * @param predicate the predicate function
      * @returns the constructed spec
      */
    @JSImport("js.spec", "spec.predicate")
    @js.native
    def predicate(name: String, predicate: PredFn): Spec_ = js.native
    
    /**
      * Returns true if data is a Set.
      */
    @JSImport("js.spec", "spec.set")
    @js.native
    val set: PredFn = js.native
    
    /**
      * Returns true if data is a string.
      */
    @JSImport("js.spec", "spec.str")
    @js.native
    val str: PredFn = js.native
    
    /**
      * Returns true if data is a string.
      */
    @JSImport("js.spec", "spec.string")
    @js.native
    val string: PredFn = js.native
    
    /**
      * Returns true if data is a Symbol.
      */
    @JSImport("js.spec", "spec.sym")
    @js.native
    val sym: PredFn = js.native
    
    /**
      * Returns true if data is a Symbol.
      */
    @JSImport("js.spec", "spec.symbol")
    @js.native
    val symbol: PredFn = js.native
    
    /**
      * Used to define collections with items of possibly different types. Works only with arrays as order is important.
      * @param name the name of the spec
      * @param specs the specs to test the value array
      * @returns the constructed spec
      */
    @JSImport("js.spec", "spec.tuple")
    @js.native
    def tuple(name: String, specs: SpecInput*): Spec_ = js.native
    
    /**
      * Returns true if data is the number zero.
      * Why: To easily construct specs for >= 0.
      */
    @JSImport("js.spec", "spec.zero")
    @js.native
    val zero: PredFn = js.native
    
    /**
      * Returns true if data is a plain object.
      */
    @JSImport("js.spec", "spec.object")
    @js.native
    val `object`: PredFn = js.native
  }
  
  object symbol {
    
    /**
      * Used as an option in collection() to specify the size of a collection.
      */
    @JSImport("js.spec", "symbol.count")
    @js.native
    val count: js.Symbol = js.native
    
    /**
      * Returned by conform() to indicate a value does not conform to a spec.
      */
    @JSImport("js.spec", "symbol.invalid")
    @js.native
    val invalid: js.Symbol = js.native
    
    /**
      * Used as an option in collection() to specify the maximum size of a collection.
      */
    @JSImport("js.spec", "symbol.maxCount")
    @js.native
    val maxCount: js.Symbol = js.native
    
    /**
      * Used as an option in collection() to specify the minimum size of a collection.
      */
    @JSImport("js.spec", "symbol.minCount")
    @js.native
    val minCount: js.Symbol = js.native
    
    /**
      * Used as an option in map() to specify a key spec that is optional.
      */
    @JSImport("js.spec", "symbol.optional")
    @js.native
    val optional: js.Symbol = js.native
  }
  
  @JSImport("js.spec", "valid")
  @js.native
  def valid(spec: SpecInput, value: js.Any): Boolean = js.native
  
  type PredFn = js.Function1[/* value */ js.Any, Boolean]
  
  @js.native
  trait Problem extends StObject {
    
    /**
      * The path to the value.
      */
    val path: js.Array[String] = js.native
    
    /**
      * A predicate function to test new values for conformance.
      */
    def predicate(value: js.Any): Boolean = js.native
    
    /**
      * The value associated with the problem.
      */
    val value: js.Any = js.native
    
    /**
      * Path to the Spec that applies.
      */
    val via: js.Array[String] = js.native
  }
  object Problem {
    
    @scala.inline
    def apply(path: js.Array[String], predicate: js.Any => Boolean, value: js.Any, via: js.Array[String]): Problem = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate), value = value.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
      __obj.asInstanceOf[Problem]
    }
    
    @scala.inline
    implicit class ProblemMutableBuilder[Self <: Problem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setPredicate(value: js.Any => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVia(value: js.Array[String]): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViaVarargs(value: String*): Self = StObject.set(x, "via", js.Array(value :_*))
    }
  }
  
  type SpecInput = PredFn | Spec_
  
  @js.native
  trait Spec_ extends StObject {
    
    /**
      * Returns the conformed value to this spec.
      * @param value the value to test for conformance
      * @returns if the value does not conform to the spec, or the value if it does.
      */
    def conform(value: js.Any): js.Any = js.native
    
    /**
      * Explain why a value does not conform to this spec.
      * @param path the path to the value
      * @param via the containing specs, if any
      * @param value the value to examine
      * @returns list of problems or null if none
      */
    def explain(path: js.Array[String], via: js.Array[String], value: js.Any): js.Array[Problem] = js.native
    
    /**
      * The name of the spec, displayed in explain() results.
      */
    val name: String = js.native
    
    /**
      * Data necessary to check values for conformity.
      */
    val options: js.Object = js.native
  }
  object Spec_ {
    
    @scala.inline
    def apply(
      conform: js.Any => js.Any,
      explain: (js.Array[String], js.Array[String], js.Any) => js.Array[Problem],
      name: String,
      options: js.Object
    ): Spec_ = {
      val __obj = js.Dynamic.literal(conform = js.Any.fromFunction1(conform), explain = js.Any.fromFunction3(explain), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spec_]
    }
    
    @scala.inline
    implicit class Spec_MutableBuilder[Self <: Spec_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConform(value: js.Any => js.Any): Self = StObject.set(x, "conform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExplain(value: (js.Array[String], js.Array[String], js.Any) => js.Array[Problem]): Self = StObject.set(x, "explain", js.Any.fromFunction3(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
