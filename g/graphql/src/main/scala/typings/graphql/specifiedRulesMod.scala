package typings.graphql

import typings.graphql.validationContextMod.SDLValidationRule
import typings.graphql.validationContextMod.ValidationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/specifiedRules", JSImport.Namespace)
@js.native
object specifiedRulesMod extends js.Object {
  val specifiedRules: js.Array[ValidationRule] = js.native
  val specifiedSDLRules: js.Array[SDLValidationRule] = js.native
}

