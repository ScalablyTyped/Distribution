package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogsMod {
  
  @JSImport("@jupyterlab/docmanager/lib/dialogs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidFileName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidFileName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def renameDialog(manager: IDocumentManager, oldPath: String): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameDialog")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  
  inline def renameFile(manager: IDocumentManager, oldPath: String, newPath: String): js.Promise[IModel | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameFile")(manager.asInstanceOf[js.Any], oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IModel | Null]]
  
  inline def shouldOverwrite(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldOverwrite")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
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
    
    extension [Self <: IFileContainer](x: Self) {
      
      inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
