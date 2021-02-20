package typings.jupyterlabSettingregistry

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabSettingregistry.anon.Composite
import typings.jupyterlabSettingregistry.anon.User
import typings.jupyterlabSettingregistry.anon.phaseinPhaseTransform
import typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`object`
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait ISettingRegistry extends StObject {
    
    /**
      * The data connector used by the setting registry.
      */
    val connector: IDataConnector[IPlugin, String, String, String] = js.native
    
    /**
      * Get an individual setting.
      *
      * @param plugin - The name of the plugin whose settings are being retrieved.
      *
      * @param key - The name of the setting being retrieved.
      *
      * @returns A promise that resolves when the setting is retrieved.
      */
    def get(plugin: String, key: String): js.Promise[Composite] = js.native
    
    /**
      * Load a plugin's settings into the setting registry.
      *
      * @param plugin - The name of the plugin whose settings are being loaded.
      *
      * @returns A promise that resolves with a plugin settings object or rejects
      * if the plugin is not found.
      */
    def load(plugin: String): js.Promise[ISettings] = js.native
    
    /**
      * A signal that emits the name of a plugin when its settings change.
      */
    val pluginChanged: ISignal[this.type, String] = js.native
    
    /**
      * The collection of setting registry plugins.
      */
    val plugins: StringDictionary[js.UndefOr[IPlugin]] = js.native
    
    /**
      * Reload a plugin's settings into the registry even if they already exist.
      *
      * @param plugin - The name of the plugin whose settings are being reloaded.
      *
      * @returns A promise that resolves with a plugin settings object or rejects
      * with a list of `ISchemaValidator.IError` objects if it fails.
      */
    def reload(plugin: String): js.Promise[ISettings] = js.native
    
    /**
      * Remove a single setting in the registry.
      *
      * @param plugin - The name of the plugin whose setting is being removed.
      *
      * @param key - The name of the setting being removed.
      *
      * @returns A promise that resolves when the setting is removed.
      */
    def remove(plugin: String, key: String): js.Promise[Unit] = js.native
    
    /**
      * The schema of the setting registry.
      */
    val schema: ISchema = js.native
    
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
    def set(plugin: String, key: String, value: PartialJSONValue): js.Promise[Unit] = js.native
    
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
    def transform(plugin: String, transforms: phaseinPhaseTransform): IDisposable = js.native
    
    /**
      * Upload a plugin's settings.
      *
      * @param plugin - The name of the plugin whose settings are being set.
      *
      * @param raw - The raw plugin settings being uploaded.
      *
      * @returns A promise that resolves when the settings have been saved.
      */
    def upload(plugin: String, raw: String): js.Promise[Unit] = js.native
    
    /**
      * The schema validator used by the setting registry.
      */
    val validator: ISchemaValidator = js.native
  }
  object ISettingRegistry extends Shortcut {
    
    @scala.inline
    def apply(
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
      * The settings for a specific plugin.
      */
    @js.native
    trait IPlugin extends PartialJSONObject {
      
      /**
        * The collection of values for a specified plugin.
        */
      var data: ISettingBundle = js.native
      
      /**
        * The name of the plugin.
        */
      var id: String = js.native
      
      /**
        * The raw user settings data as a string containing JSON with comments.
        */
      var raw: String = js.native
      
      /**
        * The JSON schema for the plugin.
        */
      var schema: ISchema = js.native
      
      /**
        * The published version of the NPM package containing the plugin.
        */
      var version: String = js.native
    }
    /**
      * A namespace for plugin functionality.
      */
    object IPlugin {
      
      @scala.inline
      def apply(data: ISettingBundle, id: String, raw: String, schema: ISchema, version: String): IPlugin = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPlugin]
      }
      
      @scala.inline
      implicit class IPluginMutableBuilder[Self <: IPlugin] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: ISettingBundle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
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
        
        @scala.inline
        def compose: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.compose = "compose".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.compose]
        
        @scala.inline
        def fetch: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.fetch = "fetch".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.fetch]
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
    @js.native
    trait IProperty extends PartialJSONObject {
      
      /**
        * The default value, if any.
        */
      var default: js.UndefOr[PartialJSONValue] = js.native
      
      /**
        * The schema description.
        */
      var description: js.UndefOr[String] = js.native
      
      /**
        * The schema's child properties.
        */
      var properties: js.UndefOr[StringDictionary[IProperty]] = js.native
      
      /**
        * The title of a property.
        */
      var title: js.UndefOr[String] = js.native
      
      /**
        * The type or types of the data.
        */
      var `type`: js.UndefOr[Primitive | js.Array[Primitive]] = js.native
    }
    object IProperty {
      
      @scala.inline
      def apply(): IProperty = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IProperty]
      }
      
      @scala.inline
      implicit class IPropertyMutableBuilder[Self <: IProperty] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: PartialJSONValue): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultNull: Self = StObject.set(x, "default", null)
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setProperties(value: StringDictionary[IProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setType(value: Primitive | js.Array[Primitive]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setTypeVarargs(value: Primitive*): Self = StObject.set(x, "type", js.Array(value :_*))
      }
    }
    
    /**
      * A schema type that is a minimal subset of the formal JSON Schema along with
      * optional JupyterLab rendering hints.
      */
    @js.native
    trait ISchema extends IProperty {
      
      /**
        * Whether the schema is deprecated.
        *
        * #### Notes
        * This flag can be used by functionality that loads this plugin's settings
        * from the registry. For example, the setting editor does not display a
        * plugin's settings if it is set to `true`.
        */
      @JSName("jupyter.lab.setting-deprecated")
      var `jupyterDotlabDotsetting-deprecated`: js.UndefOr[Boolean] = js.native
      
      /**
        * The JupyterLab icon hint.
        */
      @JSName("jupyter.lab.setting-icon")
      var `jupyterDotlabDotsetting-icon`: js.UndefOr[String] = js.native
      
      /**
        * The JupyterLab icon class hint.
        */
      @JSName("jupyter.lab.setting-icon-class")
      var `jupyterDotlabDotsetting-icon-class`: js.UndefOr[String] = js.native
      
      /**
        * The JupyterLab icon label hint.
        */
      @JSName("jupyter.lab.setting-icon-label")
      var `jupyterDotlabDotsetting-icon-label`: js.UndefOr[String] = js.native
      
      /**
        * The JupyterLab shortcuts that are created by a plugin's schema.
        */
      @JSName("jupyter.lab.shortcuts")
      var jupyterDotlabDotshortcuts: js.UndefOr[js.Array[IShortcut]] = js.native
      
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
      var jupyterDotlabDottransform: js.UndefOr[Boolean] = js.native
      
      /**
        * The root schema is always an object.
        */
      @JSName("type")
      var type_ISchema: `object` = js.native
    }
    object ISchema {
      
      @scala.inline
      def apply(`type`: `object`): ISchema = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISchema]
      }
      
      @scala.inline
      implicit class ISchemaMutableBuilder[Self <: ISchema] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setJupyterDotlabDotsetting-deprecated`(value: Boolean): Self = StObject.set(x, "jupyter.lab.setting-deprecated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setJupyterDotlabDotsetting-deprecatedUndefined`: Self = StObject.set(x, "jupyter.lab.setting-deprecated", js.undefined)
        
        @scala.inline
        def `setJupyterDotlabDotsetting-icon`(value: String): Self = StObject.set(x, "jupyter.lab.setting-icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setJupyterDotlabDotsetting-icon-class`(value: String): Self = StObject.set(x, "jupyter.lab.setting-icon-class", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setJupyterDotlabDotsetting-icon-classUndefined`: Self = StObject.set(x, "jupyter.lab.setting-icon-class", js.undefined)
        
        @scala.inline
        def `setJupyterDotlabDotsetting-icon-label`(value: String): Self = StObject.set(x, "jupyter.lab.setting-icon-label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setJupyterDotlabDotsetting-icon-labelUndefined`: Self = StObject.set(x, "jupyter.lab.setting-icon-label", js.undefined)
        
        @scala.inline
        def `setJupyterDotlabDotsetting-iconUndefined`: Self = StObject.set(x, "jupyter.lab.setting-icon", js.undefined)
        
        @scala.inline
        def setJupyterDotlabDotshortcuts(value: js.Array[IShortcut]): Self = StObject.set(x, "jupyter.lab.shortcuts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJupyterDotlabDotshortcutsUndefined: Self = StObject.set(x, "jupyter.lab.shortcuts", js.undefined)
        
        @scala.inline
        def setJupyterDotlabDotshortcutsVarargs(value: IShortcut*): Self = StObject.set(x, "jupyter.lab.shortcuts", js.Array(value :_*))
        
        @scala.inline
        def setJupyterDotlabDottransform(value: Boolean): Self = StObject.set(x, "jupyter.lab.transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJupyterDotlabDottransformUndefined: Self = StObject.set(x, "jupyter.lab.transform", js.undefined)
        
        @scala.inline
        def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The setting values for a plugin.
      */
    @js.native
    trait ISettingBundle extends PartialJSONObject {
      
      /**
        * A composite of the user setting values and the plugin schema defaults.
        *
        * #### Notes
        * The `composite` values will always be a superset of the `user` values.
        */
      var composite: PartialJSONObject = js.native
      
      /**
        * The user setting values.
        */
      var user: PartialJSONObject = js.native
    }
    object ISettingBundle {
      
      @scala.inline
      def apply(composite: PartialJSONObject, user: PartialJSONObject): ISettingBundle = {
        val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISettingBundle]
      }
      
      @scala.inline
      implicit class ISettingBundleMutableBuilder[Self <: ISettingBundle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComposite(value: PartialJSONObject): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUser(value: PartialJSONObject): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class ISettingRegistryMutableBuilder[Self <: ISettingRegistry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnector(value: IDataConnector[IPlugin, String, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: (String, String) => js.Promise[Composite]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoad(value: String => js.Promise[ISettings]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPluginChanged(value: ISignal[ISettingRegistry, String]): Self = StObject.set(x, "pluginChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugins(value: StringDictionary[js.UndefOr[IPlugin]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReload(value: String => js.Promise[ISettings]): Self = StObject.set(x, "reload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: (String, String, PartialJSONValue) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransform(value: (String, phaseinPhaseTransform) => IDisposable): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpload(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "upload", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidator(value: ISchemaValidator): Self = StObject.set(x, "validator", value.asInstanceOf[js.Any])
    }
    
    /**
      * An interface for manipulating the settings of a specific plugin.
      */
    @js.native
    trait ISettings extends IDisposable {
      
      /**
        * Calculate the default value of a setting by iterating through the schema.
        *
        * @param key - The name of the setting whose default value is calculated.
        *
        * @returns A calculated default JSON value for a specific setting.
        */
      def default(key: String): js.UndefOr[PartialJSONValue] = js.native
      
      /**
        * Return the defaults in a commented JSON format.
        */
      def annotatedDefaults(): String = js.native
      
      /**
        * A signal that emits when the plugin's settings have changed.
        */
      val changed: ISignal[this.type, Unit] = js.native
      
      /**
        * The composite of user settings and extension defaults.
        */
      val composite: ReadonlyPartialJSONObject = js.native
      
      /**
        * Get an individual setting.
        *
        * @param key - The name of the setting being retrieved.
        *
        * @returns The setting value.
        */
      def get(key: String): User = js.native
      
      /**
        * The plugin's ID.
        */
      val id: String = js.native
      
      val plugin: IPlugin = js.native
      
      /**
        * The plugin settings raw text value.
        */
      val raw: String = js.native
      
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
      def remove(key: String): js.Promise[Unit] = js.native
      
      /**
        * Save all of the plugin's user settings at once.
        */
      def save(raw: String): js.Promise[Unit] = js.native
      
      /**
        * The plugin's schema.
        */
      val schema: ISchema = js.native
      
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
      def set(key: String, value: PartialJSONValue): js.Promise[Unit] = js.native
      
      /**
        * The user settings.
        */
      val user: ReadonlyPartialJSONObject = js.native
      
      /**
        * Validates raw settings with comments.
        *
        * @param raw - The JSON with comments string being validated.
        *
        * @returns A list of errors or `null` if valid.
        */
      def validate(raw: String): js.Array[IError] | Null = js.native
      
      /**
        * The published version of the NPM package containing these settings.
        */
      val version: String = js.native
    }
    object ISettings {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class ISettingsMutableBuilder[Self <: ISettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnnotatedDefaults(value: () => String): Self = StObject.set(x, "annotatedDefaults", js.Any.fromFunction0(value))
        
        @scala.inline
        def setChanged(value: ISignal[ISettings, Unit]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComposite(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefault(value: String => js.UndefOr[PartialJSONValue]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGet(value: String => User): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlugin(value: IPlugin): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemove(value: String => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSave(value: String => js.Promise[Unit]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSchema(value: ISchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSet(value: (String, PartialJSONValue) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
        
        @scala.inline
        def setUser(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidate(value: String => js.Array[IError] | Null): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An interface describing a JupyterLab keyboard shortcut.
      */
    @js.native
    trait IShortcut extends PartialJSONObject {
      
      /**
        * The optional arguments passed into the shortcut's command.
        */
      var args: js.UndefOr[PartialJSONObject] = js.native
      
      /**
        * The command invoked by the shortcut.
        */
      var command: String = js.native
      
      /**
        * Whether a keyboard shortcut is disabled. `False` by default.
        */
      var disabled: js.UndefOr[Boolean] = js.native
      
      /**
        * The key combination of the shortcut.
        */
      var keys: js.Array[String] = js.native
      
      /**
        * The CSS selector applicable to the shortcut.
        */
      var selector: String = js.native
    }
    object IShortcut {
      
      @scala.inline
      def apply(command: String, keys: js.Array[String], selector: String): IShortcut = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[IShortcut]
      }
      
      @scala.inline
      implicit class IShortcutMutableBuilder[Self <: IShortcut] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: PartialJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
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
      
      @scala.inline
      def array: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.array = "array".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.array]
      
      @scala.inline
      def boolean: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.boolean = "boolean".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.boolean]
      
      @scala.inline
      def `null`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`null` = "null".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`null`]
      
      @scala.inline
      def number: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.number = "number".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.number]
      
      @scala.inline
      def `object`: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`object` = "object".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.`object`]
      
      @scala.inline
      def string: typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.string = "string".asInstanceOf[typings.jupyterlabSettingregistry.jupyterlabSettingregistryStrings.string]
    }
    
    type _To = Token[ISettingRegistry]
    
    /* This means you don't have to write `^`, but can instead just say `ISettingRegistry.foo` */
    override def _to: Token[ISettingRegistry] = ^
  }
}
