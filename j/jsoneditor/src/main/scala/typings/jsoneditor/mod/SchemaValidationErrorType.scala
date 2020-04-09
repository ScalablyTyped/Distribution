package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsoneditor.jsoneditorStrings.validation
  - typings.jsoneditor.jsoneditorStrings.customValidation
*/
trait SchemaValidationErrorType extends js.Object

object SchemaValidationErrorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def customValidation: typings.jsoneditor.jsoneditorStrings.customValidation = this.cast("customValidation")
  @scala.inline
  def validation: typings.jsoneditor.jsoneditorStrings.validation = this.cast("validation")
}

