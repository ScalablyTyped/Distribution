package typings.jsSpec

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js.spec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(spec: SpecInput, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(spec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def conform(spec: SpecInput, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("conform")(spec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def explain(spec: SpecInput, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("explain")(spec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def explainData(spec: SpecInput, value: Any): js.Array[Problem] = (^.asInstanceOf[js.Dynamic].applyDynamic("explainData")(spec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Problem]]
  
  inline def explainStr(spec: SpecInput, value: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("explainStr")(spec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def problemStr(problem: Problem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("problemStr")(problem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object spec {
    
    @JSImport("js.spec", "spec")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Data must conform to every provided spec.
      * @param name the name of the spec
      * @param specs the array of specs that must all match
      * @returns the constructed Spec
      */
    inline def and(name: String, specs: SpecInput*): Spec_ = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(scala.List(name.asInstanceOf[js.Any]).`++`(specs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Spec_]
    
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
    inline def collection(name: String, spec: SpecInput): Spec_ = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")(name.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Spec_]
    inline def collection(name: String, spec: SpecInput, options: StringDictionary[Double]): Spec_ = (^.asInstanceOf[js.Dynamic].applyDynamic("collection")(name.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Spec_]
    
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
    inline def map(name: String, shape: js.Object): Spec_ = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(name.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Spec_]
    
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
    inline def nilable(name: String, spec: SpecInput): Spec_ = (^.asInstanceOf[js.Dynamic].applyDynamic("nilable")(name.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Spec_]
    
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
      * Returns true if data is a plain object.
      */
    @JSImport("js.spec", "spec.object")
    @js.native
    val `object`: PredFn = js.native
    
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
    inline def oneOf(name: String, values: Any*): Spec_ = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(scala.List(name.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Spec_]
    
    /**
      * Data must conform to at least one provided spec. The order in which they are validated is not defined.
      * The conform() function returns matched branches along with input data.
      * @param name the name of the spec
      * @param alts map of alternative keys with their respective SpecInputs
      * @returns the constructed Spec
      */
    inline def or(name: String, alts: StringDictionary[SpecInput]): Spec_ = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(name.asInstanceOf[js.Any], alts.asInstanceOf[js.Any])).asInstanceOf[Spec_]
    
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
    inline def predicate(name: String, predicate: PredFn): Spec_ = (^.asInstanceOf[js.Dynamic].applyDynamic("predicate")(name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Spec_]
    
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
    inline def tuple(name: String, specs: SpecInput*): Spec_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(scala.List(name.asInstanceOf[js.Any]).`++`(specs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Spec_]
    
    /**
      * Returns true if data is the number zero.
      * Why: To easily construct specs for >= 0.
      */
    @JSImport("js.spec", "spec.zero")
    @js.native
    val zero: PredFn = js.native
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
  
  inline def valid(spec: SpecInput, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(spec.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type PredFn = js.Function1[/* value */ Any, Boolean]
  
  trait Problem extends StObject {
    
    /**
      * The path to the value.
      */
    val path: js.Array[String]
    
    /**
      * A predicate function to test new values for conformance.
      */
    def predicate(value: Any): Boolean
    
    /**
      * The value associated with the problem.
      */
    val value: Any
    
    /**
      * Path to the Spec that applies.
      */
    val via: js.Array[String]
  }
  object Problem {
    
    inline def apply(path: js.Array[String], predicate: Any => Boolean, value: Any, via: js.Array[String]): Problem = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate), value = value.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
      __obj.asInstanceOf[Problem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Problem] (val x: Self) extends AnyVal {
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPredicate(value: Any => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVia(value: js.Array[String]): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      inline def setViaVarargs(value: String*): Self = StObject.set(x, "via", js.Array(value*))
    }
  }
  
  type SpecInput = PredFn | Spec_
  
  trait Spec_ extends StObject {
    
    /**
      * Returns the conformed value to this spec.
      * @param value the value to test for conformance
      * @returns if the value does not conform to the spec, or the value if it does.
      */
    def conform(value: Any): Any
    
    /**
      * Explain why a value does not conform to this spec.
      * @param path the path to the value
      * @param via the containing specs, if any
      * @param value the value to examine
      * @returns list of problems or null if none
      */
    def explain(path: js.Array[String], via: js.Array[String], value: Any): js.Array[Problem]
    
    /**
      * The name of the spec, displayed in explain() results.
      */
    val name: String
    
    /**
      * Data necessary to check values for conformity.
      */
    val options: js.Object
  }
  object Spec_ {
    
    inline def apply(
      conform: Any => Any,
      explain: (js.Array[String], js.Array[String], Any) => js.Array[Problem],
      name: String,
      options: js.Object
    ): Spec_ = {
      val __obj = js.Dynamic.literal(conform = js.Any.fromFunction1(conform), explain = js.Any.fromFunction3(explain), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spec_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Spec_] (val x: Self) extends AnyVal {
      
      inline def setConform(value: Any => Any): Self = StObject.set(x, "conform", js.Any.fromFunction1(value))
      
      inline def setExplain(value: (js.Array[String], js.Array[String], Any) => js.Array[Problem]): Self = StObject.set(x, "explain", js.Any.fromFunction3(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
