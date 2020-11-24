package typings.jupyterlabServices.mod

import typings.jupyterlabServices.sessionManagerMod.SessionManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "SessionManager")
@js.native
class SessionManager protected ()
  extends typings.jupyterlabServices.sessionMod.SessionManager {
  /**
    * Construct a new session manager.
    *
    * @param options - The default options for each session.
    */
  def this(options: IOptions) = this()
}
