package typings.jupyterlabServices

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabServices.anon.PickIModelidDeepPartialOm
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionSessionMod.IModel
import typings.jupyterlabServices.sessionSessionMod.ISessionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionRestapiMod {
  
  @JSImport("@jupyterlab/services/lib/session/restapi", "SESSION_SERVICE_URL")
  @js.native
  val SESSION_SERVICE_URL: /* "api/sessions" */ String = js.native
  
  @JSImport("@jupyterlab/services/lib/session/restapi", "getSessionModel")
  @js.native
  def getSessionModel(id: String): js.Promise[IModel] = js.native
  @JSImport("@jupyterlab/services/lib/session/restapi", "getSessionModel")
  @js.native
  def getSessionModel(id: String, settings: ISettings): js.Promise[IModel] = js.native
  
  @JSImport("@jupyterlab/services/lib/session/restapi", "getSessionUrl")
  @js.native
  def getSessionUrl(baseUrl: String, id: String): String = js.native
  
  @JSImport("@jupyterlab/services/lib/session/restapi", "listRunning")
  @js.native
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  @JSImport("@jupyterlab/services/lib/session/restapi", "listRunning")
  @js.native
  def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
  
  @JSImport("@jupyterlab/services/lib/session/restapi", "shutdownSession")
  @js.native
  def shutdownSession(id: String): js.Promise[Unit] = js.native
  @JSImport("@jupyterlab/services/lib/session/restapi", "shutdownSession")
  @js.native
  def shutdownSession(id: String, settings: ISettings): js.Promise[Unit] = js.native
  
  @JSImport("@jupyterlab/services/lib/session/restapi", "startSession")
  @js.native
  def startSession(options: ISessionOptions): js.Promise[IModel] = js.native
  @JSImport("@jupyterlab/services/lib/session/restapi", "startSession")
  @js.native
  def startSession(options: ISessionOptions, settings: ISettings): js.Promise[IModel] = js.native
  
  @JSImport("@jupyterlab/services/lib/session/restapi", "updateSession")
  @js.native
  def updateSession(model: PickIModelidDeepPartialOm): js.Promise[IModel] = js.native
  @JSImport("@jupyterlab/services/lib/session/restapi", "updateSession")
  @js.native
  def updateSession(model: PickIModelidDeepPartialOm, settings: ISettings): js.Promise[IModel] = js.native
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @jupyterlab/services.@jupyterlab/services/lib/session/restapi.DeepPartial<T[P]> * / object}
    */ typings.jupyterlabServices.jupyterlabServicesStrings.DeepPartial with TopLevel[js.Any]
}
