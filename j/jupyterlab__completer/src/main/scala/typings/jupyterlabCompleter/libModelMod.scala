package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.libWidgetMod.Completer.ICursorSpan
import typings.jupyterlabCompleter.libWidgetMod.Completer.IModel
import typings.jupyterlabCompleter.libWidgetMod.Completer.ITextState
import typings.jupyterlabCompleter.libWidgetMod.Completer.TypeMap
import typings.luminoAlgorithm.typesIterMod.IterableOrArrayLike
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelMod {
  
  @JSImport("@jupyterlab/completer/lib/model", "CompleterModel")
  @js.native
  open class CompleterModel ()
    extends StObject
       with IModel {
    
    /* private */ var _completionItems: Any = js.native
    
    /* private */ var _current: Any = js.native
    
    /* private */ var _cursor: Any = js.native
    
    /**
      * Apply the query to the complete options list to return the matching subset.
      */
    /* private */ var _filter: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * Check if CompletionItem matches against query.
      * Highlight matching prefix by adding <mark> tags.
      */
    /* private */ var _markup: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _orderedTypes: Any = js.native
    
    /* private */ var _original: Any = js.native
    
    /* private */ var _query: Any = js.native
    
    /**
      * Reset the state of the model.
      */
    /* private */ var _reset: Any = js.native
    
    /* private */ var _stateChanged: Any = js.native
    
    /* private */ var _subsetMatch: Any = js.native
    
    /* private */ var _typeMap: Any = js.native
    
    /**
      * The current text change details.
      */
    @JSName("current")
    def current_MCompleterModel: ITextState | Null = js.native
    
    /**
      * The cursor details that the API has used to return matching options.
      */
    @JSName("cursor")
    def cursor_MCompleterModel: ICursorSpan | Null = js.native
    
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
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Get whether the model is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MCompleterModel: Boolean = js.native
    
    /**
      * The original completion request details.
      */
    @JSName("original")
    def original_MCompleterModel: ITextState | Null = js.native
    
    /**
      * The query against which items are filtered.
      */
    @JSName("query")
    def query_MCompleterModel: String = js.native
    
    def setOptions(newValue: IterableOrArrayLike[String], typeMap: TypeMap): Unit = js.native
    
    /**
      * A signal emitted when state of the completer menu changes.
      */
    @JSName("stateChanged")
    def stateChanged_MCompleterModel: ISignal[this.type, Unit] = js.native
    
    /**
      * A flag that is true when the model value was modified by a subset match.
      */
    @JSName("subsetMatch")
    def subsetMatch_MCompleterModel: Boolean = js.native
  }
}
