package typings.jupyterlabConsole.historyMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.EdgeLocation
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabConsole.historyMod.ConsoleHistory.IOptions
import typings.jupyterlabServices.messagesMod.IHistoryReplyMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/console/lib/history", "ConsoleHistory")
@js.native
class ConsoleHistory_ protected () extends IConsoleHistory {
  /**
    * Construct a new console history object.
    */
  def this(options: IOptions) = this()
  
  var _cursor: js.Any = js.native
  
  var _editor: js.Any = js.native
  
  var _filtered: js.Any = js.native
  
  /**
    * Handle the current kernel changing.
    */
  var _handleKernel: js.Any = js.native
  
  var _hasSession: js.Any = js.native
  
  var _history: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _placeholder: js.Any = js.native
  
  var _setByHistory: js.Any = js.native
  
  /**
    * The current editor used by the history manager.
    */
  @JSName("editor")
  def editor_MConsoleHistory_ : IEditor | Null = js.native
  
  /**
    * Get whether the console history manager is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MConsoleHistory_ : Boolean = js.native
  
  /**
    * Handle an edge requested signal.
    */
  /* protected */ def onEdgeRequest(editor: IEditor, location: EdgeLocation): Unit = js.native
  
  /**
    * Populate the history collection on history reply from a kernel.
    *
    * @param value The kernel message history reply.
    *
    * #### Notes
    * History entries have the shape:
    * [session: number, line: number, input: string]
    * Contiguous duplicates are stripped out of the API response.
    */
  /* protected */ def onHistory(value: IHistoryReplyMsg): Unit = js.native
  
  /**
    * Handle a text change signal from the editor.
    */
  /* protected */ def onTextChange(): Unit = js.native
  
  /**
    * The placeholder text that a history session began with.
    */
  @JSName("placeholder")
  def placeholder_MConsoleHistory_ : String = js.native
  
  /**
    * Set the filter data.
    *
    * @param filterStr - The string to use when filtering the data.
    */
  /* protected */ def setFilter(): Unit = js.native
  /* protected */ def setFilter(filterStr: String): Unit = js.native
}
