package typings.gulpDashTypescript.releaseProjectMod

import typings.gulpDashTypescript.Typeofts
import typings.gulpDashTypescript.releaseCompilerMod.ICompiler
import typings.gulpDashTypescript.releaseInputMod.FileCache
import typings.gulpDashTypescript.releaseOutputMod.Output
import typings.gulpDashTypescript.releaseReporterMod.Reporter
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectInfo extends js.Object {
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
}

