package typings
package gulpLib.gulpMod.GulpClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestMethod extends js.Object {
  def apply(folder: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(folder: java.lang.String, opt: vinylDashFsLib.vinylDashFsMod.DestOptions): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* file */ vinylLib.vinylMod.File, java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

