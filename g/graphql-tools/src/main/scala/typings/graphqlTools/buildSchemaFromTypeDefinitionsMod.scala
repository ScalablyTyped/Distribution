package typings.graphqlTools

import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.GraphQLParseOptions
import typings.graphqlTools.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/generate/buildSchemaFromTypeDefinitions", JSImport.Namespace)
@js.native
object buildSchemaFromTypeDefinitionsMod extends js.Object {
  def default(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def default(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
}

