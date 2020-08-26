package typings.graphqlToolsUrlLoader.mod

import typings.graphqlToolsDelegate.typesMod.AsyncExecutor
import typings.graphqlToolsDelegate.typesMod.Subscriber
import typings.graphqlToolsUrlLoader.anon.DefaultMethod
import typings.graphqlToolsUrlLoader.anon.Executor
import typings.graphqlToolsUrlLoader.anon.Schema
import typings.graphqlToolsUrlLoader.anon.Typeofw3cwebsocket
import typings.graphqlToolsUtils.loadersMod.DocumentPointerSingle
import typings.graphqlToolsUtils.loadersMod.Loader
import typings.graphqlToolsUtils.loadersMod.SchemaPointerSingle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/url-loader", "UrlLoader")
@js.native
class UrlLoader () extends Loader[DocumentPointerSingle, LoadFromUrlOptions] {
  def buildAsyncExecutor(hasPointerFetchExtraHeadersDefaultMethodUseGETForQueries: DefaultMethod): AsyncExecutor = js.native
  def buildSubscriber(pointer: String, webSocketImpl: Typeofw3cwebsocket): Subscriber = js.native
  @JSName("canLoadSync")
  def canLoadSync_MUrlLoader(pointer: SchemaPointerSingle, _options: LoadFromUrlOptions): Boolean = js.native
  def getExecutorAndSubscriber(pointer: SchemaPointerSingle, options: LoadFromUrlOptions): js.Promise[Executor] = js.native
  def getSubschemaConfig(pointer: SchemaPointerSingle, options: LoadFromUrlOptions): js.Promise[Schema] = js.native
  @JSName("loadSync")
  def loadSync_MUrlLoader(): scala.Nothing = js.native
}

