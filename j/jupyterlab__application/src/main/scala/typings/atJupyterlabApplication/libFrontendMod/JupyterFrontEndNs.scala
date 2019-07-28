package typings.atJupyterlabApplication.libFrontendMod

import typings.atJupyterlabApplication.Anon_App
import typings.atJupyterlabApplication.Anon_AppSettings
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IShell
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.CommandLinker
import typings.atJupyterlabServices.atJupyterlabServicesMod.ServiceManager
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/frontend", "JupyterFrontEnd")
@js.native
object JupyterFrontEndNs extends js.Object {
  /**
    * The options used to initialize a JupyterFrontEnd.
    */
  trait IOptions[T /* <: IShell */, U]
    extends typings.atPhosphorApplication.atPhosphorApplicationMod.ApplicationNs.IOptions[T] {
    /**
      * The command linker used by the application.
      */
    var commandLinker: js.UndefOr[CommandLinker] = js.undefined
    /**
      * The document registry instance used by the application.
      */
    var docRegistry: js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry */ js.Any
      ] = js.undefined
    /**
      * Promise that resolves when state is first restored, returning layout
      * description.
      */
    var restored: js.UndefOr[js.Promise[U]] = js.undefined
    /**
      * The service manager used by the application.
      */
    var serviceManager: js.UndefOr[ServiceManager] = js.undefined
  }
  
  /**
    * An interface for URL and directory paths used by a Jupyter front-end.
    */
  trait IPaths extends js.Object {
    /**
      * The server directories used by the application, for user information
      * only.
      *
      * #### Notes
      * These are for user information and user interface hints only and should
      * not be relied on in code. A server may set these to empty strings if it
      * does not want to expose this information.
      *
      * Examples of appropriate use include displaying a help dialog for a user
      * listing the paths, or a tooltip in a filebrowser displaying the server
      * root. Examples of inapproriate use include using one of these paths in a
      * terminal command, generating code using these paths, or using one of
      * these paths in a request to the server (it would be better to write a
      * server extension to handle these cases).
      */
    val directories: Anon_AppSettings
    /**
      * The urls used by the application.
      */
    val urls: Anon_App
  }
  
  /**
    * A minimal shell type for Jupyter front-end applications.
    */
  @js.native
  trait IShell extends Widget {
    /**
      * The focused widget in the application shell.
      *
      * #### Notes
      * Different shell implementations have latitude to decide what "current"
      * or "focused" mean, depending on their user interface characteristics.
      */
    val currentWidget: Widget = js.native
    /**
      * Activates a widget inside the application shell.
      *
      * @param id - The ID of the widget being activated.
      */
    def activateById(id: String): Unit = js.native
    /**
      * Add a widget to the application shell.
      *
      * @param widget - The widget being added.
      *
      * @param area - Optional region in the shell into which the widget should
      * be added.
      *
      * @param options - Optional flags the shell might use when opening the
      * widget, as defined in the `DocumentRegistry`.
      */
    def add(widget: Widget): Unit = js.native
    def add(widget: Widget, area: String): Unit = js.native
    def add(
      widget: Widget,
      area: String,
      options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IOpenOptions */ js.Any
    ): Unit = js.native
    /**
      * Returns an iterator for the widgets inside the application shell.
      *
      * @param area - Optional regions in the shell whose widgets are iterated.
      */
    def widgets(): IIterator[Widget] = js.native
    def widgets(area: String): IIterator[Widget] = js.native
  }
  
  /**
    * The application paths dictionary token.
    */
  val IPaths: Token[typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IPaths] = js.native
}

