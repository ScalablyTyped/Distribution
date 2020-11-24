package typings.jupyterlabCompleter.widgetMod.Completer

import typings.jupyterlabCompleter.handlerMod.CompletionHandler.ICompletionItems
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoAlgorithm.iterMod.IterableOrArrayLike
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data model backing a code completer widget.
  */
@js.native
trait IModel extends IDisposable {
  
  /**
    * Get the list of visible CompletionItems in the completer menu.
    */
  var completionItems: js.UndefOr[js.Function0[ICompletionItems]] = js.native
  
  /**
    * Create a resolved patch between the original state and a patch string.
    */
  def createPatch(patch: String): js.UndefOr[IPatch] = js.native
  
  /**
    * The current text state details.
    */
  var current: ITextState | Null = js.native
  
  /**
    * The cursor details that the API has used to return matching options.
    */
  var cursor: ICursorSpan | Null = js.native
  
  /**
    * Handle a cursor change.
    */
  def handleCursorChange(change: ITextState): Unit = js.native
  
  /**
    * Handle a completion request.
    */
  def handleTextChange(change: ITextState): Unit = js.native
  
  /**
    * Get the of visible items in the completer menu.
    */
  def items(): IIterator[IItem] = js.native
  
  /**
    * Get the unfiltered options in a completer menu.
    */
  def options(): IIterator[String] = js.native
  
  /**
    * An ordered list of types used for visual encoding.
    */
  def orderedTypes(): js.Array[String] = js.native
  
  /**
    * The original completer request details.
    */
  var original: ITextState | Null = js.native
  
  /**
    * The query against which items are filtered.
    */
  var query: String = js.native
  
  /**
    * Reset the state of the model and emit a state change signal.
    *
    * @param hard - Reset even if a subset match is in progress.
    */
  def reset(): Unit = js.native
  def reset(hard: Boolean): Unit = js.native
  
  /**
    * Set the list of visible CompletionItems in the completer menu.
    */
  var setCompletionItems: js.UndefOr[js.Function1[/* items */ ICompletionItems, Unit]] = js.native
  
  /**
    * Set the available options in the completer menu.
    */
  def setOptions(options: IterableOrArrayLike[String]): Unit = js.native
  def setOptions(options: IterableOrArrayLike[String], typeMap: JSONObject): Unit = js.native
  
  /**
    * A signal emitted when state of the completer menu changes.
    */
  val stateChanged: ISignal[IModel, Unit] = js.native
  
  /**
    * A flag that is true when the model value was modified by a subset match.
    */
  var subsetMatch: Boolean = js.native
  
  /**
    * The map from identifiers (`a.b`) to their types (function, module, class,
    * instance, etc.).
    */
  def typeMap(): TypeMap = js.native
}
