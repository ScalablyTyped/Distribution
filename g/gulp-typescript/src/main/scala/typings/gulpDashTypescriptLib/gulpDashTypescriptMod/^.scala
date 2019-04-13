package typings
package gulpDashTypescriptLib.gulpDashTypescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): CompileStream = js.native
  def apply(proj: gulpDashTypescriptLib.releaseProjectMod.Project): CompileStream = js.native
  def apply(
    proj: gulpDashTypescriptLib.releaseProjectMod.Project,
    theReporter: gulpDashTypescriptLib.releaseReporterMod.Reporter
  ): CompileStream = js.native
  def apply(settings: Settings): CompileStream = js.native
  def apply(settings: Settings, theReporter: gulpDashTypescriptLib.releaseReporterMod.Reporter): CompileStream = js.native
  def createProject(): Project = js.native
  def createProject(settings: Settings): Project = js.native
  def createProject(tsConfigFileName: java.lang.String): Project = js.native
  def createProject(tsConfigFileName: java.lang.String, settings: Settings): Project = js.native
  def filter(args: js.Any*): scala.Unit = js.native
}

