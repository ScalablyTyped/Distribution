package typings.jupyterlabServices

import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.libSettingMod.SettingManager.IOptions
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingMod {
  
  @JSImport("@jupyterlab/services/lib/setting", "SettingManager")
  @js.native
  /**
    * Create a new setting manager.
    */
  open class SettingManager () extends DataConnector[IPlugin, String, String, String] {
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
    trait IOptions extends StObject {
      
      /**
        * The server settings used to make API requests.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
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
