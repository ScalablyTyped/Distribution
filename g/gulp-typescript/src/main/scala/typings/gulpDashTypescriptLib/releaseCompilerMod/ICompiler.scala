package typings
package gulpDashTypescriptLib.releaseCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICompiler extends js.Object {
  def inputDone(): scala.Unit
  def inputFile(file: gulpDashTypescriptLib.releaseInputMod.File): scala.Unit
  def prepare(project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo): scala.Unit
}

