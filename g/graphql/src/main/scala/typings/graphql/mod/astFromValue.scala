package typings.graphql.mod

import typings.graphql.astMod.ValueNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "astFromValue")
@js.native
object astFromValue extends js.Object {
  def apply(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
}

