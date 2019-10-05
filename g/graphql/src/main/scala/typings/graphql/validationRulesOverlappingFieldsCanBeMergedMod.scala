package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationRulesOverlappingFieldsCanBeMergedMod.ConflictReason
import typings.graphql.validationRulesOverlappingFieldsCanBeMergedMod.ConflictReasonMessage
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/OverlappingFieldsCanBeMerged", JSImport.Namespace)
@js.native
object validationRulesOverlappingFieldsCanBeMergedMod extends js.Object {
  def OverlappingFieldsCanBeMerged(context: ValidationContext): ASTVisitor = js.native
  def fieldsConflictMessage(responseName: String, reason: ConflictReasonMessage): String = js.native
  // Field name and reason.
  type ConflictReason = js.Tuple2[String, String]
  // Reason is a string, or a nested list of conflicts.
  type ConflictReasonMessage = String | js.Array[ConflictReason]
}

