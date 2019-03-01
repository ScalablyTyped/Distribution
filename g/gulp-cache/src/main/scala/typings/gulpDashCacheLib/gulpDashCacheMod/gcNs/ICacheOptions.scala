package typings
package gulpDashCacheLib.gulpDashCacheMod.gcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICacheOptions extends js.Object {
  /**
    * Specifies the name of the directory where the cache
    * is to be stored.
    */
  var cacheDirName: java.lang.String
}

object ICacheOptions {
  @scala.inline
  def apply(cacheDirName: java.lang.String): ICacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cacheDirName")(cacheDirName)
    __obj.asInstanceOf[ICacheOptions]
  }
}

