package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array extends js.Object {
  /**
    * Validates the provided value against the schema using all of the validation keywords specific to instances of an
    * array.
    * The validation keywords for the type `array` are:
    * ```
    * ['items', 'maxItems', 'minItems', 'uniqueItems']
    * ```
    * see http://json-schema.org/latest/json-schema-validation.html#anchor25
    *
    * @name Schema.typeGroupValidators.array
    * @method
    * @param {*} value Array to be validated.
    * @param {object} schema Schema containing at least one array keyword.
    * @param {object} [opts] Configuration options.
    * @returns {(array|undefined)} Array of errors or `undefined` if valid.
    */
  def array(value: js.Any, schema: js.Any): js.Array[_] = js.native
  def array(value: js.Any, schema: js.Any, opts: js.Any): js.Array[_] = js.native
  /**
    * Validates the provided value against the schema using all of the validation keywords specific to instances of an
    * integer.
    * The validation keywords for the type `integer` are:
    * ```
    * ['multipleOf', 'maximum', 'minimum']
    * ```
    * @name Schema.typeGroupValidators.integer
    * @method
    * @param {*} value Number to be validated.
    * @param {object} schema Schema containing at least one `integer` keyword.
    * @param {object} [opts] Configuration options.
    * @returns {(array|undefined)} Array of errors or `undefined` if valid.
    */
  def integer(value: js.Any, schema: js.Any, opts: js.Any): js.Array[_] = js.native
  /**
    * Validates the provided value against the schema using all of the validation keywords specific to instances of an
    * number.
    * The validation keywords for the type `number` are:
    * ```
    * ['multipleOf', 'maximum', 'minimum']
    * ```
    * @name Schema.typeGroupValidators.number
    * @method
    * @param {*} value Number to be validated.
    * @param {object} schema Schema containing at least one `number` keyword.
    * @param {object} [opts] Configuration options.
    * @returns {(array|undefined)} Array of errors or `undefined` if valid.
    */
  def number(value: js.Any, schema: js.Any, opts: js.Any): js.Array[_] = js.native
  /**
    * Validates the provided value against the schema using all of the validation keywords specific to instances of a
    * number or integer.
    * The validation keywords for the type `numeric` are:
    * ```
    * ['multipleOf', 'maximum', 'minimum']
    * ```
    * See http://json-schema.org/latest/json-schema-validation.html#anchor13.
    *
    * @name Schema.typeGroupValidators.numeric
    * @method
    * @param {*} value Number to be validated.
    * @param {object} schema Schema containing at least one `numeric` keyword.
    * @param {object} [opts] Configuration options.
    * @returns {(array|undefined)} Array of errors or `undefined` if valid.
    */
  def numeric(value: js.Any, schema: js.Any, opts: js.Any): js.Array[_] = js.native
  /**
    * Validates the provided value against the schema using all of the validation keywords specific to instances of an
    * object.
    * The validation keywords for the type `object` are:
    * ```
    * ['maxProperties', 'minProperties', 'required', 'properties', 'dependencies']
    * ```
    * See http://json-schema.org/latest/json-schema-validation.html#anchor53.
    *
    * @name Schema.typeGroupValidators.object
    * @method
    * @param {*} value Object to be validated.
    * @param {object} schema Schema containing at least one `object` keyword.
    * @param {object} [opts] Configuration options.
    * @returns {(array|undefined)} Array of errors or `undefined` if valid.
    */
  def `object`(value: js.Any, schema: js.Any, opts: js.Any): js.Array[_] = js.native
  /**
    * Validates the provided value against the schema using all of the validation keywords specific to instances of an
    * string.
    * The validation keywords for the type `string` are:
    * ```
    * ['maxLength', 'minLength', 'pattern']
    * ```
    * See http://json-schema.org/latest/json-schema-validation.html#anchor25.
    *
    * @name Schema.typeGroupValidators.string
    * @method
    * @param {*} value String to be validated.
    * @param {object} schema Schema containing at least one `string` keyword.
    * @param {object} [opts] Configuration options.
    * @returns {(array|undefined)} Array of errors or `undefined` if valid.
    */
  def string(value: js.Any, schema: js.Any): js.Array[_] = js.native
  def string(value: js.Any, schema: js.Any, opts: js.Any): js.Array[_] = js.native
}

