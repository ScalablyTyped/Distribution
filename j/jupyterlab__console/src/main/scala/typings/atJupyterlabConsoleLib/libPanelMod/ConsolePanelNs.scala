package typings
package atJupyterlabConsoleLib.libPanelMod

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
    extends atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.ContentFactory
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
      * Create a new console panel.
      */
    /* CompleteClass */
    override def createConsole(options: atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IOptions): atJupyterlabConsoleLib.libWidgetMod.CodeConsole = js.native
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
    * The console panel renderer.
    */
  trait IContentFactory
    extends atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IContentFactory {
    /**
      * Create a new console panel.
      */
    def createConsole(options: atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IOptions): atJupyterlabConsoleLib.libWidgetMod.CodeConsole
  }
  
  /**
    * The initialization options for a console panel.
    */
  trait IOptions extends js.Object {
    /**
      * The base path for a new console.
      */
    var basePath: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The content factory for the panel.
      */
    var contentFactory: IContentFactory
    /**
      * A kernel preference.
      */
    var kernelPreference: js.UndefOr[atJupyterlabApputilsLib.libClientsessionMod.IClientSessionNs.IKernelPreference] = js.undefined
    /**
      * The service manager used by the panel.
      */
    var manager: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager
    /**
      * The service used to look up mime types.
      */
    var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
    /**
      * The model factory for the console widget.
      */
    var modelFactory: js.UndefOr[atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.IModelFactory] = js.undefined
    /**
      * The name of the console.
      */
    var name: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The path of an existing console.
      */
    var path: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The rendermime instance used by the panel.
      */
    var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
    /**
      * A function to call when the kernel is busy.
      */
    var setBusy: js.UndefOr[js.Function0[atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable]] = js.undefined
  }
  
  /**
    * The console renderer token.
    */
  val IContentFactory: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[IContentFactory] = js.native
  /**
    * A default code console content factory.
    */
  val defaultContentFactory: IContentFactory = js.native
  /**
    * A namespace for the console panel content factory.
    */
  @JSName("ContentFactory")
  @js.native
  object ContentFactoryNs extends js.Object {
    /**
      * Options for the code console content factory.
      */
    type IOptions = atJupyterlabConsoleLib.libWidgetMod.CodeConsoleNs.ContentFactoryNs.IOptions
  }
  
}

