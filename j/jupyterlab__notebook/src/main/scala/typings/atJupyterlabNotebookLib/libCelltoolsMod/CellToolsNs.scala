package typings
package atJupyterlabNotebookLib.libCelltoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/celltools", "CellTools")
@js.native
object CellToolsNs extends js.Object {
  /**
    * A cell tool displaying the active cell contents.
    */
  @js.native
  /**
    * Construct a new active cell tool.
    */
  class ActiveCellTool () extends Tool {
    var _cellModel: js.Any = js.native
    var _model: js.Any = js.native
    /**
      * Handle a change to the current editor mimetype.
      */
    var _onMimeTypeChanged: js.Any = js.native
    /**
      * Handle a change to the current editor value.
      */
    var _onValueChanged: js.Any = js.native
    /**
      * Handle a change to the active cell.
      */
    /* protected */ def onActiveCellChanged(): scala.Unit = js.native
  }
  
  /**
    * The options used to add an item to the cell tools.
    */
  trait IAddOptions extends js.Object {
    /**
      * The rank order of the widget among its siblings.
      */
    var rank: js.UndefOr[scala.Double] = js.undefined
    /**
      * The tool to add to the cell tools area.
      */
    var tool: Tool
  }
  
  /**
    * The options used to create a CellTools object.
    */
  trait IOptions extends js.Object {
    /**
      * The notebook tracker used by the cell tools.
      */
    var tracker: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify INotebookTracker */ js.Any
  }
  
  /**
    * A cell tool that provides a selection for a given metadata key.
    */
  @js.native
  class KeySelector protected () extends Tool {
    /**
      * Construct a new KeySelector.
      */
    def this(options: atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.KeySelectorNs.IOptions) = this()
    var _changeGuard: js.Any = js.native
    /**
      * Get the value for the data.
      */
    var _getValue: js.Any = js.native
    var _getter: js.Any = js.native
    /**
      * Set the value for the data.
      */
    var _setValue: js.Any = js.native
    var _setter: js.Any = js.native
    var _validCellTypes: js.Any = js.native
    /**
      * The metadata key used by the selector.
      */
    val key: java.lang.String = js.native
    /**
      * The select node for the widget.
      */
    val selectNode: stdLib.HTMLSelectElement = js.native
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the notebook panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: stdLib.Event): scala.Unit = js.native
    /**
      * Handle a change to the value.
      */
    /* protected */ def onValueChanged(): scala.Unit = js.native
  }
  
  /**
    * A raw metadata editor.
    */
  @js.native
  class MetadataEditorTool protected () extends Tool {
    /**
      * Construct a new raw metadata tool.
      */
    def this(options: atJupyterlabNotebookLib.libCelltoolsMod.CellToolsNs.MetadataEditorToolNs.IOptions) = this()
    /**
      * The editor used by the tool.
      */
    val editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JSONEditor */ js.Any = js.native
  }
  
  /**
    * The base cell tool, meant to be subclassed.
    */
  @js.native
  class Tool ()
    extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
    /**
      * The cell tools object.
      */
    @JSName("parent")
    val parent_Tool: atJupyterlabNotebookLib.libCelltoolsMod.ICellTools = js.native
    /**
      * Handle a change to the active cell.
      *
      * #### Notes
      * The default implementation is a no-op.
      */
    /* protected */ def onActiveCellChanged(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
    /**
      * Handle a change to the metadata of the active cell.
      *
      * #### Notes
      * The default implementation is a no-op.
      */
    /* protected */ def onMetadataChanged(msg: atJupyterlabObservablesLib.atJupyterlabObservablesMod.ObservableJSONNs.ChangeMessage): scala.Unit = js.native
    /**
      * Handle a change to the selection.
      *
      * #### Notes
      * The default implementation is a no-op.
      */
    /* protected */ def onSelectionChanged(msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message): scala.Unit = js.native
  }
  
  /**
    * A singleton conflatable `'activecell-changed'` message.
    */
  val ActiveCellMessage: atPhosphorMessagingLib.atPhosphorMessagingMod.ConflatableMessage = js.native
  /**
    * A singleton conflatable `'selection-changed'` message.
    */
  val SelectionMessage: atPhosphorMessagingLib.atPhosphorMessagingMod.ConflatableMessage = js.native
  /**
    * Create an nbcovert selector.
    */
  def createNBConvertSelector(
    optionsMap: org.scalablytyped.runtime.StringDictionary[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
  ): KeySelector = js.native
  /**
    * Create a slideshow selector.
    */
  def createSlideShowSelector(): KeySelector = js.native
  /**
    * The namespace for `KeySelector` static data.
    */
  @JSName("KeySelector")
  @js.native
  object KeySelectorNs extends js.Object {
    /**
      * The options used to initialize a keyselector.
      */
    trait IOptions extends js.Object {
      /**
        * An optional value getter for the selector.
        *
        * @param cell - The currently active cell.
        *
        * @returns The appropriate value for the selector.
        */
      var getter: js.UndefOr[
            js.Function1[
              /* cell */ atJupyterlabCellsLib.atJupyterlabCellsMod.Cell, 
              atPhosphorCoreutilsLib.libJsonMod.JSONValue
            ]
          ] = js.undefined
      /**
        * The metadata key of interest.
        */
      var key: java.lang.String
      /**
        * The map of options to values.
        */
      var optionsMap: org.scalablytyped.runtime.StringDictionary[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
      /**
        * An optional value setter for the selector.
        *
        * @param cell - The currently active cell.
        *
        * @param value - The value of the selector.
        *
        * #### Notes
        * The setter should set the appropriate metadata value
        * given the value of the selector.
        */
      var setter: js.UndefOr[
            js.Function2[
              /* cell */ atJupyterlabCellsLib.atJupyterlabCellsMod.Cell, 
              /* value */ atPhosphorCoreutilsLib.libJsonMod.JSONValue, 
              scala.Unit
            ]
          ] = js.undefined
      /**
        * The optional title of the selector - defaults to capitalized `key`.
        */
      var title: js.UndefOr[java.lang.String] = js.undefined
      /**
        * The optional valid cell types - defaults to all valid types.
        */
      var validCellTypes: js.UndefOr[js.Array[atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.CellType]] = js.undefined
    }
    
  }
  
  /**
    * The namespace for `MetadataEditorTool` static data.
    */
  @JSName("MetadataEditorTool")
  @js.native
  object MetadataEditorToolNs extends js.Object {
    /**
      * The options used to initialize a metadata editor tool.
      */
    trait IOptions extends js.Object {
      /**
        * The editor factory used by the tool.
        */
      var editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
    }
    
  }
  
}

