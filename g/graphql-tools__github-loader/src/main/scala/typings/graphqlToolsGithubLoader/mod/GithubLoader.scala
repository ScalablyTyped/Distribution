package typings.graphqlToolsGithubLoader.mod

import typings.graphqlToolsGithubLoader.anon.Document
import typings.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typings.graphqlToolsUtils.loadersMod.Loader
import typings.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/github-loader", "GithubLoader")
@js.native
class GithubLoader () extends Loader[SchemaPointerSingle | DocumentPointerSingle, GithubLoaderOptions] {
  def canLoad(pointer: String): js.Promise[Boolean] = js.native
  @JSName("canLoadSync")
  def canLoadSync_MGithubLoader(): Boolean = js.native
  def load(pointer: String, options: GithubLoaderOptions): js.Promise[Source | Document] = js.native
  @JSName("loadSync")
  def loadSync_MGithubLoader(): scala.Nothing = js.native
}

