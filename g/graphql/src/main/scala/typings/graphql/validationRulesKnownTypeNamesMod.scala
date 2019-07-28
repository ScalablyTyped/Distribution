package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownTypeNames", JSImport.Namespace)
@js.native
object validationRulesKnownTypeNamesMod extends js.Object {
  def KnownTypeNames(context: ValidationContext): ASTVisitor = js.native
  def unknownTypeMessage(typeName: String, suggestedTypes: js.Array[String]): String = js.native
}

