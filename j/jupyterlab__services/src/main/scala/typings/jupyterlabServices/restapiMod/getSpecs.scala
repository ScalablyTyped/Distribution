package typings.jupyterlabServices.restapiMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/kernelspec/restapi", "getSpecs")
@js.native
object getSpecs extends js.Object {
  
  def apply(): js.Promise[ISpecModels] = js.native
  def apply(settings: ISettings): js.Promise[ISpecModels] = js.native
}
