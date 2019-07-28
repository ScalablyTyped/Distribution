package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectivesPerLocation", JSImport.Namespace)
@js.native
object validationRulesUniqueDirectivesPerLocationMod extends js.Object {
  def UniqueDirectivesPerLocation(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateDirectiveMessage(directiveName: String): String = js.native
}

