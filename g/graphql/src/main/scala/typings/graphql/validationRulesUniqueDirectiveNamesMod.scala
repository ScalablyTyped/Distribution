package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.SDLValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectiveNames", JSImport.Namespace)
@js.native
object validationRulesUniqueDirectiveNamesMod extends js.Object {
  def UniqueDirectiveNames(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateDirectiveNameMessage(directiveName: String): String = js.native
  def existedDirectiveNameMessage(directiveName: String): String = js.native
}

