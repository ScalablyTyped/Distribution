package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueTypeNames", JSImport.Namespace)
@js.native
object uniqueTypeNamesMod extends js.Object {
  def UniqueTypeNames(context: SDLValidationContext): ASTVisitor = js.native
}

