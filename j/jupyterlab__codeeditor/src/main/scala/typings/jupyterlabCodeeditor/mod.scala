package typings.jupyterlabCodeeditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IConfig
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ISelectionStyle
import typings.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper.IOptions
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodeEditorWrapper protected ()
    extends typings.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper {
    /**
      * Construct a new code editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class JSONEditor protected ()
    extends typings.jupyterlabCodeeditor.jsoneditorMod.JSONEditor {
    /**
      * Construct a new JSON editor.
      */
    def this(options: typings.jupyterlabCodeeditor.jsoneditorMod.JSONEditor.IOptions) = this()
  }
  
  val IEditorServices: Token[typings.jupyterlabCodeeditor.tokensMod.IEditorServices] = js.native
  @js.native
  object CodeEditor extends js.Object {
    /**
      * The default implementation of the editor model.
      */
    @js.native
    /**
      * Construct a new Model.
      */
    class Model ()
      extends typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model {
      def this(options: typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions) = this()
    }
    
    /**
      * The default configuration options for an editor.
      */
    var defaultConfig: IConfig = js.native
    /**
      * The default selection style.
      */
    val defaultSelectionStyle: ISelectionStyle = js.native
  }
  
  @js.native
  object IEditorMimeTypeService extends js.Object {
    /**
      * The default mime type.
      */
    val defaultMimeType: String = js.native
  }
  
}

