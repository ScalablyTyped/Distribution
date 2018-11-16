package typings
package graphqlLib.utilitiesBuildASTSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/buildASTSchema", JSImport.Namespace)
@js.native
object utilitiesBuildASTSchemaModMembers extends js.Object {
  def buildASTSchema(documentAST: graphqlLib.languageAstMod.DocumentNode): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildASTSchema(documentAST: graphqlLib.languageAstMod.DocumentNode, options: BuildSchemaOptions): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: graphqlLib.languageSourceMod.Source): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: graphqlLib.languageSourceMod.Source,
    options: BuildSchemaOptions with graphqlLib.languageParserMod.ParseOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: java.lang.String): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: java.lang.String,
    options: BuildSchemaOptions with graphqlLib.languageParserMod.ParseOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def getDescription(node: graphqlLib.Anon_Description, options: graphqlLib.tsutilsMaybeMod.Maybe[BuildSchemaOptions]): js.UndefOr[java.lang.String] = js.native
}

