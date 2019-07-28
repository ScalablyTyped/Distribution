package typings.inversifyDashExpressDashUtils

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Container
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.Controller
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.ControllerMetadata
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.ControllerMethodMetadata
import typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfacesNs.ControllerParameterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/utils", JSImport.Namespace)
@js.native
object dtsUtilsMod extends js.Object {
  def cleanUpMetadata(): Unit = js.native
  def getControllerMetadata(constructor: js.Any): ControllerMetadata = js.native
  def getControllerMethodMetadata(constructor: js.Any): js.Array[ControllerMethodMetadata] = js.native
  def getControllerParameterMetadata(constructor: js.Any): ControllerParameterMetadata = js.native
  def getControllersFromContainer(container: Container, forceControllers: Boolean): js.Array[Controller] = js.native
  def getControllersFromMetadata(): js.Array[_] = js.native
  def instanceOfIHttpActionResult(value: js.Any): /* is inversify-express-utils.inversify-express-utils/dts/interfaces.interfaces.IHttpActionResult */ Boolean = js.native
}

