package typings
package gulpDashTypescriptLib.releaseCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/compiler", "ProjectCompiler")
@js.native
class ProjectCompiler () extends ICompiler {
  var attachContentToFile: js.Any = js.native
  var emit: js.Any = js.native
  var emitFile: js.Any = js.native
  var hasSourceMap: js.Any = js.native
  var host: gulpDashTypescriptLib.releaseHostMod.Host = js.native
  var program: typescriptLib.typescriptMod.tsNs.Program = js.native
  var project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo = js.native
  var removeSourceMapComment: js.Any = js.native
  var reportDiagnostics: js.Any = js.native
  /* CompleteClass */
  override def inputDone(): scala.Unit = js.native
  /* CompleteClass */
  override def inputFile(file: gulpDashTypescriptLib.releaseInputMod.File): scala.Unit = js.native
  /* CompleteClass */
  override def prepare(project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo): scala.Unit = js.native
}

