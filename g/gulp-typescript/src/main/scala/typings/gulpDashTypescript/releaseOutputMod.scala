package typings.gulpDashTypescript

import typings.gulpDashTypescript.releaseInputMod.File
import typings.gulpDashTypescript.releaseProjectMod.ProjectInfo
import typings.gulpDashTypescript.releaseReporterMod.CompilationResult
import typings.gulpDashTypescript.releaseReporterMod.TypeScriptError
import typings.node.streamMod.Readable
import typings.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/output", JSImport.Namespace)
@js.native
object releaseOutputMod extends js.Object {
  @js.native
  class Output protected () extends js.Object {
    def this(_project: ProjectInfo, streamFull: Readable, streamJs: Readable, streamDts: Readable) = this()
    var applySourceMap: js.Any = js.native
    var getError: js.Any = js.native
    var mightFinish: js.Any = js.native
    var pendingIO: js.Any = js.native
    var pipeRejection: js.Any = js.native
    var project: ProjectInfo = js.native
    var result: CompilationResult = js.native
    var streamDts: Readable = js.native
    var streamFull: Readable = js.native
    var streamJs: Readable = js.native
    var writeDtsAsync: js.Any = js.native
    var writeJsAsync: js.Any = js.native
    def diagnostic(info: Diagnostic): Unit = js.native
    def error(error: TypeScriptError): Unit = js.native
    def finish(result: CompilationResult): Unit = js.native
    def writeDts(
      base: String,
      fileName: String,
      content: String,
      declarationMapContent: String,
      cwd: String,
      original: File
    ): Unit = js.native
    def writeJs(
      base: String,
      fileName: String,
      content: String,
      sourceMapContent: String,
      cwd: String,
      original: File
    ): Unit = js.native
  }
  
}

