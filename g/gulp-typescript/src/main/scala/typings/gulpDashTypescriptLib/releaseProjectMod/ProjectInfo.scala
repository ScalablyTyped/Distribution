package typings
package gulpDashTypescriptLib.releaseProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectInfo extends js.Object {
  var compiler: gulpDashTypescriptLib.releaseCompilerMod.ICompiler
  var directory: java.lang.String
  var input: gulpDashTypescriptLib.releaseInputMod.FileCache
  var options: typescriptLib.typescriptMod.tsNs.CompilerOptions
  var output: gulpDashTypescriptLib.releaseOutputMod.Output
  var projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  var reporter: gulpDashTypescriptLib.releaseReporterMod.Reporter
  var singleOutput: scala.Boolean
  var typescript: gulpDashTypescriptLib.Anon_08
}

object ProjectInfo {
  @scala.inline
  def apply(
    compiler: gulpDashTypescriptLib.releaseCompilerMod.ICompiler,
    directory: java.lang.String,
    input: gulpDashTypescriptLib.releaseInputMod.FileCache,
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    output: gulpDashTypescriptLib.releaseOutputMod.Output,
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference],
    reporter: gulpDashTypescriptLib.releaseReporterMod.Reporter,
    singleOutput: scala.Boolean,
    typescript: gulpDashTypescriptLib.Anon_08
  ): ProjectInfo = {
    val __obj = js.Dynamic.literal(compiler = compiler, directory = directory, input = input, options = options, output = output, projectReferences = projectReferences, reporter = reporter, singleOutput = singleOutput, typescript = typescript)
  
    __obj.asInstanceOf[ProjectInfo]
  }
}

