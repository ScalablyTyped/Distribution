package typings.graphqlToolsWrap

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.AsyncExecutor
import typings.graphqlToolsDelegate.typesMod.SyncExecutor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/introspect", JSImport.Namespace)
@js.native
object introspectMod extends js.Object {
  def introspectSchema(executor: AsyncExecutor): js.Promise[GraphQLSchema] = js.native
  def introspectSchema(executor: AsyncExecutor, context: Record[String, _]): js.Promise[GraphQLSchema] = js.native
  def introspectSchemaSync(executor: SyncExecutor): GraphQLSchema = js.native
  def introspectSchemaSync(executor: SyncExecutor, context: Record[String, _]): GraphQLSchema = js.native
}

