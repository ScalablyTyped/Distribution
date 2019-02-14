package typings
package graphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected ()
  extends graphqlLib.typeMod.GraphQLObjectType[TSource, TContext, TArgs] {
  def this(config: graphqlLib.typeDefinitionMod.GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
}

