package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.SDLValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueFieldDefinitionNames", JSImport.Namespace)
@js.native
object validationRulesUniqueFieldDefinitionNamesMod extends js.Object {
  def UniqueFieldDefinitionNames(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateFieldDefinitionNameMessage(typeName: String, fieldName: String): String = js.native
  def existedFieldDefinitionNameMessage(typeName: String, fieldName: String): String = js.native
}

