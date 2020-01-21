package typings.graphql

import typings.graphql.validationContextMod.ASTValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/UniqueArgumentNames", JSImport.Namespace)
@js.native
object uniqueArgumentNamesMod extends js.Object {
  def UniqueArgumentNames(context: ASTValidationContext): ASTVisitor = js.native
  def duplicateArgMessage(argName: String): String = js.native
}

