package typings.gulpTypescript.projectMod

import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.compilerMod.ICompiler
import typings.gulpTypescript.inputMod.FileCache
import typings.gulpTypescript.outputMod.Output
import typings.gulpTypescript.reporterMod.Reporter
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectInfo extends js.Object {
  
  var compiler: ICompiler = js.native
  
  var directory: String = js.native
  
  var input: FileCache = js.native
  
  var options: CompilerOptions = js.native
  
  var output: Output = js.native
  
  var projectReferences: js.Array[ProjectReference] = js.native
  
  var reporter: Reporter = js.native
  
  var singleOutput: Boolean = js.native
  
  var typescript: Typeofts = js.native
}
object ProjectInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ProjectInfoOps[Self <: ProjectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompiler(value: ICompiler): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput(value: FileCache): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: CompilerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Output): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectReferencesVarargs(value: ProjectReference*): Self = this.set("projectReferences", js.Array(value :_*))
    
    @scala.inline
    def setProjectReferences(value: js.Array[ProjectReference]): Self = this.set("projectReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReporter(value: Reporter): Self = this.set("reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleOutput(value: Boolean): Self = this.set("singleOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypescript(value: Typeofts): Self = this.set("typescript", value.asInstanceOf[js.Any])
  }
}
