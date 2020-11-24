package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.managerMod.DocumentManager.IOptions
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docmanager", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val IDocumentManager: Token[typings.jupyterlabDocmanager.tokensMod.IDocumentManager] = js.native
  
  def isValidFileName(name: String): Boolean = js.native
  
  def renameDialog(manager: typings.jupyterlabDocmanager.tokensMod.IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
  
  def renameFile(manager: typings.jupyterlabDocmanager.tokensMod.IDocumentManager, oldPath: String, newPath: String): js.Promise[IModel | Null] = js.native
  
  def shouldOverwrite(path: String): js.Promise[Boolean] = js.native
  
  @js.native
  class DocumentManager protected ()
    extends typings.jupyterlabDocmanager.managerMod.DocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class DocumentWidgetManager protected ()
    extends typings.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager {
    /**
      * Construct a new document widget manager.
      */
    def this(options: typings.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager.IOptions) = this()
  }
  
  @js.native
  class PathStatus protected ()
    extends typings.jupyterlabDocmanager.pathstatusMod.PathStatus {
    /**
      * Construct a new PathStatus status item.
      */
    def this(opts: typings.jupyterlabDocmanager.pathstatusMod.PathStatus.IOptions) = this()
  }
  @js.native
  object PathStatus extends js.Object {
    
    /**
      * A VDomModel for rendering the PathStatus status item.
      */
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
  
  @js.native
  class SaveHandler protected ()
    extends typings.jupyterlabDocmanager.savehandlerMod.SaveHandler {
    /**
      * Construct a new save handler.
      */
    def this(options: typings.jupyterlabDocmanager.savehandlerMod.SaveHandler.IOptions) = this()
  }
  
  @js.native
  class SavingStatus protected ()
    extends typings.jupyterlabDocmanager.savingstatusMod.SavingStatus {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: typings.jupyterlabDocmanager.savingstatusMod.SavingStatus.IOptions) = this()
  }
  @js.native
  object SavingStatus extends js.Object {
    
    /**
      * A VDomModel for the SavingStatus item.
      */
    @js.native
    class Model protected ()
      extends typings.jupyterlabDocmanager.savingstatusMod.SavingStatus.Model {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: typings.jupyterlabDocmanager.tokensMod.IDocumentManager) = this()
    }
  }
}
