package typings
package atJupyterlabConsoleLib.libHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsoleHistory
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * The current editor used by the history widget.
    */
  var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | scala.Null
  /**
    * The placeholder text that a history session began with.
    */
  val placeholder: java.lang.String
  /**
    * The client session used by the foreign handler.
    */
  val session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession
  /**
    * Get the previous item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def back(placeholder: java.lang.String): js.Promise[java.lang.String]
  /**
    * Get the next item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def forward(placeholder: java.lang.String): js.Promise[java.lang.String]
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
  def push(item: java.lang.String): scala.Unit
  /**
    * Reset the history navigation state, i.e., start a new history session.
    */
  def reset(): scala.Unit
}

object IConsoleHistory {
  @scala.inline
  def apply(
    back: java.lang.String => js.Promise[java.lang.String],
    dispose: () => scala.Unit,
    forward: java.lang.String => js.Promise[java.lang.String],
    isDisposed: scala.Boolean,
    placeholder: java.lang.String,
    push: java.lang.String => scala.Unit,
    reset: () => scala.Unit,
    session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession,
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = null
  ): IConsoleHistory = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), dispose = js.Any.fromFunction0(dispose), forward = js.Any.fromFunction1(forward), isDisposed = isDisposed, placeholder = placeholder, push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), session = session)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    __obj.asInstanceOf[IConsoleHistory]
  }
}

