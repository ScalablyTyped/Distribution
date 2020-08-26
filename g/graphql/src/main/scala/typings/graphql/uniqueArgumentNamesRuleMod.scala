package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueArgumentNamesRule", JSImport.Namespace)
@js.native
object uniqueArgumentNamesRuleMod extends js.Object {
  def UniqueArgumentNamesRule(context: ASTValidationContext): ASTVisitor = js.native
}

