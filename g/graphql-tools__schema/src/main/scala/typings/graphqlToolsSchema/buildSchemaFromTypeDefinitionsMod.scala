package typings.graphqlToolsSchema

import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.GraphQLParseOptions
import typings.graphqlToolsUtils.interfacesMod.ITypeDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/buildSchemaFromTypeDefinitions", JSImport.Namespace)
@js.native
object buildSchemaFromTypeDefinitionsMod extends js.Object {
  def buildDocumentFromTypeDefinitions(typeDefinitions: ITypeDefinitions): DocumentNode = js.native
  def buildDocumentFromTypeDefinitions(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): DocumentNode = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: ITypeDefinitions): GraphQLSchema = js.native
  def buildSchemaFromTypeDefinitions(typeDefinitions: ITypeDefinitions, parseOptions: GraphQLParseOptions): GraphQLSchema = js.native
  def isDocumentNode(typeDefinitions: ITypeDefinitions): /* is graphql.graphql/language/ast.DocumentNode */ Boolean = js.native
}

