package typings.jupyterlabServices.terminalRestapiMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/terminal/restapi", "listRunning")
@js.native
object listRunning extends js.Object {
  
  def apply(): js.Promise[js.Array[IModel]] = js.native
  def apply(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
}
