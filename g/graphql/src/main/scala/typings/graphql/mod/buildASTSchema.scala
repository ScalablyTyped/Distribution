package typings.graphql.mod

import typings.graphql.astMod.DocumentNode
import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildASTSchema")
@js.native
object buildASTSchema extends js.Object {
  def apply(documentAST: DocumentNode): typings.graphql.schemaMod.GraphQLSchema = js.native
  def apply(documentAST: DocumentNode, options: BuildSchemaOptions): typings.graphql.schemaMod.GraphQLSchema = js.native
}

