package typings.jupyterlabApplication.statusMod

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Returns a signal for when application changes its busy status.
    */
  @JSName("busySignal")
  def busySignal_MLabStatus: ISignal[JupyterFrontEnd[IShell], Boolean] = js.native
  
  /**
    * Returns a signal for when application changes its dirty status.
    */
  @JSName("dirtySignal")
  def dirtySignal_MLabStatus: ISignal[JupyterFrontEnd[IShell], Boolean] = js.native
  
  /**
    * Whether the application is busy.
    */
  @JSName("isBusy")
  def isBusy_MLabStatus: Boolean = js.native
  
  /**
    * Whether the application is dirty.
    */
  @JSName("isDirty")
  def isDirty_MLabStatus: Boolean = js.native
}
