package typings
package lruDashCacheLib.lruDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LRU
  extends ScalablyTyped.runtime.Instantiable0[lruDashCacheLib.lruDashCacheMod.LRUNs.Cache[js.Object, js.Object]]
     with ScalablyTyped.runtime.Instantiable1[
      (/* opts */ lruDashCacheLib.lruDashCacheMod.LRUNs.Options[js.Object, js.Object]) | (/* max */ scala.Double), 
      lruDashCacheLib.lruDashCacheMod.LRUNs.Cache[js.Object, js.Object]
    ] {
  def apply[K, V](): lruDashCacheLib.lruDashCacheMod.LRUNs.Cache[K, V] = js.native
  def apply[K, V](max: scala.Double): lruDashCacheLib.lruDashCacheMod.LRUNs.Cache[K, V] = js.native
  def apply[K, V](opts: lruDashCacheLib.lruDashCacheMod.LRUNs.Options[K, V]): lruDashCacheLib.lruDashCacheMod.LRUNs.Cache[K, V] = js.native
}

