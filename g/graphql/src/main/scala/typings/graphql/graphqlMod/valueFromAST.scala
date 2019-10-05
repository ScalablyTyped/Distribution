package typings.graphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.ValueNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "valueFromAST")
@js.native
object valueFromAST extends js.Object {
  def apply(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def apply(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
}

