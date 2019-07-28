package typings.gulpDashTypescript.gulpDashTypescriptMod

import typings.gulpDashTypescript.releaseReporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): CompileStream = js.native
  def apply(proj: typings.gulpDashTypescript.releaseProjectMod.Project): CompileStream = js.native
  def apply(proj: typings.gulpDashTypescript.releaseProjectMod.Project, theReporter: Reporter): CompileStream = js.native
  def apply(settings: Settings): CompileStream = js.native
  def apply(settings: Settings, theReporter: Reporter): CompileStream = js.native
  def createProject(): Project = js.native
  def createProject(settings: Settings): Project = js.native
  def createProject(tsConfigFileName: String): Project = js.native
  def createProject(tsConfigFileName: String, settings: Settings): Project = js.native
  def filter(args: js.Any*): Unit = js.native
}

