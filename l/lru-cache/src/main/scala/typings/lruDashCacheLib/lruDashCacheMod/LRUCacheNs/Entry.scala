package typings
package lruDashCacheLib.lruDashCacheMod.LRUCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry[K, V] extends js.Object {
  var e: scala.Double
  var k: K
  var v: V
}

object Entry {
  @scala.inline
  def apply[K, V](e: scala.Double, k: K, v: V): Entry[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("e")(e)
    __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry[K, V]]
  }
}

