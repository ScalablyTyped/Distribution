package typings
package inversifyDashExpressDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/utils", JSImport.Namespace)
@js.native
object dtsUtilsMod extends js.Object {
  def cleanUpMetadata(): scala.Unit = js.native
  def getControllerMetadata(constructor: js.Any): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerMetadata = js.native
  def getControllerMethodMetadata(constructor: js.Any): js.Array[
    inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerMethodMetadata
  ] = js.native
  def getControllerParameterMetadata(constructor: js.Any): inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.ControllerParameterMetadata = js.native
  def getControllersFromContainer(
    container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container,
    forceControllers: scala.Boolean
  ): js.Array[inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.Controller] = js.native
  def getControllersFromMetadata(): js.Array[_] = js.native
  def instanceOfIHttpActionResult(value: js.Any): /* is IHttpActionResult */scala.Boolean = js.native
}

