package typings.jupyterlabConsole.widgetMod.CodeConsole

import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A content factory for console children.
  */
@js.native
trait IContentFactory
  extends typings.jupyterlabCells.widgetMod.Cell.IContentFactory {
  
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions): CodeCell = js.native
  
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(options: typings.jupyterlabCells.widgetMod.RawCell.IOptions): RawCell = js.native
}
object IContentFactory {
  
  @scala.inline
  def apply(
    createCellFooter: () => ICellFooter,
    createCellHeader: () => ICellHeader,
    createCodeCell: typings.jupyterlabCells.widgetMod.CodeCell.IOptions => CodeCell,
    createInputPrompt: () => IInputPrompt,
    createOutputPrompt: () => IOutputPrompt,
    createRawCell: typings.jupyterlabCells.widgetMod.RawCell.IOptions => RawCell,
    createStdin: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction1(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction1(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
    __obj.asInstanceOf[IContentFactory]
  }
  
  @scala.inline
  implicit class IContentFactoryOps[Self <: IContentFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateCodeCell(value: typings.jupyterlabCells.widgetMod.CodeCell.IOptions => CodeCell): Self = this.set("createCodeCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateRawCell(value: typings.jupyterlabCells.widgetMod.RawCell.IOptions => RawCell): Self = this.set("createRawCell", js.Any.fromFunction1(value))
  }
}
