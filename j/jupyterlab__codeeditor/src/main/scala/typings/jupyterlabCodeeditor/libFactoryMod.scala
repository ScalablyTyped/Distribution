package typings.jupyterlabCodeeditor

import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoryMod {
  
  trait IEditorFactoryService extends StObject {
    
    /**
      * Create a new editor for a full document.
      */
    def newDocumentEditor(options: IOptions): IEditor
    
    /**
      * Create a new editor for inline code.
      */
    def newInlineEditor(options: IOptions): IEditor
  }
  object IEditorFactoryService {
    
    inline def apply(newDocumentEditor: IOptions => IEditor, newInlineEditor: IOptions => IEditor): IEditorFactoryService = {
      val __obj = js.Dynamic.literal(newDocumentEditor = js.Any.fromFunction1(newDocumentEditor), newInlineEditor = js.Any.fromFunction1(newInlineEditor))
      __obj.asInstanceOf[IEditorFactoryService]
    }
    
    extension [Self <: IEditorFactoryService](x: Self) {
      
      inline def setNewDocumentEditor(value: IOptions => IEditor): Self = StObject.set(x, "newDocumentEditor", js.Any.fromFunction1(value))
      
      inline def setNewInlineEditor(value: IOptions => IEditor): Self = StObject.set(x, "newInlineEditor", js.Any.fromFunction1(value))
    }
  }
}
