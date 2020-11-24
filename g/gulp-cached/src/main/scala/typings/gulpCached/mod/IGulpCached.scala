package typings.gulpCached.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGulpCached extends js.Object {
  
  /**
    * Creates a new cache hash or uses an existing one.
    */
  def apply(name: String): ReadWriteStream = js.native
  def apply(name: String, options: IOptions): ReadWriteStream = js.native
  
  /**
    * Cache store.
    */
  var caches: ICacheStore = js.native
}
