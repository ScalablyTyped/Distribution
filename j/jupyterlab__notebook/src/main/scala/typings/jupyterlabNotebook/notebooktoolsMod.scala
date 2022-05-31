package typings.jupyterlabNotebook

import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.mod.JSONEditor
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.advanced
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.common
import typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IOptions
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.tokensMod.INotebookTools
import typings.jupyterlabNotebook.tokensMod.INotebookTools.ITool
import typings.jupyterlabNotebook.tokensMod.INotebookTracker
import typings.jupyterlabObservables.mod.ObservableJSON.ChangeMessage
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoMessaging.mod.ConflatableMessage
import typings.luminoMessaging.mod.Message
import typings.std.Event
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notebooktoolsMod {
  
  @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools")
  @js.native
  class NotebookTools protected () extends INotebookTools {
    /**
      * Construct a new NotebookTools object.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _advancedTools: js.Any = js.native
    
    /* private */ var _commonTools: js.Any = js.native
    
    /**
      * Handle a change to the active cell.
      */
    /* private */ var _onActiveCellChanged: js.Any = js.native
    
    /**
      * Handle a change in the notebook model metadata.
      */
    /* private */ var _onActiveCellMetadataChanged: js.Any = js.native
    
    /**
      * Handle a change to the notebook panel.
      */
    /* private */ var _onActiveNotebookPanelChanged: js.Any = js.native
    
    /**
      * Handle a change in the active cell metadata.
      */
    /* private */ var _onActiveNotebookPanelMetadataChanged: js.Any = js.native
    
    /**
      * Handle a change in the selection.
      */
    /* private */ var _onSelectionChanged: js.Any = js.native
    
    /* private */ var _prevActiveCell: js.Any = js.native
    
    /* private */ var _prevActiveNotebookModel: js.Any = js.native
    
    /* private */ var _toolChildren: js.Any = js.native
    
    /* private */ var _tracker: js.Any = js.native
    
    /**
      * The active cell widget.
      */
    @JSName("activeCell")
    def activeCell_MNotebookTools: Cell | Null = js.native
    
    /**
      * The current notebook.
      */
    @JSName("activeNotebookPanel")
    def activeNotebookPanel_MNotebookTools: NotebookPanel | Null = js.native
    
    /**
      * The currently selected cells.
      */
    @JSName("selectedCells")
    def selectedCells_MNotebookTools: js.Array[Cell] = js.native
  }
  object NotebookTools {
    
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A singleton conflatable `'activecell-changed'` message.
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.ActiveCellMessage")
    @js.native
    val ActiveCellMessage: ConflatableMessage = js.native
    
    /**
      * A cell tool displaying the active cell contents.
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.ActiveCellTool")
    @js.native
    /**
      * Construct a new active cell tool.
      */
    class ActiveCellTool () extends Tool {
      
      /* private */ var _cellModel: js.Any = js.native
      
      /* private */ var _model: js.Any = js.native
      
      /**
        * Handle a change to the current editor mimetype.
        */
      /* private */ var _onMimeTypeChanged: js.Any = js.native
      
      /**
        * Handle a change to the current editor value.
        */
      /* private */ var _onValueChanged: js.Any = js.native
      
      /**
        * Handle a change to the active cell.
        */
      /* protected */ def onActiveCellChanged(): Unit = js.native
    }
    
    /**
      * A singleton conflatable `'activenotebookpanel-changed'` message.
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.ActiveNotebookPanelMessage")
    @js.native
    val ActiveNotebookPanelMessage: ConflatableMessage = js.native
    
    /**
      * A cell metadata editor
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.CellMetadataEditorTool")
    @js.native
    class CellMetadataEditorTool protected () extends MetadataEditorTool {
      def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
      
      /* private */ var _update: js.Any = js.native
      
      /**
        * Handle a change to the active cell metadata.
        */
      /* protected */ def onActiveCellMetadataChanged(msg: Message): Unit = js.native
    }
    
    /**
      * A cell tool that provides a selection for a given metadata key.
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.KeySelector")
    @js.native
    class KeySelector protected () extends Tool {
      /**
        * Construct a new KeySelector.
        */
      def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions) = this()
      
      /* private */ var _changeGuard: js.Any = js.native
      
      /* private */ var _default: js.Any = js.native
      
      /**
        * Get the value for the data.
        */
      /* private */ var _getValue: js.Any = js.native
      
      /* private */ var _getter: js.Any = js.native
      
      /**
        * Set the value for the data.
        */
      /* private */ var _setValue: js.Any = js.native
      
      /* private */ var _setter: js.Any = js.native
      
      /* private */ var _validCellTypes: js.Any = js.native
      
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
      def handleEvent(event: Event): Unit = js.native
      
      /**
        * The metadata key used by the selector.
        */
      val key: String = js.native
      
      /**
        * Handle a change to the value.
        */
      /* protected */ def onValueChanged(): Unit = js.native
      
      /**
        * The select node for the widget.
        */
      def selectNode: HTMLSelectElement = js.native
    }
    /**
      * The namespace for `KeySelector` static data.
      */
    object KeySelector {
      
      /**
        * The options used to initialize a keyselector.
        */
      trait IOptions extends StObject {
        
        /**
          * Default value for default setters and getters if value is not found.
          */
        var default: js.UndefOr[ReadonlyPartialJSONValue] = js.undefined
        
        /**
          * An optional value getter for the selector.
          *
          * @param cell - The currently active cell.
          *
          * @returns The appropriate value for the selector.
          */
        var getter: js.UndefOr[js.Function1[/* cell */ Cell, js.UndefOr[ReadonlyPartialJSONValue]]] = js.undefined
        
        /**
          * The metadata key of interest.
          */
        var key: String
        
        /**
          * The map of options to values.
          *
          * #### Notes
          * If a value equals the default, choosing it may erase the key from the
          * metadata.
          */
        var optionsMap: ReadonlyPartialJSONObject
        
        /**
          * An optional value setter for the selector.
          *
          * @param cell - The currently active cell.
          *
          * @param value - The value of the selector.
          *
          * #### Notes
          * The setter should set the appropriate metadata value given the value of
          * the selector.
          */
        var setter: js.UndefOr[
                js.Function2[/* cell */ Cell, /* value */ js.UndefOr[ReadonlyPartialJSONValue], Unit]
              ] = js.undefined
        
        /**
          * The optional title of the selector - defaults to capitalized `key`.
          */
        var title: js.UndefOr[String] = js.undefined
        
        /**
          * The optional valid cell types - defaults to all valid types.
          */
        var validCellTypes: js.UndefOr[js.Array[CellType]] = js.undefined
      }
      object IOptions {
        
        inline def apply(key: String, optionsMap: ReadonlyPartialJSONObject): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions = {
          val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optionsMap = optionsMap.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions]
        }
        
        extension [Self <: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions](x: Self) {
          
          inline def setDefault(value: ReadonlyPartialJSONValue): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          inline def setDefaultNull: Self = StObject.set(x, "default", null)
          
          inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
          
          inline def setGetter(value: /* cell */ Cell => js.UndefOr[ReadonlyPartialJSONValue]): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
          
          inline def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
          
          inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
          
          inline def setOptionsMap(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "optionsMap", value.asInstanceOf[js.Any])
          
          inline def setSetter(value: (/* cell */ Cell, /* value */ js.UndefOr[ReadonlyPartialJSONValue]) => Unit): Self = StObject.set(x, "setter", js.Any.fromFunction2(value))
          
          inline def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          inline def setValidCellTypes(value: js.Array[CellType]): Self = StObject.set(x, "validCellTypes", value.asInstanceOf[js.Any])
          
          inline def setValidCellTypesUndefined: Self = StObject.set(x, "validCellTypes", js.undefined)
          
          inline def setValidCellTypesVarargs(value: CellType*): Self = StObject.set(x, "validCellTypes", js.Array(value :_*))
        }
      }
    }
    
    /**
      * A raw metadata editor.
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.MetadataEditorTool")
    @js.native
    class MetadataEditorTool protected () extends Tool {
      /**
        * Construct a new raw metadata tool.
        */
      def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
      
      /**
        * The editor used by the tool.
        */
      val editor: JSONEditor = js.native
    }
    /**
      * The namespace for `MetadataEditorTool` static data.
      */
    object MetadataEditorTool {
      
      /**
        * The options used to initialize a metadata editor tool.
        */
      trait IOptions extends StObject {
        
        /**
          * Initial collapse state, defaults to true.
          */
        var collapsed: js.UndefOr[Boolean] = js.undefined
        
        /**
          * The editor factory used by the tool.
          */
        var editorFactory: Factory
        
        /**
          * The label for the JSON editor
          */
        var label: js.UndefOr[String] = js.undefined
      }
      object IOptions {
        
        inline def apply(editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions = {
          val __obj = js.Dynamic.literal(editorFactory = js.Any.fromFunction1(editorFactory))
          __obj.asInstanceOf[typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions]
        }
        
        extension [Self <: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions](x: Self) {
          
          inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
          
          inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
          
          inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        }
      }
    }
    
    /**
      * A notebook metadata editor
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.NotebookMetadataEditorTool")
    @js.native
    class NotebookMetadataEditorTool protected () extends MetadataEditorTool {
      def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
      
      /* private */ var _update: js.Any = js.native
      
      /**
        * Handle a change to the notebook metadata.
        */
      /* protected */ def onActiveNotebookPanelMetadataChanged(msg: Message): Unit = js.native
    }
    
    /**
      * A singleton conflatable `'selection-changed'` message.
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.SelectionMessage")
    @js.native
    val SelectionMessage: ConflatableMessage = js.native
    
    /**
      * The base notebook tool, meant to be subclassed.
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.Tool")
    @js.native
    /**
      * Construct a new widget.
      *
      * @param options - The options for initializing the widget.
      */
    class Tool () extends ITool {
      def this(options: typings.luminoWidgets.widgetMod.Widget.IOptions) = this()
      
      /**
        * Handle a change to the active cell.
        *
        * #### Notes
        * The default implementation is a no-op.
        */
      /* protected */ def onActiveCellChanged(msg: Message): Unit = js.native
      
      /**
        * Handle a change to the metadata of the active cell.
        *
        * #### Notes
        * The default implementation is a no-op.
        */
      /* protected */ def onActiveCellMetadataChanged(msg: ChangeMessage): Unit = js.native
      
      /**
        * Handle a change to the notebook panel.
        *
        * #### Notes
        * The default implementation is a no-op.
        */
      /* protected */ def onActiveNotebookPanelChanged(msg: Message): Unit = js.native
      
      /**
        * Handle a change to the metadata of the active cell.
        *
        * #### Notes
        * The default implementation is a no-op.
        */
      /* protected */ def onActiveNotebookPanelMetadataChanged(msg: ChangeMessage): Unit = js.native
      
      /**
        * Handle a change to the selection.
        *
        * #### Notes
        * The default implementation is a no-op.
        */
      /* protected */ def onSelectionChanged(msg: Message): Unit = js.native
    }
    
    /**
      * Create an nbconvert selector.
      */
    inline def createNBConvertSelector(optionsMap: ReadonlyPartialJSONObject): KeySelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createNBConvertSelector")(optionsMap.asInstanceOf[js.Any]).asInstanceOf[KeySelector]
    
    /**
      * Create a slideshow selector.
      */
    inline def createSlideShowSelector(): KeySelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createSlideShowSelector")().asInstanceOf[KeySelector]
    
    /**
      * The options used to add an item to the notebook tools.
      */
    trait IAddOptions extends StObject {
      
      /**
        * The rank order of the widget among its siblings.
        */
      var rank: js.UndefOr[Double] = js.undefined
      
      /**
        * The section to which the tool should be added.
        */
      var section: js.UndefOr[common | advanced] = js.undefined
      
      /**
        * The tool to add to the notebook tools area.
        */
      var tool: Tool
    }
    object IAddOptions {
      
      inline def apply(tool: Tool): IAddOptions = {
        val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
        __obj.asInstanceOf[IAddOptions]
      }
      
      extension [Self <: IAddOptions](x: Self) {
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
        
        inline def setSection(value: common | advanced): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
        
        inline def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to create a NotebookTools object.
      */
    trait IOptions extends StObject {
      
      /**
        * The notebook tracker used by the notebook tools.
        */
      var tracker: INotebookTracker
    }
    object IOptions {
      
      inline def apply(tracker: INotebookTracker): IOptions = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setTracker(value: INotebookTracker): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      }
    }
  }
}
