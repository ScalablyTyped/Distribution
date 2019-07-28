package typings.graphql.graphqlMod

import typings.graphql.typeSchemaMod.GraphQLSchemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends typings.graphql.typeMod.GraphQLSchema {
  def this(config: GraphQLSchemaConfig) = this()
}

