package typings.gulpDashCached.gulpDashCachedMod

import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpCached extends js.Object {
  /**
    * Cache store.
    */
  var caches: ICacheStore = js.native
  /**
    * Creates a new cache hash or uses an existing one.
    */
  def apply(name: String): ReadWriteStream = js.native
  def apply(name: String, options: IOptions): ReadWriteStream = js.native
}

