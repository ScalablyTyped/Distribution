package typings.jupyterlabSettingregistry

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabSettingregistry.anon.Composite
import typings.jupyterlabSettingregistry.anon.Context
import typings.jupyterlabSettingregistry.anon.User
import typings.jupyterlabSettingregistry.anon.phaseinPhaseTransform
import typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`object`
import typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.command
import typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.separator
import typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.spacer
import typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.submenu
import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator
import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator.IError
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISchema
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  trait ISettingRegistry extends StObject {
    
    /**
      * The data connector used by the setting registry.
      */
    val connector: IDataConnector[IPlugin, String, String, String]
    
    /**
      * Get an individual setting.
      *
      * @param plugin - The name of the plugin whose settings are being retrieved.
      *
      * @param key - The name of the setting being retrieved.
      *
      * @returns A promise that resolves when the setting is retrieved.
      */
    def get(plugin: String, key: String): js.Promise[Composite]
    
    /**
      * Load a plugin's settings into the setting registry.
      *
      * @param plugin - The name of the plugin whose settings are being loaded.
      *
      * @returns A promise that resolves with a plugin settings object or rejects
      * if the plugin is not found.
      */
    def load(plugin: String): js.Promise[ISettings]
    
    /**
      * A signal that emits the name of a plugin when its settings change.
      */
    val pluginChanged: ISignal[this.type, String]
    
    /**
      * The collection of setting registry plugins.
      */
    val plugins: StringDictionary[js.UndefOr[IPlugin]]
    
    /**
      * Reload a plugin's settings into the registry even if they already exist.
      *
      * @param plugin - The name of the plugin whose settings are being reloaded.
      *
      * @returns A promise that resolves with a plugin settings object or rejects
      * with a list of `ISchemaValidator.IError` objects if it fails.
      */
    def reload(plugin: String): js.Promise[ISettings]
    
    /**
      * Remove a single setting in the registry.
      *
      * @param plugin - The name of the plugin whose setting is being removed.
      *
      * @param key - The name of the setting being removed.
      *
      * @returns A promise that resolves when the setting is removed.
      */
    def remove(plugin: String, key: String): js.Promise[Unit]
    
    /**
      * The schema of the setting registry.
      */
    val schema: ISchema
    
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
    def set(plugin: String, key: String, value: PartialJSONValue): js.Promise[Unit]
    
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
    def transform(plugin: String, transforms: phaseinPhaseTransform): IDisposable
    
    /**
      * Upload a plugin's settings.
      *
      * @param plugin - The name of the plugin whose settings are being set.
      *
      * @param raw - The raw plugin settings being uploaded.
      *
      * @returns A promise that resolves when the settings have been saved.
      */
    def upload(plugin: String, raw: String): js.Promise[Unit]
    
    /**
      * The schema validator used by the setting registry.
      */
    val validator: ISchemaValidator
  }
  object ISettingRegistry extends Shortcut {
    
    inline def apply(
      connector: IDataConnector[IPlugin, String, String, String],
      get: (String, String) => js.Promise[Composite],
      load: String => js.Promise[ISettings],
      pluginChanged: ISignal[ISettingRegistry, String],
      plugins: StringDictionary[js.UndefOr[IPlugin]],
      reload: String => js.Promise[ISettings],
      remove: (String, String) => js.Promise[Unit],
      schema: ISchema,
      set: (String, String, PartialJSONValue) => js.Promise[Unit],
      transform: (String, phaseinPhaseTransform) => IDisposable,
      upload: (String, String) => js.Promise[Unit],
      validator: ISchemaValidator
    ): ISettingRegistry = {
      val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), load = js.Any.fromFunction1(load), pluginChanged = pluginChanged.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], reload = js.Any.fromFunction1(reload), remove = js.Any.fromFunction2(remove), schema = schema.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), transform = js.Any.fromFunction2(transform), upload = js.Any.fromFunction2(upload), validator = validator.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingRegistry]
    }
    
    @JSImport("@jupyterlab/settingregistry/lib/tokens", "ISettingRegistry")
    @js.native
    val ^ : Token[ISettingRegistry] = js.native
    
    /**
      * The menu ids defined by default.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-file`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-file-new`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-edit`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-help`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-kernel`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-run`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-settings`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-view`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-tabs`
    */
    trait DefaultMenuId extends StObject
    object DefaultMenuId {
      
      inline def `jp-menu-edit`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-edit` = "jp-menu-edit".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-edit`]
      
      inline def `jp-menu-file`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-file` = "jp-menu-file".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-file`]
      
      inline def `jp-menu-file-new`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-file-new` = "jp-menu-file-new".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-file-new`]
      
      inline def `jp-menu-help`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-help` = "jp-menu-help".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-help`]
      
      inline def `jp-menu-kernel`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-kernel` = "jp-menu-kernel".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-kernel`]
      
      inline def `jp-menu-run`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-run` = "jp-menu-run".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-run`]
      
      inline def `jp-menu-settings`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-settings` = "jp-menu-settings".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-settings`]
      
      inline def `jp-menu-tabs`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-tabs` = "jp-menu-tabs".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-tabs`]
      
      inline def `jp-menu-view`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-view` = "jp-menu-view".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`jp-menu-view`]
    }
    
    trait IContextMenuItem
      extends StObject
         with IMenuItem {
      
      /**
        * The CSS selector for the context menu item.
        *
        * The context menu item will only be displayed in the context menu
        * when the selector matches a node on the propagation path of the
        * contextmenu event. This allows the menu item to be restricted to
        * user-defined contexts.
        *
        * The selector must not contain commas.
        */
      var selector: String
    }
    object IContextMenuItem {
      
      inline def apply(selector: String): IContextMenuItem = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IContextMenuItem]
      }
      
      extension [Self <: IContextMenuItem](x: Self) {
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An interface defining a menu.
      */
    trait IMenu
      extends StObject
         with PartialJSONObject {
      
      /**
        * Whether a menu is disabled. `False` by default.
        *
        * #### Notes
        * This allows an user to suppress a menu.
        */
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Menu icon id
        *
        * #### Note
        * The icon id will looked for in registered LabIcon.
        */
      var icon: js.UndefOr[String] = js.undefined
      
      /**
        * Unique menu identifier
        */
      var id: DefaultMenuId | String
      
      /**
        * Menu items
        */
      var items: js.UndefOr[js.Array[IMenuItem]] = js.undefined
      
      /**
        * Menu title
        *
        * #### Notes
        * Default will be the capitalized id.
        */
      var label: js.UndefOr[String] = js.undefined
      
      /**
        * Get the mnemonic index for the title.
        *
        * #### Notes
        * The default value is `-1`.
        */
      var mnemonic: js.UndefOr[Double] = js.undefined
      
      /**
        * The rank order of the menu among its siblings.
        */
      var rank: js.UndefOr[Double] = js.undefined
    }
    object IMenu {
      
      inline def apply(id: DefaultMenuId | String): IMenu = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[IMenu]
      }
      
      extension [Self <: IMenu](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setId(value: DefaultMenuId | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setItems(value: js.Array[IMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: IMenuItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setMnemonic(value: Double): Self = StObject.set(x, "mnemonic", value.asInstanceOf[js.Any])
        
        inline def setMnemonicUndefined: Self = StObject.set(x, "mnemonic", js.undefined)
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    /**
      * An interface describing a menu item.
      */
    trait IMenuItem
      extends StObject
         with PartialJSONObject {
      
      /**
        * The arguments for the command.
        *
        * The default value is an empty object.
        */
      var args: js.UndefOr[PartialJSONObject] = js.undefined
      
      /**
        * The command to execute when the item is triggered.
        *
        * The default value is an empty string.
        */
      var command: js.UndefOr[String] = js.undefined
      
      /**
        * Whether a menu item is disabled. `false` by default.
        *
        * #### Notes
        * This allows an user to suppress menu items.
        */
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The rank order of the menu item among its siblings.
        */
      var rank: js.UndefOr[Double] = js.undefined
      
      /**
        * The submenu for a `'submenu'` type item.
        *
        * The default value is `null`.
        */
      var submenu: js.UndefOr[IMenu | Null] = js.undefined
      
      /**
        * The type of the menu item.
        *
        * The default value is `'command'`.
        */
      var `type`: js.UndefOr[command | submenu | separator] = js.undefined
    }
    object IMenuItem {
      
      inline def apply(): IMenuItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IMenuItem]
      }
      
      extension [Self <: IMenuItem](x: Self) {
        
        inline def setArgs(value: PartialJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
        
        inline def setSubmenu(value: IMenu): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
        
        inline def setSubmenuNull: Self = StObject.set(x, "submenu", null)
        
        inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
        
        inline def setType(value: command | submenu | separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * The settings for a specific plugin.
      */
    trait IPlugin
      extends StObject
         with PartialJSONObject {
      
      /**
        * The collection of values for a specified plugin.
        */
      var data: ISettingBundle
      
      /**
        * The name of the plugin.
        */
      var id: String
      
      /**
        * The raw user settings data as a string containing JSON with comments.
        */
      var raw: String
      
      /**
        * The JSON schema for the plugin.
        */
      var schema: ISchema
      
      /**
        * The published version of the NPM package containing the plugin.
        */
      var version: String
    }
    /**
      * A namespace for plugin functionality.
      */
    object IPlugin {
      
      inline def apply(data: ISettingBundle, id: String, raw: String, schema: ISchema, version: String): IPlugin = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPlugin]
      }
      
      extension [Self <: IPlugin](x: Self) {
        
        inline def setData(value: ISettingBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        inline def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
      
      /**
        * The phases during which a transformation may be applied to a plugin.
        */
      /* Rewritten from type alias, can be one of: 
        - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.compose
        - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.fetch
      */
      trait Phase extends StObject
      object Phase {
        
        inline def compose: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.compose = "compose".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.compose]
        
        inline def fetch: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.fetch = "fetch".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.fetch]
      }
      
      /**
        * A function that transforms a plugin object before it is consumed by the
        * setting registry.
        */
      type Transform = js.Function1[/* plugin */ IPlugin, IPlugin]
    }
    
    /**
      * A minimal subset of the formal JSON Schema that describes a property.
      */
    trait IProperty
      extends StObject
         with PartialJSONObject {
      
      /**
        * The default value, if any.
        */
      var default: js.UndefOr[PartialJSONValue] = js.undefined
      
      /**
        * The schema description.
        */
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * The schema's child properties.
        */
      var properties: js.UndefOr[StringDictionary[IProperty]] = js.undefined
      
      /**
        * The title of a property.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * The type or types of the data.
        */
      var `type`: js.UndefOr[Primitive | js.Array[Primitive]] = js.undefined
    }
    object IProperty {
      
      inline def apply(): IProperty = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IProperty]
      }
      
      extension [Self <: IProperty](x: Self) {
        
        inline def setDefault(value: PartialJSONValue): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultNull: Self = StObject.set(x, "default", null)
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setProperties(value: StringDictionary[IProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: Primitive | js.Array[Primitive]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setTypeVarargs(value: Primitive*): Self = StObject.set(x, "type", js.Array(value*))
      }
    }
    
    /**
      * A schema type that is a minimal subset of the formal JSON Schema along with
      * optional JupyterLab rendering hints.
      */
    trait ISchema
      extends StObject
         with IProperty {
      
      /**
        * The JupyterLab menus that are created by a plugin's schema.
        */
      @JSName("jupyter.lab.menus")
      var jupyterDotlabDotmenus: js.UndefOr[Context] = js.undefined
      
      /**
        * Whether the schema is deprecated.
        *
        * #### Notes
        * This flag can be used by functionality that loads this plugin's settings
        * from the registry. For example, the setting editor does not display a
        * plugin's settings if it is set to `true`.
        */
      @JSName("jupyter.lab.setting-deprecated")
      var `jupyterDotlabDotsetting-deprecated`: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The JupyterLab icon hint.
        */
      @JSName("jupyter.lab.setting-icon")
      var `jupyterDotlabDotsetting-icon`: js.UndefOr[String] = js.undefined
      
      /**
        * The JupyterLab icon class hint.
        */
      @JSName("jupyter.lab.setting-icon-class")
      var `jupyterDotlabDotsetting-icon-class`: js.UndefOr[String] = js.undefined
      
      /**
        * The JupyterLab icon label hint.
        */
      @JSName("jupyter.lab.setting-icon-label")
      var `jupyterDotlabDotsetting-icon-label`: js.UndefOr[String] = js.undefined
      
      /**
        * The JupyterLab shortcuts that are created by a plugin's schema.
        */
      @JSName("jupyter.lab.shortcuts")
      var jupyterDotlabDotshortcuts: js.UndefOr[js.Array[IShortcut]] = js.undefined
      
      /**
        * The JupyterLab toolbars created by a plugin's schema.
        *
        * #### Notes
        * The toolbar items are grouped by document or widget factory name
        * that will contain a toolbar.
        */
      @JSName("jupyter.lab.toolbars")
      var jupyterDotlabDottoolbars: js.UndefOr[StringDictionary[js.Array[IToolbarItem]]] = js.undefined
      
      /**
        * A flag that indicates plugin should be transformed before being used by
        * the setting registry.
        *
        * #### Notes
        * If this value is set to `true`, the setting registry will wait until a
        * transformation has been registered (by calling the `transform()` method
        * of the registry) for the plugin ID before resolving `load()` promises.
        * This means that if the attribute is set to `true` but no transformation
        * is registered in time, calls to `load()` a plugin will eventually time
        * out and reject.
        */
      @JSName("jupyter.lab.transform")
      var jupyterDotlabDottransform: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The root schema is always an object.
        */
      @JSName("type")
      var type_ISchema: `object`
    }
    object ISchema {
      
      inline def apply(): ISchema = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")("object")
        __obj.asInstanceOf[ISchema]
      }
      
      extension [Self <: ISchema](x: Self) {
        
        inline def setJupyterDotlabDotmenus(value: Context): Self = StObject.set(x, "jupyter.lab.menus", value.asInstanceOf[js.Any])
        
        inline def setJupyterDotlabDotmenusUndefined: Self = StObject.set(x, "jupyter.lab.menus", js.undefined)
        
        inline def `setJupyterDotlabDotsetting-deprecated`(value: Boolean): Self = StObject.set(x, "jupyter.lab.setting-deprecated", value.asInstanceOf[js.Any])
        
        inline def `setJupyterDotlabDotsetting-deprecatedUndefined`: Self = StObject.set(x, "jupyter.lab.setting-deprecated", js.undefined)
        
        inline def `setJupyterDotlabDotsetting-icon`(value: String): Self = StObject.set(x, "jupyter.lab.setting-icon", value.asInstanceOf[js.Any])
        
        inline def `setJupyterDotlabDotsetting-icon-class`(value: String): Self = StObject.set(x, "jupyter.lab.setting-icon-class", value.asInstanceOf[js.Any])
        
        inline def `setJupyterDotlabDotsetting-icon-classUndefined`: Self = StObject.set(x, "jupyter.lab.setting-icon-class", js.undefined)
        
        inline def `setJupyterDotlabDotsetting-icon-label`(value: String): Self = StObject.set(x, "jupyter.lab.setting-icon-label", value.asInstanceOf[js.Any])
        
        inline def `setJupyterDotlabDotsetting-icon-labelUndefined`: Self = StObject.set(x, "jupyter.lab.setting-icon-label", js.undefined)
        
        inline def `setJupyterDotlabDotsetting-iconUndefined`: Self = StObject.set(x, "jupyter.lab.setting-icon", js.undefined)
        
        inline def setJupyterDotlabDotshortcuts(value: js.Array[IShortcut]): Self = StObject.set(x, "jupyter.lab.shortcuts", value.asInstanceOf[js.Any])
        
        inline def setJupyterDotlabDotshortcutsUndefined: Self = StObject.set(x, "jupyter.lab.shortcuts", js.undefined)
        
        inline def setJupyterDotlabDotshortcutsVarargs(value: IShortcut*): Self = StObject.set(x, "jupyter.lab.shortcuts", js.Array(value*))
        
        inline def setJupyterDotlabDottoolbars(value: StringDictionary[js.Array[IToolbarItem]]): Self = StObject.set(x, "jupyter.lab.toolbars", value.asInstanceOf[js.Any])
        
        inline def setJupyterDotlabDottoolbarsUndefined: Self = StObject.set(x, "jupyter.lab.toolbars", js.undefined)
        
        inline def setJupyterDotlabDottransform(value: Boolean): Self = StObject.set(x, "jupyter.lab.transform", value.asInstanceOf[js.Any])
        
        inline def setJupyterDotlabDottransformUndefined: Self = StObject.set(x, "jupyter.lab.transform", js.undefined)
        
        inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The setting values for a plugin.
      */
    trait ISettingBundle
      extends StObject
         with PartialJSONObject {
      
      /**
        * A composite of the user setting values and the plugin schema defaults.
        *
        * #### Notes
        * The `composite` values will always be a superset of the `user` values.
        */
      var composite: PartialJSONObject
      
      /**
        * The user setting values.
        */
      var user: PartialJSONObject
    }
    object ISettingBundle {
      
      inline def apply(composite: PartialJSONObject, user: PartialJSONObject): ISettingBundle = {
        val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISettingBundle]
      }
      
      extension [Self <: ISettingBundle](x: Self) {
        
        inline def setComposite(value: PartialJSONObject): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
        
        inline def setUser(value: PartialJSONObject): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: ISettingRegistry](x: Self) {
      
      inline def setConnector(value: IDataConnector[IPlugin, String, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      inline def setGet(value: (String, String) => js.Promise[Composite]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setLoad(value: String => js.Promise[ISettings]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setPluginChanged(value: ISignal[ISettingRegistry, String]): Self = StObject.set(x, "pluginChanged", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: StringDictionary[js.UndefOr[IPlugin]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setReload(value: String => js.Promise[ISettings]): Self = StObject.set(x, "reload", js.Any.fromFunction1(value))
      
      inline def setRemove(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (String, String, PartialJSONValue) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def setTransform(value: (String, phaseinPhaseTransform) => IDisposable): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setUpload(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "upload", js.Any.fromFunction2(value))
      
      inline def setValidator(value: ISchemaValidator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
    
    /**
      * An interface for manipulating the settings of a specific plugin.
      */
    trait ISettings
      extends StObject
         with IDisposable {
      
      /**
        * Calculate the default value of a setting by iterating through the schema.
        *
        * @param key - The name of the setting whose default value is calculated.
        *
        * @returns A calculated default JSON value for a specific setting.
        */
      def default(key: String): js.UndefOr[PartialJSONValue]
      
      /**
        * Return the defaults in a commented JSON format.
        */
      def annotatedDefaults(): String
      
      /**
        * A signal that emits when the plugin's settings have changed.
        */
      val changed: ISignal[this.type, Unit]
      
      /**
        * The composite of user settings and extension defaults.
        */
      val composite: ReadonlyPartialJSONObject
      
      /**
        * Get an individual setting.
        *
        * @param key - The name of the setting being retrieved.
        *
        * @returns The setting value.
        */
      def get(key: String): User
      
      /**
        * The plugin's ID.
        */
      val id: String
      
      val plugin: IPlugin
      
      /**
        * The plugin settings raw text value.
        */
      val raw: String
      
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
      def remove(key: String): js.Promise[Unit]
      
      /**
        * Save all of the plugin's user settings at once.
        */
      def save(raw: String): js.Promise[Unit]
      
      /**
        * The plugin's schema.
        */
      val schema: ISchema
      
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
      def set(key: String, value: PartialJSONValue): js.Promise[Unit]
      
      /**
        * The user settings.
        */
      val user: ReadonlyPartialJSONObject
      
      /**
        * Validates raw settings with comments.
        *
        * @param raw - The JSON with comments string being validated.
        *
        * @returns A list of errors or `null` if valid.
        */
      def validate(raw: String): js.Array[IError] | Null
      
      /**
        * The published version of the NPM package containing these settings.
        */
      val version: String
    }
    object ISettings {
      
      inline def apply(
        annotatedDefaults: () => String,
        changed: ISignal[ISettings, Unit],
        composite: ReadonlyPartialJSONObject,
        default: String => js.UndefOr[PartialJSONValue],
        dispose: () => Unit,
        get: String => User,
        id: String,
        isDisposed: Boolean,
        plugin: IPlugin,
        raw: String,
        remove: String => js.Promise[Unit],
        save: String => js.Promise[Unit],
        schema: ISchema,
        set: (String, PartialJSONValue) => js.Promise[Unit],
        user: ReadonlyPartialJSONObject,
        validate: String => js.Array[IError] | Null,
        version: String
      ): ISettings = {
        val __obj = js.Dynamic.literal(annotatedDefaults = js.Any.fromFunction0(annotatedDefaults), changed = changed.asInstanceOf[js.Any], composite = composite.asInstanceOf[js.Any], default = js.Any.fromFunction1(default), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), save = js.Any.fromFunction1(save), schema = schema.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), user = user.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate), version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISettings]
      }
      
      extension [Self <: ISettings](x: Self) {
        
        inline def setAnnotatedDefaults(value: () => String): Self = StObject.set(x, "annotatedDefaults", js.Any.fromFunction0(value))
        
        inline def setChanged(value: ISignal[ISettings, Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
        
        inline def setComposite(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
        
        inline def setDefault(value: String => js.UndefOr[PartialJSONValue]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
        
        inline def setGet(value: String => User): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setPlugin(value: IPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
        
        inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        inline def setRemove(value: String => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        inline def setSave(value: String => js.Promise[Unit]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
        
        inline def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        inline def setSet(value: (String, PartialJSONValue) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
        
        inline def setUser(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setValidate(value: String => js.Array[IError] | Null): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An interface describing a JupyterLab keyboard shortcut.
      */
    trait IShortcut
      extends StObject
         with PartialJSONObject {
      
      /**
        * The optional arguments passed into the shortcut's command.
        */
      var args: js.UndefOr[PartialJSONObject] = js.undefined
      
      /**
        * The command invoked by the shortcut.
        */
      var command: String
      
      /**
        * Whether a keyboard shortcut is disabled. `False` by default.
        */
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The key sequence of the shortcut.
        *
        * ### Notes
        *
        * If this is a list like `['Ctrl A', 'B']`, the user needs to press
        * `Ctrl A` followed by `B` to trigger the shortcuts.
        */
      var keys: js.Array[String]
      
      /**
        * The CSS selector applicable to the shortcut.
        */
      var selector: String
    }
    object IShortcut {
      
      inline def apply(command: String, keys: js.Array[String], selector: String): IShortcut = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IShortcut]
      }
      
      extension [Self <: IShortcut](x: Self) {
        
        inline def setArgs(value: PartialJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An interface describing a toolbar item.
      */
    trait IToolbarItem
      extends StObject
         with PartialJSONObject {
      
      /**
        * The arguments for the command.
        *
        * The default value is an empty object.
        */
      var args: js.UndefOr[PartialJSONObject] = js.undefined
      
      /**
        * The command to execute when the item is triggered.
        *
        * The default value is an empty string.
        */
      var command: js.UndefOr[String] = js.undefined
      
      /**
        * Whether the toolbar item is ignored (i.e. not created). `false` by default.
        *
        * #### Notes
        * This allows an user to suppress toolbar items.
        */
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Item icon id
        *
        * #### Note
        * The id will be looked for in the LabIcon registry.
        * The command icon will be overridden by this label if defined.
        */
      var icon: js.UndefOr[String] = js.undefined
      
      /**
        * Item label
        *
        * #### Note
        * The command label will be overridden by this label if defined.
        */
      var label: js.UndefOr[String] = js.undefined
      
      /**
        * Unique toolbar item name
        */
      var name: String
      
      /**
        * The rank order of the toolbar item among its siblings.
        */
      var rank: js.UndefOr[Double] = js.undefined
      
      /**
        * The type of the toolbar item.
        */
      var `type`: js.UndefOr[command | spacer] = js.undefined
    }
    object IToolbarItem {
      
      inline def apply(name: String): IToolbarItem = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[IToolbarItem]
      }
      
      extension [Self <: IToolbarItem](x: Self) {
        
        inline def setArgs(value: PartialJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
        
        inline def setType(value: command | spacer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * The primitive types available in a JSON schema.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.array
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.boolean
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`null`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.number
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`object`
      - typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.string
    */
    trait Primitive extends StObject
    object Primitive {
      
      inline def array: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.array = "array".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.array]
      
      inline def boolean: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.boolean = "boolean".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.boolean]
      
      inline def `null`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`null` = "null".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`null`]
      
      inline def number: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.number = "number".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.number]
      
      inline def `object`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`object` = "object".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`object`]
      
      inline def string: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.string = "string".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.string]
    }
    
    type _To = Token[ISettingRegistry]
    
    /* This means you don't have to write `^`, but can instead just say `ISettingRegistry.foo` */
    override def _to: Token[ISettingRegistry] = ^
  }
}
