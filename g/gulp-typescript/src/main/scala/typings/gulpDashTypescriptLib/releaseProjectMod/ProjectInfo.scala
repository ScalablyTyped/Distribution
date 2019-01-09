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

