package typings.jupyterlabSettingeditor

import typings.jupyterlabSettingeditor.libPluginlistMod.PluginList
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.mod.Settings
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.jupyterlabUiComponents.libFormComponentRegistryMod.IFormComponentRegistry
import typings.luminoSignaling.mod.ISignal
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingspanelMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/settingspanel", "SettingsPanel")
  @js.native
  val SettingsPanel: FC[ISettingsPanelProps] = js.native
  
  trait ISettingsPanelProps extends StObject {
    
    /**
      * Form component registry that provides renderers
      * for the form editor.
      */
    var editorRegistry: IFormComponentRegistry
    
    /**
      * Signal that fires when a selection is made in the plugin list.
      */
    var handleSelectSignal: ISignal[PluginList, String]
    
    /**
      * Callback to update the plugin list to display plugins with
      * invalid / unsaved settings in red.
      */
    def hasError(id: String, error: Boolean): Unit
    
    /**
      * If the settings editor is created with an initial search query, an initial
      * filter function is passed to the settings panel.
      */
    def initialFilter(item: IPlugin): js.Array[String] | Null
    
    /**
      * Handler for when selection change is triggered by scrolling
      * in the SettingsPanel.
      */
    def onSelect(id: String): Unit
    
    /**
      * List of Settings objects that provide schema and values
      * of plugins.
      */
    var settings: js.Array[Settings]
    
    /**
      * Translator object
      */
    var translator: ITranslator
    
    /**
      * Sends the updated dirty state to the parent class.
      */
    def updateDirtyState(dirty: Boolean): Unit
    
    /**
      * Signal that sends updated filter when search value changes.
      */
    var updateFilterSignal: ISignal[PluginList, js.Function1[/* plugin */ IPlugin, js.Array[String] | Null]]
  }
  object ISettingsPanelProps {
    
    inline def apply(
      editorRegistry: IFormComponentRegistry,
      handleSelectSignal: ISignal[PluginList, String],
      hasError: (String, Boolean) => Unit,
      initialFilter: IPlugin => js.Array[String] | Null,
      onSelect: String => Unit,
      settings: js.Array[Settings],
      translator: ITranslator,
      updateDirtyState: Boolean => Unit,
      updateFilterSignal: ISignal[PluginList, js.Function1[/* plugin */ IPlugin, js.Array[String] | Null]]
    ): ISettingsPanelProps = {
      val __obj = js.Dynamic.literal(editorRegistry = editorRegistry.asInstanceOf[js.Any], handleSelectSignal = handleSelectSignal.asInstanceOf[js.Any], hasError = js.Any.fromFunction2(hasError), initialFilter = js.Any.fromFunction1(initialFilter), onSelect = js.Any.fromFunction1(onSelect), settings = settings.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any], updateDirtyState = js.Any.fromFunction1(updateDirtyState), updateFilterSignal = updateFilterSignal.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettingsPanelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISettingsPanelProps] (val x: Self) extends AnyVal {
      
      inline def setEditorRegistry(value: IFormComponentRegistry): Self = StObject.set(x, "editorRegistry", value.asInstanceOf[js.Any])
      
      inline def setHandleSelectSignal(value: ISignal[PluginList, String]): Self = StObject.set(x, "handleSelectSignal", value.asInstanceOf[js.Any])
      
      inline def setHasError(value: (String, Boolean) => Unit): Self = StObject.set(x, "hasError", js.Any.fromFunction2(value))
      
      inline def setInitialFilter(value: IPlugin => js.Array[String] | Null): Self = StObject.set(x, "initialFilter", js.Any.fromFunction1(value))
      
      inline def setOnSelect(value: String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setSettings(value: js.Array[Settings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsVarargs(value: Settings*): Self = StObject.set(x, "settings", js.Array(value*))
      
      inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
      
      inline def setUpdateDirtyState(value: Boolean => Unit): Self = StObject.set(x, "updateDirtyState", js.Any.fromFunction1(value))
      
      inline def setUpdateFilterSignal(value: ISignal[PluginList, js.Function1[/* plugin */ IPlugin, js.Array[String] | Null]]): Self = StObject.set(x, "updateFilterSignal", value.asInstanceOf[js.Any])
    }
  }
}
