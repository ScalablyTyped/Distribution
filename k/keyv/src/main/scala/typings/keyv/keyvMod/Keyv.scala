package typings.keyv.keyvMod

import typings.keyv.keyvNumbers.`true`
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyv[TValue] extends EventEmitter {
  /** Delete all entries in the current namespace. */
  def clear(): js.Promise[Unit] = js.native
  /**
    * Deletes an entry.
    *
    * Returns `true` if the key existed, `false` if not.
    */
  def delete(key: String): js.Promise[Boolean] = js.native
  /** Returns the value. */
  def get(key: String): js.Promise[js.UndefOr[TValue]] = js.native
  /**
    * Set a value.
    *
    * By default keys are persistent. You can set an expiry TTL in milliseconds.
    */
  def set(key: String, value: TValue): js.Promise[`true`] = js.native
  def set(key: String, value: TValue, ttl: Double): js.Promise[`true`] = js.native
}

