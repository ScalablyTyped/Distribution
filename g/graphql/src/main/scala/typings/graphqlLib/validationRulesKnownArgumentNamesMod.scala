package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownArgumentNames", JSImport.Namespace)
@js.native
object validationRulesKnownArgumentNamesMod extends js.Object {
  def KnownArgumentNames(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def KnownArgumentNamesOnDirectives(context: graphqlLib.validationValidationContextMod.SDLValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def KnownArgumentNamesOnDirectives(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def unknownArgMessage(
    argName: java.lang.String,
    fieldName: java.lang.String,
    typeName: java.lang.String,
    suggestedArgs: js.Array[java.lang.String]
  ): java.lang.String = js.native
  def unknownDirectiveArgMessage(
    argName: java.lang.String,
    directiveName: java.lang.String,
    suggestedArgs: js.Array[java.lang.String]
  ): java.lang.String = js.native
}

