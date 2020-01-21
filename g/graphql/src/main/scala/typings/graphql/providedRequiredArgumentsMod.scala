package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ProvidedRequiredArguments", JSImport.Namespace)
@js.native
object providedRequiredArgumentsMod extends js.Object {
  def ProvidedRequiredArguments(context: ValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsOnDirectives(context: SDLValidationContext): ASTVisitor = js.native
  def ProvidedRequiredArgumentsOnDirectives(context: ValidationContext): ASTVisitor = js.native
  def missingDirectiveArgMessage(directiveName: String, argName: String, `type`: String): String = js.native
  def missingFieldArgMessage(fieldName: String, argName: String, `type`: String): String = js.native
}

