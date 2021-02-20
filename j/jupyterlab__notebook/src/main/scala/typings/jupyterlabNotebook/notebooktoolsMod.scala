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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notebooktoolsMod {
  
  @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools")
  @js.native
  class NotebookTools protected () extends INotebookTools {
    /**
      * Construct a new NotebookTools object.
      */
    def this(options: IOptions) = this()
    
    var _advancedTools: js.Any = js.native
    
    var _commonTools: js.Any = js.native
    
    /**
      * Handle a change to the active cell.
      */
    var _onActiveCellChanged: js.Any = js.native
    
    /**
      * Handle a change in the notebook model metadata.
      */
    var _onActiveCellMetadataChanged: js.Any = js.native
    
    /**
      * Handle a change to the notebook panel.
      */
    var _onActiveNotebookPanelChanged: js.Any = js.native
    
    /**
      * Handle a change in the active cell metadata.
      */
    var _onActiveNotebookPanelMetadataChanged: js.Any = js.native
    
    /**
      * Handle a change in the selection.
      */
    var _onSelectionChanged: js.Any = js.native
    
    var _prevActiveCell: js.Any = js.native
    
    var _prevActiveNotebookModel: js.Any = js.native
    
    var _toolChildren: js.Any = js.native
    
    var _tracker: js.Any = js.native
    
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
      
      var _update: js.Any = js.native
      
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
      
      var _changeGuard: js.Any = js.native
      
      var _default: js.Any = js.native
      
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
      @js.native
      trait IOptions extends StObject {
        
        /**
          * Default value for default setters and getters if value is not found.
          */
        var default: js.UndefOr[ReadonlyPartialJSONValue] = js.native
        
        /**
          * An optional value getter for the selector.
          *
          * @param cell - The currently active cell.
          *
          * @returns The appropriate value for the selector.
          */
        var getter: js.UndefOr[js.Function1[/* cell */ Cell, js.UndefOr[ReadonlyPartialJSONValue]]] = js.native
        
        /**
          * The metadata key of interest.
          */
        var key: String = js.native
        
        /**
          * The map of options to values.
          *
          * #### Notes
          * If a value equals the default, choosing it may erase the key from the
          * metadata.
          */
        var optionsMap: ReadonlyPartialJSONObject = js.native
        
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
              ] = js.native
        
        /**
          * The optional title of the selector - defaults to capitalized `key`.
          */
        var title: js.UndefOr[String] = js.native
        
        /**
          * The optional valid cell types - defaults to all valid types.
          */
        var validCellTypes: js.UndefOr[js.Array[CellType]] = js.native
      }
      object IOptions {
        
        @scala.inline
        def apply(key: String, optionsMap: ReadonlyPartialJSONObject): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions = {
          val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optionsMap = optionsMap.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions]
        }
        
        @scala.inline
        implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDefault(value: ReadonlyPartialJSONValue): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultNull: Self = StObject.set(x, "default", null)
          
          @scala.inline
          def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
          
          @scala.inline
          def setGetter(value: /* cell */ Cell => js.UndefOr[ReadonlyPartialJSONValue]): Self = StObject.set(x, "getter", js.Any.fromFunction1(value))
          
          @scala.inline
          def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
          
          @scala.inline
          def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOptionsMap(value: ReadonlyPartialJSONObject): Self = StObject.set(x, "optionsMap", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSetter(value: (/* cell */ Cell, /* value */ js.UndefOr[ReadonlyPartialJSONValue]) => Unit): Self = StObject.set(x, "setter", js.Any.fromFunction2(value))
          
          @scala.inline
          def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          @scala.inline
          def setValidCellTypes(value: js.Array[CellType]): Self = StObject.set(x, "validCellTypes", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setValidCellTypesUndefined: Self = StObject.set(x, "validCellTypes", js.undefined)
          
          @scala.inline
          def setValidCellTypesVarargs(value: CellType*): Self = StObject.set(x, "validCellTypes", js.Array(value :_*))
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
      @js.native
      trait IOptions extends StObject {
        
        /**
          * Initial collapse state, defaults to true.
          */
        var collapsed: js.UndefOr[Boolean] = js.native
        
        /**
          * The editor factory used by the tool.
          */
        var editorFactory: Factory = js.native
        
        /**
          * The label for the JSON editor
          */
        var label: js.UndefOr[String] = js.native
      }
      object IOptions {
        
        @scala.inline
        def apply(editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions = {
          val __obj = js.Dynamic.literal(editorFactory = js.Any.fromFunction1(editorFactory))
          __obj.asInstanceOf[typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions]
        }
        
        @scala.inline
        implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
          
          @scala.inline
          def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
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
      
      var _update: js.Any = js.native
      
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
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.createNBConvertSelector")
    @js.native
    def createNBConvertSelector(optionsMap: ReadonlyPartialJSONObject): KeySelector = js.native
    
    /**
      * Create a slideshow selector.
      */
    @JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.createSlideShowSelector")
    @js.native
    def createSlideShowSelector(): KeySelector = js.native
    
    /**
      * The options used to add an item to the notebook tools.
      */
    @js.native
    trait IAddOptions extends StObject {
      
      /**
        * The rank order of the widget among its siblings.
        */
      var rank: js.UndefOr[Double] = js.native
      
      /**
        * The section to which the tool should be added.
        */
      var section: js.UndefOr[common | advanced] = js.native
      
      /**
        * The tool to add to the notebook tools area.
        */
      var tool: Tool = js.native
    }
    object IAddOptions {
      
      @scala.inline
      def apply(tool: Tool): IAddOptions = {
        val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
        __obj.asInstanceOf[IAddOptions]
      }
      
      @scala.inline
      implicit class IAddOptionsMutableBuilder[Self <: IAddOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
        
        @scala.inline
        def setSection(value: common | advanced): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
        
        @scala.inline
        def setTool(value: Tool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to create a NotebookTools object.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The notebook tracker used by the notebook tools.
        */
      var tracker: INotebookTracker = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(tracker: INotebookTracker): IOptions = {
        val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTracker(value: INotebookTracker): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      }
    }
  }
}
