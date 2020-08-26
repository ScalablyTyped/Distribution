package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/FragmentsOnCompositeTypesRule", JSImport.Namespace)
@js.native
object fragmentsOnCompositeTypesRuleMod extends js.Object {
  def FragmentsOnCompositeTypesRule(context: ValidationContext): ASTVisitor = js.native
}

