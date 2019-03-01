package typings
package jsDashDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllOf extends js.Object {
  def allOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def anyOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def dependencies(value: js.Any, schema: js.Any, opts: js.Any): scala.Unit
  def enum(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def items(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def maxItems(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def maxLength(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def maxProperties(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def maximum(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def minItems(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def minLength(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def minProperties(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def minimum(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def multipleOf(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def not(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def oneOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def pattern(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def properties(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def required(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]
  def `type`(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
  def uniqueItems(value: js.Any, schema: js.Any, opts: js.Any): jsDashDataLib.jsDashDataMod.SchemaValidationError
}

object Anon_AllOf {
  @scala.inline
  def apply(
    allOf: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    anyOf: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    dependencies: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    enum: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    items: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    maxItems: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    maxLength: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    maxProperties: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    maximum: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    minItems: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    minLength: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    minProperties: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    minimum: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    multipleOf: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    not: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    oneOf: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    pattern: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    properties: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    required: js.Function3[js.Any, js.Any, js.Any, js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError]],
    `type`: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError],
    uniqueItems: js.Function3[js.Any, js.Any, js.Any, jsDashDataLib.jsDashDataMod.SchemaValidationError]
  ): Anon_AllOf = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("allOf")(allOf)
    __obj.updateDynamic("anyOf")(anyOf)
    __obj.updateDynamic("dependencies")(dependencies)
    __obj.updateDynamic("enum")(enum)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("maxItems")(maxItems)
    __obj.updateDynamic("maxLength")(maxLength)
    __obj.updateDynamic("maxProperties")(maxProperties)
    __obj.updateDynamic("maximum")(maximum)
    __obj.updateDynamic("minItems")(minItems)
    __obj.updateDynamic("minLength")(minLength)
    __obj.updateDynamic("minProperties")(minProperties)
    __obj.updateDynamic("minimum")(minimum)
    __obj.updateDynamic("multipleOf")(multipleOf)
    __obj.updateDynamic("not")(not)
    __obj.updateDynamic("oneOf")(oneOf)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[Anon_AllOf]
  }
}

