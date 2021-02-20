package typings.jupyterlabDocmanager

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabDocmanager.savingstatusMod.SavingStatus.IOptions
import typings.jupyterlabDocmanager.savingstatusMod.SavingStatus.Model
import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.SaveState
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object savingstatusMod {
  
  @JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus")
  @js.native
  class SavingStatus protected () extends VDomRenderer[Model] {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: IOptions) = this()
  }
  object SavingStatus {
    
    /**
      * A VDomModel for the SavingStatus item.
      */
    @JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus.Model")
    @js.native
    class Model protected () extends VDomModel {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: IDocumentManager) = this()
      
      var _docManager: js.Any = js.native
      
      /**
        * React to a saving status change from the current document widget.
        */
      var _onStatusChange: js.Any = js.native
      
      var _status: js.Any = js.native
      
      var _widget: js.Any = js.native
      
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The application document manager.
        */
      var docManager: IDocumentManager = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(docManager: IDocumentManager): IOptions = {
        val __obj = js.Dynamic.literal(docManager = docManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDocManager(value: IDocumentManager): Self = StObject.set(x, "docManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
