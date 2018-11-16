package typings
package gulpDashCachedLib.gulpDashCachedMod

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
  def apply(name: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  /**
       * Creates a new cache hash or uses an existing one.
       */
  def apply(name: java.lang.String, options: IOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

