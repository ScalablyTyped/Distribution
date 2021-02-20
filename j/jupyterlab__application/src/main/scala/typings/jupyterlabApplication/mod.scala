package typings.jupyterlabApplication

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IOptions
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/application", "ConnectionLost")
  @js.native
  val ConnectionLost: typings.jupyterlabApplication.tokensMod.IConnectionLost = js.native
  
  @JSImport("@jupyterlab/application", "IConnectionLost")
  @js.native
  val IConnectionLost: Token[typings.jupyterlabApplication.tokensMod.IConnectionLost] = js.native
  
  object ILabShell extends Shortcut {
    
    @JSImport("@jupyterlab/application", "ILabShell")
    @js.native
    val ^ : Token[typings.jupyterlabApplication.shellMod.ILabShell] = js.native
    
    type _To = Token[typings.jupyterlabApplication.shellMod.ILabShell]
    
    /* This means you don't have to write `^`, but can instead just say `ILabShell.foo` */
    override def _to: Token[typings.jupyterlabApplication.shellMod.ILabShell] = ^
  }
  
  @JSImport("@jupyterlab/application", "ILabStatus")
  @js.native
  val ILabStatus: Token[typings.jupyterlabApplication.statusMod.ILabStatus] = js.native
  
  @JSImport("@jupyterlab/application", "ILayoutRestorer")
  @js.native
  val ILayoutRestorer: Token[typings.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer] = js.native
  
  @JSImport("@jupyterlab/application", "IMimeDocumentTracker")
  @js.native
  val IMimeDocumentTracker: Token[typings.jupyterlabApplication.mimerenderersMod.IMimeDocumentTracker] = js.native
  
  object IRouter extends Shortcut {
    
    @JSImport("@jupyterlab/application", "IRouter")
    @js.native
    val ^ : Token[typings.jupyterlabApplication.tokensMod.IRouter] = js.native
    
    type _To = Token[typings.jupyterlabApplication.tokensMod.IRouter]
    
    /* This means you don't have to write `^`, but can instead just say `IRouter.foo` */
    override def _to: Token[typings.jupyterlabApplication.tokensMod.IRouter] = ^
  }
  
  @JSImport("@jupyterlab/application", "JupyterFrontEnd")
  @js.native
  abstract class JupyterFrontEnd[T /* <: IShell */] protected ()
    extends typings.jupyterlabApplication.frontendMod.JupyterFrontEnd[T] {
    /**
      * Construct a new JupyterFrontEnd object.
      */
    def this(options: IOptions[T, _]) = this()
  }
  object JupyterFrontEnd {
    
    /**
      * The application paths dictionary token.
      */
    @JSImport("@jupyterlab/application", "JupyterFrontEnd.IPaths")
    @js.native
    val IPaths: Token[typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths] = js.native
    
    /**
      * A namespace for tree resolver types.
      */
    object ITreeResolver extends Shortcut {
      
      @JSImport("@jupyterlab/application", "JupyterFrontEnd.ITreeResolver")
      @js.native
      val ^ : Token[typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver] = js.native
      
      type _To = Token[typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver]
      
      /* This means you don't have to write `^`, but can instead just say `ITreeResolver.foo` */
      override def _to: Token[typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.ITreeResolver] = ^
    }
  }
  
  @JSImport("@jupyterlab/application", "JupyterLab")
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  class JupyterLab ()
    extends typings.jupyterlabApplication.labMod.JupyterLab {
    def this(options: typings.jupyterlabApplication.labMod.JupyterLab.IOptions) = this()
  }
  object JupyterLab {
    
    /**
      * The layout restorer token.
      */
    @JSImport("@jupyterlab/application", "JupyterLab.IInfo")
    @js.native
    val IInfo: Token[typings.jupyterlabApplication.labMod.JupyterLab.IInfo] = js.native
    
    /**
      * The default JupyterLab application info.
      */
    @JSImport("@jupyterlab/application", "JupyterLab.defaultInfo")
    @js.native
    val defaultInfo: typings.jupyterlabApplication.labMod.JupyterLab.IInfo = js.native
    
    /**
      * The default JupyterLab application paths.
      */
    @JSImport("@jupyterlab/application", "JupyterLab.defaultPaths")
    @js.native
    val defaultPaths: IPaths = js.native
  }
  
  @JSImport("@jupyterlab/application", "LabShell")
  @js.native
  /**
    * Construct a new application shell.
    */
  class LabShell ()
    extends typings.jupyterlabApplication.shellMod.LabShell
  
  @JSImport("@jupyterlab/application", "LayoutRestorer")
  @js.native
  class LayoutRestorer protected ()
    extends typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/application", "Router")
  @js.native
  class Router protected ()
    extends typings.jupyterlabApplication.routerMod.Router {
    /**
      * Create a URL router.
      */
    def this(options: typings.jupyterlabApplication.routerMod.Router.IOptions) = this()
  }
}
