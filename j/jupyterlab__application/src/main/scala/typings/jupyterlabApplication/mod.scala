package typings.jupyterlabApplication

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IOptions
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class JupyterFrontEnd[T /* <: IShell */] protected ()
    extends typings.jupyterlabApplication.frontendMod.JupyterFrontEnd[T] {
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
    extends typings.jupyterlabApplication.labMod.JupyterLab {
    def this(options: typings.jupyterlabApplication.labMod.JupyterLab.IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new application shell.
    */
  class LabShell ()
    extends typings.jupyterlabApplication.shellMod.LabShell
  
  @js.native
  class LayoutRestorer protected ()
    extends typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions) = this()
  }
  
  @js.native
  class Router protected ()
    extends typings.jupyterlabApplication.routerMod.Router {
    /**
      * Create a URL router.
      */
    def this(options: typings.jupyterlabApplication.routerMod.Router.IOptions) = this()
  }
  
  val ConnectionLost: typings.jupyterlabApplication.tokensMod.IConnectionLost = js.native
  val IConnectionLost: Token[typings.jupyterlabApplication.tokensMod.IConnectionLost] = js.native
  val ILabStatus: Token[typings.jupyterlabApplication.statusMod.ILabStatus] = js.native
  val ILayoutRestorer: Token[typings.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer] = js.native
  val IMimeDocumentTracker: Token[typings.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  @js.native
  object ILabShell
    extends TopLevel[Token[typings.jupyterlabApplication.shellMod.ILabShell]]
  
  @js.native
  object IRouter
    extends TopLevel[Token[typings.jupyterlabApplication.tokensMod.IRouter]]
  
  @js.native
  object JupyterFrontEnd extends js.Object {
    /**
      * The application paths dictionary token.
      */
    val IPaths: Token[typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths] = js.native
  }
  
  @js.native
  object JupyterLab extends js.Object {
    /**
      * The layout restorer token.
      */
    val IInfo: Token[typings.jupyterlabApplication.labMod.JupyterLab.IInfo] = js.native
    /**
      * The default JupyterLab application info.
      */
    val defaultInfo: typings.jupyterlabApplication.labMod.JupyterLab.IInfo = js.native
    /**
      * The default JupyterLab application paths.
      */
    val defaultPaths: IPaths = js.native
  }
  
}

