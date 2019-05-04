package typings
package atJupyterlabApplicationLib.atJupyterlabApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application", "JupyterLab")
@js.native
/**
  * Construct a new JupyterLab object.
  */
class JupyterLab ()
  extends atPhosphorApplicationLib.atPhosphorApplicationMod.Application[atJupyterlabApplicationLib.libShellMod.ApplicationShell] {
  def this(options: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabNs.IOptions) = this()
  var _busyCount: js.Any = js.native
  var _busySignal: js.Any = js.native
  var _contextMenuEvent: js.Any = js.native
  var _dirtyCount: js.Any = js.native
  var _dirtySignal: js.Any = js.native
  /**
    * Gets the hierarchy of html nodes that was under the cursor
    * when the most recent contextmenu event was issued
    */
  var _getContextMenuNodes: js.Any = js.native
  var _info: js.Any = js.native
  /**
    * Returns a signal for when application changes its busy status.
    */
  val busySignal: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[JupyterLab, scala.Boolean] = js.native
  /**
    * The command linker used by the application.
    */
  val commandLinker: atJupyterlabApputilsLib.atJupyterlabApputilsMod.CommandLinker = js.native
  /**
    * Returns a signal for when application changes its dirty status.
    */
  val dirtySignal: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[JupyterLab, scala.Boolean] = js.native
  /**
    * The document registry instance used by the application.
    */
  val docRegistry: atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.DocumentRegistry = js.native
  /**
    * The information about the application.
    */
  val info: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabNs.IInfo = js.native
  /**
    * Whether the application is busy.
    */
  val isBusy: scala.Boolean = js.native
  /**
    * Whether the application is dirty.
    */
  val isDirty: scala.Boolean = js.native
  /**
    * A list of all errors encountered when registering plugins.
    */
  val registerPluginErrors: js.Array[stdLib.Error] = js.native
  /**
    * Promise that resolves when state is first restored, returning layout description.
    *
    * #### Notes
    * This is just a reference to `shell.restored`.
    */
  val restored: js.Promise[atJupyterlabApplicationLib.libShellMod.ApplicationShellNs.ILayout] = js.native
  /**
    * The service manager used by the application.
    */
  val serviceManager: atJupyterlabServicesLib.atJupyterlabServicesMod.ServiceManager = js.native
  /**
    * Walks up the DOM hierarchy of the target of the active `contextmenu`
    * event, testing the nodes for a user-supplied funcion. This can
    * be used to find a node on which to operate, given a context menu click.
    *
    * @param test - a function that takes an `HTMLElement` and returns a
    *   boolean for whether it is the element the requester is seeking.
    *
    * @returns an HTMLElement or undefined, if none is found.
    */
  def contextMenuFirst(test: js.Function1[/* node */ stdLib.HTMLElement, scala.Boolean]): js.UndefOr[stdLib.HTMLElement] = js.native
  /**
    * Register plugins from a plugin module.
    *
    * @param mod - The plugin module to register.
    */
  def registerPluginModule(mod: atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabNs.IPluginModule): scala.Unit = js.native
  /**
    * Register the plugins from multiple plugin modules.
    *
    * @param mods - The plugin modules to register.
    */
  def registerPluginModules(mods: js.Array[atJupyterlabApplicationLib.atJupyterlabApplicationMod.JupyterLabNs.IPluginModule]): scala.Unit = js.native
  /**
    * Set the application state to busy.
    *
    * @returns A disposable used to clear the busy state for the caller.
    */
  def setBusy(): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Set the application state to dirty.
    *
    * @returns A disposable used to clear the dirty state for the caller.
    */
  def setDirty(): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
}

