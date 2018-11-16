package typings
package graphqlLib.validationValidationContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ASTValidationContext")
@js.native
class ASTValidationContext protected () extends js.Object {
  def this(ast: graphqlLib.languageAstMod.DocumentNode) = this()
  def getDocument(): graphqlLib.languageAstMod.DocumentNode = js.native
  def getErrors(): js.Array[graphqlLib.errorMod.GraphQLError] = js.native
  def reportError(error: graphqlLib.errorMod.GraphQLError): js.UndefOr[scala.Nothing] = js.native
}

