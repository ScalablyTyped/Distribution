package typings.gulpTypescript.mod

import typings.gulpTypescript.reporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-typescript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): CompileStream = js.native
  def apply(proj: typings.gulpTypescript.projectMod.Project): CompileStream = js.native
  def apply(proj: typings.gulpTypescript.projectMod.Project, theReporter: Reporter): CompileStream = js.native
  def apply(settings: Settings): CompileStream = js.native
  def apply(settings: Settings, theReporter: Reporter): CompileStream = js.native
}
