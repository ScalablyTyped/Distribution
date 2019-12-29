package typings.atIonicUtilsDashNetwork

import typings.node.osMod.NetworkInterfaceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-network", JSImport.Namespace)
@js.native
object atIonicUtilsDashNetworkMod extends js.Object {
  val DEFAULT_ADDRESSES: js.Array[String] = js.native
  def findClosestOpenPort(port: Double): js.Promise[Double] = js.native
  def getExternalIPv4Interfaces(): js.Array[NetworkInterface] = js.native
  def isHostConnectable(host: String, port: Double): js.Promise[Boolean] = js.native
  def isHostConnectable(host: String, port: Double, hasTimeout: Anon_Timeout): js.Promise[Boolean] = js.native
  def isPortAvailable(port: Double): js.Promise[Boolean] = js.native
  def isPortAvailableForHost(host: String, port: Double): js.Promise[Boolean] = js.native
  type NetworkInterface = Anon_Device with NetworkInterfaceInfo
}

