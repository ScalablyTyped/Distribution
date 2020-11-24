package typings.jupyterlabRunning.mod

import typings.jupyterlabApputils.mod.ReactWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/running", "RunningSessions")
@js.native
class RunningSessions protected () extends ReactWidget {
  /**
    * Construct a new running widget.
    */
  def this(managers: IRunningSessionManagers) = this()
  
  var managers: js.Any = js.native
}
