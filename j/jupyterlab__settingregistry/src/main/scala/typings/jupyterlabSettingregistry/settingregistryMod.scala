package typings.jupyterlabSettingregistry

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator.IError
import typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISchema
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IShortcut
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingregistryMod {
  
  @JSImport("@jupyterlab/settingregistry/lib/settingregistry", "DefaultSchemaValidator")
  @js.native
  /**
    * Instantiate a schema validator.
    */
  class DefaultSchemaValidator () extends ISchemaValidator {
    
    /**
      * Add a schema to the validator.
      *
      * @param plugin - The plugin ID.
      *
      * @param schema - The schema being added.
      *
      * @return A list of errors if the schema fails to validate or `null` if there
      * are no errors.
      *
      * #### Notes
      * It is safe to call this function multiple times with the same plugin name.
      */
    var _addSchema: js.Any = js.native
    
    var _composer: js.Any = js.native
    
    var _validator: js.Any = js.native
  }
  
  @JSImport("@jupyterlab/settingregistry/lib/settingregistry", "SettingRegistry")
  @js.native
  class SettingRegistry protected () extends ISettingRegistry {
    /**
      * Create a new setting registry.
      */
    def this(options: IOptions) = this()
    
    /**
      * Load a plugin into the registry.
      */
    var _load: js.Any = js.native
    
    var _pluginChanged: js.Any = js.native
    
    /**
      * Preload a list of plugins and fail gracefully.
      */
    var _preload: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    /**
      * Save a plugin in the registry.
      */
    var _save: js.Any = js.native
    
    var _timeout: js.Any = js.native
    
    /**
      * Transform the plugin if necessary.
      */
    var _transform: js.Any = js.native
    
    var _transformers: js.Any = js.native
    
    /**
      * Validate and preload a plugin, compose the `composite` data.
      */
    var _validate: js.Any = js.native
    
    /**
      * A signal that emits the name of a plugin when its settings change.
      */
    @JSName("pluginChanged")
    def pluginChanged_MSettingRegistry: ISignal[this.type, String] = js.native
    
    /**
      * The collection of setting registry plugins.
      */
    @JSName("plugins")
    val plugins_SettingRegistry: StringDictionary[IPlugin] = js.native
  }
  object SettingRegistry {
    
    /**
      * Reconcile default and user shortcuts and return the composite list.
      *
      * @param defaults - The list of default shortcuts.
      *
      * @param user - The list of user shortcut overrides and additions.
      *
      * @returns A loadable list of shortcuts (omitting disabled and overridden).
      */
    @JSImport("@jupyterlab/settingregistry/lib/settingregistry", "SettingRegistry.reconcileShortcuts")
    @js.native
    def reconcileShortcuts(defaults: js.Array[IShortcut], user: js.Array[IShortcut]): js.Array[IShortcut] = js.native
    
    /**
      * The instantiation options for a setting registry
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The data connector used by the setting registry.
        */
      var connector: IDataConnector[IPlugin, String, String, String] = js.native
      
      /**
        * Preloaded plugin data to populate the setting registry.
        */
      var plugins: js.UndefOr[js.Array[IPlugin]] = js.native
      
      /**
        * The number of milliseconds before a `load()` call to the registry waits
        * before timing out if it requires a transformation that has not been
        * registered.
        *
        * #### Notes
        * The default value is 7000.
        */
      var timeout: js.UndefOr[Double] = js.native
      
      /**
        * The validator used to enforce the settings JSON schema.
        */
      var validator: js.UndefOr[ISchemaValidator] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(connector: IDataConnector[IPlugin, String, String, String]): IOptions = {
        val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnector(value: IDataConnector[IPlugin, String, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlugins(value: js.Array[IPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
        
        @scala.inline
        def setPluginsVarargs(value: IPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        @scala.inline
        def setValidator(value: ISchemaValidator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/settingregistry/lib/settingregistry", "Settings")
  @js.native
  class Settings protected () extends ISettings {
    /**
      * Instantiate a new plugin settings manager.
      */
    def this(options: typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions) = this()
    
    var _changed: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * Handle plugin changes in the setting registry.
      */
    var _onPluginChanged: js.Any = js.native
    
    /**
      * A signal that emits when the plugin's settings have changed.
      */
    @JSName("changed")
    def changed_MSettings: ISignal[this.type, Unit] = js.native
    
    /**
      * The composite of user settings and extension defaults.
      */
    @JSName("composite")
    def composite_MSettings: ReadonlyPartialJSONObject = js.native
    
    /**
      * Test whether the plugin settings manager disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MSettings: Boolean = js.native
    
    @JSName("plugin")
    def plugin_MSettings: IPlugin = js.native
    
    /**
      * The plugin settings raw text value.
      */
    @JSName("raw")
    def raw_MSettings: String = js.native
    
    /**
      * The setting registry instance used as a back-end for these settings.
      */
    val registry: ISettingRegistry = js.native
    
    /**
      * The plugin's schema.
      */
    @JSName("schema")
    def schema_MSettings: ISchema = js.native
    
    /**
      * The user settings.
      */
    @JSName("user")
    def user_MSettings: ReadonlyPartialJSONObject = js.native
    
    /**
      * The published version of the NPM package containing these settings.
      */
    @JSName("version")
    def version_MSettings: String = js.native
  }
  object Settings {
    
    /**
      * The instantiation options for a `Settings` object.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The setting values for a plugin.
        */
      var plugin: IPlugin = js.native
      
      /**
        * The system registry instance used by the settings manager.
        */
      var registry: ISettingRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(plugin: IPlugin, registry: ISettingRegistry): typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions = {
        val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPlugin(value: IPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait ISchemaValidator extends StObject {
    
    /**
      * Validate a plugin's schema and user data; populate the `composite` data.
      *
      * @param plugin - The plugin being validated. Its `composite` data will be
      * populated by reference.
      *
      * @param populate - Whether plugin data should be populated, defaults to
      * `true`.
      *
      * @return A list of errors if either the schema or data fail to validate or
      * `null` if there are no errors.
      */
    def validateData(plugin: IPlugin): js.Array[IError] | Null = js.native
    def validateData(plugin: IPlugin, populate: Boolean): js.Array[IError] | Null = js.native
  }
  object ISchemaValidator {
    
    /**
      * A schema validation error definition.
      */
    @js.native
    trait IError extends StObject {
      
      /**
        * The path in the data where the error occurred.
        */
      var dataPath: String = js.native
      
      /**
        * The keyword whose validation failed.
        */
      var keyword: String = js.native
      
      /**
        * The error message.
        */
      var message: String = js.native
      
      /**
        * Optional parameter metadata that might be included in an error.
        */
      var params: js.UndefOr[ReadonlyJSONObject] = js.native
      
      /**
        * The path in the schema where the error occurred.
        */
      var schemaPath: String = js.native
    }
    object IError {
      
      @scala.inline
      def apply(dataPath: String, keyword: String, message: String, schemaPath: String): IError = {
        val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
        __obj.asInstanceOf[IError]
      }
      
      @scala.inline
      implicit class IErrorMutableBuilder[Self <: IError] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParams(value: ReadonlyJSONObject): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      }
    }
  }
}
