package typings.graphqlReact.mod

import typings.graphqlReact.anon.Cache
import typings.graphqlReact.anon.CacheKey
import typings.graphqlReact.anon.CacheValuePromise
import typings.graphqlReact.anon.ExceptCacheKey
import typings.graphqlReact.anon.FetchOptionsOverride
import typings.graphqlReact.graphqlReactStrings.cache
import typings.graphqlReact.graphqlReactStrings.fetch
import typings.graphqlReact.graphqlReactStrings.reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-react", "GraphQL")
@js.native
class GraphQL () extends js.Object {
  def this(options: Cache) = this()
  
  var cache: GraphQLCache = js.native
  
  @JSName("off")
  def off_cache(`type`: cache, handler: js.Function1[/* event */ CacheKey, Unit]): Unit = js.native
  @JSName("off")
  def off_fetch(`type`: fetch, handler: js.Function1[/* event */ CacheValuePromise, Unit]): Unit = js.native
  @JSName("off")
  def off_reset(`type`: reset, handler: js.Function1[/* event */ ExceptCacheKey, Unit]): Unit = js.native
  
  @JSName("on")
  def on_cache(`type`: cache, handler: js.Function1[/* event */ CacheKey, Unit]): Unit = js.native
  @JSName("on")
  def on_fetch(`type`: fetch, handler: js.Function1[/* event */ CacheValuePromise, Unit]): Unit = js.native
  @JSName("on")
  def on_reset(`type`: reset, handler: js.Function1[/* event */ ExceptCacheKey, Unit]): Unit = js.native
  
  def operate[T, V](options: FetchOptionsOverride[V]): GraphQLOperationLoading[T] = js.native
  
  def reset(): Unit = js.native
  def reset(exceptCacheKey: String): Unit = js.native
}
