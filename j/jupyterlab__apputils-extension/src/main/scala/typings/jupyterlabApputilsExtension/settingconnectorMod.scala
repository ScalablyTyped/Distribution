package typings.jupyterlabApputilsExtension

import typings.jupyterlabApputilsExtension.anon.Ids
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.active
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.all
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingconnectorMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/settingconnector", "SettingConnector")
  @js.native
  class SettingConnector protected () extends DataConnector[IPlugin, String, String, String] {
    def this(connector: IDataConnector[IPlugin, String, String, String]) = this()
    
    /* private */ var _connector: js.Any = js.native
    
    /* private */ var _throttlers: js.Any = js.native
    
    @JSName("list")
    def list_active(query: active): js.Promise[Ids] = js.native
    @JSName("list")
    def list_all(query: all): js.Promise[Ids] = js.native
  }
}
