package typings.ionicUtilsNetwork

import typings.ionicUtilsNetwork.anon.Device
import typings.ionicUtilsNetwork.anon.Timeout
import typings.node.osMod.NetworkInterfaceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-network", "DEFAULT_ADDRESSES")
  @js.native
  val DEFAULT_ADDRESSES: js.Array[String] = js.native
  
  @JSImport("@ionic/utils-network", "findClosestOpenPort")
  @js.native
  def findClosestOpenPort(port: Double): js.Promise[Double] = js.native
  
  @JSImport("@ionic/utils-network", "getExternalIPv4Interfaces")
  @js.native
  def getExternalIPv4Interfaces(): js.Array[NetworkInterface] = js.native
  
  @JSImport("@ionic/utils-network", "isHostConnectable")
  @js.native
  def isHostConnectable(host: String, port: Double): js.Promise[Boolean] = js.native
  @JSImport("@ionic/utils-network", "isHostConnectable")
  @js.native
  def isHostConnectable(host: String, port: Double, hasTimeout: Timeout): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/utils-network", "isPortAvailable")
  @js.native
  def isPortAvailable(port: Double): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/utils-network", "isPortAvailableForHost")
  @js.native
  def isPortAvailableForHost(host: String, port: Double): js.Promise[Boolean] = js.native
  
  type NetworkInterface = Device with NetworkInterfaceInfo
}
