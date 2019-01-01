package typings
package keyvLib.keyvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyv[TValue]
  extends nodeLib.NodeJSNs.EventEmitter {
  /** Delete all entries in the current namespace. */
  def clear(): js.Promise[scala.Unit] = js.native
  /**
    * Deletes an entry.
    *
    * Returns `true` if the key existed, `false` if not.
    */
  def delete(key: java.lang.String): js.Promise[scala.Boolean] = js.native
  /** Returns the value. */
  def get(key: java.lang.String): js.Promise[js.UndefOr[TValue]] = js.native
  /**
    * Set a value.
    *
    * By default keys are persistent. You can set an expiry TTL in milliseconds.
    */
  def set(key: java.lang.String, value: TValue): js.Promise[keyvLib.keyvLibNumbers.`true`] = js.native
  def set(key: java.lang.String, value: TValue, ttl: scala.Double): js.Promise[keyvLib.keyvLibNumbers.`true`] = js.native
}

