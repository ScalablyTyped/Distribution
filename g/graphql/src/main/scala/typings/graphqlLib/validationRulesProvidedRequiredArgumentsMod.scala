package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ProvidedRequiredArguments", JSImport.Namespace)
@js.native
object validationRulesProvidedRequiredArgumentsMod extends js.Object {
  def ProvidedRequiredArguments(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def ProvidedRequiredArgumentsOnDirectives(context: graphqlLib.validationValidationContextMod.SDLValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def ProvidedRequiredArgumentsOnDirectives(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def missingDirectiveArgMessage(directiveName: java.lang.String, argName: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
  def missingFieldArgMessage(fieldName: java.lang.String, argName: java.lang.String, `type`: java.lang.String): java.lang.String = js.native
}

