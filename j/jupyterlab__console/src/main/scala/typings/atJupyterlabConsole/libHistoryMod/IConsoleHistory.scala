package typings.atJupyterlabConsole.libHistoryMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsoleHistory extends IDisposable {
  /**
    * The current editor used by the history widget.
    */
  var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | Null
  /**
    * The placeholder text that a history session began with.
    */
  val placeholder: String
  /**
    * The client session used by the foreign handler.
    */
  val session: IClientSession
  /**
    * Get the previous item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def back(placeholder: String): js.Promise[String]
  /**
    * Get the next item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def forward(placeholder: String): js.Promise[String]
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
  def push(item: String): Unit
  /**
    * Reset the history navigation state, i.e., start a new history session.
    */
  def reset(): Unit
}

object IConsoleHistory {
  @scala.inline
  def apply(
    back: String => js.Promise[String],
    dispose: () => Unit,
    forward: String => js.Promise[String],
    isDisposed: Boolean,
    placeholder: String,
    push: String => Unit,
    reset: () => Unit,
    session: IClientSession,
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = null
  ): IConsoleHistory = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), dispose = js.Any.fromFunction0(dispose), forward = js.Any.fromFunction1(forward), isDisposed = isDisposed, placeholder = placeholder, push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), session = session)
    if (editor != null) __obj.updateDynamic("editor")(editor)
    __obj.asInstanceOf[IConsoleHistory]
  }
}

