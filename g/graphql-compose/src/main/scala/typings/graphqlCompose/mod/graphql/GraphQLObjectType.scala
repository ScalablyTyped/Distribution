package typings.graphqlCompose.mod.graphql

import typings.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends typings.graphqlCompose.graphqlMod.GraphQLObjectType[TSource, TContext] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext]) = this()
}

