package typings.inversifyExpressUtils

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyExpressUtils.anon.Controller
import typings.inversifyExpressUtils.anon.ControllerMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugMod {
  
  @JSImport("inversify-express-utils/dts/debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRawMetadata(container: Container): js.Array[ControllerMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawMetadata")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[ControllerMetadata]]
  
  @scala.inline
  def getRouteInfo(container: Container): js.Array[Controller] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteInfo")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[Controller]]
}
