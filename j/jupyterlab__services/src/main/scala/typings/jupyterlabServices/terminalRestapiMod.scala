package typings.jupyterlabServices

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalRestapiMod {
  
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "TERMINAL_SERVICE_URL")
  @js.native
  val TERMINAL_SERVICE_URL: /* "api/terminals" */ String = js.native
  
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "isAvailable")
  @js.native
  def isAvailable(): Boolean = js.native
  
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "listRunning")
  @js.native
  def listRunning(): js.Promise[js.Array[IModel]] = js.native
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "listRunning")
  @js.native
  def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
  
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "shutdownTerminal")
  @js.native
  def shutdownTerminal(name: String): js.Promise[Unit] = js.native
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "shutdownTerminal")
  @js.native
  def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = js.native
  
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "startNew")
  @js.native
  def startNew(): js.Promise[IModel] = js.native
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "startNew")
  @js.native
  def startNew(settings: ISettings): js.Promise[IModel] = js.native
  
  @js.native
  trait IModel extends StObject {
    
    /**
      * The name of the terminal session.
      */
    val name: String = js.native
  }
  object IModel {
    
    @scala.inline
    def apply(name: String): IModel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModel]
    }
    
    @scala.inline
    implicit class IModelMutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
