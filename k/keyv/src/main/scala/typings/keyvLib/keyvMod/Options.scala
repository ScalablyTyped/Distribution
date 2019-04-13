package typings
package keyvLib.keyvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[TValue]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** Specify an adapter to use. e.g `'redis'` or `'mongodb'`. */
  var adapter: js.UndefOr[
    keyvLib.keyvLibStrings.redis | keyvLib.keyvLibStrings.mongodb | keyvLib.keyvLibStrings.mongo | keyvLib.keyvLibStrings.sqlite | keyvLib.keyvLibStrings.postgresql | keyvLib.keyvLibStrings.postgres | keyvLib.keyvLibStrings.mysql
  ] = js.undefined
  /** A custom deserialization function. */
  var deserialize: js.UndefOr[js.Function1[/* data */ java.lang.String, TValue]] = js.undefined
  /** Namespace for the current instance. */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /** A custom serialization function. */
  var serialize: js.UndefOr[js.Function1[/* data */ TValue, java.lang.String]] = js.undefined
  /** The storage adapter instance to be used by Keyv. */
  var store: js.UndefOr[Store[TValue]] = js.undefined
  /** Default TTL. Can be overridden by specififying a TTL on `.set()`. */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /** The connection string URI. */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply[TValue](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    adapter: keyvLib.keyvLibStrings.redis | keyvLib.keyvLibStrings.mongodb | keyvLib.keyvLibStrings.mongo | keyvLib.keyvLibStrings.sqlite | keyvLib.keyvLibStrings.postgresql | keyvLib.keyvLibStrings.postgres | keyvLib.keyvLibStrings.mysql = null,
    deserialize: /* data */ java.lang.String => TValue = null,
    namespace: java.lang.String = null,
    serialize: /* data */ TValue => java.lang.String = null,
    store: Store[TValue] = null,
    ttl: scala.Int | scala.Double = null,
    uri: java.lang.String = null
  ): Options[TValue] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1(deserialize))
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    if (store != null) __obj.updateDynamic("store")(store)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Options[TValue]]
  }
}

