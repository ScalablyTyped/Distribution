package typings
package atJupyterlabConsoleLib.libHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/history", "ConsoleHistory")
@js.native
class ConsoleHistory protected () extends IConsoleHistory {
  /**
    * Construct a new console history object.
    */
  def this(options: atJupyterlabConsoleLib.libHistoryMod.ConsoleHistoryNs.IOptions) = this()
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
    * The current editor used by the history widget.
    */
  /* CompleteClass */
  override var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | scala.Null = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The placeholder text that a history session began with.
    */
  /* CompleteClass */
  override val placeholder: java.lang.String = js.native
  /**
    * The client session used by the foreign handler.
    */
  /* CompleteClass */
  override val session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession = js.native
  /**
    * Get the previous item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  /* CompleteClass */
  override def back(placeholder: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Get the next item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  /* CompleteClass */
  override def forward(placeholder: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
    * Handle an edge requested signal.
    */
  /* protected */ def onEdgeRequest(
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any,
    location: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.EdgeLocation */ js.Any
  ): scala.Unit = js.native
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
  /* protected */ def onHistory(value: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IHistoryReplyMsg): scala.Unit = js.native
  /**
    * Handle a text change signal from the editor.
    */
  /* protected */ def onTextChange(): scala.Unit = js.native
  /**
    * Add a new item to the bottom of history.
    *
    * @param item The item being added to the bottom of history.
    *
    * #### Notes
    * If the item being added is undefined or empty, it is ignored. If the item
    * being added is the same as the last item in history, it is ignored as well
    * so that the console's history will consist of no contiguous repetitions.
    */
  /* CompleteClass */
  override def push(item: java.lang.String): scala.Unit = js.native
  /**
    * Reset the history navigation state, i.e., start a new history session.
    */
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  /**
    * Set the filter data.
    *
    * @param filterStr - The string to use when filtering the data.
    */
  /* protected */ def setFilter(): scala.Unit = js.native
  /* protected */ def setFilter(filterStr: java.lang.String): scala.Unit = js.native
}

