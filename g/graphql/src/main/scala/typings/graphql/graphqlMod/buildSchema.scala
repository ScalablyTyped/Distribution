package typings.graphql.graphqlMod

import typings.graphql.languageParserMod.ParseOptions
import typings.graphql.utilitiesBuildASTSchemaMod.BuildSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildSchema")
@js.native
object buildSchema extends js.Object {
  def apply(source: String): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(source: String, options: BuildSchemaOptions with ParseOptions): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(source: typings.graphql.languageSourceMod.Source): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def apply(source: typings.graphql.languageSourceMod.Source, options: BuildSchemaOptions with ParseOptions): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
}

