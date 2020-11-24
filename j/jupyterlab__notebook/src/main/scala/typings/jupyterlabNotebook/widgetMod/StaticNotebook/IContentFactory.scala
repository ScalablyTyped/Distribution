package typings.jupyterlabNotebook.widgetMod.StaticNotebook

import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.MarkdownCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A factory for creating notebook content.
  *
  * #### Notes
  * This extends the content factory of the cell itself, which extends the content
  * factory of the output area and input area. The result is that there is a single
  * factory for creating all child content of a notebook.
  */
@js.native
trait IContentFactory
  extends typings.jupyterlabCells.widgetMod.Cell.IContentFactory {
  
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(
    options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions,
    parent: typings.jupyterlabNotebook.widgetMod.StaticNotebook
  ): CodeCell = js.native
  
  /**
    * Create a new markdown cell widget.
    */
  def createMarkdownCell(
    options: typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions,
    parent: typings.jupyterlabNotebook.widgetMod.StaticNotebook
  ): MarkdownCell = js.native
  
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(
    options: typings.jupyterlabCells.widgetMod.RawCell.IOptions,
    parent: typings.jupyterlabNotebook.widgetMod.StaticNotebook
  ): RawCell = js.native
}
object IContentFactory {
  
  @scala.inline
  def apply(
    createCellFooter: () => ICellFooter,
    createCellHeader: () => ICellHeader,
    createCodeCell: (typings.jupyterlabCells.widgetMod.CodeCell.IOptions, typings.jupyterlabNotebook.widgetMod.StaticNotebook) => CodeCell,
    createInputPrompt: () => IInputPrompt,
    createMarkdownCell: (typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions, typings.jupyterlabNotebook.widgetMod.StaticNotebook) => MarkdownCell,
    createOutputPrompt: () => IOutputPrompt,
    createRawCell: (typings.jupyterlabCells.widgetMod.RawCell.IOptions, typings.jupyterlabNotebook.widgetMod.StaticNotebook) => RawCell,
    createStdin: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction2(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createMarkdownCell = js.Any.fromFunction2(createMarkdownCell), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction2(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
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
    def setCreateCodeCell(
      value: (typings.jupyterlabCells.widgetMod.CodeCell.IOptions, typings.jupyterlabNotebook.widgetMod.StaticNotebook) => CodeCell
    ): Self = this.set("createCodeCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateMarkdownCell(
      value: (typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions, typings.jupyterlabNotebook.widgetMod.StaticNotebook) => MarkdownCell
    ): Self = this.set("createMarkdownCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateRawCell(
      value: (typings.jupyterlabCells.widgetMod.RawCell.IOptions, typings.jupyterlabNotebook.widgetMod.StaticNotebook) => RawCell
    ): Self = this.set("createRawCell", js.Any.fromFunction2(value))
  }
}
