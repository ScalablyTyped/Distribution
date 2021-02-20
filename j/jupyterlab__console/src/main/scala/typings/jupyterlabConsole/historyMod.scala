package typings.jupyterlabConsole

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.EdgeLocation
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabConsole.historyMod.ConsoleHistory.IOptions
import typings.jupyterlabServices.messagesMod.IHistoryReplyMsg
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object historyMod {
  
  @JSImport("@jupyterlab/console/lib/history", "ConsoleHistory")
  @js.native
  class ConsoleHistory protected () extends IConsoleHistory {
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
    def editor_MConsoleHistory: IEditor | Null = js.native
    
    /**
      * Get whether the console history manager is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MConsoleHistory: Boolean = js.native
    
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
    def placeholder_MConsoleHistory: String = js.native
    
    /**
      * Set the filter data.
      *
      * @param filterStr - The string to use when filtering the data.
      */
    /* protected */ def setFilter(): Unit = js.native
    /* protected */ def setFilter(filterStr: String): Unit = js.native
  }
  object ConsoleHistory {
    
    /**
      * The initialization options for a console history object.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The client session used by the foreign handler.
        */
      var sessionContext: ISessionContext = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(sessionContext: ISessionContext): IOptions = {
        val __obj = js.Dynamic.literal(sessionContext = sessionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
      }
    }
  }
  
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
    implicit class IConsoleHistoryMutableBuilder[Self <: IConsoleHistory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBack(value: String => js.Promise[String]): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorNull: Self = StObject.set(x, "editor", null)
      
      @scala.inline
      def setForward(value: String => js.Promise[String]): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPush(value: String => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
    }
  }
}
