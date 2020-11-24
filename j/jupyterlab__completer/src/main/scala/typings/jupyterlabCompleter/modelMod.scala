package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.widgetMod.Completer.ICursorSpan
import typings.jupyterlabCompleter.widgetMod.Completer.IModel
import typings.jupyterlabCompleter.widgetMod.Completer.ITextState
import typings.jupyterlabCompleter.widgetMod.Completer.TypeMap
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/completer/lib/model", JSImport.Namespace)
@js.native
object modelMod extends js.Object {
  
  @js.native
  class CompleterModel () extends IModel {
    
    var _completionItems: js.Any = js.native
    
    var _current: js.Any = js.native
    
    var _cursor: js.Any = js.native
    
    /**
      * Apply the query to the complete options list to return the matching subset.
      */
    var _filter: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * Check if CompletionItem matches against query.
      * Highlight matching prefix by adding <mark> tags.
      */
    var _markup: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _orderedTypes: js.Any = js.native
    
    var _original: js.Any = js.native
    
    var _query: js.Any = js.native
    
    /**
      * Reset the state of the model.
      */
    var _reset: js.Any = js.native
    
    var _stateChanged: js.Any = js.native
    
    var _subsetMatch: js.Any = js.native
    
    var _typeMap: js.Any = js.native
    
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
