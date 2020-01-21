package typings.jsData

import typings.jsData.mod.SchemaValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllOf extends js.Object {
  def allOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def anyOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def dependencies(value: js.Any, schema: js.Any, opts: js.Any): Unit
  def enum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def items(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def maxItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def maxLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def maxProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def maximum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def minItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def minLength(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def minProperties(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def minimum(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def multipleOf(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def not(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def oneOf(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def pattern(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def properties(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def required(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError]
  def `type`(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
  def uniqueItems(value: js.Any, schema: js.Any, opts: js.Any): SchemaValidationError
}

object AnonAllOf {
  @scala.inline
  def apply(
    allOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    anyOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    dependencies: (js.Any, js.Any, js.Any) => Unit,
    enum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    items: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    maxItems: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maxLength: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maxProperties: (js.Any, js.Any, js.Any) => SchemaValidationError,
    maximum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minItems: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minLength: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minProperties: (js.Any, js.Any, js.Any) => SchemaValidationError,
    minimum: (js.Any, js.Any, js.Any) => SchemaValidationError,
    multipleOf: (js.Any, js.Any, js.Any) => SchemaValidationError,
    not: (js.Any, js.Any, js.Any) => SchemaValidationError,
    oneOf: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    pattern: (js.Any, js.Any, js.Any) => SchemaValidationError,
    properties: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    required: (js.Any, js.Any, js.Any) => js.Array[SchemaValidationError],
    `type`: (js.Any, js.Any, js.Any) => SchemaValidationError,
    uniqueItems: (js.Any, js.Any, js.Any) => SchemaValidationError
  ): AnonAllOf = {
    val __obj = js.Dynamic.literal(allOf = js.Any.fromFunction3(allOf), anyOf = js.Any.fromFunction3(anyOf), dependencies = js.Any.fromFunction3(dependencies), enum = js.Any.fromFunction3(enum), items = js.Any.fromFunction3(items), maxItems = js.Any.fromFunction3(maxItems), maxLength = js.Any.fromFunction3(maxLength), maxProperties = js.Any.fromFunction3(maxProperties), maximum = js.Any.fromFunction3(maximum), minItems = js.Any.fromFunction3(minItems), minLength = js.Any.fromFunction3(minLength), minProperties = js.Any.fromFunction3(minProperties), minimum = js.Any.fromFunction3(minimum), multipleOf = js.Any.fromFunction3(multipleOf), not = js.Any.fromFunction3(not), oneOf = js.Any.fromFunction3(oneOf), pattern = js.Any.fromFunction3(pattern), properties = js.Any.fromFunction3(properties), required = js.Any.fromFunction3(required), uniqueItems = js.Any.fromFunction3(uniqueItems))
    __obj.updateDynamic("type")(js.Any.fromFunction3(`type`))
    __obj.asInstanceOf[AnonAllOf]
  }
}

