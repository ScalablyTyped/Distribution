package typings.graphql.typeMod

import typings.graphql.typeSchemaMod.GraphQLSchemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends typings.graphql.typeSchemaMod.GraphQLSchema {
  def this(config: GraphQLSchemaConfig) = this()
}

