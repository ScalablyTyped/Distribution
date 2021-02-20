package typings.jupyterlabInspector

import typings.jupyterlabApputils.printingMod.Printing.IPrintable
import typings.jupyterlabInspector.inspectorMod.InspectorPanel.IOptions
import typings.jupyterlabInspector.tokensMod.IInspector
import typings.jupyterlabInspector.tokensMod.IInspector.IInspectable
import typings.jupyterlabInspector.tokensMod.IInspector.IInspectorUpdate
import typings.luminoWidgets.mod.Panel
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inspectorMod {
  
  @JSImport("@jupyterlab/inspector/lib/inspector", "InspectorPanel")
  @js.native
  /**
    * Construct an inspector.
    */
  class InspectorPanel ()
    extends Panel
       with IInspector
       with IPrintable {
    def this(options: IOptions) = this()
    
    var _content: js.Any = js.native
    
    var _source: js.Any = js.native
    
    /**
      * Handle inspector update signals.
      */
    /* protected */ def onInspectorUpdate(sender: js.Any, args: IInspectorUpdate): Unit = js.native
    
    /**
      * Handle source disposed signals.
      */
    /* protected */ def onSourceDisposed(sender: js.Any, args: Unit): Unit = js.native
    
    /**
      * The source of events the inspector panel listens for.
      */
    @JSName("source")
    def source_MInspectorPanel: IInspectable | Null = js.native
  }
  /* static members */
  object InspectorPanel {
    
    @JSImport("@jupyterlab/inspector/lib/inspector", "InspectorPanel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generate content widget from string
      */
    @JSImport("@jupyterlab/inspector/lib/inspector", "InspectorPanel._generateContentWidget")
    @js.native
    def _generateContentWidget: js.Any = js.native
    @scala.inline
    def _generateContentWidget_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_generateContentWidget")(x.asInstanceOf[js.Any])
    
    @js.native
    trait IOptions extends StObject {
      
      var initialContent: js.UndefOr[Widget | String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInitialContent(value: Widget | String): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      }
    }
  }
}
