package typings.jupyterlabCodemirror

import typings.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typings.jupyterlabCodemirror.anon.PartialIConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@jupyterlab/codemirror/lib/factory", "CodeMirrorEditorFactory")
  @js.native
  /**
    * Construct an IEditorFactoryService for CodeMirrorEditors.
    */
  class CodeMirrorEditorFactory () extends IEditorFactoryService {
    def this(defaults: PartialIConfig) = this()
    
    var documentCodeMirrorConfig: PartialIConfig = js.native
    
    var inlineCodeMirrorConfig: PartialIConfig = js.native
  }
}
