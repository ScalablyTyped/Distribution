package typings.graphql.typeMod

import typings.graphql.schemaMod.GraphQLSchemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends typings.graphql.schemaMod.GraphQLSchema {
  def this(config: GraphQLSchemaConfig) = this()
}

