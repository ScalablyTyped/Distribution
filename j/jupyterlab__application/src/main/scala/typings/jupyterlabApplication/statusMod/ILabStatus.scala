package typings.jupyterlabApplication.statusMod

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILabStatus extends js.Object {
  
  /**
    * A signal for when application changes its busy status.
    */
  val busySignal: ISignal[JupyterFrontEnd[IShell], Boolean] = js.native
  
  /**
    * A signal for when application changes its dirty status.
    */
  val dirtySignal: ISignal[JupyterFrontEnd[IShell], Boolean] = js.native
  
  /**
    * Whether the application is busy.
    */
  val isBusy: Boolean = js.native
  
  /**
    * Whether the application is dirty.
    */
  val isDirty: Boolean = js.native
  
  /**
    * Set the application state to busy.
    *
    * @returns A disposable used to clear the busy state for the caller.
    */
  def setBusy(): IDisposable = js.native
  
  /**
    * Set the application state to dirty.
    *
    * @returns A disposable used to clear the dirty state for the caller.
    */
  def setDirty(): IDisposable = js.native
}
@JSImport("@jupyterlab/application/lib/status", "ILabStatus")
@js.native
object ILabStatus extends TopLevel[Token[ILabStatus]]
