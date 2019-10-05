package typings.atJupyterlabCodeeditor

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.ISelectionStyle
import typings.atJupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class CodeEditorWrapper protected ()
    extends typings.atJupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper {
    /**
      * Construct a new code editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class JSONEditor protected ()
    extends typings.atJupyterlabCodeeditor.libJsoneditorMod.JSONEditor {
    /**
      * Construct a new JSON editor.
      */
    def this(options: typings.atJupyterlabCodeeditor.libJsoneditorMod.JSONEditor.IOptions) = this()
  }
  
  val IEditorServices: Token[typings.atJupyterlabCodeeditor.libTokensMod.IEditorServices] = js.native
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
      extends typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Model {
      def this(options: typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Model.IOptions) = this()
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

