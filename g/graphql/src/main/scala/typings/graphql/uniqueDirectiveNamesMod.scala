package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueDirectiveNames", JSImport.Namespace)
@js.native
object uniqueDirectiveNamesMod extends js.Object {
  def UniqueDirectiveNames(context: SDLValidationContext): ASTVisitor = js.native
}

