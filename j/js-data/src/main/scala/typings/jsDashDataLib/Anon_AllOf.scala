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
    allOf: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    anyOf: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    dependencies: (js.Any, js.Any, js.Any) => scala.Unit,
    enum: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    items: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    maxItems: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    maxLength: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    maxProperties: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    maximum: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    minItems: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    minLength: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    minProperties: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    minimum: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    multipleOf: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    not: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    oneOf: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    pattern: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    properties: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    required: (js.Any, js.Any, js.Any) => js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError],
    `type`: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError,
    uniqueItems: (js.Any, js.Any, js.Any) => jsDashDataLib.jsDashDataMod.SchemaValidationError
  ): Anon_AllOf = {
    val __obj = js.Dynamic.literal(allOf = js.Any.fromFunction3(allOf), anyOf = js.Any.fromFunction3(anyOf), dependencies = js.Any.fromFunction3(dependencies), enum = js.Any.fromFunction3(enum), items = js.Any.fromFunction3(items), maxItems = js.Any.fromFunction3(maxItems), maxLength = js.Any.fromFunction3(maxLength), maxProperties = js.Any.fromFunction3(maxProperties), maximum = js.Any.fromFunction3(maximum), minItems = js.Any.fromFunction3(minItems), minLength = js.Any.fromFunction3(minLength), minProperties = js.Any.fromFunction3(minProperties), minimum = js.Any.fromFunction3(minimum), multipleOf = js.Any.fromFunction3(multipleOf), not = js.Any.fromFunction3(not), oneOf = js.Any.fromFunction3(oneOf), pattern = js.Any.fromFunction3(pattern), properties = js.Any.fromFunction3(properties), required = js.Any.fromFunction3(required), uniqueItems = js.Any.fromFunction3(uniqueItems))
    __obj.updateDynamic("type")(js.Any.fromFunction3(`type`))
    __obj.asInstanceOf[Anon_AllOf]
  }
}

