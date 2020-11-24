package typings.gulpTypescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gulp-typescript", "createProject")
@js.native
object createProject extends js.Object {
  
  def apply(): Project = js.native
  def apply(settings: Settings): Project = js.native
  def apply(tsConfigFileName: String): Project = js.native
  def apply(tsConfigFileName: String, settings: Settings): Project = js.native
}
