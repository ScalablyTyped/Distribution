package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.ValueNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "astFromValue")
@js.native
object astFromValue extends js.Object {
  def apply(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
}

