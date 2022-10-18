package typings.jupyterlabApplication

import typings.jupyterlabApplication.jupyterlabApplicationStrings.desktop
import typings.jupyterlabApplication.jupyterlabApplicationStrings.mobile
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IOptions
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabDocregistry.mod.MimeDocument
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtension
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/application", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/application", "ConnectionLost")
  @js.native
  val ConnectionLost: typings.jupyterlabApplication.libTokensMod.IConnectionLost = js.native
  
  @JSImport("@jupyterlab/application", "IConnectionLost")
  @js.native
  val IConnectionLost: Token[typings.jupyterlabApplication.libTokensMod.IConnectionLost] = js.native
  
  @JSImport("@jupyterlab/application", "ILabShell")
  @js.native
  val ILabShell: Token[typings.jupyterlabApplication.libShellMod.ILabShell] = js.native
  
  @JSImport("@jupyterlab/application", "ILabStatus")
  @js.native
  val ILabStatus: Token[typings.jupyterlabApplication.libStatusMod.ILabStatus] = js.native
  
  @JSImport("@jupyterlab/application", "ILayoutRestorer")
  @js.native
  val ILayoutRestorer: Token[typings.jupyterlabApplication.libLayoutrestorerMod.ILayoutRestorer] = js.native
  
  @JSImport("@jupyterlab/application", "IMimeDocumentTracker")
  @js.native
  val IMimeDocumentTracker: Token[typings.jupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker] = js.native
  
  @JSImport("@jupyterlab/application", "IRouter")
  @js.native
  val IRouter: Token[typings.jupyterlabApplication.libTokensMod.IRouter] = js.native
  
  @JSImport("@jupyterlab/application", "ITreePathUpdater")
  @js.native
  val ITreePathUpdater: Token[typings.jupyterlabApplication.libTreepathupdaterMod.ITreePathUpdater] = js.native
  
  /* note: abstract class */ @JSImport("@jupyterlab/application", "JupyterFrontEnd")
  @js.native
  open class JupyterFrontEnd[T /* <: IShell */, U /* <: String */] protected ()
    extends typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd[T, U] {
    /**
      * Construct a new JupyterFrontEnd object.
      */
    def this(options: IOptions[T, Any]) = this()
  }
  object JupyterFrontEnd {
    
    @JSImport("@jupyterlab/application", "JupyterFrontEnd")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The application paths dictionary token.
      */
    @JSImport("@jupyterlab/application", "JupyterFrontEnd.IPaths")
    @js.native
    val IPaths: Token[typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths] = js.native
    
    /**
      * A namespace for tree resolver types.
      */
    @JSImport("@jupyterlab/application", "JupyterFrontEnd.ITreeResolver")
    @js.native
    val ITreeResolver: Token[typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.ITreeResolver] = js.native
    
    /**
      * Is JupyterLab in document mode?
      *
      * @param path - Full URL of JupyterLab
      * @param paths - The current IPaths object hydrated from PageConfig.
      */
    inline def inDocMode(path: String, paths: typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inDocMode")(path.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object JupyterFrontEndContextMenu {
    
    /**
      * An id for a private context-menu-info ersatz command.
      */
    @JSImport("@jupyterlab/application", "JupyterFrontEndContextMenu.contextMenu")
    @js.native
    val contextMenu: /* "__internal:context-menu-info" */ String = js.native
  }
  
  @JSImport("@jupyterlab/application", "JupyterLab")
  @js.native
  /**
    * Construct a new JupyterLab object.
    */
  open class JupyterLab ()
    extends typings.jupyterlabApplication.libLabMod.JupyterLab {
    def this(options: typings.jupyterlabApplication.libLabMod.JupyterLab.IOptions) = this()
  }
  object JupyterLab {
    
    /**
      * The layout restorer token.
      */
    @JSImport("@jupyterlab/application", "JupyterLab.IInfo")
    @js.native
    val IInfo: Token[typings.jupyterlabApplication.libLabMod.JupyterLab.IInfo] = js.native
    
    /**
      * The default JupyterLab application info.
      */
    @JSImport("@jupyterlab/application", "JupyterLab.defaultInfo")
    @js.native
    val defaultInfo: typings.jupyterlabApplication.libLabMod.JupyterLab.IInfo = js.native
    
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
  open class LabShell ()
    extends typings.jupyterlabApplication.libShellMod.LabShell {
    def this(options: typings.jupyterlabApplication.libShellMod.ILabShell.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/application", "LayoutRestorer")
  @js.native
  open class LayoutRestorer protected ()
    extends typings.jupyterlabApplication.libLayoutrestorerMod.LayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typings.jupyterlabApplication.libLayoutrestorerMod.LayoutRestorer.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/application", "Router")
  @js.native
  open class Router protected ()
    extends typings.jupyterlabApplication.libRouterMod.Router {
    /**
      * Create a URL router.
      */
    def this(options: typings.jupyterlabApplication.libRouterMod.Router.IOptions) = this()
  }
  
  inline def createRendermimePlugin(tracker: WidgetTracker[MimeDocument], item: IExtension): JupyterFrontEndPlugin[Unit, IShell, desktop | mobile] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRendermimePlugin")(tracker.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[JupyterFrontEndPlugin[Unit, IShell, desktop | mobile]]
  
  inline def createRendermimePlugins(extensions: js.Array[IExtensionModule]): js.Array[
    JupyterFrontEndPlugin[
      Unit | typings.jupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker, 
      Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRendermimePlugins")(extensions.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    JupyterFrontEndPlugin[
      Unit | typings.jupyterlabApplication.libMimerenderersMod.IMimeDocumentTracker, 
      Any, 
      Any
    ]
  ]]
}
