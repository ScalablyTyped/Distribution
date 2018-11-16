package typings
package gulpDashRememberLib.gulpDashRememberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpRemember extends js.Object {
  /**
       * Return a through stream that will:
       *   1. Remember all files that ever pass through it.
       *   2. Add all remembered files back into the stream when not present.
       * @param cacheName Name to give your cache
       */
  def apply(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
       * Return a through stream that will:
       *   1. Remember all files that ever pass through it.
       *   2. Add all remembered files back into the stream when not present.
       * @param cacheName Name to give your cache
       */
  def apply(cacheName: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
       * Return a raw cache by name.
       * Useful for checking state. Manually adding or removing files is NOT recommended.
       *
       * @param cacheName Name of the cache to retrieve
       */
  def cacheFor(): ICache = js.native
  /**
       * Return a raw cache by name.
       * Useful for checking state. Manually adding or removing files is NOT recommended.
       *
       * @param cacheName Name of the cache to retrieve
       */
  def cacheFor(cacheName: java.lang.String): ICache = js.native
  /**
       * Forget about a file.
       * A warning is logged if either the named cache or file do not exist.
       * @param cacheName Name of the cache from which to drop the file
       * @param path Path of the file to forget
       */
  def forget(cacheName: java.lang.String, path: java.lang.String): scala.Unit = js.native
  /**
       * Forget about a file.
       * A warning is logged if either the named cache or file do not exist.
       * @param path Path of the file to forget
       */
  def forget(path: java.lang.String): scala.Unit = js.native
  /**
       * Forget all files in one cache.
       * A warning is logged if the cache does not exist.
       *
       * @param cacheName Name of the cache to wipe
       */
  def forgetAll(): scala.Unit = js.native
  /**
       * Forget all files in one cache.
       * A warning is logged if the cache does not exist.
       *
       * @param cacheName Name of the cache to wipe
       */
  def forgetAll(cacheName: java.lang.String): scala.Unit = js.native
}

