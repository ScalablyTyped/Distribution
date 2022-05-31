package typings.jupyterlabCodemirror

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions
import typings.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typings.jupyterlabCodemirror.anon.PartialIConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@jupyterlab/codemirror/lib/factory", "CodeMirrorEditorFactory")
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory ()
    extends StObject
       with IEditorFactoryService {
    def this(defaults: PartialIConfig) = this()
    
    /* protected */ var documentCodeMirrorConfig: PartialIConfig = js.native
    
    /* protected */ var inlineCodeMirrorConfig: PartialIConfig = js.native
    
    /**
      * Create a new editor for a full document.
      */
    /* CompleteClass */
    override def newDocumentEditor(options: IOptions): IEditor = js.native
    
    /**
      * Create a new editor for inline code.
      */
    /* CompleteClass */
    override def newInlineEditor(options: IOptions): IEditor = js.native
  }
}
