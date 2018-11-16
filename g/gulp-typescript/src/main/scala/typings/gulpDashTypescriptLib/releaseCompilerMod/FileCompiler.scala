package typings
package gulpDashTypescriptLib.releaseCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/compiler", "FileCompiler")
@js.native
class FileCompiler () extends ICompiler {
  var compilationResult: js.Any = js.native
  var host: gulpDashTypescriptLib.releaseHostMod.Host = js.native
  var output: js.Any = js.native
  var previousOutput: js.Any = js.native
  var project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo = js.native
  var write: js.Any = js.native
  /* CompleteClass */
  override def inputDone(): scala.Unit = js.native
  /* CompleteClass */
  override def inputFile(file: gulpDashTypescriptLib.releaseInputMod.File): scala.Unit = js.native
  /* CompleteClass */
  override def prepare(project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo): scala.Unit = js.native
}

