package typings.atJupyterlabApplication.libStatusMod

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd
import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEndNs.IShell
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabStatus extends js.Object {
  /**
    * A signal for when application changes its busy status.
    */
  val busySignal: ISignal[JupyterFrontEnd[IShell], Boolean]
  /**
    * A signal for when application changes its dirty status.
    */
  val dirtySignal: ISignal[JupyterFrontEnd[IShell], Boolean]
  /**
    * Whether the application is busy.
    */
  val isBusy: Boolean
  /**
    * Whether the application is dirty.
    */
  val isDirty: Boolean
  /**
    * Set the application state to busy.
    *
    * @returns A disposable used to clear the busy state for the caller.
    */
  def setBusy(): IDisposable
  /**
    * Set the application state to dirty.
    *
    * @returns A disposable used to clear the dirty state for the caller.
    */
  def setDirty(): IDisposable
}

object ILabStatus {
  @scala.inline
  def apply(
    busySignal: ISignal[JupyterFrontEnd[IShell], Boolean],
    dirtySignal: ISignal[JupyterFrontEnd[IShell], Boolean],
    isBusy: Boolean,
    isDirty: Boolean,
    setBusy: () => IDisposable,
    setDirty: () => IDisposable
  ): ILabStatus = {
    val __obj = js.Dynamic.literal(busySignal = busySignal, dirtySignal = dirtySignal, isBusy = isBusy, isDirty = isDirty, setBusy = js.Any.fromFunction0(setBusy), setDirty = js.Any.fromFunction0(setDirty))
  
    __obj.asInstanceOf[ILabStatus]
  }
}

