package typings.graphql

import typings.graphql.validationContextMod.SDLValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueEnumValueNamesRule", JSImport.Namespace)
@js.native
object uniqueEnumValueNamesRuleMod extends js.Object {
  def UniqueEnumValueNamesRule(context: SDLValidationContext): ASTVisitor = js.native
}

