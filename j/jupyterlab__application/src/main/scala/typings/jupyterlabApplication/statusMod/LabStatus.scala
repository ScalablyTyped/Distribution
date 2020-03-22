package typings.jupyterlabApplication.statusMod

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/status", "LabStatus")
@js.native
class LabStatus protected () extends ILabStatus {
  /**
    * Construct a new  status object.
    */
  def this(app: JupyterFrontEnd[IShell]) = this()
  var _busyCount: js.Any = js.native
  var _busySignal: js.Any = js.native
  var _dirtyCount: js.Any = js.native
  var _dirtySignal: js.Any = js.native
  /**
    * A signal for when application changes its busy status.
    */
  /* CompleteClass */
  override val busySignal: ISignal[JupyterFrontEnd[IShell], Boolean] = js.native
  /**
    * A signal for when application changes its dirty status.
    */
  /* CompleteClass */
  override val dirtySignal: ISignal[JupyterFrontEnd[IShell], Boolean] = js.native
  /**
    * Whether the application is busy.
    */
  /* CompleteClass */
  override val isBusy: Boolean = js.native
  /**
    * Whether the application is dirty.
    */
  /* CompleteClass */
  override val isDirty: Boolean = js.native
  /**
    * Returns a signal for when application changes its busy status.
    */
  @JSName("busySignal")
  def busySignal_MLabStatus(): ISignal[JupyterFrontEnd[IShell], Boolean] = js.native
  /**
    * Returns a signal for when application changes its dirty status.
    */
  @JSName("dirtySignal")
  def dirtySignal_MLabStatus(): ISignal[JupyterFrontEnd[IShell], Boolean] = js.native
  /**
    * Whether the application is busy.
    */
  @JSName("isBusy")
  def isBusy_MLabStatus(): Boolean = js.native
  /**
    * Whether the application is dirty.
    */
  @JSName("isDirty")
  def isDirty_MLabStatus(): Boolean = js.native
  /**
    * Set the application state to busy.
    *
    * @returns A disposable used to clear the busy state for the caller.
    */
  /* CompleteClass */
  override def setBusy(): IDisposable = js.native
  /**
    * Set the application state to dirty.
    *
    * @returns A disposable used to clear the dirty state for the caller.
    */
  /* CompleteClass */
  override def setDirty(): IDisposable = js.native
}

