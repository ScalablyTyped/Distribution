package typings.inversifyExpressUtils

import typings.inversify.libInterfacesInterfacesMod.interfaces.Container
import typings.inversifyExpressUtils.libInterfacesMod.RawMetadata
import typings.inversifyExpressUtils.libInterfacesMod.RouteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDebugMod {
  
  @JSImport("inversify-express-utils/lib/debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRawMetadata(container: Container): js.Array[RawMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRawMetadata")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[RawMetadata]]
  
  inline def getRouteInfo(container: Container): js.Array[RouteInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteInfo")(container.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteInfo]]
}
