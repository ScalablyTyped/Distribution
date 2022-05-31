package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.managerMod.DocumentManager.IOptions
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/docmanager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/docmanager", "DocumentManager")
  @js.native
  class DocumentManager protected ()
    extends typings.jupyterlabDocmanager.managerMod.DocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "DocumentWidgetManager")
  @js.native
  class DocumentWidgetManager protected ()
    extends typings.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager {
    /**
      * Construct a new document widget manager.
      */
    def this(options: typings.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "IDocumentManager")
  @js.native
  val IDocumentManager: Token[typings.jupyterlabDocmanager.tokensMod.IDocumentManager] = js.native
  
  @JSImport("@jupyterlab/docmanager", "PathStatus")
  @js.native
  class PathStatus protected ()
    extends typings.jupyterlabDocmanager.pathstatusMod.PathStatus {
    /**
      * Construct a new PathStatus status item.
      */
    def this(opts: typings.jupyterlabDocmanager.pathstatusMod.PathStatus.IOptions) = this()
  }
  object PathStatus {
    
    /**
      * A VDomModel for rendering the PathStatus status item.
      */
    @JSImport("@jupyterlab/docmanager", "PathStatus.Model")
    @js.native
    class Model protected ()
      extends typings.jupyterlabDocmanager.pathstatusMod.PathStatus.Model {
      /**
        * Construct a new model.
        *
        * @param docManager: the application document manager. Used to check
        *   whether the current widget is a document.
        */
      def this(docManager: typings.jupyterlabDocmanager.tokensMod.IDocumentManager) = this()
    }
  }
  
  @JSImport("@jupyterlab/docmanager", "SaveHandler")
  @js.native
  class SaveHandler protected ()
    extends typings.jupyterlabDocmanager.savehandlerMod.SaveHandler {
    /**
      * Construct a new save handler.
      */
    def this(options: typings.jupyterlabDocmanager.savehandlerMod.SaveHandler.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "SavingStatus")
  @js.native
  class SavingStatus protected ()
    extends typings.jupyterlabDocmanager.savingstatusMod.SavingStatus {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: typings.jupyterlabDocmanager.savingstatusMod.SavingStatus.IOptions) = this()
  }
  object SavingStatus {
    
    /**
      * A VDomModel for the SavingStatus item.
      */
    @JSImport("@jupyterlab/docmanager", "SavingStatus.Model")
    @js.native
    class Model protected ()
      extends typings.jupyterlabDocmanager.savingstatusMod.SavingStatus.Model {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: typings.jupyterlabDocmanager.tokensMod.IDocumentManager) = this()
    }
  }
  
  inline def isValidFileName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFileName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def renameDialog(manager: typings.jupyterlabDocmanager.tokensMod.IDocumentManager, oldPath: String): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameDialog")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  
  inline def renameFile(manager: typings.jupyterlabDocmanager.tokensMod.IDocumentManager, oldPath: String, newPath: String): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameFile")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  
  inline def shouldOverwrite(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldOverwrite")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
