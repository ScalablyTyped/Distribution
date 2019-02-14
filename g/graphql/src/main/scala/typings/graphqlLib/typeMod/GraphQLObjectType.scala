package typings
package graphqlLib.typeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext, TArgs] protected ()
  extends graphqlLib.typeDefinitionMod.GraphQLObjectType[TSource, TContext, TArgs] {
  def this(config: graphqlLib.typeDefinitionMod.GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
}

