package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/print-schema-with-directives", JSImport.Namespace)
@js.native
object printSchemaWithDirectivesMod extends js.Object {
  def printSchemaWithDirectives(schema: GraphQLSchema): String = js.native
  def printSchemaWithDirectives(schema: GraphQLSchema, _options: SchemaPrintOptions): String = js.native
}

