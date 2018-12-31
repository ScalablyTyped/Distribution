package typings
package keyvLib.keyvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyvOptions extends js.Object {
  /** Specify an adapter to use. e.g `'redis'` or `'mongodb'`. */
  var adapter: js.UndefOr[java.lang.String] = js.undefined
  /** A custom deserialization function. */
  var deserialize: js.UndefOr[js.Function1[/* data */ java.lang.String, _]] = js.undefined
  /** Namespace for the current instance. */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /** A custom serialization function. */
  var serialize: js.UndefOr[js.Function1[/* data */ js.Any, java.lang.String]] = js.undefined
  /** The storage adapter instance to be used by Keyv. */
  var store: js.UndefOr[js.Any] = js.undefined
  /** Default TTL. Can be overridden by specififying a TTL on `.set()`. */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /** The connection string URI. */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

