package typings
package graphqlLib.utilitiesBuildASTSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildASTSchema(documentAST: graphqlLib.languageAstMod.DocumentNode): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildASTSchema(
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: graphqlLib.languageSourceMod.Source): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: graphqlLib.languageSourceMod.Source,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions with graphqlLib.languageParserMod.ParseOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: java.lang.String): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: java.lang.String,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions with graphqlLib.languageParserMod.ParseOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def getDescription(
    node: graphqlLib.Anon_Description,
    options: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions]
  ): js.UndefOr[java.lang.String] = js.native
}

