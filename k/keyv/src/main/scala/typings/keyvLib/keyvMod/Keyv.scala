package typings
package keyvLib.keyvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyv
  extends nodeLib.NodeJSNs.EventEmitter {
  /** Returns the namespace of a key */
  def _getKeyPrefix(key: java.lang.String): java.lang.String = js.native
  /** Delete all entries in the current namespace. */
  def clear(): stdLib.Promise[scala.Unit] = js.native
  /**
       * Deletes an entry.
       *
       * Returns `true` if the key existed, `false` if not.
       */
  def delete(key: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  /** Returns the value. */
  def get(key: java.lang.String): stdLib.Promise[_] = js.native
  /**
       * Set a value.
       *
       * By default keys are persistent. You can set an expiry TTL in milliseconds.
       */
  def set(key: java.lang.String, value: js.Any): js.UndefOr[stdLib.Promise[scala.Boolean]] = js.native
  /**
       * Set a value.
       *
       * By default keys are persistent. You can set an expiry TTL in milliseconds.
       */
  def set(key: java.lang.String, value: js.Any, ttl: scala.Double): js.UndefOr[stdLib.Promise[scala.Boolean]] = js.native
}

