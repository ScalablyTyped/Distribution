package typings.jupyterlabNotebook.widgetMod.StaticNotebook

import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.MarkdownCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
class ContentFactory ()
  extends typings.jupyterlabCells.mod.Cell.ContentFactory
     with IContentFactory {
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  /* InferMemberOverrides */
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
  override def createCodeCell(
    options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions,
    parent: typings.jupyterlabNotebook.widgetMod.StaticNotebook
  ): CodeCell = js.native
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
  override def createMarkdownCell(
    options: typings.jupyterlabCells.widgetMod.MarkdownCell.IOptions,
    parent: typings.jupyterlabNotebook.widgetMod.StaticNotebook
  ): MarkdownCell = js.native
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
  override def createRawCell(
    options: typings.jupyterlabCells.widgetMod.RawCell.IOptions,
    parent: typings.jupyterlabNotebook.widgetMod.StaticNotebook
  ): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createStdin(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
  /**
    * The readonly editor factory that create code editors
    */
  /* InferMemberOverrides */
  @JSName("editorFactory")
  override def editorFactory_MContentFactory_ : Factory = js.native
}

/**
  * A namespace for the staic notebook content factory.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * Options for the content factory.
    */
  type IOptions = typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions
}

