package typings.jsonSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-schema", "validate")
@js.native
object validate extends js.Object {
  
  def apply(instance: js.Object, schema: JSONSchema4): ValidationResult = js.native
  def apply(instance: js.Object, schema: JSONSchema6): ValidationResult = js.native
  def apply(instance: js.Object, schema: JSONSchema7): ValidationResult = js.native
}
