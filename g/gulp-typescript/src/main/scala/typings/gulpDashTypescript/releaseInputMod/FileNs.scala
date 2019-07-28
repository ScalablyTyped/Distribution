package typings.gulpDashTypescript.releaseInputMod

import typings.gulpDashTypescript.releaseTypesMod.VinylFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/input", "File")
@js.native
object FileNs extends js.Object {
  def equal(a: File, b: File): Boolean = js.native
  def fromContent(fileName: String, content: String): File = js.native
  def fromGulp(file: VinylFile): File = js.native
  def getChangeState(previous: File, current: File): FileChangeState = js.native
}

