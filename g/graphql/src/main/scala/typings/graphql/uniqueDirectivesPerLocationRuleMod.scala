package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectivesPerLocationRule", JSImport.Namespace)
@js.native
object uniqueDirectivesPerLocationRuleMod extends js.Object {
  def UniqueDirectivesPerLocationRule(context: ASTValidationContext): ASTVisitor = js.native
}

