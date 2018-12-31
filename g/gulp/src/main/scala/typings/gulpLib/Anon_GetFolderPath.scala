package typings
package gulpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetFolderPath extends js.Object {
  def apply(folder: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(folder: java.lang.String, opts: vinylDashFsLib.Anon_Cwd): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(getFolderPath: js.Function1[/* File */ vinylLib.vinylMod.File, java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def apply(
    getFolderPath: js.Function1[/* File */ vinylLib.vinylMod.File, java.lang.String],
    opts: vinylDashFsLib.Anon_CwdDirMode
  ): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

