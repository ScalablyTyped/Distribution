package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueTypeNamesRule", JSImport.Namespace)
@js.native
object uniqueTypeNamesRuleMod extends js.Object {
  def UniqueTypeNamesRule(context: SDLValidationContext): ASTVisitor = js.native
}

