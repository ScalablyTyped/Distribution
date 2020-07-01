package typings.graphqlToolsUtils

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.SchemaMapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/mapSchema", JSImport.Namespace)
@js.native
object mapSchemaMod extends js.Object {
  def mapSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def mapSchema(schema: GraphQLSchema, schemaMapper: SchemaMapper): GraphQLSchema = js.native
}

