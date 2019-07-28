package typings.gulpDashTypescript.releaseCompilerMod

import typings.gulpDashTypescript.releaseHostMod.Host
import typings.gulpDashTypescript.releaseProjectMod.ProjectInfo
import typings.gulpDashTypescript.releaseTypesMod.FinalTransformers
import typings.typescript.typescriptMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/compiler", "ProjectCompiler")
@js.native
class ProjectCompiler () extends ICompiler {
  var attachContentToFile: js.Any = js.native
  var emit: js.Any = js.native
  var emitFile: js.Any = js.native
  var finalTransformers: FinalTransformers = js.native
  var hasSourceMap: js.Any = js.native
  var host: Host = js.native
  var program: Program = js.native
  var project: ProjectInfo = js.native
  var removeSourceMapComment: js.Any = js.native
}

