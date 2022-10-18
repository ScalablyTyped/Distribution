package typings.jupyterlabDocmanager

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabDocmanager.libPathstatusMod.PathStatus.IOptions
import typings.jupyterlabDocmanager.libPathstatusMod.PathStatus.Model
import typings.jupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathstatusMod {
  
  @JSImport("@jupyterlab/docmanager/lib/pathstatus", "PathStatus")
  @js.native
  open class PathStatus protected () extends VDomRenderer[Model] {
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
    open class Model protected () extends VDomModel {
      /**
        * Construct a new model.
        *
        * @param docManager: the application document manager. Used to check
        *   whether the current widget is a document.
        */
      def this(docManager: IDocumentManager) = this()
      
      /* private */ var _docManager: Any = js.native
      
      /**
        * Get the current state of the model.
        */
      /* private */ var _getAllState: Any = js.native
      
      /* private */ var _name: Any = js.native
      
      /**
        * React to a path change for the current document.
        */
      /* private */ var _onPathChange: Any = js.native
      
      /**
        * React to a title change for the current widget.
        */
      /* private */ var _onTitleChange: Any = js.native
      
      /* private */ var _path: Any = js.native
      
      /**
        * Trigger a state change to rerender.
        */
      /* private */ var _triggerChange: Any = js.native
      
      /* private */ var _widget: Any = js.native
      
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
    trait IOptions extends StObject {
      
      /**
        * The application document manager.
        */
      var docManager: IDocumentManager
    }
    object IOptions {
      
      inline def apply(docManager: IDocumentManager): IOptions = {
        val __obj = js.Dynamic.literal(docManager = docManager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setDocManager(value: IDocumentManager): Self = StObject.set(x, "docManager", value.asInstanceOf[js.Any])
      }
    }
  }
}
