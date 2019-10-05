package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.ASTNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "locatedError")
@js.native
object locatedError extends js.Object {
  def apply(
    originalError: typings.graphql.errorGraphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typings.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def apply(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typings.graphql.errorGraphQLErrorMod.GraphQLError = js.native
}

