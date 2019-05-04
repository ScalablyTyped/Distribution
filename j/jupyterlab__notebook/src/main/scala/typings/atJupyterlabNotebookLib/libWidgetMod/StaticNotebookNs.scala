package typings
package atJupyterlabNotebookLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook")
@js.native
object StaticNotebookNs extends js.Object {
  /**
    * The default implementation of an `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends atJupyterlabCellsLib.atJupyterlabCellsMod.CellNs.ContentFactory
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
    * A factory for creating notebook content.
    *
    * #### Notes
    * This extends the content factory of the cell itself, which extends the content
    * factory of the output area and input area. The result is that there is a single
    * factory for creating all child content of a notebook.
    */
  trait IContentFactory
    extends atJupyterlabCellsLib.libWidgetMod.CellNs.IContentFactory {
    /**
      * Create a new code cell widget.
      */
    def createCodeCell(
      options: atJupyterlabCellsLib.libWidgetMod.CodeCellNs.IOptions,
      parent: atJupyterlabNotebookLib.libWidgetMod.StaticNotebook
    ): atJupyterlabCellsLib.atJupyterlabCellsMod.CodeCell
    /**
      * Create a new markdown cell widget.
      */
    def createMarkdownCell(
      options: atJupyterlabCellsLib.libWidgetMod.MarkdownCellNs.IOptions,
      parent: atJupyterlabNotebookLib.libWidgetMod.StaticNotebook
    ): atJupyterlabCellsLib.atJupyterlabCellsMod.MarkdownCell
    /**
      * Create a new raw cell widget.
      */
    def createRawCell(
      options: atJupyterlabCellsLib.libWidgetMod.RawCellNs.IOptions,
      parent: atJupyterlabNotebookLib.libWidgetMod.StaticNotebook
    ): atJupyterlabCellsLib.atJupyterlabCellsMod.RawCell
  }
  
  /**
    * A config object for the cell editors.
    */
  trait IEditorConfig extends js.Object {
    /**
      * Config options for code cells.
      */
    val code: stdLib.Partial[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IConfig */ _
      ]
    /**
      * Config options for markdown cells.
      */
    val markdown: stdLib.Partial[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IConfig */ _
      ]
    /**
      * Config options for raw cells.
      */
    val raw: stdLib.Partial[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IConfig */ _
      ]
  }
  
  /**
    * An options object for initializing a static notebook.
    */
  trait IOptions extends js.Object {
    /**
      * A factory for creating content.
      */
    var contentFactory: js.UndefOr[IContentFactory] = js.undefined
    /**
      * A configuration object for the cell editor settings.
      */
    var editorConfig: js.UndefOr[IEditorConfig] = js.undefined
    /**
      * The language preference for the model.
      */
    var languagePreference: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The service used to look up mime types.
      */
    var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
    /**
      * The rendermime instance used by the widget.
      */
    var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
  }
  
  /**
    * Default content factory for the static notebook widget.
    */
  val defaultContentFactory: IContentFactory = js.native
  /**
    * Default configuration options for cell editors.
    */
  val defaultEditorConfig: IEditorConfig = js.native
  /**
    * A namespace for the staic notebook content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object {
    /**
      * Options for the content factory.
      */
    type IOptions = atJupyterlabCellsLib.libWidgetMod.CellNs.ContentFactoryNs.IOptions
  }
  
}

