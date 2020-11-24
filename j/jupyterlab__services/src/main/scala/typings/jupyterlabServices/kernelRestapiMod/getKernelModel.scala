package typings.jupyterlabServices.kernelRestapiMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/kernel/restapi", "getKernelModel")
@js.native
object getKernelModel extends js.Object {
  
  def apply(id: String): js.Promise[js.UndefOr[IModel]] = js.native
  def apply(id: String, settings: ISettings): js.Promise[js.UndefOr[IModel]] = js.native
}
