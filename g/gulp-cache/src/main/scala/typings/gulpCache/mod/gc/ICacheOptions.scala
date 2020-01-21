package typings.gulpCache.mod.gc

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
    val __obj = js.Dynamic.literal(cacheDirName = cacheDirName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICacheOptions]
  }
}

