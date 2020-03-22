package typings.jsData.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema
  extends typings.jsData.componentMod.default {
  val additionalProperties: js.Any = js.native
  val `extends`: js.Any = js.native
  val items: js.Any = js.native
  var properties: js.Any = js.native
  val track: js.Any = js.native
  var `type`: String = js.native
  /**
    * This adds ES5 getters/setters to the target based on the "properties" in
    * this Schema, which makes possible change tracking and validation on
    * property assignment.
    *
    * @name Schema#apply
    * @method
    * @param {object} target The prototype to which to apply this schema.
    * @param opts
    */
  @JSName("apply")
  def apply(target: js.Any): Unit = js.native
  @JSName("apply")
  def apply(target: js.Any, opts: js.Any): Unit = js.native
  /**
    * Apply default values to the target object for missing values.
    *
    * @name Schema#applyDefaults
    * @method
    * @param {object} target The target to which to apply values for missing values.
    */
  def applyDefaults(target: js.Any): Unit = js.native
  /**
    * Assemble a property descriptor for tracking and validating changes to
    * a property according to the given schema. This method is called when
    * {@link Mapper#applySchema} is set to `true`.
    *
    * @name Schema#makeDescriptor
    * @method
    * @param {string} prop The property name.
    * @param {(Schema|object)} schema The schema for the property.
    * @param {object} [opts] Optional configuration.
    * @param {function} [opts.getter] Custom getter function.
    * @param {function} [opts.setter] Custom setter function.
    * @param {function} [opts.track] Whether to track changes.
    * @returns {object} A property descriptor for the given schema.
    */
  def makeDescriptor(prop: js.Any, schema: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Create a copy of the given value that contains only the properties defined
    * in this schema.
    *
    * @name Schema#pick
    * @method
    * @param {*} value The value to copy.
    * @returns {*} The copy.
    */
  def pick(value: js.Any): js.Any = js.native
  def pick(value: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Validate the provided value against this schema.
    *
    * @name Schema#validate
    * @method
    * @param {*} value Value to validate.
    * @param {object} [opts] Configuration options.
    * @returns {(array|undefined)} Array of errors or `undefined` if valid.
    */
  def validate(value: js.Any): js.Array[_] = js.native
  def validate(value: js.Any, opts: js.Any): js.Array[_] = js.native
}

