package typings.jupyterlabInspector

import typings.jupyterlabApputils.printingMod.Printing.IPrintable
import typings.jupyterlabInspector.inspectorMod.InspectorPanel.IOptions
import typings.jupyterlabInspector.tokensMod.IInspector
import typings.jupyterlabInspector.tokensMod.IInspector.IInspectable
import typings.jupyterlabInspector.tokensMod.IInspector.IInspectorUpdate
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Panel
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    /* private */ var _content: js.Any = js.native
    
    /* private */ var _source: js.Any = js.native
    
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
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Handle inspector update signals.
      */
    /* protected */ def onInspectorUpdate(sender: js.Any, args: IInspectorUpdate): Unit = js.native
    
    /**
      * Handle source disposed signals.
      */
    /* protected */ def onSourceDisposed(sender: js.Any, args: Unit): Unit = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
    
    /**
      * The source of events the inspector listens for.
      */
    /* CompleteClass */
    var source: IInspectable | Null = js.native
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
    inline def _generateContentWidget_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_generateContentWidget")(x.asInstanceOf[js.Any])
    
    trait IOptions extends StObject {
      
      var initialContent: js.UndefOr[Widget | String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setInitialContent(value: Widget | String): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
        
        inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      }
    }
  }
}
