package typings.graphqlToolsCodeFileLoader.mod

import typings.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typings.graphqlToolsUtils.loadersMod.Loader
import typings.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/code-file-loader", "CodeFileLoader")
@js.native
class CodeFileLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, CodeFileLoaderOptions] {
  @JSName("canLoadSync")
  def canLoadSync_MCodeFileLoader(pointer: DocumentPointerSingle | SchemaPointerSingle, options: CodeFileLoaderOptions): Boolean = js.native
  @JSName("loadSync")
  def loadSync_MCodeFileLoader(pointer: DocumentPointerSingle | SchemaPointerSingle, options: CodeFileLoaderOptions): Source = js.native
}

