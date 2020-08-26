package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "applySchemaTransforms")
@js.native
object applySchemaTransforms extends js.Object {
  def apply(originalSchema: GraphQLSchema, transforms: js.Array[Transform[Record[String, _]]]): GraphQLSchema = js.native
}

