package typings.jsonSchemaTyped.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.array
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.boolean
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.integer
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.`null`
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.number
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.`object`
  - typings.jsonSchemaTyped.jsonSchemaTypedStrings.string
*/
trait JSONSchemaTypeName extends _JSONSchemaTypeValue

object JSONSchemaTypeName {
  @scala.inline
  def array: typings.jsonSchemaTyped.jsonSchemaTypedStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.jsonSchemaTyped.jsonSchemaTypedStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typings.jsonSchemaTyped.jsonSchemaTypedStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typings.jsonSchemaTyped.jsonSchemaTypedStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.jsonSchemaTyped.jsonSchemaTypedStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.jsonSchemaTyped.jsonSchemaTypedStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.jsonSchemaTyped.jsonSchemaTypedStrings.string = this.cast("string")
}

