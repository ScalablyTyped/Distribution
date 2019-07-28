package typings.lruDashCache.lruDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lru-cache", JSImport.Namespace)
@js.native
class ^[K, V] () extends LRUCache[K, V] {
  def this(max: Double) = this()
  def this(options: Options[K, V]) = this()
}

