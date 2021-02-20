package typings.jupyterlabServices

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.settingMod.SettingManager.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingMod {
  
  @JSImport("@jupyterlab/services/lib/setting", "SettingManager")
  @js.native
  /**
    * Create a new setting manager.
    */
  class SettingManager () extends DataConnector[IPlugin, String, String, String] {
    def this(options: IOptions) = this()
    
    /**
      * The server settings used to make API requests.
      */
    val serverSettings: ISettings = js.native
  }
  object SettingManager {
    
    /**
      * The instantiation options for a setting manager.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The server settings used to make API requests.
        */
      var serverSettings: js.UndefOr[ISettings] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  object Setting {
    
    /**
      * The interface for the setting system manager.
      */
    type IManager = SettingManager
  }
}
