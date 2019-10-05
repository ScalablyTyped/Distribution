package typings.graphql.utilitiesBuildASTSchemaMod

import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", "buildASTSchema")
@js.native
object buildASTSchema extends js.Object {
  def apply(documentAST: DocumentNode): GraphQLSchema = js.native
  def apply(documentAST: DocumentNode, options: BuildSchemaOptions): GraphQLSchema = js.native
}

