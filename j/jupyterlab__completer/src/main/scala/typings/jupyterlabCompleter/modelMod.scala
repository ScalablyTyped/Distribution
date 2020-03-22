package typings.jupyterlabCompleter

import typings.jupyterlabCompleter.widgetMod.Completer.ICursorSpan
import typings.jupyterlabCompleter.widgetMod.Completer.IModel
import typings.jupyterlabCompleter.widgetMod.Completer.ITextState
import typings.jupyterlabCompleter.widgetMod.Completer.TypeMap
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/model", JSImport.Namespace)
@js.native
object modelMod extends js.Object {
  @js.native
  class CompleterModel () extends IModel {
    var _current: js.Any = js.native
    var _cursor: js.Any = js.native
    /**
      * Apply the query to the complete options list to return the matching subset.
      */
    var _filter: js.Any = js.native
    var _isDisposed: js.Any = js.native
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
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    @JSName("current")
    def current_MCompleterModel(): js.Any = js.native
    @JSName("current")
    def current_MCompleterModel(newValue: ITextState): js.Any = js.native
    /**
      * The current text change details.
      */
    @JSName("current")
    def current_Union(): ITextState | Null = js.native
    @JSName("cursor")
    def cursor_MCompleterModel(): js.Any = js.native
    @JSName("cursor")
    def cursor_MCompleterModel(newValue: ICursorSpan): js.Any = js.native
    /**
      * The cursor details that the API has used to return matching options.
      */
    @JSName("cursor")
    def cursor_Union(): ICursorSpan | Null = js.native
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
      * Get whether the model is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MCompleterModel(): Boolean = js.native
    @JSName("original")
    def original_MCompleterModel(): js.Any = js.native
    @JSName("original")
    def original_MCompleterModel(newValue: ITextState): js.Any = js.native
    /**
      * The original completion request details.
      */
    @JSName("original")
    def original_Union(): ITextState | Null = js.native
    /**
      * The query against which items are filtered.
      */
    @JSName("query")
    def query_MCompleterModel(): String = js.native
    @JSName("query")
    def query_MCompleterModel(newValue: String): js.Any = js.native
    def setOptions(newValue: IterableOrArrayLike[String], typeMap: TypeMap): Unit = js.native
    /**
      * A signal emitted when state of the completer menu changes.
      */
    @JSName("stateChanged")
    def stateChanged_MCompleterModel(): ISignal[this.type, Unit] = js.native
    /**
      * A flag that is true when the model value was modified by a subset match.
      */
    @JSName("subsetMatch")
    def subsetMatch_MCompleterModel(): Boolean = js.native
    @JSName("subsetMatch")
    def subsetMatch_MCompleterModel(newValue: Boolean): js.Any = js.native
  }
  
}

