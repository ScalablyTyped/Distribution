package typings.graphql

import typings.graphql.maybeMod.Maybe
import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/NoUnusedVariables", JSImport.Namespace)
@js.native
object noUnusedVariablesMod extends js.Object {
  def NoUnusedVariables(context: ValidationContext): ASTVisitor = js.native
  def unusedVariableMessage(varName: String, opName: Maybe[String]): String = js.native
}

