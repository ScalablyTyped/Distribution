package typings.graphqlToolsUtils.pruneMod

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/prune", "pruneSchema")
@js.native
object pruneSchema extends js.Object {
  def apply(schema: GraphQLSchema): GraphQLSchema = js.native
  def apply(schema: GraphQLSchema, options: PruneSchemaOptions): GraphQLSchema = js.native
}

