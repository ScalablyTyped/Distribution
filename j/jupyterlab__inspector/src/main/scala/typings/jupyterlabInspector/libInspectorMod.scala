package typings.jupyterlabInspector

import typings.jupyterlabApputils.libPrintingMod.Printing.IPrintable
import typings.jupyterlabInspector.libInspectorMod.InspectorPanel.IOptions
import typings.jupyterlabInspector.libTokensMod.IInspector
import typings.jupyterlabInspector.libTokensMod.IInspector.IInspectable
import typings.jupyterlabInspector.libTokensMod.IInspector.IInspectorUpdate
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Panel
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInspectorMod {
  
  @JSImport("@jupyterlab/inspector/lib/inspector", "InspectorPanel")
  @js.native
  /**
    * Construct an inspector.
    */
  open class InspectorPanel ()
    extends Panel
       with IInspector
       with IPrintable {
    def this(options: IOptions) = this()
    
    /* private */ var _content: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
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
    /* protected */ def onInspectorUpdate(sender: Any, args: IInspectorUpdate): Unit = js.native
    
    /**
      * Handle source disposed signals.
      */
    /* protected */ def onSourceDisposed(sender: Any, args: Unit): Unit = js.native
    
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
    
    /* protected */ var translator: ITranslator = js.native
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
    def _generateContentWidget: Any = js.native
    inline def _generateContentWidget_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_generateContentWidget")(x.asInstanceOf[js.Any])
    
    trait IOptions extends StObject {
      
      var initialContent: js.UndefOr[Widget | String] = js.undefined
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setInitialContent(value: Widget | String): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
        
        inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
