package typings
package atJupyterlabApplicationLib.atJupyterlabApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application", "JupyterLab")
@js.native
object JupyterLabNs extends js.Object {
  /**
    * The information about a JupyterLab application.
    */
  trait IInfo extends js.Object {
    /**
      * The name of the default workspace.
      */
    val defaultWorkspace: java.lang.String
    /**
      * The collection of deferred extension patterns and matched extensions.
      */
    val deferred: atJupyterlabApplicationLib.Anon_Matches
    /**
      * Whether the application is in dev mode.
      */
    val devMode: scala.Boolean
    /**
      * The local directories used by the application.
      */
    val directories: atJupyterlabApplicationLib.Anon_AppSettings
    /**
      * The collection of disabled extension patterns and matched extensions.
      */
    val disabled: atJupyterlabApplicationLib.Anon_Matches
    /**
      * Whether files are cached on the server.
      */
    val filesCached: scala.Boolean
    /**
      * The mime renderer extensions.
      */
    val mimeExtensions: js.Array[
        atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IExtensionModule
      ]
    /**
      * The name of the JupyterLab application.
      */
    val name: java.lang.String
    /**
      * The namespace/prefix plugins may use to denote their origin.
      */
    val namespace: java.lang.String
    /**
      * The urls used by the application.
      */
    val urls: atJupyterlabApplicationLib.Anon_Base
    /**
      * The version of the JupyterLab application.
      */
    val version: java.lang.String
    /**
      * The name of the current workspace.
      */
    val workspace: java.lang.String
  }
  
  /**
    * The options used to initialize a JupyterLab object.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @jupyterlab/application.@jupyterlab/application.JupyterLab.IInfo ]:? @jupyterlab/application.@jupyterlab/application.JupyterLab.IInfo[P]} */ trait IOptions extends js.Object {
    /**
      * The command linker used by the application.
      */
    var commandLinker: js.UndefOr[atJupyterlabApputilsLib.atJupyterlabApputilsMod.CommandLinker] = js.undefined
    /**
      * The document registry instance used by the application.
      */
    var docRegistry: js.UndefOr[atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.DocumentRegistry] = js.undefined
    /**
      * The service manager used by the application.
      */
    var serviceManager: js.UndefOr[atJupyterlabServicesLib.atJupyterlabServicesMod.ServiceManager] = js.undefined
  }
  
  /**
    * The interface for a module that exports a plugin or plugins as
    * the default value.
    */
  trait IPluginModule extends js.Object {
    /**
      * The default export.
      */
    var default: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabPlugin[_] | js.Array[atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabPlugin[_]]
  }
  
  /**
    * The default application info.
    */
  val defaultInfo: IInfo = js.native
}

