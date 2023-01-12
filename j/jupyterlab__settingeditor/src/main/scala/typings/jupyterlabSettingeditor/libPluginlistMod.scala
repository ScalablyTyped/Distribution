package typings.jupyterlabSettingeditor

import typings.jupyterlabApputils.mod.ReactWidget
import typings.jupyterlabSettingeditor.anon.PartialIScore
import typings.jupyterlabSettingeditor.libPluginlistMod.PluginList.IOptions
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IProperty
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoSignaling.mod.ISignal
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginlistMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/pluginlist", "PluginList")
  @js.native
  open class PluginList protected () extends ReactWidget {
    /**
      * Create a new plugin list.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _allPlugins: Any = js.native
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _confirm: Any = js.native
    
    /* private */ var _errors: Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the plugin list.
      *
      * @param event - The DOM event sent to the widget
      */
    /* private */ var _evtMousedown: Any = js.native
    
    /* private */ var _filter: Any = js.native
    
    /* private */ var _handleSelectSignal: Any = js.native
    
    /* private */ var _query: Any = js.native
    
    /* private */ var _scrollTop: Any = js.native
    
    /* private */ var _selection: Any = js.native
    
    /* private */ var _settings: Any = js.native
    
    /* private */ var _updateFilterSignal: Any = js.native
    
    /**
      * A signal emitted when a list user interaction happens.
      */
    def changed: ISignal[this.type, Unit] = js.native
    
    def filter: js.Function1[/* item */ IPlugin, js.Array[String] | Null] = js.native
    
    /**
      * Function to recursively filter properties that match search results.
      * @param filter - Function to filter based on search results
      * @param props - Schema properties being filtered
      * @param definitions - Definitions to use for filling in references in properties
      * @param ref - Reference to a definition
      * @returns - String array of properties that match the search results.
      */
    def getFilterString(filter: js.Function1[/* item */ String, Boolean | PartialIScore | Null], props: IProperty): js.Array[String] = js.native
    def getFilterString(
      filter: js.Function1[/* item */ String, Boolean | PartialIScore | Null],
      props: IProperty,
      definitions: Any
    ): js.Array[String] = js.native
    def getFilterString(
      filter: js.Function1[/* item */ String, Boolean | PartialIScore | Null],
      props: IProperty,
      definitions: Any,
      ref: String
    ): js.Array[String] = js.native
    def getFilterString(
      filter: js.Function1[/* item */ String, Boolean | PartialIScore | Null],
      props: IProperty,
      definitions: Unit,
      ref: String
    ): js.Array[String] = js.native
    
    /**
      * Check the plugin for a rendering hint's value.
      *
      * #### Notes
      * The order of priority for overridden hints is as follows, from most
      * important to least:
      * 1. Data set by the end user in a settings file.
      * 2. Data set by the plugin author as a schema default.
      * 3. Data set by the plugin author as a top-level key of the schema.
      */
    def getHint(key: String, registry: ISettingRegistry, plugin: IPlugin): String = js.native
    
    def handleSelectSignal: ISignal[this.type, String] = js.native
    
    def hasErrors: Boolean = js.native
    
    def mapPlugins(plugin: IPlugin): Element = js.native
    
    /**
      * The setting registry.
      */
    val registry: ISettingRegistry = js.native
    
    /**
      * The selection value of the plugin list.
      */
    def scrollTop: js.UndefOr[Double] = js.native
    
    /**
      * The selection value of the plugin list.
      */
    def selection: String = js.native
    def selection_=(selection: String): Unit = js.native
    
    def setError(id: String, error: Boolean): Unit = js.native
    
    /**
      * Updates the filter when the search bar value changes.
      * @param filter Filter function passed by search bar based on search value.
      */
    def setFilter(filter: js.Function1[/* item */ String, Boolean | PartialIScore | Null]): Unit = js.native
    def setFilter(filter: js.Function1[/* item */ String, Boolean | PartialIScore | Null], query: String): Unit = js.native
    
    /* protected */ var translator: ITranslator = js.native
    
    /**
      * Signal that fires when search filter is updated so that settings panel can filter results.
      */
    def updateFilterSignal: ISignal[this.type, js.Function1[/* plugin */ IPlugin, js.Array[String] | Null]] = js.native
  }
  object PluginList {
    
    @JSImport("@jupyterlab/settingeditor/lib/pluginlist", "PluginList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Sort a list of plugins by title and ID.
      */
    inline def sortPlugins(registry: ISettingRegistry): js.Array[IPlugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortPlugins")(registry.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPlugin]]
    
    /**
      * The instantiation options for a plugin list.
      */
    trait IOptions extends StObject {
      
      /**
        * A function that allows for asynchronously confirming a selection.
        *
        * #### Notes
        * If the promise returned by the function resolves, then the selection will
        * succeed and emit an event. If the promise rejects, the selection is not
        * made.
        */
      var confirm: js.UndefOr[js.Function1[/* id */ String, js.Promise[Unit]]] = js.undefined
      
      /**
        * An optional initial query so the plugin list can filter on start.
        */
      var query: js.UndefOr[String] = js.undefined
      
      /**
        * The setting registry for the plugin list.
        */
      var registry: ISettingRegistry
      
      /**
        * List of plugins to skip
        */
      var toSkip: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The setting registry for the plugin list.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(registry: ISettingRegistry): IOptions = {
        val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setConfirm(value: /* id */ String => js.Promise[Unit]): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
        
        inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setToSkip(value: js.Array[String]): Self = StObject.set(x, "toSkip", value.asInstanceOf[js.Any])
        
        inline def setToSkipUndefined: Self = StObject.set(x, "toSkip", js.undefined)
        
        inline def setToSkipVarargs(value: String*): Self = StObject.set(x, "toSkip", js.Array(value*))
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
