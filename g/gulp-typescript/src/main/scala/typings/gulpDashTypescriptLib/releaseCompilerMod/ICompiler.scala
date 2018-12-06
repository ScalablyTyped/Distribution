package typings
package gulpDashTypescriptLib.releaseCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiler extends js.Object {
  def inputDone(): scala.Unit = js.native
  def inputFile(file: gulpDashTypescriptLib.releaseInputMod.File): scala.Unit = js.native
  def prepare(project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo): scala.Unit = js.native
  def prepare(
    project: gulpDashTypescriptLib.releaseProjectMod.ProjectInfo,
    finalTransformers: gulpDashTypescriptLib.releaseTypesMod.FinalTransformers
  ): scala.Unit = js.native
}

