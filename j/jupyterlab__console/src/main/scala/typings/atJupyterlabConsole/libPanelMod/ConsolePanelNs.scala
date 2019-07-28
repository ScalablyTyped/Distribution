package typings.atJupyterlabConsole.libPanelMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSessionNs.IKernelPreference
import typings.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import typings.atJupyterlabCells.atJupyterlabCellsMod.RawCell
import typings.atJupyterlabCells.libHeaderfooterMod.ICellFooter
import typings.atJupyterlabCells.libHeaderfooterMod.ICellHeader
import typings.atJupyterlabCells.libInputareaMod.IInputPrompt
import typings.atJupyterlabConsole.libWidgetMod.CodeConsole
import typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IModelFactory
import typings.atJupyterlabOutputarea.libWidgetMod.IOutputPrompt
import typings.atJupyterlabOutputarea.libWidgetMod.IStdin
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atJupyterlabServices.libManagerMod.ServiceManagerNs.IManager
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel")
@js.native
object ConsolePanelNs extends js.Object {
  /**
    * Default implementation of `IContentFactory`.
    */
  @js.native
  class ContentFactory ()
    extends typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.ContentFactory
       with typings.atJupyterlabConsole.libPanelMod.ConsolePanelNs.IContentFactory {
    /**
      * The editor factory we need to include in `CodeEditorWratter.IOptions`.
      *
      * This is a separate readonly attribute rather than a factory method as we need
      * to pass it around.
      */
    /* InferMemberOverrides */
    override val editorFactory: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.Factory */ js.Any = js.native
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
      * Create a new console panel.
      */
    /* CompleteClass */
    override def createConsole(options: typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IOptions): CodeConsole = js.native
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
    * The console panel renderer.
    */
  trait IContentFactory
    extends typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IContentFactory {
    /**
      * Create a new console panel.
      */
    def createConsole(options: typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.IOptions): CodeConsole
  }
  
  /**
    * The initialization options for a console panel.
    */
  trait IOptions extends js.Object {
    /**
      * The base path for a new console.
      */
    var basePath: js.UndefOr[String] = js.undefined
    /**
      * The content factory for the panel.
      */
    var contentFactory: typings.atJupyterlabConsole.libPanelMod.ConsolePanelNs.IContentFactory
    /**
      * A kernel preference.
      */
    var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
    /**
      * The service manager used by the panel.
      */
    var manager: IManager
    /**
      * The service used to look up mime types.
      */
    var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
    /**
      * The model factory for the console widget.
      */
    var modelFactory: js.UndefOr[IModelFactory] = js.undefined
    /**
      * The name of the console.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The path of an existing console.
      */
    var path: js.UndefOr[String] = js.undefined
    /**
      * The rendermime instance used by the panel.
      */
    var rendermime: IRenderMimeRegistry
    /**
      * A function to call when the kernel is busy.
      */
    var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
  }
  
  /**
    * The console renderer token.
    */
  val IContentFactory: Token[typings.atJupyterlabConsole.libPanelMod.ConsolePanelNs.IContentFactory] = js.native
  /**
    * A default code console content factory.
    */
  val defaultContentFactory: typings.atJupyterlabConsole.libPanelMod.ConsolePanelNs.IContentFactory = js.native
  /**
    * A namespace for the console panel content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object {
    /**
      * Options for the code console content factory.
      */
    type IOptions = typings.atJupyterlabConsole.libWidgetMod.CodeConsoleNs.ContentFactoryNs.IOptions
  }
  
}

