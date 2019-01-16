package typings
package graphqlLib.typeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLObjectType")
@js.native
class GraphQLObjectType[TSource, TContext] protected ()
  extends graphqlLib.typeDefinitionMod.GraphQLObjectType[TSource, TContext] {
  def this(config: graphqlLib.typeDefinitionMod.GraphQLObjectTypeConfig[TSource, TContext]) = this()
}

