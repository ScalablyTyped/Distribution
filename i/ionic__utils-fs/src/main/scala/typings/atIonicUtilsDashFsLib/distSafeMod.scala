package typings
package atIonicUtilsDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs/dist/safe", JSImport.Namespace)
@js.native
object distSafeMod extends js.Object {
  def readdir(dir: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def stat(p: java.lang.String): js.Promise[js.UndefOr[fsDashExtraLib.fsDashExtraMod.Stats]] = js.native
}

