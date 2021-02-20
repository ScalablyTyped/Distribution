package typings.jupyterlabCodeeditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @js.native
  trait IEditorFactoryService extends StObject {
    
    /**
      * Create a new editor for a full document.
      */
    def newDocumentEditor(options: IOptions): IEditor = js.native
    
    /**
      * Create a new editor for inline code.
      */
    def newInlineEditor(options: IOptions): IEditor = js.native
  }
  object IEditorFactoryService {
    
    @scala.inline
    def apply(newDocumentEditor: IOptions => IEditor, newInlineEditor: IOptions => IEditor): IEditorFactoryService = {
      val __obj = js.Dynamic.literal(newDocumentEditor = js.Any.fromFunction1(newDocumentEditor), newInlineEditor = js.Any.fromFunction1(newInlineEditor))
      __obj.asInstanceOf[IEditorFactoryService]
    }
    
    @scala.inline
    implicit class IEditorFactoryServiceMutableBuilder[Self <: IEditorFactoryService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewDocumentEditor(value: IOptions => IEditor): Self = StObject.set(x, "newDocumentEditor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNewInlineEditor(value: IOptions => IEditor): Self = StObject.set(x, "newInlineEditor", js.Any.fromFunction1(value))
    }
  }
}
