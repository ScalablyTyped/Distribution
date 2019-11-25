package typings.jsonDashSchema.jsonDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsonDashSchema.jsonDashSchemaStrings.string
  - typings.jsonDashSchema.jsonDashSchemaStrings.number
  - typings.jsonDashSchema.jsonDashSchemaStrings.integer
  - typings.jsonDashSchema.jsonDashSchemaStrings.boolean
  - typings.jsonDashSchema.jsonDashSchemaStrings.`object`
  - typings.jsonDashSchema.jsonDashSchemaStrings.array
  - typings.jsonDashSchema.jsonDashSchemaStrings.`null`
*/
trait JSONSchema7TypeName extends js.Object

object JSONSchema7TypeName {
  @scala.inline
  def array: typings.jsonDashSchema.jsonDashSchemaStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.jsonDashSchema.jsonDashSchemaStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typings.jsonDashSchema.jsonDashSchemaStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typings.jsonDashSchema.jsonDashSchemaStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.jsonDashSchema.jsonDashSchemaStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.jsonDashSchema.jsonDashSchemaStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.jsonDashSchema.jsonDashSchemaStrings.string = this.cast("string")
}

