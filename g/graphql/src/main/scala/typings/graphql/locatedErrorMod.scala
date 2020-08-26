package typings.graphql

import typings.graphql.astMod.ASTNode
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.maybeMod.Maybe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/error/locatedError", JSImport.Namespace)
@js.native
object locatedErrorMod extends js.Object {
  def locatedError(originalError: GraphQLError): GraphQLError = js.native
  def locatedError(
    originalError: GraphQLError,
    nodes: js.UndefOr[scala.Nothing],
    path: Maybe[js.Array[String | Double]]
  ): GraphQLError = js.native
  def locatedError(originalError: GraphQLError, nodes: js.Array[ASTNode]): GraphQLError = js.native
  def locatedError(originalError: GraphQLError, nodes: js.Array[ASTNode], path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
  def locatedError(originalError: GraphQLError, nodes: ASTNode): GraphQLError = js.native
  def locatedError(originalError: GraphQLError, nodes: ASTNode, path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
  def locatedError(originalError: Error): GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.UndefOr[scala.Nothing], path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode]): GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
  def locatedError(originalError: Error, nodes: ASTNode): GraphQLError = js.native
  def locatedError(originalError: Error, nodes: ASTNode, path: Maybe[js.Array[String | Double]]): GraphQLError = js.native
}

