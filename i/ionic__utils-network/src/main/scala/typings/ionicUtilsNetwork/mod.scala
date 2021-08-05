package typings.ionicUtilsNetwork

import typings.ionicUtilsNetwork.anon.Device
import typings.ionicUtilsNetwork.anon.Timeout
import typings.node.osMod.NetworkInterfaceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-network", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/utils-network", "DEFAULT_ADDRESSES")
  @js.native
  val DEFAULT_ADDRESSES: js.Array[String] = js.native
  
  inline def findClosestOpenPort(port: Double): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findClosestOpenPort")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  inline def getExternalIPv4Interfaces(): js.Array[NetworkInterface] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExternalIPv4Interfaces")().asInstanceOf[js.Array[NetworkInterface]]
  
  inline def isHostConnectable(host: String, port: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHostConnectable")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isHostConnectable(host: String, port: Double, hasTimeout: Timeout): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isHostConnectable")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], hasTimeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def isPortAvailable(port: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPortAvailable")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isPortAvailableForHost(host: String, port: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isPortAvailableForHost")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  type NetworkInterface = Device & NetworkInterfaceInfo
}
