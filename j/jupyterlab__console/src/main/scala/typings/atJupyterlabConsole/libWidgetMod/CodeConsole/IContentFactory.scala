package typings.atJupyterlabConsole.libWidgetMod.CodeConsole

import typings.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import typings.atJupyterlabCells.atJupyterlabCellsMod.RawCell
import typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A content factory for console children.
  */
trait IContentFactory
  extends typings.atJupyterlabCells.libWidgetMod.Cell.IContentFactory {
  /**
    * Create a new code cell widget.
    */
  def createCodeCell(options: typings.atJupyterlabCells.libWidgetMod.CodeCell.IOptions): CodeCell
  /**
    * Create a new raw cell widget.
    */
  def createRawCell(options: typings.atJupyterlabCells.libWidgetMod.RawCell.IOptions): RawCell
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: () => ICellFooter,
    createCellHeader: () => ICellHeader,
    createCodeCell: typings.atJupyterlabCells.libWidgetMod.CodeCell.IOptions => CodeCell,
    createInputPrompt: () => IInputPrompt,
    createOutputPrompt: () => IOutputPrompt,
    createRawCell: typings.atJupyterlabCells.libWidgetMod.RawCell.IOptions => RawCell,
    createStdin: typings.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createCodeCell = js.Any.fromFunction1(createCodeCell), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createRawCell = js.Any.fromFunction1(createRawCell), createStdin = js.Any.fromFunction1(createStdin), editorFactory = editorFactory)
  
    __obj.asInstanceOf[IContentFactory]
  }
}

