package typings.graphqlToolsJsonFileLoader

import typings.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typings.graphqlToolsUtils.loadersMod.Loader
import typings.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typings.graphqlToolsUtils.loadersMod.SingleFileOptions
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/json-file-loader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonFileLoader () extends Loader[DocumentPointerSingle, SingleFileOptions] {
    @JSName("canLoadSync")
    def canLoadSync_MJsonFileLoader(pointer: SchemaPointerSingle, options: JsonFileLoaderOptions): Boolean = js.native
    @JSName("loadSync")
    def loadSync_MJsonFileLoader(pointer: SchemaPointerSingle, options: JsonFileLoaderOptions): Source = js.native
  }
  
  type JsonFileLoaderOptions = SingleFileOptions
}

