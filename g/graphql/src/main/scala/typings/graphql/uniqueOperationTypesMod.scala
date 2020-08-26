package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueOperationTypes", JSImport.Namespace)
@js.native
object uniqueOperationTypesMod extends js.Object {
  def UniqueOperationTypes(context: SDLValidationContext): ASTVisitor = js.native
}

