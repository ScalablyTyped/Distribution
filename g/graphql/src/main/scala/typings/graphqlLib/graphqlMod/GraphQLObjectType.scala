package typings
package graphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends graphqlLib.typeMod.GraphQLObjectType[TSource, TContext] {
  def this(config: graphqlLib.typeDefinitionMod.GraphQLObjectTypeConfig[TSource, TContext]) = this()
}

