package typings.inversifyExpressUtils

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyExpressUtils.anon.Controller
import typings.inversifyExpressUtils.anon.ControllerMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugMod {
  
  @JSImport("inversify-express-utils/dts/debug", "getRawMetadata")
  @js.native
  def getRawMetadata(container: Container): js.Array[ControllerMetadata] = js.native
  
  @JSImport("inversify-express-utils/dts/debug", "getRouteInfo")
  @js.native
  def getRouteInfo(container: Container): js.Array[Controller] = js.native
}
