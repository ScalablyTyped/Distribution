package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/VariablesAreInputTypes", JSImport.Namespace)
@js.native
object variablesAreInputTypesMod extends js.Object {
  def VariablesAreInputTypes(context: ValidationContext): ASTVisitor = js.native
  def nonInputTypeOnVarMessage(variableName: String, typeName: String): String = js.native
}

