package typings
package atJupyterlabNotebookLib.libPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel")
@js.native
object NotebookPanelNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends atJupyterlabNotebookLib.libWidgetMod.NotebookNs.ContentFactory
       with IContentFactory {
    /**
      * The editor factory we need to include in `CodeEditorWratter.IOptions`.
      *
      * This is a separate readonly attribute rather than a factory method as we need
      * to pass it around.
      */
    /* CompleteClass */
    override val editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = js.native
    /**
      * Create a new cell header for the parent widget.
      */
    /* InferMemberOverrides */
    override def createCellFooter(): atJupyterlabCellsLib.libHeaderfooterMod.ICellFooter = js.native
    /**
      * Create a new cell header for the parent widget.
      */
    /* InferMemberOverrides */
    override def createCellHeader(): atJupyterlabCellsLib.libHeaderfooterMod.ICellHeader = js.native
    /**
      * Create a new code cell widget.
      */
    /* CompleteClass */
    override def createCodeCell(
      options: atJupyterlabCellsLib.libWidgetMod.CodeCellNs.IOptions,
      parent: atJupyterlabNotebookLib.libWidgetMod.StaticNotebook
    ): atJupyterlabCellsLib.atJupyterlabCellsMod.CodeCell = js.native
    /**
      * Create an input prompt.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def createInputPrompt(): atJupyterlabCellsLib.libInputareaMod.IInputPrompt = js.native
    /**
      * Create a new markdown cell widget.
      */
    /* CompleteClass */
    override def createMarkdownCell(
      options: atJupyterlabCellsLib.libWidgetMod.MarkdownCellNs.IOptions,
      parent: atJupyterlabNotebookLib.libWidgetMod.StaticNotebook
    ): atJupyterlabCellsLib.atJupyterlabCellsMod.MarkdownCell = js.native
    /**
      * Create a new content area for the panel.
      */
    /* CompleteClass */
    override def createNotebook(options: atJupyterlabNotebookLib.libWidgetMod.NotebookNs.IOptions): atJupyterlabNotebookLib.libWidgetMod.Notebook = js.native
    /**
      * Create an output prompt.
      */
    /* InferMemberOverrides */
    override def createOutputPrompt(): atJupyterlabOutputareaLib.libWidgetMod.IOutputPrompt = js.native
    /**
      * Create a new raw cell widget.
      */
    /* CompleteClass */
    override def createRawCell(
      options: atJupyterlabCellsLib.libWidgetMod.RawCellNs.IOptions,
      parent: atJupyterlabNotebookLib.libWidgetMod.StaticNotebook
    ): atJupyterlabCellsLib.atJupyterlabCellsMod.RawCell = js.native
    /**
      * Create an stdin widget.
      */
    /* InferMemberOverrides */
    override def createStdin(options: atJupyterlabOutputareaLib.libWidgetMod.StdinNs.IOptions): atJupyterlabOutputareaLib.libWidgetMod.IStdin = js.native
  }
  
  /**
    * A content factory interface for NotebookPanel.
    */
  trait IContentFactory
    extends atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IContentFactory {
    /**
      * Create a new content area for the panel.
      */
    def createNotebook(options: atJupyterlabNotebookLib.libWidgetMod.NotebookNs.IOptions): atJupyterlabNotebookLib.libWidgetMod.Notebook
  }
  
  /**
    * The notebook renderer token.
    */
  val IContentFactory: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[IContentFactory] = js.native
  /**
    * Default content factory for the notebook panel.
    */
  val defaultContentFactory: ContentFactory = js.native
}

