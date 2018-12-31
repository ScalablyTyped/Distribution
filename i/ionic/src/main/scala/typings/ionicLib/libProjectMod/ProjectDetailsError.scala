package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "ProjectDetailsError")
@js.native
class ProjectDetailsError protected ()
  extends ionicLib.libErrorsMod.BaseException {
  def this(msg: java.lang.String, /**
    * Unique code for this error.
    */
  code: ProjectDetailsErrorCode) = this()
  def this(msg: java.lang.String, /**
    * Unique code for this error.
    */
  code: ProjectDetailsErrorCode, /**
    * The underlying error that caused this error.
    */
  error: nodeLib.Error) = this()
  /**
    * Unique code for this error.
    */
  @JSName("code")
  val code_ProjectDetailsError: ProjectDetailsErrorCode = js.native
}

