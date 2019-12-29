package typings.atJupyterlabNotebook.libPanelMod.NotebookPanel

import typings.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import typings.atJupyterlabCells.atJupyterlabCellsMod.MarkdownCell
import typings.atJupyterlabCells.atJupyterlabCellsMod.RawCell
import typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import typings.atJupyterlabCells.libWidgetMod.CodeCell.IOptions
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.atJupyterlabNotebook.libWidgetMod.Notebook
import typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook
import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.ContentFactory")
@js.native
class ContentFactory ()
  extends typings.atJupyterlabNotebook.libWidgetMod.StaticNotebook.ContentFactory
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
  /* InferMemberOverrides */
  override def createCellFooter(): ICellFooter = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* InferMemberOverrides */
  override def createCellHeader(): ICellHeader = js.native
  /**
    * Create a new code cell widget.
    */
  /* CompleteClass */
  override def createCodeCell(options: IOptions, parent: StaticNotebook): CodeCell = js.native
  /**
    * Create an input prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createInputPrompt(): IInputPrompt = js.native
  /**
    * Create a new markdown cell widget.
    */
  /* CompleteClass */
  override def createMarkdownCell(options: typings.atJupyterlabCells.libWidgetMod.MarkdownCell.IOptions, parent: StaticNotebook): MarkdownCell = js.native
  /**
    * Create a new content area for the panel.
    */
  /* CompleteClass */
  override def createNotebook(options: typings.atJupyterlabNotebook.libWidgetMod.Notebook.IOptions): Notebook = js.native
  /**
    * Create an output prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create a new raw cell widget.
    */
  /* CompleteClass */
  override def createRawCell(options: typings.atJupyterlabCells.libWidgetMod.RawCell.IOptions, parent: StaticNotebook): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createStdin(options: typings.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions): IStdin = js.native
}

