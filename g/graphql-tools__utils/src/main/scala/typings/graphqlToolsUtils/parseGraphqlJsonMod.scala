package typings.graphqlToolsUtils

import typings.graphql.parserMod.ParseOptions
import typings.graphql.schemaMod.GraphQLSchemaValidationOptions
import typings.graphqlToolsUtils.loadersMod.Source
import typings.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/parse-graphql-json", JSImport.Namespace)
@js.native
object parseGraphqlJsonMod extends js.Object {
  def parseGraphQLJSON(
    location: String,
    jsonContent: String,
    options: SchemaPrintOptions with ParseOptions with GraphQLSchemaValidationOptions
  ): Source = js.native
}

