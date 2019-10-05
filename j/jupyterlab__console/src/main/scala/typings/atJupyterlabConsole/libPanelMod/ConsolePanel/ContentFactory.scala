package typings.atJupyterlabConsole.libPanelMod.ConsolePanel

import typings.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import typings.atJupyterlabCells.atJupyterlabCellsMod.RawCell
import typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.atJupyterlabConsole.libWidgetMod.CodeConsole
import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
class ContentFactory ()
  extends typings.atJupyterlabConsole.libWidgetMod.CodeConsole.ContentFactory
     with IContentFactory {
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  /* CompleteClass */
  override val editorFactory: Factory = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createCellFooter(): ICellFooter = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createCellHeader(): ICellHeader = js.native
  /**
    * Create a new code cell widget.
    */
  /* CompleteClass */
  override def createCodeCell(options: typings.atJupyterlabCells.libWidgetMod.CodeCell.IOptions): CodeCell = js.native
  /**
    * Create a new console panel.
    */
  /* CompleteClass */
  override def createConsole(options: typings.atJupyterlabConsole.libWidgetMod.CodeConsole.IOptions): CodeConsole = js.native
  /**
    * Create an input prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createInputPrompt(): IInputPrompt = js.native
  /**
    * Create an output prompt.
    */
  /* InferMemberOverrides */
  override def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create a new raw cell widget.
    */
  /* CompleteClass */
  override def createRawCell(options: typings.atJupyterlabCells.libWidgetMod.RawCell.IOptions): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* InferMemberOverrides */
  override def createStdin(options: typings.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin = js.native
}

/**
  * A namespace for the console panel content factory.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * Options for the code console content factory.
    */
  type IOptions = typings.atJupyterlabConsole.libWidgetMod.CodeConsole.ContentFactory.IOptions
}

