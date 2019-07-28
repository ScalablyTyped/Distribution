package typings.graphql.graphqlMod

import typings.graphql.typeDefinitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected ()
  extends typings.graphql.typeMod.GraphQLObjectType[TSource, TContext, TArgs] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
}

