package typings.jupyterlabApputilsExtension

import typings.jupyterlabApputilsExtension.anon.Ids
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.active
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.all
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabStatedb.libInterfacesMod.IDataConnector
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingconnectorMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/settingconnector", "SettingConnector")
  @js.native
  open class SettingConnector protected () extends DataConnector[IPlugin, String, String, String] {
    def this(connector: IDataConnector[IPlugin, String, String, String]) = this()
    
    /* private */ var _connector: Any = js.native
    
    /* private */ var _throttlers: Any = js.native
    
    def list(query: active | all): js.Promise[Ids] = js.native
  }
}
