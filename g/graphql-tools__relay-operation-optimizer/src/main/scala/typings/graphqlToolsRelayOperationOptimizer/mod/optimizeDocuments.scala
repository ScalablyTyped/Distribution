package typings.graphqlToolsRelayOperationOptimizer.mod

import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/relay-operation-optimizer", "optimizeDocuments")
@js.native
object optimizeDocuments extends js.Object {
  def apply(schema: GraphQLSchema, documents: js.Array[DocumentNode]): js.Array[DocumentNode] = js.native
  def apply(schema: GraphQLSchema, documents: js.Array[DocumentNode], options: OptimizeDocumentsOptions): js.Array[DocumentNode] = js.native
}

