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
    
    /* private */ var compilationResult: js.Any = js.native
    
    var finalTransformers: FinalTransformers = js.native
    
    var host: Host = js.native
    
    /* private */ var output: js.Any = js.native
    
    /* private */ var previousOutput: js.Any = js.native
    
    var project: ProjectInfo = js.native
    
    /* private */ var write: js.Any = js.native
  }
  
  @JSImport("gulp-typescript/release/compiler", "ProjectCompiler")
  @js.native
  class ProjectCompiler ()
    extends StObject
       with ICompiler {
    
    /* private */ var attachContentToFile: js.Any = js.native
    
    /* private */ var emit: js.Any = js.native
    
    /* private */ var emitFile: js.Any = js.native
    
    var finalTransformers: FinalTransformers = js.native
    
    /* private */ var hasSourceMap: js.Any = js.native
    
    var host: Host = js.native
    
    var program: Program = js.native
    
    var project: ProjectInfo = js.native
    
    /* private */ var removeSourceMapComment: js.Any = js.native
  }
  
  @js.native
  trait ICompiler extends StObject {
    
    def inputDone(): Unit = js.native
    
    def inputFile(file: File): Unit = js.native
    
    def prepare(project: ProjectInfo): Unit = js.native
    def prepare(project: ProjectInfo, finalTransformers: FinalTransformers): Unit = js.native
  }
}
