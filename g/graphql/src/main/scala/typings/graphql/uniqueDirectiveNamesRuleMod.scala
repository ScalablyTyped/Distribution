package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectiveNamesRule", JSImport.Namespace)
@js.native
object uniqueDirectiveNamesRuleMod extends js.Object {
  def UniqueDirectiveNamesRule(context: SDLValidationContext): ASTVisitor = js.native
}

