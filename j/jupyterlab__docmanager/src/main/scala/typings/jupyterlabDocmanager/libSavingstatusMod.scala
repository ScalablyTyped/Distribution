package typings.jupyterlabDocmanager

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabDocmanager.libSavingstatusMod.SavingStatus.IOptions
import typings.jupyterlabDocmanager.libSavingstatusMod.SavingStatus.Model
import typings.jupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.SaveState
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSavingstatusMod {
  
  @JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus")
  @js.native
  open class SavingStatus protected () extends VDomRenderer[Model] {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: IOptions) = this()
    
    /* private */ var _statusMap: Any = js.native
  }
  object SavingStatus {
    
    /**
      * A VDomModel for the SavingStatus item.
      */
    @JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus.Model")
    @js.native
    open class Model protected () extends VDomModel {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: IDocumentManager) = this()
      
      /* private */ var _docManager: Any = js.native
      
      /**
        * React to a saving status change from the current document widget.
        */
      /* private */ var _onStatusChange: Any = js.native
      
      /* private */ var _status: Any = js.native
      
      /* private */ var _widget: Any = js.native
      
      /**
        * The current status of the model.
        */
      def status: SaveState | Null = js.native
      
      /**
        * The current widget for the model. Any widget can be assigned,
        * but it only has any effect if the widget is an IDocument widget
        * known to the application document manager.
        */
      def widget: Widget | Null = js.native
      def widget_=(widget: Widget | Null): Unit = js.native
    }
    
    /**
      * Options for creating a new SaveStatus item
      */
    trait IOptions extends StObject {
      
      /**
        * The application document manager.
        */
      var docManager: IDocumentManager
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(docManager: IDocumentManager): IOptions = {
        val __obj = js.Dynamic.literal(docManager = docManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setDocManager(value: IDocumentManager): Self = StObject.set(x, "docManager", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
