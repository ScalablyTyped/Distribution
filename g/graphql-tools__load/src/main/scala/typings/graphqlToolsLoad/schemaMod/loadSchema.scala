package typings.graphqlToolsLoad.schemaMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/load/schema", "loadSchema")
@js.native
object loadSchema extends js.Object {
  def apply(schemaPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadSchemaOptions): js.Promise[GraphQLSchema] = js.native
  def apply(schemaPointers: UnnormalizedTypeDefPointer, options: LoadSchemaOptions): js.Promise[GraphQLSchema] = js.native
}

