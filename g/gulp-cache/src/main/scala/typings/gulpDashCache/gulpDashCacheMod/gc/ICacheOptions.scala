package typings.gulpDashCache.gulpDashCacheMod.gc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICacheOptions extends js.Object {
  /**
    * Specifies the name of the directory where the cache
    * is to be stored.
    */
  var cacheDirName: String
}

object ICacheOptions {
  @scala.inline
  def apply(cacheDirName: String): ICacheOptions = {
    val __obj = js.Dynamic.literal(cacheDirName = cacheDirName)
  
    __obj.asInstanceOf[ICacheOptions]
  }
}

