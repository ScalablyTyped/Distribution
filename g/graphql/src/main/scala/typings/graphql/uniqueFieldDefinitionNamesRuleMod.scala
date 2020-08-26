package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueFieldDefinitionNamesRule", JSImport.Namespace)
@js.native
object uniqueFieldDefinitionNamesRuleMod extends js.Object {
  def UniqueFieldDefinitionNamesRule(context: SDLValidationContext): ASTVisitor = js.native
}

