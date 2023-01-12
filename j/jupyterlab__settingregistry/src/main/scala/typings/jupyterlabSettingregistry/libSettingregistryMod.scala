package typings.jupyterlabSettingregistry

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabSettingregistry.anon.Composite
import typings.jupyterlabSettingregistry.anon.User
import typings.jupyterlabSettingregistry.anon.phaseinPhaseTransform
import typings.jupyterlabSettingregistry.libSettingregistryMod.ISchemaValidator.IError
import typings.jupyterlabSettingregistry.libSettingregistryMod.SettingRegistry.IOptions
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IMenu
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IMenuItem
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.ISchema
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.ISettings
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IShortcut
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IToolbarItem
import typings.jupyterlabStatedb.libInterfacesMod.IDataConnector
import typings.luminoCoreutils.typesJsonMod.PartialJSONValue
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingregistryMod {
  
  @JSImport("@jupyterlab/settingregistry/lib/settingregistry", "DefaultSchemaValidator")
  @js.native
  /**
    * Instantiate a schema validator.
    */
  open class DefaultSchemaValidator ()
    extends StObject
       with ISchemaValidator {
    
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
    /* private */ var _addSchema: Any = js.native
    
    /* private */ var _composer: Any = js.native
    
    /* private */ var _validator: Any = js.native
  }
  
  @JSImport("@jupyterlab/settingregistry/lib/settingregistry", "SettingRegistry")
  @js.native
  open class SettingRegistry protected ()
    extends StObject
       with ISettingRegistry {
    /**
      * Create a new setting registry.
      */
    def this(options: IOptions) = this()
    
    /**
      * Load a plugin into the registry.
      */
    /* private */ var _load: Any = js.native
    
    /* private */ var _pluginChanged: Any = js.native
    
    /**
      * Preload a list of plugins and fail gracefully.
      */
    /* private */ var _preload: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /**
      * Save a plugin in the registry.
      */
    /* private */ var _save: Any = js.native
    
    /* private */ var _timeout: Any = js.native
    
    /**
      * Transform the plugin if necessary.
      */
    /* private */ var _transform: Any = js.native
    
    /* private */ var _transformers: Any = js.native
    
    /**
      * Validate and preload a plugin, compose the `composite` data.
      */
    /* private */ var _validate: Any = js.native
    
    /**
      * The data connector used by the setting registry.
      */
    /* CompleteClass */
    override val connector: IDataConnector[IPlugin, String, String, String] = js.native
    
    /**
      * Get an individual setting.
      *
      * @param plugin - The name of the plugin whose settings are being retrieved.
      *
      * @param key - The name of the setting being retrieved.
      *
      * @returns A promise that resolves when the setting is retrieved.
      */
    /* CompleteClass */
    override def get(plugin: String, key: String): js.Promise[Composite] = js.native
    
    /**
      * Load a plugin's settings into the setting registry.
      *
      * @param plugin - The name of the plugin whose settings are being loaded.
      *
      * @returns A promise that resolves with a plugin settings object or rejects
      * if the plugin is not found.
      */
    /* CompleteClass */
    override def load(plugin: String): js.Promise[ISettings] = js.native
    
    /**
      * A signal that emits the name of a plugin when its settings change.
      */
    /* CompleteClass */
    override val pluginChanged: ISignal[this.type, String] = js.native
    /**
      * A signal that emits the name of a plugin when its settings change.
      */
    @JSName("pluginChanged")
    def pluginChanged_MSettingRegistry: ISignal[this.type, String] = js.native
    
    /**
      * The collection of setting registry plugins.
      */
    /* CompleteClass */
    override val plugins: StringDictionary[js.UndefOr[IPlugin]] = js.native
    /**
      * The collection of setting registry plugins.
      */
    @JSName("plugins")
    val plugins_SettingRegistry: StringDictionary[IPlugin] = js.native
    
    /**
      * Reload a plugin's settings into the registry even if they already exist.
      *
      * @param plugin - The name of the plugin whose settings are being reloaded.
      *
      * @returns A promise that resolves with a plugin settings object or rejects
      * with a list of `ISchemaValidator.IError` objects if it fails.
      */
    /* CompleteClass */
    override def reload(plugin: String): js.Promise[ISettings] = js.native
    
    /**
      * Remove a single setting in the registry.
      *
      * @param plugin - The name of the plugin whose setting is being removed.
      *
      * @param key - The name of the setting being removed.
      *
      * @returns A promise that resolves when the setting is removed.
      */
    /* CompleteClass */
    override def remove(plugin: String, key: String): js.Promise[Unit] = js.native
    
    /**
      * The schema of the setting registry.
      */
    /* CompleteClass */
    override val schema: ISchema = js.native
    
    /**
      * Set a single setting in the registry.
      *
      * @param plugin - The name of the plugin whose setting is being set.
      *
      * @param key - The name of the setting being set.
      *
      * @param value - The value of the setting being set.
      *
      * @returns A promise that resolves when the setting has been saved.
      *
      */
    /* CompleteClass */
    override def set(plugin: String, key: String, value: PartialJSONValue): js.Promise[Unit] = js.native
    
    /**
      * Register a plugin transform function to act on a specific plugin.
      *
      * @param plugin - The name of the plugin whose settings are transformed.
      *
      * @param transforms - The transform functions applied to the plugin.
      *
      * @returns A disposable that removes the transforms from the registry.
      *
      * #### Notes
      * - `compose` transformations: The registry automatically overwrites a
      * plugin's default values with user overrides, but a plugin may instead wish
      * to merge values. This behavior can be accomplished in a `compose`
      * transformation.
      * - `fetch` transformations: The registry uses the plugin data that is
      * fetched from its connector. If a plugin wants to override, e.g. to update
      * its schema with dynamic defaults, a `fetch` transformation can be applied.
      */
    /* CompleteClass */
    override def transform(plugin: String, transforms: phaseinPhaseTransform): IDisposable = js.native
    
    /**
      * Upload a plugin's settings.
      *
      * @param plugin - The name of the plugin whose settings are being set.
      *
      * @param raw - The raw plugin settings being uploaded.
      *
      * @returns A promise that resolves when the settings have been saved.
      */
    /* CompleteClass */
    override def upload(plugin: String, raw: String): js.Promise[Unit] = js.native
    
    /**
      * The schema validator used by the setting registry.
      */
    /* CompleteClass */
    override val validator: ISchemaValidator = js.native
  }
  object SettingRegistry {
    
    @JSImport("@jupyterlab/settingregistry/lib/settingregistry", "SettingRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Remove disabled entries from menu items
      *
      * @param items Menu items
      * @returns Filtered menu items
      */
    inline def filterDisabledItems[T /* <: IMenuItem */](items: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterDisabledItems")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    /**
      * Merge two set of menu items.
      *
      * @param reference Reference set of menu items
      * @param addition New items to add
      * @param warn Whether to warn if item is duplicated; default to false
      * @returns The merged set of items
      */
    inline def reconcileItems[T /* <: IMenuItem */](): js.UndefOr[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")().asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T]): js.UndefOr[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: js.Array[T]): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: js.Array[T], warn: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: js.Array[T], warn: Boolean, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: js.Array[T], warn: Unit, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: Unit, warn: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: Unit, warn: Boolean, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: js.Array[T], addition: Unit, warn: Unit, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: js.Array[T]): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: js.Array[T], warn: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: js.Array[T], warn: Boolean, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: js.Array[T], warn: Unit, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: Unit, warn: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: Unit, warn: Boolean, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    inline def reconcileItems[T /* <: IMenuItem */](reference: Unit, addition: Unit, warn: Unit, addNewItems: Boolean): js.UndefOr[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T]]]
    
    /**
      * Reconcile the menus.
      *
      * @param reference The reference list of menus.
      * @param addition The list of menus to add.
      * @param warn Warn if the command items are duplicated within the same menu.
      * @returns The reconciled list of menus.
      */
    inline def reconcileMenus(): js.Array[IMenu] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")().asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu]): js.Array[IMenu] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any]).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: js.Array[IMenu]): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: js.Array[IMenu], warn: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: js.Array[IMenu], warn: Boolean, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: js.Array[IMenu], warn: Unit, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: Null, warn: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: Null, warn: Boolean, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: js.Array[IMenu], addition: Null, warn: Unit, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: js.Array[IMenu]): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: js.Array[IMenu], warn: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: js.Array[IMenu], warn: Boolean, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: js.Array[IMenu], warn: Unit, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: Null, warn: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: Null, warn: Boolean, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    inline def reconcileMenus(reference: Null, addition: Null, warn: Unit, addNewItems: Boolean): js.Array[IMenu] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileMenus")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any], addNewItems.asInstanceOf[js.Any])).asInstanceOf[js.Array[IMenu]]
    
    /**
      * Reconcile default and user shortcuts and return the composite list.
      *
      * @param defaults - The list of default shortcuts.
      *
      * @param user - The list of user shortcut overrides and additions.
      *
      * @returns A loadable list of shortcuts (omitting disabled and overridden).
      */
    inline def reconcileShortcuts(defaults: js.Array[IShortcut], user: js.Array[IShortcut]): js.Array[IShortcut] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileShortcuts")(defaults.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[js.Array[IShortcut]]
    
    /**
      * Merge two set of toolbar items.
      *
      * @param reference Reference set of toolbar items
      * @param addition New items to add
      * @param warn Whether to warn if item is duplicated; default to false
      * @returns The merged set of items
      */
    inline def reconcileToolbarItems(): js.UndefOr[js.Array[IToolbarItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")().asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: js.Array[IToolbarItem]): js.UndefOr[js.Array[IToolbarItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: js.Array[IToolbarItem], addition: js.Array[IToolbarItem]): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: js.Array[IToolbarItem], addition: js.Array[IToolbarItem], warn: Boolean): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: js.Array[IToolbarItem], addition: Unit, warn: Boolean): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: Unit, addition: js.Array[IToolbarItem]): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: Unit, addition: js.Array[IToolbarItem], warn: Boolean): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    inline def reconcileToolbarItems(reference: Unit, addition: Unit, warn: Boolean): js.UndefOr[js.Array[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reconcileToolbarItems")(reference.asInstanceOf[js.Any], addition.asInstanceOf[js.Any], warn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IToolbarItem]]]
    
    /**
      * The instantiation options for a setting registry
      */
    trait IOptions extends StObject {
      
      /**
        * The data connector used by the setting registry.
        */
      var connector: IDataConnector[IPlugin, String, String, String]
      
      /**
        * Preloaded plugin data to populate the setting registry.
        */
      var plugins: js.UndefOr[js.Array[IPlugin]] = js.undefined
      
      /**
        * The number of milliseconds before a `load()` call to the registry waits
        * before timing out if it requires a transformation that has not been
        * registered.
        *
        * #### Notes
        * The default value is 7000.
        */
      var timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * The validator used to enforce the settings JSON schema.
        */
      var validator: js.UndefOr[ISchemaValidator] = js.undefined
    }
    object IOptions {
      
      inline def apply(connector: IDataConnector[IPlugin, String, String, String]): IOptions = {
        val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setConnector(value: IDataConnector[IPlugin, String, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        inline def setPlugins(value: js.Array[IPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
        
        inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
        
        inline def setPluginsVarargs(value: IPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        inline def setValidator(value: ISchemaValidator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
        
        inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/settingregistry/lib/settingregistry", "Settings")
  @js.native
  open class Settings protected ()
    extends StObject
       with ISettings {
    /**
      * Instantiate a new plugin settings manager.
      */
    def this(options: typings.jupyterlabSettingregistry.libSettingregistryMod.Settings.IOptions) = this()
    
    /**
      * Calculate the default value of a setting by iterating through the schema.
      *
      * @param key - The name of the setting whose default value is calculated.
      *
      * @returns A calculated default JSON value for a specific setting.
      */
    def default(): js.UndefOr[PartialJSONValue] = js.native
    /**
      * Calculate the default value of a setting by iterating through the schema.
      *
      * @param key - The name of the setting whose default value is calculated.
      *
      * @returns A calculated default JSON value for a specific setting.
      */
    /* CompleteClass */
    override def default(key: String): js.UndefOr[PartialJSONValue] = js.native
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * Handle plugin changes in the setting registry.
      */
    /* private */ var _onPluginChanged: Any = js.native
    
    /**
      * Return the defaults in a commented JSON format.
      */
    /* CompleteClass */
    override def annotatedDefaults(): String = js.native
    
    /**
      * A signal that emits when the plugin's settings have changed.
      */
    /* CompleteClass */
    override val changed: ISignal[this.type, Unit] = js.native
    /**
      * A signal that emits when the plugin's settings have changed.
      */
    @JSName("changed")
    def changed_MSettings: ISignal[this.type, Unit] = js.native
    
    /**
      * The composite of user settings and extension defaults.
      */
    /* CompleteClass */
    override val composite: ReadonlyPartialJSONObject = js.native
    /**
      * The composite of user settings and extension defaults.
      */
    @JSName("composite")
    def composite_MSettings: ReadonlyPartialJSONObject = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Get an individual setting.
      *
      * @param key - The name of the setting being retrieved.
      *
      * @returns The setting value.
      */
    /* CompleteClass */
    override def get(key: String): User = js.native
    
    /**
      * The plugin's ID.
      */
    /* CompleteClass */
    override val id: String = js.native
    
    /**
      * Checks if any fields are different from the default value.
      */
    def isDefault(user: ReadonlyPartialJSONObject): Boolean = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the plugin settings manager disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MSettings: Boolean = js.native
    
    def isModified: Boolean = js.native
    
    /* CompleteClass */
    override val plugin: IPlugin = js.native
    @JSName("plugin")
    def plugin_MSettings: IPlugin = js.native
    
    /**
      * The plugin settings raw text value.
      */
    /* CompleteClass */
    override val raw: String = js.native
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
      * Remove a single setting.
      *
      * @param key - The name of the setting being removed.
      *
      * @returns A promise that resolves when the setting is removed.
      *
      * #### Notes
      * This function is asynchronous because it writes to the setting registry.
      */
    /* CompleteClass */
    override def remove(key: String): js.Promise[Unit] = js.native
    
    /**
      * Save all of the plugin's user settings at once.
      */
    /* CompleteClass */
    override def save(raw: String): js.Promise[Unit] = js.native
    
    /**
      * The plugin's schema.
      */
    /* CompleteClass */
    override val schema: ISchema = js.native
    /**
      * The plugin's schema.
      */
    @JSName("schema")
    def schema_MSettings: ISchema = js.native
    
    /**
      * Set a single setting.
      *
      * @param key - The name of the setting being set.
      *
      * @param value - The value of the setting.
      *
      * @returns A promise that resolves when the setting has been saved.
      *
      * #### Notes
      * This function is asynchronous because it writes to the setting registry.
      */
    /* CompleteClass */
    override def set(key: String, value: PartialJSONValue): js.Promise[Unit] = js.native
    
    /**
      * The user settings.
      */
    /* CompleteClass */
    override val user: ReadonlyPartialJSONObject = js.native
    /**
      * The user settings.
      */
    @JSName("user")
    def user_MSettings: ReadonlyPartialJSONObject = js.native
    
    /**
      * Validates raw settings with comments.
      *
      * @param raw - The JSON with comments string being validated.
      *
      * @returns A list of errors or `null` if valid.
      */
    /* CompleteClass */
    override def validate(raw: String): js.Array[IError] | Null = js.native
    
    /**
      * The published version of the NPM package containing these settings.
      */
    /* CompleteClass */
    override val version: String = js.native
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
    trait IOptions extends StObject {
      
      /**
        * The setting values for a plugin.
        */
      var plugin: IPlugin
      
      /**
        * The system registry instance used by the settings manager.
        */
      var registry: ISettingRegistry
    }
    object IOptions {
      
      inline def apply(plugin: IPlugin, registry: ISettingRegistry): typings.jupyterlabSettingregistry.libSettingregistryMod.Settings.IOptions = {
        val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabSettingregistry.libSettingregistryMod.Settings.IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.jupyterlabSettingregistry.libSettingregistryMod.Settings.IOptions] (val x: Self) extends AnyVal {
        
        inline def setPlugin(value: IPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
        
        inline def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
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
    trait IError extends StObject {
      
      /**
        * The path in the data where the error occurred.
        */
      var dataPath: String
      
      /**
        * The keyword whose validation failed.
        */
      var keyword: String
      
      /**
        * The error message.
        */
      var message: String
      
      /**
        * Optional parameter metadata that might be included in an error.
        */
      var params: js.UndefOr[ReadonlyJSONObject] = js.undefined
      
      /**
        * The path in the schema where the error occurred.
        */
      var schemaPath: String
    }
    object IError {
      
      inline def apply(dataPath: String, keyword: String, message: String, schemaPath: String): IError = {
        val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
        __obj.asInstanceOf[IError]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IError] (val x: Self) extends AnyVal {
        
        inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
        
        inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setParams(value: ReadonlyJSONObject): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      }
    }
  }
}
