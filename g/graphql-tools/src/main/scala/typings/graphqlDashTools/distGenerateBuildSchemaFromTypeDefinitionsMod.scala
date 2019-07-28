package typings.graphqlDashTools

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.GraphQLParseOptions
import typings.graphqlDashTools.distInterfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/buildSchemaFromTypeDefinitions", JSImport.Namespace)
@js.native
object distGenerateBuildSchemaFromTypeDefinitionsMod extends js.Object {
  def default(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def default(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
}

