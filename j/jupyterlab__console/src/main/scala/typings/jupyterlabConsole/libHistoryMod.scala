package typings.jupyterlabConsole

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.EdgeLocation
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabConsole.libHistoryMod.ConsoleHistory.IOptions
import typings.jupyterlabServices.libKernelMessagesMod.IHistoryReplyMsg
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHistoryMod {
  
  @JSImport("@jupyterlab/console/lib/history", "ConsoleHistory")
  @js.native
  open class ConsoleHistory protected ()
    extends StObject
       with IConsoleHistory {
    /**
      * Construct a new console history object.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _cursor: Any = js.native
    
    /* private */ var _editor: Any = js.native
    
    /* private */ var _filtered: Any = js.native
    
    /**
      * Handle the current kernel changing.
      */
    /* private */ var _handleKernel: Any = js.native
    
    /* private */ var _hasSession: Any = js.native
    
    /* private */ var _history: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _placeholder: Any = js.native
    
    /* private */ var _setByHistory: Any = js.native
    
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
    override def back(placeholder: String): js.Promise[String] = js.native
    
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
    override def dispose(): Unit = js.native
    
    /**
      * The current editor used by the history widget.
      */
    /* CompleteClass */
    var editor: IEditor | Null = js.native
    /**
      * The current editor used by the history manager.
      */
    @JSName("editor")
    def editor_MConsoleHistory: IEditor | Null = js.native
    
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
    override def forward(placeholder: String): js.Promise[String] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
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
    /* CompleteClass */
    override val placeholder: String = js.native
    /**
      * The placeholder text that a history session began with.
      */
    @JSName("placeholder")
    def placeholder_MConsoleHistory: String = js.native
    
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
    override def push(item: String): Unit = js.native
    
    /**
      * Reset the history navigation state, i.e., start a new history session.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /**
      * The session context used by the foreign handler.
      */
    /* CompleteClass */
    override val sessionContext: ISessionContext = js.native
    
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
    trait IOptions extends StObject {
      
      /**
        * The client session used by the foreign handler.
        */
      var sessionContext: ISessionContext
    }
    object IOptions {
      
      inline def apply(sessionContext: ISessionContext): IOptions = {
        val __obj = js.Dynamic.literal(sessionContext = sessionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait IConsoleHistory
    extends StObject
       with IDisposable {
    
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
      * The current editor used by the history widget.
      */
    var editor: IEditor | Null
    
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
      * The placeholder text that a history session began with.
      */
    val placeholder: String
    
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
    
    /**
      * The session context used by the foreign handler.
      */
    val sessionContext: ISessionContext
  }
  object IConsoleHistory {
    
    inline def apply(
      back: String => js.Promise[String],
      dispose: () => Unit,
      forward: String => js.Promise[String],
      isDisposed: Boolean,
      placeholder: String,
      push: String => Unit,
      reset: () => Unit,
      sessionContext: ISessionContext
    ): IConsoleHistory = {
      val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), dispose = js.Any.fromFunction0(dispose), forward = js.Any.fromFunction1(forward), isDisposed = isDisposed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), sessionContext = sessionContext.asInstanceOf[js.Any], editor = null)
      __obj.asInstanceOf[IConsoleHistory]
    }
    
    extension [Self <: IConsoleHistory](x: Self) {
      
      inline def setBack(value: String => js.Promise[String]): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
      
      inline def setEditor(value: IEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorNull: Self = StObject.set(x, "editor", null)
      
      inline def setForward(value: String => js.Promise[String]): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPush(value: String => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSessionContext(value: ISessionContext): Self = StObject.set(x, "sessionContext", value.asInstanceOf[js.Any])
    }
  }
}
