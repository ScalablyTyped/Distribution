package typings.graphql.mod

import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import typings.graphql.parserMod.ParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "buildSchema")
@js.native
object buildSchema extends js.Object {
  def apply(source: String): typings.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: String, options: BuildSchemaOptions with ParseOptions): typings.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: typings.graphql.sourceMod.Source): typings.graphql.schemaMod.GraphQLSchema = js.native
  def apply(source: typings.graphql.sourceMod.Source, options: BuildSchemaOptions with ParseOptions): typings.graphql.schemaMod.GraphQLSchema = js.native
}

