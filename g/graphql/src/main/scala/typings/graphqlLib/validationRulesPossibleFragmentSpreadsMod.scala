package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/PossibleFragmentSpreads", JSImport.Namespace)
@js.native
object validationRulesPossibleFragmentSpreadsMod extends js.Object {
  def PossibleFragmentSpreads(context: graphqlLib.validationValidationContextMod.ValidationContext): graphqlLib.languageVisitorMod.ASTVisitor = js.native
  def typeIncompatibleAnonSpreadMessage(parentType: java.lang.String, fragType: java.lang.String): java.lang.String = js.native
  def typeIncompatibleSpreadMessage(fragName: java.lang.String, parentType: java.lang.String, fragType: java.lang.String): java.lang.String = js.native
}

