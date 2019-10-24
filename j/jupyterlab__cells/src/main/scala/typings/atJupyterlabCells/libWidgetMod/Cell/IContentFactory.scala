package typings.atJupyterlabCells.libWidgetMod.Cell

import typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
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
  extends typings.atJupyterlabOutputarea.libWidgetMod.OutputArea.IContentFactory
     with typings.atJupyterlabCells.libInputareaMod.InputArea.IContentFactory {
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
    createStdin: typings.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions => IStdin,
    editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(createCellFooter = js.Any.fromFunction0(createCellFooter), createCellHeader = js.Any.fromFunction0(createCellHeader), createInputPrompt = js.Any.fromFunction0(createInputPrompt), createOutputPrompt = js.Any.fromFunction0(createOutputPrompt), createStdin = js.Any.fromFunction1(createStdin), editorFactory = editorFactory)
  
    __obj.asInstanceOf[IContentFactory]
  }
}

