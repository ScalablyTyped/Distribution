package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownTypeNames", JSImport.Namespace)
@js.native
object validationRulesKnownTypeNamesMod extends js.Object {
  def KnownTypeNames(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def unknownTypeMessage(typeName: java.lang.String, suggestedTypes: js.Array[java.lang.String]): java.lang.String = js.native
}

