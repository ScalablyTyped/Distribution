package typings.graphql.mod

import typings.graphql.anon.ReadonlyGraphQLSchemaConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends typings.graphql.typeMod.GraphQLSchema {
  def this(config: ReadonlyGraphQLSchemaConf) = this()
}

