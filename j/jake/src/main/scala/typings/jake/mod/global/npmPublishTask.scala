package typings.jake.mod.global

import typings.jake.mod.global.jake.NpmPublishTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("npmPublishTask")
@js.native
object npmPublishTask extends js.Object {
  
  def apply(name: String): NpmPublishTask = js.native
  def apply(name: String, definition: js.Function0[Unit]): NpmPublishTask = js.native
  /**
    * @param name The name of the NpmPublishTask
    * @param packageFiles The files to include in the package
    * @param definition A function that creates the package definition
    */
  def apply(name: String, packageFiles: js.Array[String]): NpmPublishTask = js.native
}
