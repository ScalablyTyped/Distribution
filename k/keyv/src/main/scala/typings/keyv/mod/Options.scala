package typings.keyv.mod

import org.scalablytyped.runtime.StringDictionary
import typings.keyv.keyvStrings.mongo
import typings.keyv.keyvStrings.mongodb
import typings.keyv.keyvStrings.mysql
import typings.keyv.keyvStrings.postgres
import typings.keyv.keyvStrings.postgresql
import typings.keyv.keyvStrings.redis
import typings.keyv.keyvStrings.sqlite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TValue]
  extends /* key */ StringDictionary[js.Any] {
  /** Specify an adapter to use. e.g `'redis'` or `'mongodb'`. */
  var adapter: js.UndefOr[redis | mongodb | mongo | sqlite | postgresql | postgres | mysql] = js.undefined
  /** A custom deserialization function. */
  var deserialize: js.UndefOr[js.Function1[/* data */ String, TValue]] = js.undefined
  /** Namespace for the current instance. */
  var namespace: js.UndefOr[String] = js.undefined
  /** A custom serialization function. */
  var serialize: js.UndefOr[js.Function1[/* data */ TValue, String]] = js.undefined
  /** The storage adapter instance to be used by Keyv. */
  var store: js.UndefOr[Store[TValue]] = js.undefined
  /** Default TTL. Can be overridden by specififying a TTL on `.set()`. */
  var ttl: js.UndefOr[Double] = js.undefined
  /** The connection string URI. */
  var uri: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply[TValue](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    adapter: redis | mongodb | mongo | sqlite | postgresql | postgres | mysql = null,
    deserialize: /* data */ String => TValue = null,
    namespace: String = null,
    serialize: /* data */ TValue => String = null,
    store: Store[TValue] = null,
    ttl: js.UndefOr[Double] = js.undefined,
    uri: String = null
  ): Options[TValue] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1(deserialize))
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TValue]]
  }
}

