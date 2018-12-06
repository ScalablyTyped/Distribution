package typings
package gulpDashTypescriptLib.releaseInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/input", "File")
@js.native
object FileNs extends js.Object {
  def equal(a: gulpDashTypescriptLib.releaseInputMod.File, b: gulpDashTypescriptLib.releaseInputMod.File): scala.Boolean = js.native
  def fromContent(fileName: java.lang.String, content: java.lang.String): gulpDashTypescriptLib.releaseInputMod.File = js.native
  def fromGulp(file: gulpDashTypescriptLib.releaseTypesMod.VinylFile): gulpDashTypescriptLib.releaseInputMod.File = js.native
  def getChangeState(
    previous: gulpDashTypescriptLib.releaseInputMod.File,
    current: gulpDashTypescriptLib.releaseInputMod.File
  ): gulpDashTypescriptLib.releaseInputMod.FileChangeState = js.native
}

