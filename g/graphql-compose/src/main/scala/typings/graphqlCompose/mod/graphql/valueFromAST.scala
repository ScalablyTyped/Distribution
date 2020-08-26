package typings.graphqlCompose.mod.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ValueNode
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.valueFromAST")
@js.native
object valueFromAST extends js.Object {
  def apply(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def apply(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
}

