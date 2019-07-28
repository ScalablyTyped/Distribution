package typings.graphql.validationValidationContextMod

import typings.graphql.errorMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/validation/ValidationContext", "ASTValidationContext")
@js.native
class ASTValidationContext protected () extends js.Object {
  def this(ast: DocumentNode) = this()
  def getDocument(): DocumentNode = js.native
  def getErrors(): js.Array[GraphQLError] = js.native
  def reportError(error: GraphQLError): js.UndefOr[scala.Nothing] = js.native
}

