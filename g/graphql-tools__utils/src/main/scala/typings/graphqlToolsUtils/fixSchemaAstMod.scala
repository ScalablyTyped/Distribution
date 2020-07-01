package typings.graphqlToolsUtils

import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/fix-schema-ast", JSImport.Namespace)
@js.native
object fixSchemaAstMod extends js.Object {
  def fixSchemaAst(schema: GraphQLSchema, options: BuildSchemaOptions with SchemaPrintOptions): GraphQLSchema = js.native
}

