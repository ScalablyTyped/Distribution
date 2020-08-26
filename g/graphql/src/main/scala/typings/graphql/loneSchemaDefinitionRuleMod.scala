package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneSchemaDefinitionRule", JSImport.Namespace)
@js.native
object loneSchemaDefinitionRuleMod extends js.Object {
  def LoneSchemaDefinitionRule(context: SDLValidationContext): ASTVisitor = js.native
}

