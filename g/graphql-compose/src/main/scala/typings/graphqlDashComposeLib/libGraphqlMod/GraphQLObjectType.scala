package typings
package graphqlDashComposeLib.libGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected ()
  extends graphqlLib.graphqlMod.GraphQLObjectType[TSource, TContext, TArgs] {
  def this(config: graphqlLib.typeDefinitionMod.GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
}

