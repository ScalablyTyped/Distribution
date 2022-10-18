package typings.gulpTypescript

import typings.gulpTypescript.releaseHostMod.Host
import typings.gulpTypescript.releaseInputMod.File
import typings.gulpTypescript.releaseProjectMod.ProjectInfo
import typings.gulpTypescript.releaseTypesMod.FinalTransformers
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseCompilerMod {
  
  @JSImport("gulp-typescript/release/compiler", "FileCompiler")
  @js.native
  open class FileCompiler ()
    extends StObject
       with ICompiler {
    
    /* private */ var compilationResult: Any = js.native
    
    var finalTransformers: FinalTransformers = js.native
    
    var host: Host = js.native
    
    /* private */ var output: Any = js.native
    
    /* private */ var previousOutput: Any = js.native
    
    var project: ProjectInfo = js.native
    
    /* private */ var write: Any = js.native
  }
  
  @JSImport("gulp-typescript/release/compiler", "ProjectCompiler")
  @js.native
  open class ProjectCompiler ()
    extends StObject
       with ICompiler {
    
    /* private */ var attachContentToFile: Any = js.native
    
    /* private */ var emit: Any = js.native
    
    /* private */ var emitFile: Any = js.native
    
    var finalTransformers: FinalTransformers = js.native
    
    /* private */ var hasSourceMap: Any = js.native
    
    var host: Host = js.native
    
    var program: Program = js.native
    
    var project: ProjectInfo = js.native
    
    /* private */ var removeSourceMapComment: Any = js.native
  }
  
  @js.native
  trait ICompiler extends StObject {
    
    def inputDone(): Unit = js.native
    
    def inputFile(file: File): Unit = js.native
    
    def prepare(project: ProjectInfo): Unit = js.native
    def prepare(project: ProjectInfo, finalTransformers: FinalTransformers): Unit = js.native
  }
}
