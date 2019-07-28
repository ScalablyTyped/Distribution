package typings.atJupyterlabApplication.libLabMod

import typings.atJupyterlabApplication.Anon_Matches
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IPaths
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.atJupyterlabApplication.libShellMod.LabShell
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IExtensionModule
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/lab", "JupyterLab")
@js.native
object JupyterLabNs extends js.Object {
  /**
    * The information about a JupyterLab application.
    */
  trait IInfo extends js.Object {
    /**
      * The collection of deferred extension patterns and matched extensions.
      */
    val deferred: Anon_Matches
    /**
      * Whether the application is in dev mode.
      */
    val devMode: Boolean
    /**
      * The collection of disabled extension patterns and matched extensions.
      */
    val disabled: Anon_Matches
    /**
      * Whether files are cached on the server.
      */
    val filesCached: Boolean
    /**
      * The mime renderer extensions.
      */
    val mimeExtensions: js.Array[IExtensionModule]
  }
  
  /**
    * The options used to initialize a JupyterLab object.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @jupyterlab/application.@jupyterlab/application/lib/lab.JupyterLab.IInfo ]:? @jupyterlab/application.@jupyterlab/application/lib/lab.JupyterLab.IInfo[P]} */ trait IOptions
    extends typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IOptions[LabShell, js.Any] {
    var paths: js.UndefOr[Partial[IPaths]] = js.undefined
  }
  
  /**
    * The interface for a module that exports a plugin or plugins as
    * the default value.
    */
  trait IPluginModule extends js.Object {
    /**
      * The default export.
      */
    var default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]
  }
  
  /**
    * The layout restorer token.
    */
  val IInfo: Token[typings.atJupyterlabApplication.libLabMod.JupyterLabNs.IInfo] = js.native
  /**
    * The default JupyterLab application info.
    */
  val defaultInfo: typings.atJupyterlabApplication.libLabMod.JupyterLabNs.IInfo = js.native
  /**
    * The default JupyterLab application paths.
    */
  val defaultPaths: IPaths = js.native
}

