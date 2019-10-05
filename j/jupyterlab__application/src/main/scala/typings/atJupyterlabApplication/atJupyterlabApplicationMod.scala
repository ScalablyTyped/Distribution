package typings.atJupyterlabApplication

import org.scalablytyped.runtime.TopLevel
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IOptions
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application", JSImport.Namespace)
@js.native
object atJupyterlabApplicationMod extends js.Object {
  @js.native
  abstract class JupyterFrontEnd[T /* <: IShell */] protected ()
    extends typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd[T] {
    /**
      * Construct a new JupyterFrontEnd object.
      */
    def this(options: IOptions[T, _]) = this()
  }
  
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  class JupyterLab ()
    extends typings.atJupyterlabApplication.libLabMod.JupyterLab {
    def this(options: typings.atJupyterlabApplication.libLabMod.JupyterLab.IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new application shell.
    */
  class LabShell ()
    extends typings.atJupyterlabApplication.libShellMod.LabShell
  
  @js.native
  class LayoutRestorer protected ()
    extends typings.atJupyterlabApplication.libLayoutrestorerMod.LayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typings.atJupyterlabApplication.libLayoutrestorerMod.LayoutRestorer.IOptions) = this()
  }
  
  @js.native
  class Router protected ()
    extends typings.atJupyterlabApplication.libRouterMod.Router {
    /**
      * Create a URL router.
      */
    def this(options: typings.atJupyterlabApplication.libRouterMod.Router.IOptions) = this()
  }
  
  val ConnectionLost: typings.atJupyterlabApplication.libTokensMod.IConnectionLost = js.native
  val IConnectionLost: Token[typings.atJupyterlabApplication.libTokensMod.IConnectionLost] = js.native
  val ILabStatus: Token[typings.atJupyterlabApplication.libStatusMod.ILabStatus] = js.native
  val ILayoutRestorer: Token[typings.atJupyterlabApplication.libLayoutrestorerMod.ILayoutRestorer] = js.native
  val IMimeDocumentTracker: Token[typings.atJupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker] = js.native
  @js.native
  object ILabShell
    extends TopLevel[Token[typings.atJupyterlabApplication.libShellMod.ILabShell]]
  
  @js.native
  object IRouter
    extends TopLevel[Token[typings.atJupyterlabApplication.libTokensMod.IRouter]]
  
  @js.native
  object JupyterFrontEnd extends js.Object {
    /**
      * The application paths dictionary token.
      */
    val IPaths: Token[typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths] = js.native
  }
  
  @js.native
  object JupyterLab extends js.Object {
    /**
      * The layout restorer token.
      */
    val IInfo: Token[typings.atJupyterlabApplication.libLabMod.JupyterLab.IInfo] = js.native
    /**
      * The default JupyterLab application info.
      */
    val defaultInfo: typings.atJupyterlabApplication.libLabMod.JupyterLab.IInfo = js.native
    /**
      * The default JupyterLab application paths.
      */
    val defaultPaths: IPaths = js.native
  }
  
}

