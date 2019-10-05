package typings.gulpDashTypescript

import typings.gulpDashTypescript.releaseCompilerMod.ICompiler
import typings.gulpDashTypescript.releaseHostMod.Host
import typings.gulpDashTypescript.releaseInputMod.File
import typings.gulpDashTypescript.releaseProjectMod.ProjectInfo
import typings.gulpDashTypescript.releaseTypesMod.FinalTransformers
import typings.typescript.typescriptMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/compiler", JSImport.Namespace)
@js.native
object releaseCompilerMod extends js.Object {
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
  
  @js.native
  trait ICompiler extends js.Object {
    def inputDone(): Unit = js.native
    def inputFile(file: File): Unit = js.native
    def prepare(project: ProjectInfo): Unit = js.native
    def prepare(project: ProjectInfo, finalTransformers: FinalTransformers): Unit = js.native
  }
  
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
  
}

