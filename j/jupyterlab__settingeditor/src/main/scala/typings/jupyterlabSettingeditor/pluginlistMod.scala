package typings.jupyterlabSettingeditor

import typings.jupyterlabSettingeditor.pluginlistMod.PluginList.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginlistMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/pluginlist", "PluginList")
  @js.native
  class PluginList protected () extends Widget {
    /**
      * Create a new plugin list.
      */
    def this(options: IOptions) = this()
    
    var _changed: js.Any = js.native
    
    var _confirm: js.Any = js.native
    
    /**
      * Handle the `'mousedown'` event for the plugin list.
      *
      * @param event - The DOM event sent to the widget
      */
    var _evtMousedown: js.Any = js.native
    
    var _scrollTop: js.Any = js.native
    
    var _selection: js.Any = js.native
    
    /**
      * A signal emitted when a list user interaction happens.
      */
    def changed: ISignal[this.type, Unit] = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the plugin list's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
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
  }
  object PluginList {
    
    /**
      * The instantiation options for a plugin list.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A function that allows for asynchronously confirming a selection.
        *
        * #### Notest
        * If the promise returned by the function resolves, then the selection will
        * succeed and emit an event. If the promise rejects, the selection is not
        * made.
        */
      def confirm(): js.Promise[Unit] = js.native
      
      /**
        * The setting registry for the plugin list.
        */
      var registry: ISettingRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(confirm: () => js.Promise[Unit], registry: ISettingRegistry): IOptions = {
        val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction0(confirm), registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfirm(value: () => js.Promise[Unit]): Self = StObject.set(x, "confirm", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      }
    }
  }
}
