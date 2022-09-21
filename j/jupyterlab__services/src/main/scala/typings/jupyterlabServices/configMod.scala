package typings.jupyterlabServices

import typings.jupyterlabServices.configMod.ConfigWithDefaults.IOptions
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  object ConfigSection {
    
    @JSImport("@jupyterlab/services/lib/config", "ConfigSection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a config section.
      *
      * @returns A Promise that is fulfilled with the config section is loaded.
      */
    inline def create(options: IOptions): js.Promise[IConfigSection] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IConfigSection]]
    
    /**
      * The options used to create a config section.
      */
    trait IOptions extends StObject {
      
      /**
        * The section name.
        */
      var name: String
      
      /**
        * The optional server settings.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(name: String): IOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/services/lib/config", "ConfigWithDefaults")
  @js.native
  open class ConfigWithDefaults protected () extends StObject {
    /**
      * Create a new config with defaults.
      */
    def this(options: IOptions) = this()
    
    /**
      * Get data from the Section with our classname, if available.
      *
      * #### Notes
      * If we have no classname, get all of the data in the Section
      */
    /* private */ var _classData: Any = js.native
    
    /* private */ var _className: Any = js.native
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _section: Any = js.native
    
    /**
      * Get data from the config section or fall back to defaults.
      */
    def get(key: String): JSONValue = js.native
    
    /**
      * Set a config value.
      *
      * #### Notes
      * Uses the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/config).
      *
      * The promise is fulfilled on a valid response and rejected otherwise.
      *
      * Sends the update to the server, and changes our local copy of the data
      * immediately.
      */
    def set(key: String, value: JSONValue): js.Promise[JSONValue] = js.native
  }
  object ConfigWithDefaults {
    
    /**
      * The options used to initialize a ConfigWithDefaults object.
      */
    trait IOptions extends StObject {
      
      /**
        * The optional classname namespace.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * The default values.
        */
      var defaults: js.UndefOr[JSONObject] = js.undefined
      
      /**
        * The configuration section.
        */
      var section: IConfigSection
    }
    object IOptions {
      
      inline def apply(section: IConfigSection): IOptions = {
        val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setDefaults(value: JSONObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
        
        inline def setSection(value: IConfigSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait IConfigSection extends StObject {
    
    /**
      * The data for this section.
      */
    val data: JSONObject
    
    /**
      * The server settings for the section.
      */
    val serverSettings: ISettings
    
    /**
      * Modify the stored config values.
      *
      * #### Notes
      * Updates the local data immediately, sends the change to the server,
      * and updates the local data with the response, and fulfils the promise
      * with that data.
      */
    def update(newdata: JSONObject): js.Promise[JSONObject]
  }
  object IConfigSection {
    
    inline def apply(data: JSONObject, serverSettings: ISettings, update: JSONObject => js.Promise[JSONObject]): IConfigSection = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[IConfigSection]
    }
    
    extension [Self <: IConfigSection](x: Self) {
      
      inline def setData(value: JSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: JSONObject => js.Promise[JSONObject]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
