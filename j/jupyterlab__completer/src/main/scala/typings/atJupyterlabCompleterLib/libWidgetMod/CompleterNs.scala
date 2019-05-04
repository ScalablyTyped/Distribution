package typings
package atJupyterlabCompleterLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/widget", "Completer")
@js.native
object CompleterNs extends js.Object {
  /**
    * A cursor span.
    */
  trait ICursorSpan
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * The end position of the cursor.
      */
    var end: scala.Double
    /**
      * The start position of the cursor.
      */
    var start: scala.Double
  }
  
  /**
    * A completer menu item.
    */
  trait IItem extends js.Object {
    /**
      * The raw text of a visible completer item.
      */
    var raw: java.lang.String
    /**
      * The highlighted, marked up text of a visible completer item.
      */
    var text: java.lang.String
  }
  
  /**
    * The data model backing a code completer widget.
    */
  @js.native
  trait IModel
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * The current text state details.
      */
    var current: ITextState | scala.Null = js.native
    /**
      * The cursor details that the API has used to return matching options.
      */
    var cursor: ICursorSpan | scala.Null = js.native
    /**
      * The original completer request details.
      */
    var original: ITextState | scala.Null = js.native
    /**
      * The query against which items are filtered.
      */
    var query: java.lang.String = js.native
    /**
      * A signal emitted when state of the completer menu changes.
      */
    val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IModel, scala.Unit] = js.native
    /**
      * A flag that is true when the model value was modified by a subset match.
      */
    var subsetMatch: scala.Boolean = js.native
    /**
      * Create a resolved patch between the original state and a patch string.
      */
    def createPatch(patch: java.lang.String): js.UndefOr[IPatch] = js.native
    /**
      * Handle a cursor change.
      */
    def handleCursorChange(change: ITextState): scala.Unit = js.native
    /**
      * Handle a completion request.
      */
    def handleTextChange(change: ITextState): scala.Unit = js.native
    /**
      * Get the of visible items in the completer menu.
      */
    def items(): atPhosphorAlgorithmLib.libIterMod.IIterator[IItem] = js.native
    /**
      * Get the unfiltered options in a completer menu.
      */
    def options(): atPhosphorAlgorithmLib.libIterMod.IIterator[java.lang.String] = js.native
    /**
      * An ordered list of types used for visual encoding.
      */
    def orderedTypes(): js.Array[java.lang.String] = js.native
    /**
      * Reset the state of the model and emit a state change signal.
      *
      * @param hard - Reset even if a subset match is in progress.
      */
    def reset(): scala.Unit = js.native
    def reset(hard: scala.Boolean): scala.Unit = js.native
    /**
      * Set the available options in the completer menu.
      */
    def setOptions(options: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[java.lang.String]): scala.Unit = js.native
    def setOptions(
      options: atPhosphorAlgorithmLib.libIterMod.IterableOrArrayLike[java.lang.String],
      typeMap: atPhosphorCoreutilsLib.libJsonMod.JSONObject
    ): scala.Unit = js.native
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
        (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | scala.Null
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
      * The offset of the cursor.
      */
    var offset: scala.Double
    /**
      * The patched text.
      */
    var text: java.lang.String
  }
  
  /**
    * A renderer for completer widget nodes.
    */
  trait IRenderer extends js.Object {
    /**
      * Create an item node (an `li` element) for a text completer menu.
      */
    def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[java.lang.String]): stdLib.HTMLLIElement
  }
  
  /**
    * An interface for a completion request reflecting the state of the editor.
    */
  trait ITextState
    extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
    /**
      * The width of a character in the editor.
      */
    val charWidth: scala.Double
    /**
      * The character number of the editor cursor within a line.
      */
    val column: scala.Double
    /**
      * The line number of the editor cursor.
      */
    val line: scala.Double
    /**
      * The height of a character in the editor.
      */
    val lineHeight: scala.Double
    /**
      * The current value of the editor.
      */
    val text: java.lang.String
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
    override def createItemNode(item: IItem, typeMap: TypeMap, orderedTypes: js.Array[java.lang.String]): stdLib.HTMLLIElement = js.native
  }
  
  /**
    * The default `IRenderer` instance.
    */
  val defaultRenderer: Renderer = js.native
  /**
    * A type map that may add type annotations to completer matches.
    */
  type TypeMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

