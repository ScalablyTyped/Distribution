package typings.lruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lru-cache", JSImport.Namespace)
@js.native
class ^[K, V] () extends LRUCache[K, V] {
  def this(max: Double) = this()
  def this(options: Options[K, V]) = this()
}
