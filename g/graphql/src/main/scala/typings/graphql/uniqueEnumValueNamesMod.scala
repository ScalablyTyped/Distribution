package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueEnumValueNames", JSImport.Namespace)
@js.native
object uniqueEnumValueNamesMod extends js.Object {
  def UniqueEnumValueNames(context: SDLValidationContext): ASTVisitor = js.native
  def duplicateEnumValueNameMessage(typeName: String, valueName: String): String = js.native
  def existedEnumValueNameMessage(typeName: String, valueName: String): String = js.native
}

