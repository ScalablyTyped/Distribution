package typings.jupyterlabCodemirror.syntaxstatusMod.EditorSyntaxStatus

import typings.jupyterlabApputils.vdomMod.VDomModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VDomModel for the current editor/mode combination.
  */
@JSImport("@jupyterlab/codemirror/lib/syntaxstatus", "EditorSyntaxStatus.Model")
@js.native
class Model () extends VDomModel {
  
  var _editor: js.Any = js.native
  
  var _mode: js.Any = js.native
  
  /**
    * If the editor mode changes, update the model.
    */
  var _onMIMETypeChange: js.Any = js.native
  
  /**
    * Trigger a rerender of the model.
    */
  var _triggerChange: js.Any = js.native
  
  /**
    * The current editor for the application editor tracker.
    */
  def editor: IEditor | Null = js.native
  def editor_=(editor: IEditor | Null): Unit = js.native
  
  /**
    * The current mode for the editor. If no editor is present,
    * returns the empty string.
    */
  def mode: String = js.native
}
