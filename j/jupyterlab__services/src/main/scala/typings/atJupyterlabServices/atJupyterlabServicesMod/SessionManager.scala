package typings.atJupyterlabServices.atJupyterlabServicesMod

import typings.atJupyterlabServices.libSessionManagerMod.SessionManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "SessionManager")
@js.native
/**
  * Construct a new session manager.
  *
  * @param options - The default options for each session.
  */
class SessionManager ()
  extends typings.atJupyterlabServices.libSessionMod.SessionManager {
  def this(options: IOptions) = this()
}

