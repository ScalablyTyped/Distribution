package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheConfiguration extends js.Object {
  /**
    * Provisions a simple LRU cache for caching simple inputs (`undefined`, `null`, strings, numbers, and booleans).
    */
  def provision(): Unit = js.native
  def provision(options: CacheProvisionOptions): Unit = js.native
}

