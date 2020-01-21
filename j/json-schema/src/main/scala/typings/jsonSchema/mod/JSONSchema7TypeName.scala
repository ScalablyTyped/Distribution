package typings.jsonSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonSchema.jsonSchemaStrings.string
  - typings.jsonSchema.jsonSchemaStrings.number
  - typings.jsonSchema.jsonSchemaStrings.integer
  - typings.jsonSchema.jsonSchemaStrings.boolean
  - typings.jsonSchema.jsonSchemaStrings.`object`
  - typings.jsonSchema.jsonSchemaStrings.array
  - typings.jsonSchema.jsonSchemaStrings.`null`
*/
trait JSONSchema7TypeName extends js.Object

object JSONSchema7TypeName {
  @scala.inline
  def array: typings.jsonSchema.jsonSchemaStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.jsonSchema.jsonSchemaStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typings.jsonSchema.jsonSchemaStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typings.jsonSchema.jsonSchemaStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.jsonSchema.jsonSchemaStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.jsonSchema.jsonSchemaStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.jsonSchema.jsonSchemaStrings.string = this.cast("string")
}

