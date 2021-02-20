package typings.jupyterlabDocmanager

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabDocmanager.pathstatusMod.PathStatus.IOptions
import typings.jupyterlabDocmanager.pathstatusMod.PathStatus.Model
import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathstatusMod {
  
  @JSImport("@jupyterlab/docmanager/lib/pathstatus", "PathStatus")
  @js.native
  class PathStatus protected () extends VDomRenderer[Model] {
    /**
      * Construct a new PathStatus status item.
      */
    def this(opts: IOptions) = this()
  }
  object PathStatus {
    
    /**
      * A VDomModel for rendering the PathStatus status item.
      */
    @JSImport("@jupyterlab/docmanager/lib/pathstatus", "PathStatus.Model")
    @js.native
    class Model protected () extends VDomModel {
      /**
        * Construct a new model.
        *
        * @param docManager: the application document manager. Used to check
        *   whether the current widget is a document.
        */
      def this(docManager: IDocumentManager) = this()
      
      var _docManager: js.Any = js.native
      
      /**
        * Get the current state of the model.
        */
      var _getAllState: js.Any = js.native
      
      var _name: js.Any = js.native
      
      /**
        * React to a path change for the current document.
        */
      var _onPathChange: js.Any = js.native
      
      /**
        * React to a title change for the current widget.
        */
      var _onTitleChange: js.Any = js.native
      
      var _path: js.Any = js.native
      
      /**
        * Trigger a state change to rerender.
        */
      var _triggerChange: js.Any = js.native
      
      var _widget: js.Any = js.native
      
      /**
        * The name of the current activity.
        */
      def name: String = js.native
      
      /**
        * The current path for the application.
        */
      def path: String = js.native
      
      /**
        * The current widget for the application.
        */
      def widget: Widget | Null = js.native
      def widget_=(widget: Widget | Null): Unit = js.native
    }
    
    /**
      * Options for creating the PathStatus widget.
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
