package typings.jupyterlabCells

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabCells.libCelldragutilsMod.CellDragUtils.ICellTargetArea
import typings.jupyterlabCells.libModelMod.IAttachmentsCellModel
import typings.jupyterlabCells.libModelMod.ICellModel
import typings.jupyterlabCells.libWidgetMod.Cell.IOptions
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.jupyterlabNbformat.mod.ICell
import typings.jupyterlabServices.libKernelMessagesMod.IExecuteReplyMsg
import typings.luminoAlgorithm.typesIterMod.IterableOrArrayLike
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/cells", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@jupyterlab/cells", "AttachmentsCell")
  @js.native
  open class AttachmentsCell[T /* <: IAttachmentsCellModel */] protected ()
    extends typings.jupyterlabCells.libWidgetMod.AttachmentsCell[T] {
    /**
      * Construct a new base cell widget.
      */
    def this(options: IOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/cells", "AttachmentsCellModel")
  @js.native
  open class AttachmentsCellModel protected ()
    extends typings.jupyterlabCells.libModelMod.AttachmentsCellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: typings.jupyterlabCells.libModelMod.AttachmentsCellModel.IOptions) = this()
  }
  object AttachmentsCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells", "AttachmentsCellModel.ContentFactory")
    @js.native
    open class ContentFactory ()
      extends typings.jupyterlabCells.libModelMod.AttachmentsCellModel.ContentFactory
    
    /**
      * The shared `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells", "AttachmentsCellModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabCells.libModelMod.AttachmentsCellModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/cells", "Cell")
  @js.native
  open class Cell[T /* <: ICellModel */] protected ()
    extends typings.jupyterlabCells.libWidgetMod.Cell[T] {
    /**
      * Construct a new base cell widget.
      */
    def this(options: IOptions[T]) = this()
  }
  object Cell {
    
    /**
      * The default implementation of an `IContentFactory`.
      *
      * This includes a CodeMirror editor factory to make it easy to use out of the box.
      */
    @JSImport("@jupyterlab/cells", "Cell.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    open class ContentFactory ()
      extends typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory {
      def this(options: typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory.IOptions) = this()
    }
    
    /**
      * The default content factory for cells.
      */
    @JSImport("@jupyterlab/cells", "Cell.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabCells.libWidgetMod.Cell.ContentFactory = js.native
  }
  
  object CellDragUtils {
    
    @JSImport("@jupyterlab/cells", "CellDragUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an image for the cell(s) to be dragged
      *
      * @param activeCell - The cell from where the drag event is triggered
      * @param selectedCells - The cells to be dragged
      */
    inline def createCellDragImage(activeCell: typings.jupyterlabCells.libWidgetMod.Cell[ICellModel], selectedCells: js.Array[ICell]): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createCellDragImage")(activeCell.asInstanceOf[js.Any], selectedCells.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * Detect which part of the cell triggered the MouseEvent
      *
      * @param cell - The cell which contains the MouseEvent's target
      * @param target - The DOM node which triggered the MouseEvent
      */
    inline def detectTargetArea(cell: typings.jupyterlabCells.libWidgetMod.Cell[ICellModel], target: HTMLElement): ICellTargetArea = (^.asInstanceOf[js.Dynamic].applyDynamic("detectTargetArea")(cell.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[ICellTargetArea]
    
    /**
      * Find the cell index containing the target html element.
      * This function traces up the DOM hierarchy to find the root cell
      * node. Then find the corresponding child and select it.
      *
      * @param node - the cell node or a child of the cell node.
      * @param cells - an iterable of Cells
      * @param isCellNode - a function that takes in a node and checks if
      * it is a cell node.
      *
      * @returns index of the cell we're looking for. Returns -1 if
      * the cell is not founds
      */
    inline def findCell(
      node: HTMLElement,
      cells: IterableOrArrayLike[typings.jupyterlabCells.libWidgetMod.Cell[ICellModel]],
      isCellNode: js.Function1[/* node */ HTMLElement, Boolean]
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findCell")(node.asInstanceOf[js.Any], cells.asInstanceOf[js.Any], isCellNode.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Detect if a drag event should be started. This is down if the
      * mouse is moved beyond a certain distance (DRAG_THRESHOLD).
      *
      * @param prevX - X Coordinate of the mouse pointer during the mousedown event
      * @param prevY - Y Coordinate of the mouse pointer during the mousedown event
      * @param nextX - Current X Coordinate of the mouse pointer
      * @param nextY - Current Y Coordinate of the mouse pointer
      */
    inline def shouldStartDrag(prevX: Double, prevY: Double, nextX: Double, nextY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldStartDrag")(prevX.asInstanceOf[js.Any], prevY.asInstanceOf[js.Any], nextX.asInstanceOf[js.Any], nextY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("@jupyterlab/cells", "CellFooter")
  @js.native
  /**
    * Construct a new cell footer.
    */
  open class CellFooter ()
    extends typings.jupyterlabCells.libHeaderfooterMod.CellFooter
  
  @JSImport("@jupyterlab/cells", "CellHeader")
  @js.native
  /**
    * Construct a new cell header.
    */
  open class CellHeader ()
    extends typings.jupyterlabCells.libHeaderfooterMod.CellHeader
  
  @JSImport("@jupyterlab/cells", "CellModel")
  @js.native
  open class CellModel protected ()
    extends typings.jupyterlabCells.libModelMod.CellModel {
    /**
      * Construct a cell model from optional cell content.
      */
    def this(options: typings.jupyterlabCells.libModelMod.CellModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "CodeCell")
  @js.native
  open class CodeCell protected ()
    extends typings.jupyterlabCells.libWidgetMod.CodeCell {
    /**
      * Construct a code cell widget.
      */
    def this(options: typings.jupyterlabCells.libWidgetMod.CodeCell.IOptions) = this()
  }
  object CodeCell {
    
    @JSImport("@jupyterlab/cells", "CodeCell")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Execute a cell given a client session.
      */
    inline def execute(cell: typings.jupyterlabCells.libWidgetMod.CodeCell, sessionContext: ISessionContext): js.Promise[IExecuteReplyMsg | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(cell.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IExecuteReplyMsg | Unit]]
    inline def execute(
      cell: typings.jupyterlabCells.libWidgetMod.CodeCell,
      sessionContext: ISessionContext,
      metadata: JSONObject
    ): js.Promise[IExecuteReplyMsg | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(cell.asInstanceOf[js.Any], sessionContext.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IExecuteReplyMsg | Unit]]
  }
  
  @JSImport("@jupyterlab/cells", "CodeCellModel")
  @js.native
  open class CodeCellModel protected ()
    extends typings.jupyterlabCells.libModelMod.CodeCellModel {
    /**
      * Construct a new code cell with optional original cell content.
      */
    def this(options: typings.jupyterlabCells.libModelMod.CodeCellModel.IOptions) = this()
  }
  object CodeCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells", "CodeCellModel.ContentFactory")
    @js.native
    open class ContentFactory ()
      extends typings.jupyterlabCells.libModelMod.CodeCellModel.ContentFactory
    
    /**
      * The shared `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells", "CodeCellModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabCells.libModelMod.CodeCellModel.ContentFactory = js.native
  }
  
  /* note: abstract class */ @JSImport("@jupyterlab/cells", "Collapser")
  @js.native
  /**
    * Construct a new collapser.
    */
  open class Collapser ()
    extends typings.jupyterlabCells.libCollapserMod.Collapser
  
  @JSImport("@jupyterlab/cells", "InputArea")
  @js.native
  open class InputArea protected ()
    extends typings.jupyterlabCells.libInputareaMod.InputArea {
    /**
      * Construct an input area widget.
      */
    def this(options: typings.jupyterlabCells.libInputareaMod.InputArea.IOptions) = this()
  }
  object InputArea {
    
    /**
      * Default implementation of `IContentFactory`.
      *
      * This defaults to using an `editorFactory` based on CodeMirror.
      */
    @JSImport("@jupyterlab/cells", "InputArea.ContentFactory")
    @js.native
    /**
      * Construct a `ContentFactory`.
      */
    open class ContentFactory ()
      extends typings.jupyterlabCells.libInputareaMod.InputArea.ContentFactory {
      def this(options: typings.jupyterlabCells.libInputareaMod.InputArea.ContentFactory.IOptions) = this()
    }
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells", "InputArea.defaultContentFactory")
    @js.native
    val defaultContentFactory: typings.jupyterlabCells.libInputareaMod.InputArea.ContentFactory = js.native
    
    /**
      * The default editor factory singleton based on CodeMirror.
      */
    @JSImport("@jupyterlab/cells", "InputArea.defaultEditorFactory")
    @js.native
    val defaultEditorFactory: Factory = js.native
  }
  
  @JSImport("@jupyterlab/cells", "InputCollapser")
  @js.native
  /**
    * Construct a new input collapser.
    */
  open class InputCollapser ()
    extends typings.jupyterlabCells.libCollapserMod.InputCollapser
  
  @JSImport("@jupyterlab/cells", "InputPlaceholder")
  @js.native
  open class InputPlaceholder protected ()
    extends typings.jupyterlabCells.libPlaceholderMod.InputPlaceholder {
    /**
      * Construct a new input placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
  }
  
  @JSImport("@jupyterlab/cells", "InputPrompt")
  @js.native
  open class InputPrompt ()
    extends typings.jupyterlabCells.libInputareaMod.InputPrompt
  
  @JSImport("@jupyterlab/cells", "MARKDOWN_HEADING_COLLAPSED")
  @js.native
  val MARKDOWN_HEADING_COLLAPSED: /* "jp-MarkdownHeadingCollapsed" */ String = js.native
  
  @JSImport("@jupyterlab/cells", "MarkdownCell")
  @js.native
  open class MarkdownCell protected ()
    extends typings.jupyterlabCells.libWidgetMod.MarkdownCell {
    /**
      * Construct a Markdown cell widget.
      */
    def this(options: typings.jupyterlabCells.libWidgetMod.MarkdownCell.IOptions) = this()
  }
  object MarkdownCell {
    
    /**
      * Default value for showEditorForReadOnlyMarkdown.
      */
    @JSImport("@jupyterlab/cells", "MarkdownCell.defaultShowEditorForReadOnlyMarkdown")
    @js.native
    val defaultShowEditorForReadOnlyMarkdown: /* true */ Boolean = js.native
  }
  
  @JSImport("@jupyterlab/cells", "MarkdownCellModel")
  @js.native
  open class MarkdownCellModel protected ()
    extends typings.jupyterlabCells.libModelMod.MarkdownCellModel {
    /**
      * Construct a markdown cell model from optional cell content.
      */
    def this(options: typings.jupyterlabCells.libModelMod.CellModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "OutputCollapser")
  @js.native
  /**
    * Construct a new output collapser.
    */
  open class OutputCollapser ()
    extends typings.jupyterlabCells.libCollapserMod.OutputCollapser
  
  @JSImport("@jupyterlab/cells", "OutputPlaceholder")
  @js.native
  open class OutputPlaceholder protected ()
    extends typings.jupyterlabCells.libPlaceholderMod.OutputPlaceholder {
    /**
      * Construct a new output placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
  }
  
  /* note: abstract class */ @JSImport("@jupyterlab/cells", "Placeholder")
  @js.native
  open class Placeholder protected ()
    extends typings.jupyterlabCells.libPlaceholderMod.Placeholder {
    /**
      * Construct a new placeholder.
      */
    def this(callback: js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]) = this()
  }
  
  @JSImport("@jupyterlab/cells", "RawCell")
  @js.native
  open class RawCell protected ()
    extends typings.jupyterlabCells.libWidgetMod.RawCell {
    /**
      * Construct a raw cell widget.
      */
    def this(options: typings.jupyterlabCells.libWidgetMod.RawCell.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "RawCellModel")
  @js.native
  open class RawCellModel protected ()
    extends typings.jupyterlabCells.libModelMod.RawCellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: typings.jupyterlabCells.libModelMod.AttachmentsCellModel.IOptions) = this()
  }
  
  inline def isCodeCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.ICodeCellModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCodeCellModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/cells.@jupyterlab/cells/lib/model.ICodeCellModel */ Boolean]
  
  inline def isMarkdownCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IMarkdownCellModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkdownCellModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IMarkdownCellModel */ Boolean]
  
  inline def isRawCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IRawCellModel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRawCellModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IRawCellModel */ Boolean]
}
