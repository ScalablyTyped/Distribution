package typings.jupyterlabCells.widgetMod.Cell

import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The factory object for customizable cell children.
  *
  * This is used to allow users of cells to customize child content.
  *
  * This inherits from `OutputArea.IContentFactory` to avoid needless nesting and
  * provide a single factory object for all notebook/cell/outputarea related
  * widgets.
  */
trait IContentFactory
  extends typings.jupyterlabOutputarea.widgetMod.OutputArea.IContentFactory
     with typings.jupyterlabCells.inputareaMod.InputArea.IContentFactory {
  /**
    * Create a new cell header for the parent widget.
    */
  def createCellFooter(): ICellFooter
  /**
    * Create a new cell header for the parent widget.
    */
  def createCellHeader(): ICellHeader
}

object IContentFactory {
  @scala.inline
  def apply(
    createCellFooter: () => ICellFooter,
    createCellHeader: () => ICellHeader,
    createInputPrompt: () => IInputPrompt,
    createOutputPrompt: () => IOutputPrompt,
    createStdin: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createStdin = js.Any.fromFunction1(createStdin), editorFactory = js.Any.fromFunction1(editorFactory))
    __obj.asInstanceOf[IContentFactory]
  }
}

