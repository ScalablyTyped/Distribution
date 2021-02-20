package typings.jupyterlabNotebook

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.advanced
import typings.jupyterlabNotebook.jupyterlabNotebookStrings.common
import typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.IAddOptions
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IFactory
import typings.luminoCoreutils.mod.Token
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait INotebookTools extends Widget {
    
    var activeCell: Cell | Null = js.native
    
    var activeNotebookPanel: NotebookPanel | Null = js.native
    
    def addItem(options: IAddOptions): Unit = js.native
    
    var selectedCells: js.Array[Cell] = js.native
  }
  object INotebookTools extends Shortcut {
    
    @JSImport("@jupyterlab/notebook/lib/tokens", "INotebookTools")
    @js.native
    val ^ : Token[INotebookTools] = js.native
    
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
      var tool: ITool = js.native
    }
    object IAddOptions {
      
      @scala.inline
      def apply(tool: ITool): typings.jupyterlabNotebook.tokensMod.INotebookTools.IAddOptions = {
        val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabNotebook.tokensMod.INotebookTools.IAddOptions]
      }
      
      @scala.inline
      implicit class IAddOptionsMutableBuilder[Self <: typings.jupyterlabNotebook.tokensMod.INotebookTools.IAddOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
        
        @scala.inline
        def setSection(value: common | advanced): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
        
        @scala.inline
        def setTool(value: ITool): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ITool extends Widget {
      
      /**
        * The notebook tools object.
        */
      var notebookTools: INotebookTools = js.native
    }
    
    type _To = Token[INotebookTools]
    
    /* This means you don't have to write `^`, but can instead just say `INotebookTools.foo` */
    override def _to: Token[INotebookTools] = ^
  }
  
  @js.native
  trait INotebookTracker extends IWidgetTracker[NotebookPanel] {
    
    /**
      * The currently focused cell.
      *
      * #### Notes
      * If there is no cell with the focus, then this value is `null`.
      */
    val activeCell: Cell | Null = js.native
    
    /**
      * A signal emitted when the current active cell changes.
      *
      * #### Notes
      * If there is no cell with the focus, then `null` will be emitted.
      */
    val activeCellChanged: ISignal[this.type, Cell | Null] = js.native
    
    /**
      * A signal emitted when the selection state changes.
      */
    val selectionChanged: ISignal[this.type, Unit] = js.native
  }
  object INotebookTracker {
    
    @JSImport("@jupyterlab/notebook/lib/tokens", "INotebookTracker")
    @js.native
    val ^ : Token[INotebookTracker] = js.native
    
    @scala.inline
    implicit class INotebookTrackerMutableBuilder[Self <: INotebookTracker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveCell(value: Cell): Self = StObject.set(x, "activeCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveCellChanged(value: ISignal[INotebookTracker, Cell | Null]): Self = StObject.set(x, "activeCellChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveCellNull: Self = StObject.set(x, "activeCell", null)
      
      @scala.inline
      def setSelectionChanged(value: ISignal[INotebookTracker, Unit]): Self = StObject.set(x, "selectionChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@jupyterlab/notebook/lib/tokens", "INotebookWidgetFactory")
  @js.native
  val INotebookWidgetFactory: Token[IFactory] = js.native
}
