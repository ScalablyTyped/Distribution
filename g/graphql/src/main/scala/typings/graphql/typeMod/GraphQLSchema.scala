package typings.graphql.typeMod

import typings.graphql.anon.ReadonlyGraphQLSchemaConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/type", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends typings.graphql.schemaMod.GraphQLSchema {
  def this(config: ReadonlyGraphQLSchemaConf) = this()
}

