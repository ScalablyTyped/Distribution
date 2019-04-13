package typings
package gulpDashTypescriptLib.releaseOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript/release/output", "Output")
@js.native
class Output protected () extends js.Object {
  def this(_project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo, streamFull: nodeLib.streamMod.Readable, streamJs: nodeLib.streamMod.Readable, streamDts: nodeLib.streamMod.Readable) = this()
  var applySourceMap: js.Any = js.native
  var getError: js.Any = js.native
  var mightFinish: js.Any = js.native
  var pendingIO: js.Any = js.native
  var pipeRejection: js.Any = js.native
  var project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo = js.native
  var result: gulpDashTypescriptLib.releaseReporterMod.CompilationResult = js.native
  var streamDts: nodeLib.streamMod.Readable = js.native
  var streamFull: nodeLib.streamMod.Readable = js.native
  var streamJs: nodeLib.streamMod.Readable = js.native
  var writeDtsAsync: js.Any = js.native
  var writeJsAsync: js.Any = js.native
  def diagnostic(info: typescriptLib.typescriptMod.Diagnostic): scala.Unit = js.native
  def error(error: gulpDashTypescriptLib.releaseReporterMod.TypeScriptError): scala.Unit = js.native
  def finish(result: gulpDashTypescriptLib.releaseReporterMod.CompilationResult): scala.Unit = js.native
  def writeDts(
    base: java.lang.String,
    fileName: java.lang.String,
    content: java.lang.String,
    declarationMapContent: java.lang.String,
    cwd: java.lang.String,
    original: gulpDashTypescriptLib.releaseInputMod.File
  ): scala.Unit = js.native
  def writeJs(
    base: java.lang.String,
    fileName: java.lang.String,
    content: java.lang.String,
    sourceMapContent: java.lang.String,
    cwd: java.lang.String,
    original: gulpDashTypescriptLib.releaseInputMod.File
  ): scala.Unit = js.native
}

