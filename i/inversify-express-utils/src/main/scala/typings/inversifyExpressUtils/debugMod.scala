package typings.inversifyExpressUtils

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyExpressUtils.anon.Controller
import typings.inversifyExpressUtils.anon.ControllerMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/debug", JSImport.Namespace)
@js.native
object debugMod extends js.Object {
  def getRawMetadata(container: Container): js.Array[ControllerMetadata] = js.native
  def getRouteInfo(container: Container): js.Array[Controller] = js.native
}

