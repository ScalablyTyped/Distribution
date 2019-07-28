package typings.graphql

import typings.graphql.languageVisitorMod.ASTVisitor
import typings.graphql.validationValidationContextMod.ASTValidationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/rules/LoneAnonymousOperation", JSImport.Namespace)
@js.native
object validationRulesLoneAnonymousOperationMod extends js.Object {
  def LoneAnonymousOperation(context: ASTValidationContext): ASTVisitor = js.native
  def anonOperationNotAloneMessage(): String = js.native
}

