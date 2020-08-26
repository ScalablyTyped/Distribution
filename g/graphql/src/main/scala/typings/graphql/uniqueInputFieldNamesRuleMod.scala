package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueInputFieldNamesRule", JSImport.Namespace)
@js.native
object uniqueInputFieldNamesRuleMod extends js.Object {
  def UniqueInputFieldNamesRule(context: ASTValidationContext): ASTVisitor = js.native
}

