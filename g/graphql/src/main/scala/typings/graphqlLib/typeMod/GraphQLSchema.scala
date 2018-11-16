package typings
package graphqlLib.typeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends graphqlLib.typeSchemaMod.GraphQLSchema {
  def this(config: graphqlLib.typeSchemaMod.GraphQLSchemaConfig) = this()
}

