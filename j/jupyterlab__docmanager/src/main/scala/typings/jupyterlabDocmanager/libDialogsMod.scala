package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.jupyterlabServices.libContentsMod.Contents.IModel
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDialogsMod {
  
  @JSImport("@jupyterlab/docmanager/lib/dialogs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidFileName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFileName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def renameDialog(manager: IDocumentManager, oldPath: String): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameDialog")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  inline def renameDialog(manager: IDocumentManager, oldPath: String, translator: ITranslator): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameDialog")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  
  inline def renameFile(manager: IDocumentManager, oldPath: String, newPath: String): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameFile")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  
  inline def shouldOverwrite(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldOverwrite")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def shouldOverwrite(path: String, translator: ITranslator): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldOverwrite")(path.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  trait IFileContainer
    extends StObject
       with JSONObject {
    
    /**
      * The list of item names in the current working directory.
      */
    var items: js.Array[String]
    
    /**
      * The current working directory of the file container.
      */
    var path: String
  }
  object IFileContainer {
    
    inline def apply(items: js.Array[String], path: String): IFileContainer = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileContainer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFileContainer] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
