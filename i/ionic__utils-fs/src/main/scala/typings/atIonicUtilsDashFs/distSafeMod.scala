package typings.atIonicUtilsDashFs

import typings.fsDashExtra.fsDashExtraMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs/dist/safe", JSImport.Namespace)
@js.native
object distSafeMod extends js.Object {
  def readdir(dir: String): js.Promise[js.Array[String]] = js.native
  def stat(p: String): js.Promise[js.UndefOr[Stats]] = js.native
}

