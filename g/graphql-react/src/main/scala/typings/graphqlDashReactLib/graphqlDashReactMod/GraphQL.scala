package typings
package graphqlDashReactLib.graphqlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react", "GraphQL")
@js.native
class GraphQL () extends js.Object {
  def this(options: graphqlDashReactLib.Anon_Cache) = this()
  var cache: GraphQLCache = js.native
  @JSName("off")
  def off_cache(
    `type`: graphqlDashReactLib.graphqlDashReactLibStrings.cache,
    handler: js.Function1[/* event */ graphqlDashReactLib.Anon_CacheKey, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_fetch(
    `type`: graphqlDashReactLib.graphqlDashReactLibStrings.fetch,
    handler: js.Function1[/* event */ graphqlDashReactLib.Anon_CacheKeyCacheValuePromise, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_reset(
    `type`: graphqlDashReactLib.graphqlDashReactLibStrings.reset,
    handler: js.Function1[/* event */ graphqlDashReactLib.Anon_ExceptCacheKey, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_cache(
    `type`: graphqlDashReactLib.graphqlDashReactLibStrings.cache,
    handler: js.Function1[/* event */ graphqlDashReactLib.Anon_CacheKey, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_fetch(
    `type`: graphqlDashReactLib.graphqlDashReactLibStrings.fetch,
    handler: js.Function1[/* event */ graphqlDashReactLib.Anon_CacheKeyCacheValuePromise, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reset(
    `type`: graphqlDashReactLib.graphqlDashReactLibStrings.reset,
    handler: js.Function1[/* event */ graphqlDashReactLib.Anon_ExceptCacheKey, scala.Unit]
  ): scala.Unit = js.native
  def operate[T, V](options: graphqlDashReactLib.Anon_FetchOptionsOverride[V]): GraphQLOperationLoading[T] = js.native
  def reset(): scala.Unit = js.native
  def reset(exceptCacheKey: java.lang.String): scala.Unit = js.native
}

