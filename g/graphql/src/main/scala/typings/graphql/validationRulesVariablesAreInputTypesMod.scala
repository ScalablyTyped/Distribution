package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/VariablesAreInputTypes", JSImport.Namespace)
@js.native
object validationRulesVariablesAreInputTypesMod extends js.Object {
  def VariablesAreInputTypes(context: ValidationContext): ASTVisitor = js.native
  def nonInputTypeOnVarMessage(variableName: String, typeName: String): String = js.native
}

