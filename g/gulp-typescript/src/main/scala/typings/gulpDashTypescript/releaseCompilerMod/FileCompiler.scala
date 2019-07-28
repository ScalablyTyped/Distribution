package typings.gulpDashTypescript.releaseCompilerMod

import typings.gulpDashTypescript.releaseHostMod.Host
import typings.gulpDashTypescript.releaseProjectMod.ProjectInfo
import typings.gulpDashTypescript.releaseTypesMod.FinalTransformers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/compiler", "FileCompiler")
@js.native
class FileCompiler () extends ICompiler {
  var compilationResult: js.Any = js.native
  var finalTransformers: FinalTransformers = js.native
  var host: Host = js.native
  var output: js.Any = js.native
  var previousOutput: js.Any = js.native
  var project: ProjectInfo = js.native
  var write: js.Any = js.native
}

