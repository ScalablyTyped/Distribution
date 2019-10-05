package typings.jsDotSpec.jsDotSpecMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  /**
    * The name of the spec, displayed in explain() results.
    */
  val name: String
  /**
    * Data necessary to check values for conformity.
    */
  val options: js.Object
  /**
    * Returns the conformed value to this spec.
    * @param value the value to test for conformance
    * @returns if the value does not conform to the spec, or the value if it does.
    */
  def conform(value: js.Any): js.Any
  /**
    * Explain why a value does not conform to this spec.
    * @param path the path to the value
    * @param via the containing specs, if any
    * @param value the value to examine
    * @returns list of problems or null if none
    */
  def explain(path: js.Array[String], via: js.Array[String], value: js.Any): js.Array[Problem]
}

object Spec {
  @scala.inline
  def apply(
    conform: js.Any => js.Any,
    explain: (js.Array[String], js.Array[String], js.Any) => js.Array[Problem],
    name: String,
    options: js.Object,
    toString: () => String
  ): Spec = {
    val __obj = js.Dynamic.literal(conform = js.Any.fromFunction1(conform), explain = js.Any.fromFunction3(explain), name = name, options = options, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Spec]
  }
}

@JSImport("js.spec", "spec")
@js.native
object spec extends js.Object {
  /**
    * Returns true if data is an Array.
    */
  val array: PredFn = js.native
  /**
    * Returns true if data is a boolean.
    */
  val bool: PredFn = js.native
  /**
    * Returns true if data is a boolean.
    */
  val boolean: PredFn = js.native
  /**
    * Returns true if data is an Array or Set.
    */
  val coll: PredFn = js.native
  /**
    * Returns true if data is a Date.
    */
  val date: PredFn = js.native
  /**
    * Returns true if data is an even number.
    */
  val even: PredFn = js.native
  /**
    * Returns true if data is a finite number.
    */
  val finite: PredFn = js.native
  /**
    * Returns true if data is a function.
    */
  val fn: PredFn = js.native
  // Predicates
  /**
    * Returns true if data is an integer.
    */
  val int: PredFn = js.native
  /**
    * Returns true if data is an integer.
    */
  val integer: PredFn = js.native
  /**
    * Returns true if data is a number smaller than zero.
    */
  val negative: PredFn = js.native
  /**
    * Returns true if data is null or undefined.
    */
  val nil: PredFn = js.native
  /**
    * Returns true if data is a number (can be double or integer).
    */
  val number: PredFn = js.native
  /**
    * Returns true if data is a plain object.
    */
  val obj: PredFn = js.native
  /**
    * Returns true if data is a plain object.
    */
  val `object`: PredFn = js.native
  /**
    * Returns true if data is an odd number.
    */
  val odd: PredFn = js.native
  /**
    * Returns true if data is a number greater than zero.
    */
  val positive: PredFn = js.native
  /**
    * Returns true if data is a Set.
    */
  val set: PredFn = js.native
  /**
    * Returns true if data is a string.
    */
  val str: PredFn = js.native
  /**
    * Returns true if data is a string.
    */
  val string: PredFn = js.native
  /**
    * Returns true if data is a Symbol.
    */
  val sym: PredFn = js.native
  /**
    * Returns true if data is a Symbol.
    */
  val symbol: PredFn = js.native
  /**
    * Returns true if data is the number zero.
    * Why: To easily construct specs for >= 0.
    */
  val zero: PredFn = js.native
  /**
    * Data must conform to every provided spec.
    * @param name the name of the spec
    * @param specs the array of specs that must all match
    * @returns the constructed Spec
    */
  def and(name: String, specs: SpecInput*): Spec = js.native
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
  def collection(name: String, spec: SpecInput): Spec = js.native
  def collection(name: String, spec: SpecInput, options: StringDictionary[Double]): Spec = js.native
  /**
    * Used to define the shape of maps. By default all keys are required. Use {symbol.optional} key to define
    * optional keys. Shape map can contain nested key specs.
    * @param name the name of the spec
    * @param shape the shape map with keys and associated specs
    * @returns the constructed spec
    */
  def map(name: String, shape: js.Object): Spec = js.native
  /**
    * By default no spec accepts null or undefined as valid input. Wrap your spec in nilable() to change this.
    * @param name the name of the spec
    * @param spec the spec to apply if a value is non-nil
    * @returns the constructed spec
    */
  def nilable(name: String, spec: SpecInput): Spec = js.native
  /**
    * Used to define "one out of these values", like an enum. (It's called oneOf because enum is a reserved word.)
    * @param name the name of the spec
    * @param values the emum of values
    * @returns the constructed spec
    */
  def oneOf(name: String, values: js.Any*): Spec = js.native
  /**
    * Data must conform to at least one provided spec. The order in which they are validated is not defined.
    * The conform() function returns matched branches along with input data.
    * @param name the name of the spec
    * @param alts map of alternative keys with their respective SpecInputs
    * @returns the constructed Spec
    */
  def or(name: String, alts: StringDictionary[SpecInput]): Spec = js.native
  /**
    * Used to define a predicate function as a Spec.
    * @param name the name of the spec
    * @param predicate the predicate function
    * @returns the constructed spec
    */
  def predicate(name: String, predicate: PredFn): Spec = js.native
  /**
    * Used to define collections with items of possibly different types. Works only with arrays as order is important.
    * @param name the name of the spec
    * @param specs the specs to test the value array
    * @returns the constructed spec
    */
  def tuple(name: String, specs: SpecInput*): Spec = js.native
}

