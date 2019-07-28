package typings.graphql.typeMod

import typings.graphql.typeDefinitionMod.GraphQLObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected ()
  extends typings.graphql.typeDefinitionMod.GraphQLObjectType[TSource, TContext, TArgs] {
  def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
}

