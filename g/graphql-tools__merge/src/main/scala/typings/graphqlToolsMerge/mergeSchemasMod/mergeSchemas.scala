package typings.graphqlToolsMerge.mergeSchemasMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/merge/merge-schemas", "mergeSchemas")
@js.native
object mergeSchemas extends js.Object {
  def apply(config: MergeSchemasConfig[IResolvers[_, _, Record[String, _], _]]): GraphQLSchema = js.native
}

