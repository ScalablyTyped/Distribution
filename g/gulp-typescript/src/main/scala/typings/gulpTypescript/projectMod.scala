package typings.gulpTypescript

import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.compilerMod.ICompiler
import typings.gulpTypescript.inputMod.FileCache
import typings.gulpTypescript.outputMod.Output
import typings.gulpTypescript.reporterMod.Reporter
import typings.gulpTypescript.typesMod.FinalTransformers
import typings.gulpTypescript.typesMod.TsConfig
import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.Readable
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectMod {
  
  @JSImport("gulp-typescript/release/project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setupProject(
    projectDirectory: String,
    configFileName: String,
    rawConfig: js.Any,
    config: TsConfig,
    options: CompilerOptions,
    projectReferences: js.Array[ProjectReference],
    typescript: Typeofts,
    finalTransformers: FinalTransformers
  ): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("setupProject")(projectDirectory.asInstanceOf[js.Any], configFileName.asInstanceOf[js.Any], rawConfig.asInstanceOf[js.Any], config.asInstanceOf[js.Any], options.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], typescript.asInstanceOf[js.Any], finalTransformers.asInstanceOf[js.Any])).asInstanceOf[Project]
  
  @js.native
  trait ICompileStream
    extends StObject
       with ReadWriteStream {
    
    var dts: Readable = js.native
    
    @JSName("js")
    var js_ : Readable = js.native
  }
  
  @js.native
  trait Project extends StObject {
    
    def apply(): ICompileStream = js.native
    def apply(reporter: Reporter): ICompileStream = js.native
    
    val config: TsConfig = js.native
    
    val configFileName: String = js.native
    
    val options: CompilerOptions = js.native
    
    val projectDirectory: String = js.native
    
    val projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.native
    
    val rawConfig: js.Any = js.native
    
    def src(): ReadWriteStream = js.native
    
    val typescript: js.UndefOr[Typeofts] = js.native
  }
  
  trait ProjectInfo extends StObject {
    
    var compiler: ICompiler
    
    var directory: String
    
    var input: FileCache
    
    var options: CompilerOptions
    
    var output: Output
    
    var projectReferences: js.Array[ProjectReference]
    
    var reporter: Reporter
    
    var singleOutput: Boolean
    
    var typescript: Typeofts
  }
  object ProjectInfo {
    
    inline def apply(
      compiler: ICompiler,
      directory: String,
      input: FileCache,
      options: CompilerOptions,
      output: Output,
      projectReferences: js.Array[ProjectReference],
      reporter: Reporter,
      singleOutput: Boolean,
      typescript: Typeofts
    ): ProjectInfo = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], projectReferences = projectReferences.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], singleOutput = singleOutput.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectInfo]
    }
    
    extension [Self <: ProjectInfo](x: Self) {
      
      inline def setCompiler(value: ICompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setInput(value: FileCache): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setProjectReferences(value: js.Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
      
      inline def setProjectReferencesVarargs(value: ProjectReference*): Self = StObject.set(x, "projectReferences", js.Array(value :_*))
      
      inline def setReporter(value: Reporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setSingleOutput(value: Boolean): Self = StObject.set(x, "singleOutput", value.asInstanceOf[js.Any])
      
      inline def setTypescript(value: Typeofts): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
    }
  }
}
