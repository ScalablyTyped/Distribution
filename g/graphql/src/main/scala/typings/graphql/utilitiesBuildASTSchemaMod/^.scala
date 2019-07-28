package typings.graphql.utilitiesBuildASTSchemaMod

import typings.graphql.Anon_Description
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageParserMod.ParseOptions
import typings.graphql.languageSourceMod.Source
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildASTSchema(documentAST: DocumentNode): GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): GraphQLSchema = js.native
  def buildSchema(source: String): GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def buildSchema(source: Source): GraphQLSchema = js.native
  def buildSchema(source: Source, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def getDescription(node: Anon_Description, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
}

