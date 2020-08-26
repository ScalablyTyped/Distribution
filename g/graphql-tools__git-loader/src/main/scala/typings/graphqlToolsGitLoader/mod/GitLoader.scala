package typings.graphqlToolsGitLoader.mod

import typings.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typings.graphqlToolsUtils.loadersMod.Loader
import typings.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typings.graphqlToolsUtils.loadersMod.SingleFileOptions
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/git-loader", "GitLoader")
@js.native
class GitLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, SingleFileOptions] {
  def canLoad(pointer: String): js.Promise[Boolean] = js.native
  @JSName("canLoadSync")
  def canLoadSync_MGitLoader(pointer: String): Boolean = js.native
  def load(pointer: String, options: GitLoaderOptions): js.Promise[Source] = js.native
  @JSName("loadSync")
  def loadSync_MGitLoader(pointer: String, options: GitLoaderOptions): Source = js.native
}

