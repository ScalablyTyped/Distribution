package typings.graphqlTools.mod

import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "fixSchemaAst")
@js.native
object fixSchemaAst extends js.Object {
  def apply(schema: GraphQLSchema, options: BuildSchemaOptions with SchemaPrintOptions): GraphQLSchema = js.native
}

