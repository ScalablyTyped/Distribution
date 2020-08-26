package typings.graphqlToolsWrap.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SyncExecutor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap", "introspectSchemaSync")
@js.native
object introspectSchemaSync extends js.Object {
  def apply(executor: SyncExecutor): GraphQLSchema = js.native
  def apply(executor: SyncExecutor, context: Record[String, _]): GraphQLSchema = js.native
}

