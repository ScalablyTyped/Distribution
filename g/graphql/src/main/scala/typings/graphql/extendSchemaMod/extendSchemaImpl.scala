package typings.graphql.extendSchemaMod

import typings.graphql.astMod.DocumentNode
import typings.graphql.schemaMod.GraphQLSchemaNormalizedConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/extendSchema", "extendSchemaImpl")
@js.native
object extendSchemaImpl extends js.Object {
  def apply(schemaConfig: GraphQLSchemaNormalizedConfig, documentAST: DocumentNode): GraphQLSchemaNormalizedConfig = js.native
  def apply(schemaConfig: GraphQLSchemaNormalizedConfig, documentAST: DocumentNode, options: Options): GraphQLSchemaNormalizedConfig = js.native
}

