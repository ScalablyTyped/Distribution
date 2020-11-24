package typings.jupyterlabServices.mod

import typings.jupyterlabServices.restapiMod.ISpecModels
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "KernelSpecAPI")
@js.native
object KernelSpecAPI extends js.Object {
  
  def getSpecs(): js.Promise[ISpecModels] = js.native
  def getSpecs(settings: ISettings): js.Promise[ISpecModels] = js.native
}
