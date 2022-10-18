package typings.jupyterlabCodemirror

import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions
import typings.jupyterlabCodeeditor.libFactoryMod.IEditorFactoryService
import typings.jupyterlabCodemirror.anon.PartialIConfig
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoryMod {
  
  @JSImport("@jupyterlab/codemirror/lib/factory", "CodeMirrorEditorFactory")
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  open class CodeMirrorEditorFactory ()
    extends StObject
       with IEditorFactoryService {
    def this(defaults: PartialIConfig) = this()
    def this(defaults: Unit, translator: ITranslator) = this()
    def this(defaults: PartialIConfig, translator: ITranslator) = this()
    
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
    
    /* protected */ var translator: ITranslator = js.native
  }
}
