package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownTypeNamesRule", JSImport.Namespace)
@js.native
object knownTypeNamesRuleMod extends js.Object {
  def KnownTypeNamesRule(context: SDLValidationContext): ASTVisitor = js.native
  def KnownTypeNamesRule(context: ValidationContext): ASTVisitor = js.native
}

