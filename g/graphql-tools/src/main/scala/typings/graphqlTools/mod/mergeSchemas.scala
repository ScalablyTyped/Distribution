package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMerge.mergeSchemasMod.MergeSchemasConfig
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "mergeSchemas")
@js.native
object mergeSchemas extends js.Object {
  def apply(config: MergeSchemasConfig[IResolvers[_, _, Record[String, _], _]]): GraphQLSchema = js.native
}

