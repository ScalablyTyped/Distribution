package typings.graphqlDashCompose.libGraphqlMod

import typings.graphql.typeDefinitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected ()
  extends typings.graphql.graphqlMod.GraphQLObjectType[TSource, TContext, TArgs] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
}

