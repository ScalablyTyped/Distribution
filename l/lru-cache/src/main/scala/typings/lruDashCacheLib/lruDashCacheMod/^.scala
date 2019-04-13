package typings
package lruDashCacheLib.lruDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lru-cache", JSImport.Namespace)
@js.native
class ^[K, V] () extends LRUCache[K, V] {
  def this(max: scala.Double) = this()
  def this(options: Options[K, V]) = this()
}

