package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedFragmentsRule", JSImport.Namespace)
@js.native
object noUnusedFragmentsRuleMod extends js.Object {
  def NoUnusedFragmentsRule(context: ValidationContext): ASTVisitor = js.native
}

