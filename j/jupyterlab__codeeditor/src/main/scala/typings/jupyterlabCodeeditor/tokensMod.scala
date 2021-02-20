package typings.jupyterlabCodeeditor

import typings.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait IEditorServices extends StObject {
    
    /**
      * The code editor factory.
      */
    val factoryService: IEditorFactoryService = js.native
    
    /**
      * The editor mime type service.
      */
    val mimeTypeService: IEditorMimeTypeService = js.native
  }
  object IEditorServices {
    
    @JSImport("@jupyterlab/codeeditor/lib/tokens", "IEditorServices")
    @js.native
    val ^ : Token[IEditorServices] = js.native
    
    @scala.inline
    implicit class IEditorServicesMutableBuilder[Self <: IEditorServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactoryService(value: IEditorFactoryService): Self = StObject.set(x, "factoryService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
    }
  }
}
