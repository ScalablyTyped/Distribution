package typings.graphql

import typings.graphql.validationContextMod.ValidationContext
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/ScalarLeafsRule", JSImport.Namespace)
@js.native
object scalarLeafsRuleMod extends js.Object {
  def ScalarLeafsRule(context: ValidationContext): ASTVisitor = js.native
}

