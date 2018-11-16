package typings
package jsonschemaLib.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonschema", "ValidatorResult")
@js.native
class ValidatorResult protected () extends js.Object {
  def this(instance: js.Any, schema: Schema, options: Options, ctx: SchemaContext) = this()
  var disableFormat: scala.Boolean = js.native
  var errors: js.Array[ValidationError] = js.native
  var instance: js.Any = js.native
  var propertyPath: java.lang.String = js.native
  var schema: Schema = js.native
  var throwError: scala.Boolean = js.native
  var valid: scala.Boolean = js.native
  def addError(detail: java.lang.String): ValidationError = js.native
  def addError(detail: ErrorDetail): ValidationError = js.native
}

