package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.SDLValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueTypeNames", JSImport.Namespace)
@js.native
object validationRulesUniqueTypeNamesMod extends js.Object {
  def UniqueTypeNames(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateTypeNameMessage(typeName: String): String = js.native
  def existedTypeNameMessage(typeName: String): String = js.native
}

