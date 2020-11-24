package typings.jupyterlabCodemirror

import typings.jupyterlabCodeeditor.factoryMod.IEditorFactoryService
import typings.jupyterlabCodemirror.anon.PartialIConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/codemirror/lib/factory", JSImport.Namespace)
@js.native
object factoryMod extends js.Object {
  
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
