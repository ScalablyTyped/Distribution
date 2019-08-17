package typings.atJupyterlabConsole.libWidgetMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import typings.atJupyterlabCells.atJupyterlabCellsMod.RawCell
import typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import typings.atJupyterlabCells.libModelMod.ICodeCellModel
import typings.atJupyterlabCells.libModelMod.IRawCellModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.Factory
import typings.atJupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IContentFactory
import typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IModelFactory
import typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IModelFactoryOptions
import typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.ModelFactory
import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
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
    extends typings.atJupyterlabCells.atJupyterlabCellsMod.CellNs.ContentFactory
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
    override def createCodeCell(options: typings.atJupyterlabCells.libWidgetMod.CodeCellNs.IOptions): CodeCell = js.native
    /**
      * Create an input prompt.
      */
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
    override def createRawCell(options: typings.atJupyterlabCells.libWidgetMod.RawCellNs.IOptions): RawCell = js.native
    /**
      * Create an stdin widget.
      */
    /* InferMemberOverrides */
    override def createStdin(options: typings.atJupyterlabOutputarea.libWidgetMod.StdinNs.IOptions): IStdin = js.native
  }
  
  /**
    * A content factory for console children.
    */
  trait IContentFactory
    extends typings.atJupyterlabCells.libWidgetMod.CellNs.IContentFactory {
    /**
      * Create a new code cell widget.
      */
    def createCodeCell(options: typings.atJupyterlabCells.libWidgetMod.CodeCellNs.IOptions): CodeCell
    /**
      * Create a new raw cell widget.
      */
    def createRawCell(options: typings.atJupyterlabCells.libWidgetMod.RawCellNs.IOptions): RawCell
  }
  
  /**
    * A model factory for a console widget.
    */
  trait IModelFactory extends js.Object {
    /**
      * The factory for code cell content.
      */
    val codeCellContentFactory: typings.atJupyterlabCells.libModelMod.CodeCellModelNs.IContentFactory
    /**
      * Create a new code cell.
      *
      * @param options - The options used to create the cell.
      *
      * @returns A new code cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createCodeCell(options: typings.atJupyterlabCells.libModelMod.CodeCellModelNs.IOptions): ICodeCellModel
    /**
      * Create a new raw cell.
      *
      * @param options - The options used to create the cell.
      *
      * @returns A new raw cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createRawCell(options: typings.atJupyterlabCells.libModelMod.CellModelNs.IOptions): IRawCellModel
  }
  
  /**
    * The options used to initialize a `ModelFactory`.
    */
  trait IModelFactoryOptions extends js.Object {
    /**
      * The factory for output area models.
      */
    var codeCellContentFactory: js.UndefOr[typings.atJupyterlabCells.libModelMod.CodeCellModelNs.IContentFactory] = js.undefined
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
    var mimeTypeService: IEditorMimeTypeService
    /**
      * The model factory for the console widget.
      */
    var modelFactory: js.UndefOr[IModelFactory] = js.undefined
    /**
      * The mime renderer for the console widget.
      */
    var rendermime: IRenderMimeRegistry
    /**
      * The client session for the console widget.
      */
    var session: IClientSession
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
    val codeCellContentFactory: typings.atJupyterlabCells.libModelMod.CodeCellModelNs.IContentFactory = js.native
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
    def createCodeCell(options: typings.atJupyterlabCells.libModelMod.CodeCellModelNs.IOptions): ICodeCellModel = js.native
    /**
      * Create a new raw cell.
      *
      * @param source - The data to use for the original source data.
      *
      * @returns A new raw cell. If a source cell is provided, the
      *   new cell will be initialized with the data from the source.
      */
    def createRawCell(options: typings.atJupyterlabCells.libModelMod.CellModelNs.IOptions): IRawCellModel = js.native
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
    type IOptions = typings.atJupyterlabCells.libWidgetMod.CellNs.IContentFactory
  }
  
}

