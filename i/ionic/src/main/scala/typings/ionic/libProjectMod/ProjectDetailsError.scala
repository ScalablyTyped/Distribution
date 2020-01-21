package typings.ionic.libProjectMod

import typings.ionic.errorsMod.BaseException
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "ProjectDetailsError")
@js.native
class ProjectDetailsError protected () extends BaseException {
  def this(msg: String, /**
    * Unique code for this error.
    */
  code: ProjectDetailsErrorCode) = this()
  def this(
    msg: String,
    /**
    * Unique code for this error.
    */
  code: ProjectDetailsErrorCode,
    /**
    * The underlying error that caused this error.
    */
  error: Error
  ) = this()
  /**
    * Unique code for this error.
    */
  @JSName("code")
  val code_ProjectDetailsError: ProjectDetailsErrorCode = js.native
}

