package typings.jupyterlabServices

import typings.jupyterlabServices.configMod.ConfigWithDefaults.IOptions
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  object ConfigSection {
    
    /**
      * Create a config section.
      *
      * @returns A Promise that is fulfilled with the config section is loaded.
      */
    @JSImport("@jupyterlab/services/lib/config", "ConfigSection.create")
    @js.native
    def create(options: IOptions): js.Promise[IConfigSection] = js.native
    
    /**
      * The options used to create a config section.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The section name.
        */
      var name: String = js.native
      
      /**
        * The optional server settings.
        */
      var serverSettings: js.UndefOr[ISettings] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(name: String): IOptions = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/services/lib/config", "ConfigWithDefaults")
  @js.native
  class ConfigWithDefaults protected () extends StObject {
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
    var _classData: js.Any = js.native
    
    var _className: js.Any = js.native
    
    var _defaults: js.Any = js.native
    
    var _section: js.Any = js.native
    
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The optional classname namespace.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * The default values.
        */
      var defaults: js.UndefOr[JSONObject] = js.native
      
      /**
        * The configuration section.
        */
      var section: IConfigSection = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(section: IConfigSection): IOptions = {
        val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setDefaults(value: JSONObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
        
        @scala.inline
        def setSection(value: IConfigSection): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait IConfigSection extends StObject {
    
    /**
      * The data for this section.
      */
    val data: JSONObject = js.native
    
    /**
      * The server settings for the section.
      */
    val serverSettings: ISettings = js.native
    
    /**
      * Modify the stored config values.
      *
      * #### Notes
      * Updates the local data immediately, sends the change to the server,
      * and updates the local data with the response, and fulfils the promise
      * with that data.
      */
    def update(newdata: JSONObject): js.Promise[JSONObject] = js.native
  }
  object IConfigSection {
    
    @scala.inline
    def apply(data: JSONObject, serverSettings: ISettings, update: JSONObject => js.Promise[JSONObject]): IConfigSection = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[IConfigSection]
    }
    
    @scala.inline
    implicit class IConfigSectionMutableBuilder[Self <: IConfigSection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: JSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: JSONObject => js.Promise[JSONObject]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
