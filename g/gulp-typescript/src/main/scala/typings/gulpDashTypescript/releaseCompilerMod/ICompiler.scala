package typings.gulpDashTypescript.releaseCompilerMod

import typings.gulpDashTypescript.releaseInputMod.File
import typings.gulpDashTypescript.releaseProjectMod.ProjectInfo
import typings.gulpDashTypescript.releaseTypesMod.FinalTransformers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompiler extends js.Object {
  def inputDone(): Unit = js.native
  def inputFile(file: File): Unit = js.native
  def prepare(project: ProjectInfo): Unit = js.native
  def prepare(project: ProjectInfo, finalTransformers: FinalTransformers): Unit = js.native
}

