package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogsMod {
  
  @JSImport("@jupyterlab/docmanager/lib/dialogs", "isValidFileName")
  @js.native
  def isValidFileName(name: String): Boolean = js.native
  
  @JSImport("@jupyterlab/docmanager/lib/dialogs", "renameDialog")
  @js.native
  def renameDialog(manager: IDocumentManager, oldPath: String): js.Promise[IModel | Null] = js.native
  
  @JSImport("@jupyterlab/docmanager/lib/dialogs", "renameFile")
  @js.native
  def renameFile(manager: IDocumentManager, oldPath: String, newPath: String): js.Promise[IModel | Null] = js.native
  
  @JSImport("@jupyterlab/docmanager/lib/dialogs", "shouldOverwrite")
  @js.native
  def shouldOverwrite(path: String): js.Promise[Boolean] = js.native
  
  @js.native
  trait IFileContainer extends JSONObject {
    
    /**
      * The list of item names in the current working directory.
      */
    var items: js.Array[String] = js.native
    
    /**
      * The current working directory of the file container.
      */
    var path: String = js.native
  }
  object IFileContainer {
    
    @scala.inline
    def apply(items: js.Array[String], path: String): IFileContainer = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileContainer]
    }
    
    @scala.inline
    implicit class IFileContainerMutableBuilder[Self <: IFileContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
