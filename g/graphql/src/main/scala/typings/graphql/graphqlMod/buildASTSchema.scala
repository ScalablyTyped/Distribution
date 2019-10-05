package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.utilitiesBuildASTSchemaMod.BuildSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildASTSchema")
@js.native
object buildASTSchema extends js.Object {
  def apply(documentAST: DocumentNode): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(documentAST: DocumentNode, options: BuildSchemaOptions): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
}

