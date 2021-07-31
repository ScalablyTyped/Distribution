package typings.gulpTypescript

import typings.gulpTypescript.hostMod.Host
import typings.gulpTypescript.inputMod.File
import typings.gulpTypescript.projectMod.ProjectInfo
import typings.gulpTypescript.typesMod.FinalTransformers
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerMod {
  
  @JSImport("gulp-typescript/release/compiler", "FileCompiler")
  @js.native
  class FileCompiler ()
    extends StObject
       with ICompiler {
    
    var compilationResult: js.Any = js.native
    
    var finalTransformers: FinalTransformers = js.native
    
    var host: Host = js.native
    
    var output: js.Any = js.native
    
    var previousOutput: js.Any = js.native
    
    var project: ProjectInfo = js.native
    
    var write: js.Any = js.native
  }
  
  @JSImport("gulp-typescript/release/compiler", "ProjectCompiler")
  @js.native
  class ProjectCompiler ()
    extends StObject
       with ICompiler {
    
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
  
  @js.native
  trait ICompiler extends StObject {
    
    def inputDone(): Unit = js.native
    
    def inputFile(file: File): Unit = js.native
    
    def prepare(project: ProjectInfo): Unit = js.native
    def prepare(project: ProjectInfo, finalTransformers: FinalTransformers): Unit = js.native
  }
}
