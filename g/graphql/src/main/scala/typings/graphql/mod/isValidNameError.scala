package typings.graphql.mod

import typings.graphql.astMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "isValidNameError")
@js.native
object isValidNameError extends js.Object {
  def apply(name: String): js.UndefOr[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def apply(name: String, node: ASTNode): js.UndefOr[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
}

