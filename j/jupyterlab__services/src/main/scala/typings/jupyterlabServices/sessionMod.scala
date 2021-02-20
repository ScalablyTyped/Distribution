package typings.jupyterlabServices

import typings.jupyterlabServices.anon.PickIModelidDeepPartialOm
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionManagerMod.SessionManager.IOptions
import typings.jupyterlabServices.sessionSessionMod.IModel
import typings.jupyterlabServices.sessionSessionMod.ISessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  object SessionAPI {
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.SESSION_SERVICE_URL")
    @js.native
    val SESSION_SERVICE_URL: /* "api/sessions" */ String = js.native
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.getSessionModel")
    @js.native
    def getSessionModel(id: String): js.Promise[IModel] = js.native
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.getSessionModel")
    @js.native
    def getSessionModel(id: String, settings: ISettings): js.Promise[IModel] = js.native
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.getSessionUrl")
    @js.native
    def getSessionUrl(baseUrl: String, id: String): String = js.native
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.listRunning")
    @js.native
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.listRunning")
    @js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.shutdownSession")
    @js.native
    def shutdownSession(id: String): js.Promise[Unit] = js.native
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.shutdownSession")
    @js.native
    def shutdownSession(id: String, settings: ISettings): js.Promise[Unit] = js.native
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.startSession")
    @js.native
    def startSession(options: ISessionOptions): js.Promise[IModel] = js.native
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.startSession")
    @js.native
    def startSession(options: ISessionOptions, settings: ISettings): js.Promise[IModel] = js.native
    
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.updateSession")
    @js.native
    def updateSession(model: PickIModelidDeepPartialOm): js.Promise[IModel] = js.native
    @JSImport("@jupyterlab/services/lib/session", "SessionAPI.updateSession")
    @js.native
    def updateSession(model: PickIModelidDeepPartialOm, settings: ISettings): js.Promise[IModel] = js.native
  }
  
  @JSImport("@jupyterlab/services/lib/session", "SessionManager")
  @js.native
  class SessionManager protected ()
    extends typings.jupyterlabServices.sessionManagerMod.SessionManager {
    /**
      * Construct a new session manager.
      *
      * @param options - The default options for each session.
      */
    def this(options: IOptions) = this()
  }
}
