package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.libManagerMod.DocumentManager.IOptions
import typings.jupyterlabServices.libContentsMod.Contents.IModel
import typings.jupyterlabTranslation.libTokensMod.ITranslator
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
  open class DocumentManager protected ()
    extends typings.jupyterlabDocmanager.libManagerMod.DocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "DocumentWidgetManager")
  @js.native
  open class DocumentWidgetManager protected ()
    extends typings.jupyterlabDocmanager.libWidgetmanagerMod.DocumentWidgetManager {
    /**
      * Construct a new document widget manager.
      */
    def this(options: typings.jupyterlabDocmanager.libWidgetmanagerMod.DocumentWidgetManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "IDocumentManager")
  @js.native
  val IDocumentManager: Token[typings.jupyterlabDocmanager.libTokensMod.IDocumentManager] = js.native
  
  @JSImport("@jupyterlab/docmanager", "PathStatus")
  @js.native
  open class PathStatus protected ()
    extends typings.jupyterlabDocmanager.libPathstatusMod.PathStatus {
    /**
      * Construct a new PathStatus status item.
      */
    def this(opts: typings.jupyterlabDocmanager.libPathstatusMod.PathStatus.IOptions) = this()
  }
  object PathStatus {
    
    /**
      * A VDomModel for rendering the PathStatus status item.
      */
    @JSImport("@jupyterlab/docmanager", "PathStatus.Model")
    @js.native
    open class Model protected ()
      extends typings.jupyterlabDocmanager.libPathstatusMod.PathStatus.Model {
      /**
        * Construct a new model.
        *
        * @param docManager: the application document manager. Used to check
        *   whether the current widget is a document.
        */
      def this(docManager: typings.jupyterlabDocmanager.libTokensMod.IDocumentManager) = this()
    }
  }
  
  @JSImport("@jupyterlab/docmanager", "SaveHandler")
  @js.native
  open class SaveHandler protected ()
    extends typings.jupyterlabDocmanager.libSavehandlerMod.SaveHandler {
    /**
      * Construct a new save handler.
      */
    def this(options: typings.jupyterlabDocmanager.libSavehandlerMod.SaveHandler.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/docmanager", "SavingStatus")
  @js.native
  open class SavingStatus protected ()
    extends typings.jupyterlabDocmanager.libSavingstatusMod.SavingStatus {
    /**
      * Create a new SavingStatus item.
      */
    def this(opts: typings.jupyterlabDocmanager.libSavingstatusMod.SavingStatus.IOptions) = this()
  }
  object SavingStatus {
    
    /**
      * A VDomModel for the SavingStatus item.
      */
    @JSImport("@jupyterlab/docmanager", "SavingStatus.Model")
    @js.native
    open class Model protected ()
      extends typings.jupyterlabDocmanager.libSavingstatusMod.SavingStatus.Model {
      /**
        * Create a new SavingStatus model.
        */
      def this(docManager: typings.jupyterlabDocmanager.libTokensMod.IDocumentManager) = this()
    }
  }
  
  inline def isValidFileName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFileName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def renameDialog(manager: typings.jupyterlabDocmanager.libTokensMod.IDocumentManager, oldPath: String): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameDialog")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  inline def renameDialog(
    manager: typings.jupyterlabDocmanager.libTokensMod.IDocumentManager,
    oldPath: String,
    translator: ITranslator
  ): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameDialog")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  
  inline def renameFile(
    manager: typings.jupyterlabDocmanager.libTokensMod.IDocumentManager,
    oldPath: String,
    newPath: String
  ): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameFile")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  
  inline def shouldOverwrite(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldOverwrite")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def shouldOverwrite(path: String, translator: ITranslator): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldOverwrite")(path.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
