package typings.joi.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("joi", "validate")
@js.native
object validate extends js.Object {
  def apply[T](value: T, schema: SchemaLike): ValidationResult[T] = js.native
  def apply[T](value: T, schema: SchemaLike, options: ValidationOptions): ValidationResult[T] = js.native
  def apply[T, R](value: T, schema: SchemaLike, callback: js.Function2[/* err */ ValidationError, /* value */ T, R]): R = js.native
  def apply[T, R](
    value: T,
    schema: SchemaLike,
    options: ValidationOptions,
    callback: js.Function2[/* err */ ValidationError, /* value */ T, R]
  ): R = js.native
}

