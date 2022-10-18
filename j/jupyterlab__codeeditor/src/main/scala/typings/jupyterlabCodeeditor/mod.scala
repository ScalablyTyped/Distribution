package typings.jupyterlabCodeeditor

import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.ISelectionStyle
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Model.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CodeEditor {
    
    /**
      * The default implementation of the editor model.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.Model")
    @js.native
    /**
      * Construct a new Model.
      */
    open class Model ()
      extends typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Model {
      def this(options: IOptions) = this()
    }
    
    /**
      * The default configuration options for an editor.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.defaultConfig")
    @js.native
    val defaultConfig: IConfig = js.native
    
    /**
      * The default selection style.
      */
    @JSImport("@jupyterlab/codeeditor", "CodeEditor.defaultSelectionStyle")
    @js.native
    val defaultSelectionStyle: ISelectionStyle = js.native
  }
  
  @JSImport("@jupyterlab/codeeditor", "CodeEditorWrapper")
  @js.native
  open class CodeEditorWrapper protected ()
    extends typings.jupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper {
    /**
      * Construct a new code editor widget.
      */
    def this(options: typings.jupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper.IOptions) = this()
  }
  
  object IEditorMimeTypeService {
    
    /**
      * The default mime type.
      */
    @JSImport("@jupyterlab/codeeditor", "IEditorMimeTypeService.defaultMimeType")
    @js.native
    val defaultMimeType: String = js.native
  }
  
  @JSImport("@jupyterlab/codeeditor", "IEditorServices")
  @js.native
  val IEditorServices: Token[typings.jupyterlabCodeeditor.libTokensMod.IEditorServices] = js.native
  
  @JSImport("@jupyterlab/codeeditor", "JSONEditor")
  @js.native
  open class JSONEditor protected ()
    extends typings.jupyterlabCodeeditor.libJsoneditorMod.JSONEditor {
    /**
      * Construct a new JSON editor.
      */
    def this(options: typings.jupyterlabCodeeditor.libJsoneditorMod.JSONEditor.IOptions) = this()
  }
}
