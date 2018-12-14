package typings
package jsDotSpecLib.jsDotSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js.spec", "spec")
@js.native
object specNs extends js.Object {
  /**
       * Returns true if data is an Array.
       */
  val array: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a boolean.
       */
  val bool: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a boolean.
       */
  val boolean: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is an Array or Set.
       */
  val coll: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a Date.
       */
  val date: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is an even number.
       */
  val even: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a finite number.
       */
  val finite: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a function.
       */
  val fn: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  // Predicates
  /**
       * Returns true if data is an integer.
       */
  val int: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is an integer.
       */
  val integer: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a number smaller than zero.
       */
  val negative: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is null or undefined.
       */
  val nil: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a number (can be double or integer).
       */
  val number: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a plain object.
       */
  val obj: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a plain object.
       */
  val `object`: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is an odd number.
       */
  val odd: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a number greater than zero.
       */
  val positive: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a Set.
       */
  val set: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a string.
       */
  val str: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a string.
       */
  val string: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a Symbol.
       */
  val sym: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is a Symbol.
       */
  val symbol: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Returns true if data is the number zero.
       * Why: To easily construct specs for >= 0.
       */
  val zero: jsDotSpecLib.jsDotSpecMod.PredFn = js.native
  /**
       * Data must conform to every provided spec.
       * @param name the name of the spec
       * @param specs the array of specs that must all match
       * @returns the constructed Spec
       */
  def and(name: java.lang.String, specs: jsDotSpecLib.jsDotSpecMod.SpecInput*): jsDotSpecLib.jsDotSpecMod.Spec = js.native
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
  def collection(name: java.lang.String, spec: jsDotSpecLib.jsDotSpecMod.SpecInput): jsDotSpecLib.jsDotSpecMod.Spec = js.native
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
  def collection(
    name: java.lang.String,
    spec: jsDotSpecLib.jsDotSpecMod.SpecInput,
    options: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): jsDotSpecLib.jsDotSpecMod.Spec = js.native
  /**
       * Used to define the shape of maps. By default all keys are required. Use {symbol.optional} key to define
       * optional keys. Shape map can contain nested key specs.
       * @param name the name of the spec
       * @param shape the shape map with keys and associated specs
       * @returns the constructed spec
       */
  def map(name: java.lang.String, shape: js.Object): jsDotSpecLib.jsDotSpecMod.Spec = js.native
  /**
       * By default no spec accepts null or undefined as valid input. Wrap your spec in nilable() to change this.
       * @param name the name of the spec
       * @param spec the spec to apply if a value is non-nil
       * @returns the constructed spec
       */
  def nilable(name: java.lang.String, spec: jsDotSpecLib.jsDotSpecMod.SpecInput): jsDotSpecLib.jsDotSpecMod.Spec = js.native
  /**
       * Used to define "one out of these values", like an enum. (It's called oneOf because enum is a reserved word.)
       * @param name the name of the spec
       * @param values the emum of values
       * @returns the constructed spec
       */
  def oneOf(name: java.lang.String, values: js.Any*): jsDotSpecLib.jsDotSpecMod.Spec = js.native
  /**
       * Data must conform to at least one provided spec. The order in which they are validated is not defined.
       * The conform() function returns matched branches along with input data.
       * @param name the name of the spec
       * @param alts map of alternative keys with their respective SpecInputs
       * @returns the constructed Spec
       */
  def or(
    name: java.lang.String,
    alts: org.scalablytyped.runtime.StringDictionary[jsDotSpecLib.jsDotSpecMod.SpecInput]
  ): jsDotSpecLib.jsDotSpecMod.Spec = js.native
  /**
       * Used to define a predicate function as a Spec.
       * @param name the name of the spec
       * @param predicate the predicate function
       * @returns the constructed spec
       */
  def predicate(name: java.lang.String, predicate: jsDotSpecLib.jsDotSpecMod.PredFn): jsDotSpecLib.jsDotSpecMod.Spec = js.native
  /**
       * Used to define collections with items of possibly different types. Works only with arrays as order is important.
       * @param name the name of the spec
       * @param specs the specs to test the value array
       * @returns the constructed spec
       */
  def tuple(name: java.lang.String, specs: jsDotSpecLib.jsDotSpecMod.SpecInput*): jsDotSpecLib.jsDotSpecMod.Spec = js.native
}

