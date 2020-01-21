package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/KnownFragmentNames", JSImport.Namespace)
@js.native
object knownFragmentNamesMod extends js.Object {
  def KnownFragmentNames(context: ValidationContext): ASTVisitor = js.native
  def unknownFragmentMessage(fragName: String): String = js.native
}

