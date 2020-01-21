package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneSchemaDefinition", JSImport.Namespace)
@js.native
object loneSchemaDefinitionMod extends js.Object {
  def LoneSchemaDefinition(context: SDLValidationContext): ASTVisitor = js.native
  def canNotDefineSchemaWithinExtensionMessage(): String = js.native
  def schemaDefinitionNotAloneMessage(): String = js.native
}

