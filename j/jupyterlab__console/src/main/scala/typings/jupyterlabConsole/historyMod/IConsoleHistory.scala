package typings.jupyterlabConsole.historyMod

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsoleHistory extends IDisposable {
  
  /**
    * Get the previous item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def back(placeholder: String): js.Promise[String] = js.native
  
  /**
    * The current editor used by the history widget.
    */
  var editor: IEditor | Null = js.native
  
  /**
    * Get the next item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def forward(placeholder: String): js.Promise[String] = js.native
  
  /**
    * The placeholder text that a history session began with.
    */
  val placeholder: String = js.native
  
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
  def push(item: String): Unit = js.native
  
  /**
    * Reset the history navigation state, i.e., start a new history session.
    */
  def reset(): Unit = js.native
  
  /**
    * The session context used by the foreign handler.
    */
  val sessionContext: ISessionContext = js.native
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
    sessionContext: ISessionContext
  ): IConsoleHistory = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), dispose = js.Any.fromFunction0(dispose), forward = js.Any.fromFunction1(forward), isDisposed = isDisposed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), sessionContext = sessionContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsoleHistory]
  }
  
  @scala.inline
  implicit class IConsoleHistoryOps[Self <: IConsoleHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBack(value: String => js.Promise[String]): Self = this.set("back", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForward(value: String => js.Promise[String]): Self = this.set("forward", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: String => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSessionContext(value: ISessionContext): Self = this.set("sessionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: IEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorNull: Self = this.set("editor", null)
  }
}
