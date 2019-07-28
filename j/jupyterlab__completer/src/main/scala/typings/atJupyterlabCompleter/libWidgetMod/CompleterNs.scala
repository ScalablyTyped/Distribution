package typings.atJupyterlabCompleter.libWidgetMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabCompleter.libWidgetMod.CompleterNs.ICursorSpan
import typings.atJupyterlabCompleter.libWidgetMod.CompleterNs.IItem
import typings.atJupyterlabCompleter.libWidgetMod.CompleterNs.IModel
import typings.atJupyterlabCompleter.libWidgetMod.CompleterNs.IPatch
import typings.atJupyterlabCompleter.libWidgetMod.CompleterNs.IRenderer
import typings.atJupyterlabCompleter.libWidgetMod.CompleterNs.ITextState
import typings.atJupyterlabCompleter.libWidgetMod.CompleterNs.Renderer
import typings.atJupyterlabCompleter.libWidgetMod.CompleterNs.TypeMap
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorAlgorithm.libIterMod.IterableOrArrayLike
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/widget", "Completer")
@js.native
object CompleterNs extends js.Object {
  /**
    * A cursor span.
    */
  trait ICursorSpan extends JSONObject {
    /**
      * The end position of the cursor.
      */
    var end: Double
    /**
      * The start position of the cursor.
      */
    var start: Double
  }
  
  /**
    * A completer menu item.
    */
  trait IItem extends js.Object {
    /**
      * The raw text of a visible completer item.
      */
    var raw: String
    /**
      * The highlighted, marked up text of a visible completer item.
      */
    var text: String
  }
  
  /**
    * The data model backing a code completer widget.
    */
  @js.native
  trait IModel extends IDisposable {
    /**
      * The current text state details.
      */
    var current: ITextState | Null = js.native
    /**
      * The cursor details that the API has used to return matching options.
      */
    var cursor: ICursorSpan | Null = js.native
    /**
      * The original completer request details.
      */
    var original: ITextState | Null = js.native
    /**
      * The query against which items are filtered.
      */
    var query: String = js.native
    /**
      * A signal emitted when state of the completer menu changes.
      */
    val stateChanged: ISignal[IModel, Unit] = js.native
    /**
      * A flag that is true when the model value was modified by a subset match.
      */
    var subsetMatch: Boolean = js.native
    /**
      * Create a resolved patch between the original state and a patch string.
      */
    def createPatch(patch: String): js.UndefOr[IPatch] = js.native
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
      * Reset the state of the model and emit a state change signal.
      *
      * @param hard - Reset even if a subset match is in progress.
      */
    def reset(): Unit = js.native
    def reset(hard: Boolean): Unit = js.native
    /**
      * Set the available options in the completer menu.
      */
    def setOptions(options: IterableOrArrayLike[String]): Unit = js.native
    def setOptions(options: IterableOrArrayLike[String], typeMap: JSONObject): Unit = js.native
    /**
      * The map from identifiers (`a.b`) to their types (function, module, class,
      * instance, etc.).
      */
    def typeMap(): TypeMap = js.native
  }
  
  /**
    * The initialization options for a completer widget.
    */
  trait IOptions extends js.Object {
    /**
      * The semantic parent of the completer widget, its referent editor.
      */
    var editor: js.UndefOr[
        (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | Null
      ] = js.undefined
    /**
      * The model for the completer widget.
      */
    var model: js.UndefOr[IModel] = js.undefined
    /**
      * The renderer for the completer widget nodes.
      */
    var renderer: js.UndefOr[IRenderer] = js.undefined
  }
  
  /**
    * An object describing a completion option injection into text.
    */
  trait IPatch extends js.Object {
    /**
      * The end of the range to be patched.
      */
    var end: Double
    /**
      * The start of the range to be patched.
      */
    var start: Double
    /**
      * The value to be patched in.
      */
    var value: String
  }
  
  /**
    * A renderer for completer widget nodes.
    */
  trait IRenderer extends js.Object {
    /**
      * Create an item node (an `li` element) for a text completer menu.
      */
    def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[String]): HTMLLIElement
  }
  
  /**
    * An interface for a completion request reflecting the state of the editor.
    */
  trait ITextState extends JSONObject {
    /**
      * The width of a character in the editor.
      */
    val charWidth: Double
    /**
      * The character number of the editor cursor within a line.
      */
    val column: Double
    /**
      * The line number of the editor cursor.
      */
    val line: Double
    /**
      * The height of a character in the editor.
      */
    val lineHeight: Double
    /**
      * The current value of the editor.
      */
    val text: String
  }
  
  /**
    * The default implementation of an `IRenderer`.
    */
  @js.native
  class Renderer () extends IRenderer {
    /**
      * Create an item node (an `li` element) for a text completer menu.
      */
    /* CompleteClass */
    override def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[String]): HTMLLIElement = js.native
  }
  
  /**
    * The default `IRenderer` instance.
    */
  val defaultRenderer: Renderer = js.native
  /**
    * A type map that may add type annotations to completer matches.
    */
  type TypeMap = StringDictionary[String]
}

