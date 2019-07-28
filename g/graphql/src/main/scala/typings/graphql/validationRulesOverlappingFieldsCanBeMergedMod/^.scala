package typings.graphql.validationRulesOverlappingFieldsCanBeMergedMod

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/OverlappingFieldsCanBeMerged", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def OverlappingFieldsCanBeMerged(context: ValidationContext): ASTVisitor = js.native
  def fieldsConflictMessage(responseName: String, reason: ConflictReasonMessage): String = js.native
}

