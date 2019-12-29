package typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook

import typings.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import typings.atJupyterlabCells.atJupyterlabCellsMod.MarkdownCell
import typings.atJupyterlabCells.atJupyterlabCellsMod.RawCell
import typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating notebook content.
  *
  * #### Notes
  * This extends the content factory of the cell itself, which extends the content
  * factory of the output area and input area. The result is that there is a single
  * factory for creating all child content of a notebook.
  */
trait IContentFactory
  extends typings.atJupyterlabCells.libWidgetMod.Cell.IContentFactory {
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(
    options: typings.atJupyterlabCells.libWidgetMod.CodeCell.IOptions,
    parent: typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): CodeCell
  /**
    * Create a new markdown cell widget.
    */
  def createMarkdownCell(
    options: typings.atJupyterlabCells.libWidgetMod.MarkdownCell.IOptions,
    parent: typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): MarkdownCell
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(
    options: typings.atJupyterlabCells.libWidgetMod.RawCell.IOptions,
    parent: typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook
  ): RawCell
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: () => ICellFooter,
    createCellHeader: () => ICellHeader,
    createCodeCell: (typings.atJupyterlabCells.libWidgetMod.CodeCell.IOptions, typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook) => CodeCell,
    createInputPrompt: () => IInputPrompt,
    createMarkdownCell: (typings.atJupyterlabCells.libWidgetMod.MarkdownCell.IOptions, typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook) => MarkdownCell,
    createOutputPrompt: () => IOutputPrompt,
    createRawCell: (typings.atJupyterlabCells.libWidgetMod.RawCell.IOptions, typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook) => RawCell,
    createStdin: typings.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* options */ typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction2(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createMarkdownCell = js.Any.fromFunction2(createMarkdownCell), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction2(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
  
    __obj.asInstanceOf[IContentFactory]
  }
}

