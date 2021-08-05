package typings.gulpTypescript

import typings.gulpTypescript.inputMod.File
import typings.gulpTypescript.projectMod.ProjectInfo
import typings.gulpTypescript.reporterMod.CompilationResult
import typings.gulpTypescript.reporterMod.TypeScriptError
import typings.node.streamMod.Readable
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputMod {
  
  @JSImport("gulp-typescript/release/output", "Output")
  @js.native
  class Output protected () extends StObject {
    def this(_project: ProjectInfo, streamFull: Readable, streamJs: Readable, streamDts: Readable) = this()
    
    /* private */ var applySourceMap: js.Any = js.native
    
    def diagnostic(info: Diagnostic): Unit = js.native
    
    def error(error: TypeScriptError): Unit = js.native
    
    def finish(result: CompilationResult): Unit = js.native
    
    /* private */ var getError: js.Any = js.native
    
    /* private */ var mightFinish: js.Any = js.native
    
    /* private */ var pendingIO: js.Any = js.native
    
    /* private */ var pipeRejection: js.Any = js.native
    
    var project: ProjectInfo = js.native
    
    var result: CompilationResult = js.native
    
    var streamDts: Readable = js.native
    
    var streamFull: Readable = js.native
    
    var streamJs: Readable = js.native
    
    def writeDts(
      base: String,
      fileName: String,
      content: String,
      declarationMapContent: String,
      cwd: String,
      original: File
    ): Unit = js.native
    
    /* private */ var writeDtsAsync: js.Any = js.native
    
    def writeJs(
      base: String,
      fileName: String,
      content: String,
      sourceMapContent: String,
      cwd: String,
      original: File
    ): Unit = js.native
    
    /* private */ var writeJsAsync: js.Any = js.native
  }
}
