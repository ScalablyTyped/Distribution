package typings.graphqlCompose.graphqlMod

import typings.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends typings.graphql.mod.GraphQLObjectType[TSource, TContext] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext]) = this()
}

