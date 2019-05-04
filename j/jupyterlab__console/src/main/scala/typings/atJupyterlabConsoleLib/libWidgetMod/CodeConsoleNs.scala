package typings
package atJupyterlabConsoleLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/widget", "CodeConsole")
@js.native
object CodeConsoleNs extends js.Object {
  /**
    * Default implementation of `IContentFactory`.
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
    override def createCodeCell(options: atJupyterlabCellsLib.libWidgetMod.CodeCellNs.IOptions): atJupyterlabCellsLib.atJupyterlabCellsMod.CodeCell = js.native
    /**
      * Create an input prompt.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def createInputPrompt(): atJupyterlabCellsLib.libInputareaMod.IInputPrompt = js.native
    /**
      * Create an output prompt.
      */
    /* InferMemberOverrides */
    override def createOutputPrompt(): atJupyterlabOutputareaLib.libWidgetMod.IOutputPrompt = js.native
    /**
      * Create a new raw cell widget.
      */
    /* CompleteClass */
    override def createRawCell(options: atJupyterlabCellsLib.libWidgetMod.RawCellNs.IOptions): atJupyterlabCellsLib.atJupyterlabCellsMod.RawCell = js.native
    /**
      * Create an stdin widget.
      */
    /* InferMemberOverrides */
    override def createStdin(options: atJupyterlabOutputareaLib.libWidgetMod.StdinNs.IOptions): atJupyterlabOutputareaLib.libWidgetMod.IStdin = js.native
  }
  
  /**
    * A content factory for console children.
    */
  trait IContentFactory
    extends atJupyterlabCellsLib.libWidgetMod.CellNs.IContentFactory {
    /**
      * Create a new code cell widget.
      */
    def createCodeCell(options: atJupyterlabCellsLib.libWidgetMod.CodeCellNs.IOptions): atJupyterlabCellsLib.atJupyterlabCellsMod.CodeCell
    /**
      * Create a new raw cell widget.
      */
    def createRawCell(options: atJupyterlabCellsLib.libWidgetMod.RawCellNs.IOptions): atJupyterlabCellsLib.atJupyterlabCellsMod.RawCell
  }
  
  /**
    * A model factory for a console widget.
    */
  trait IModelFactory extends js.Object {
    /**
      * The factory for code cell content.
      */
    val codeCellContentFactory: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IContentFactory
    /**
      * Create a new code cell.
      *
      * @param options - The options used to create the cell.
      *
      * @returns A new code cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createCodeCell(options: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.ICodeCellModel
    /**
      * Create a new raw cell.
      *
      * @param options - The options used to create the cell.
      *
      * @returns A new raw cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createRawCell(options: atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.IRawCellModel
  }
  
  /**
    * The options used to initialize a `ModelFactory`.
    */
  trait IModelFactoryOptions extends js.Object {
    /**
      * The factory for output area models.
      */
    var codeCellContentFactory: js.UndefOr[atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IContentFactory] = js.undefined
  }
  
  /**
    * The initialization options for a console widget.
    */
  trait IOptions extends js.Object {
    /**
      * The content factory for the console widget.
      */
    var contentFactory: IContentFactory
    /**
      * The service used to look up mime types.
      */
    var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
    /**
      * The model factory for the console widget.
      */
    var modelFactory: js.UndefOr[IModelFactory] = js.undefined
    /**
      * The mime renderer for the console widget.
      */
    var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
    /**
      * The client session for the console widget.
      */
    var session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession
  }
  
  /**
    * The default implementation of an `IModelFactory`.
    */
  @js.native
  /**
    * Create a new cell model factory.
    */
  class ModelFactory () extends js.Object {
    def this(options: IModelFactoryOptions) = this()
    /**
      * The factory for output area models.
      */
    val codeCellContentFactory: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IContentFactory = js.native
    /**
      * Create a new code cell.
      *
      * @param source - The data to use for the original source data.
      *
      * @returns A new code cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      *   If the contentFactory is not provided, the instance
      *   `codeCellContentFactory` will be used.
      */
    def createCodeCell(options: atJupyterlabCellsLib.libModelMod.CodeCellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.ICodeCellModel = js.native
    /**
      * Create a new raw cell.
      *
      * @param source - The data to use for the original source data.
      *
      * @returns A new raw cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createRawCell(options: atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions): atJupyterlabCellsLib.libModelMod.IRawCellModel = js.native
  }
  
  /**
    * A default content factory for the code console.
    */
  val defaultContentFactory: IContentFactory = js.native
  /**
    * The default `ModelFactory` instance.
    */
  val defaultModelFactory: ModelFactory = js.native
  /**
    * A namespace for the code console content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object {
    /**
      * An initialize options for `ContentFactory`.
      */
    type IOptions = atJupyterlabCellsLib.libWidgetMod.CellNs.IContentFactory
  }
  
}

