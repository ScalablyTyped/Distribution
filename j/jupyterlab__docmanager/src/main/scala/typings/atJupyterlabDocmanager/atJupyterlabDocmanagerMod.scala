package typings.atJupyterlabDocmanager

import typings.atJupyterlabDocmanager.libManagerMod.DocumentManager.IOptions
import typings.atJupyterlabServices.libContentsMod.Contents.IModel
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager", JSImport.Namespace)
@js.native
object atJupyterlabDocmanagerMod extends js.Object {
  @js.native
  class DocumentManager protected ()
    extends typings.atJupyterlabDocmanager.libManagerMod.DocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class DocumentWidgetManager protected ()
    extends typings.atJupyterlabDocmanager.libWidgetmanagerMod.DocumentWidgetManager {
    /**
      * Construct a new document widget manager.
      */
    def this(options: typings.atJupyterlabDocmanager.libWidgetmanagerMod.DocumentWidgetManager.IOptions) = this()
  }
  
  @js.native
  class PathStatus protected ()
    extends typings.atJupyterlabDocmanager.libPathstatusMod.PathStatus {
    /**
      * Construct a new PathStatus status item.
      */
    def this(opts: typings.atJupyterlabDocmanager.libPathstatusMod.PathStatus.IOptions) = this()
  }
  
  @js.native
  class SaveHandler protected ()
    extends typings.atJupyterlabDocmanager.libSavehandlerMod.SaveHandler {
    /**
      * Construct a new save handler.
      */
    def this(options: typings.atJupyterlabDocmanager.libSavehandlerMod.SaveHandler.IOptions) = this()
  }
  
  @js.native
  class SavingStatus protected ()
    extends typings.atJupyterlabDocmanager.libSavingstatusMod.SavingStatus {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: typings.atJupyterlabDocmanager.libSavingstatusMod.SavingStatus.IOptions) = this()
  }
  
  val IDocumentManager: Token[typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager] = js.native
  def isValidFileName(name: String): Boolean = js.native
  def renameDialog(manager: typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
  def renameFile(
    manager: typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager,
    oldPath: String,
    newPath: String
  ): js.Promise[IModel | Null] = js.native
  def shouldOverwrite(path: String): js.Promise[Boolean] = js.native
  @js.native
  object PathStatus extends js.Object {
    /**
      * A VDomModel for rendering the PathStatus status item.
      */
    @js.native
    class Model protected ()
      extends typings.atJupyterlabDocmanager.libPathstatusMod.PathStatus.Model {
      /**
        * Construct a new model.
        *
        * @param docManager: the application document manager. Used to check
        *   whether the current widget is a document.
        */
      def this(docManager: typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager) = this()
    }
    
  }
  
  @js.native
  object SavingStatus extends js.Object {
    /**
      * A VDomModel for the SavingStatus item.
      */
    @js.native
    class Model protected ()
      extends typings.atJupyterlabDocmanager.libSavingstatusMod.SavingStatus.Model {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager) = this()
    }
    
  }
  
}

