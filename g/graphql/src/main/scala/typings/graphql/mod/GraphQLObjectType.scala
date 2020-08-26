package typings.graphql.mod

import typings.graphql.definitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends typings.graphql.typeMod.GraphQLObjectType[TSource, TContext] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext]) = this()
}

