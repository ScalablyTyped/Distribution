package typings.graphqlToolsGraphqlFileLoader.mod

import typings.graphqlToolsGraphqlFileLoader.anon.Document
import typings.graphqlToolsGraphqlFileLoader.anon.Location
import typings.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typings.graphqlToolsUtils.loadersMod.Loader
import typings.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/graphql-file-loader", "GraphQLFileLoader")
@js.native
class GraphQLFileLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, GraphQLFileLoaderOptions] {
  @JSName("canLoadSync")
  def canLoadSync_MGraphQLFileLoader(pointer: DocumentPointerSingle | SchemaPointerSingle, options: GraphQLFileLoaderOptions): Boolean = js.native
  def handleFileContent(rawSDL: String, pointer: String, options: GraphQLFileLoaderOptions): Document | Location = js.native
  @JSName("loadSync")
  def loadSync_MGraphQLFileLoader(pointer: DocumentPointerSingle | SchemaPointerSingle, options: GraphQLFileLoaderOptions): Source = js.native
}

