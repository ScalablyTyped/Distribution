package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectivesPerLocation", JSImport.Namespace)
@js.native
object uniqueDirectivesPerLocationMod extends js.Object {
  def UniqueDirectivesPerLocation(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateDirectiveMessage(directiveName: String): String = js.native
}

