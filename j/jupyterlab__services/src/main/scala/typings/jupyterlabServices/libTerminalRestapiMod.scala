package typings.jupyterlabServices

import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTerminalRestapiMod {
  
  @JSImport("@jupyterlab/services/lib/terminal/restapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/services/lib/terminal/restapi", "TERMINAL_SERVICE_URL")
  @js.native
  val TERMINAL_SERVICE_URL: /* "api/terminals" */ String = js.native
  
  inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  
  inline def listRunning(): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")().asInstanceOf[js.Promise[js.Array[IModel]]]
  inline def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listRunning")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IModel]]]
  
  inline def shutdownTerminal(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdownTerminal")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def shutdownTerminal(name: String, settings: ISettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("shutdownTerminal")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startNew(): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")().asInstanceOf[js.Promise[IModel]]
  inline def startNew(settings: Unit, name: String): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  inline def startNew(settings: Unit, name: String, cwd: String): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  inline def startNew(settings: Unit, name: Unit, cwd: String): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  inline def startNew(settings: ISettings): js.Promise[IModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IModel]]
  inline def startNew(settings: ISettings, name: String): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  inline def startNew(settings: ISettings, name: String, cwd: String): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  inline def startNew(settings: ISettings, name: Unit, cwd: String): js.Promise[IModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNew")(settings.asInstanceOf[js.Any], name.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel]]
  
  trait IModel extends StObject {
    
    /**
      * The name of the terminal session.
      */
    val name: String
  }
  object IModel {
    
    inline def apply(name: String): IModel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
