package typings
package gulpDashSassLib.gulpDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sass extends js.Object {
  def apply(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(opts: GulpSassOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def logError(): scala.Unit = js.native
  def logError(error: java.lang.String): scala.Unit = js.native
  def sync(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def sync(options: GulpSassOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

