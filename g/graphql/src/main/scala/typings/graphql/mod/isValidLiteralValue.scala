package typings.graphql.mod

import typings.graphql.astMod.ValueNode
import typings.graphql.definitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "isValidLiteralValue")
@js.native
object isValidLiteralValue extends js.Object {
  def apply(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
}

