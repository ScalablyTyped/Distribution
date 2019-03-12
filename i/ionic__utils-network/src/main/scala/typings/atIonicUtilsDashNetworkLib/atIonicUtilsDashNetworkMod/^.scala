package typings
package atIonicUtilsDashNetworkLib.atIonicUtilsDashNetworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-network", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_ADDRESSES: js.Array[java.lang.String] = js.native
  def findClosestOpenPort(port: scala.Double): js.Promise[scala.Double] = js.native
  def getExternalIPv4Interfaces(): js.Array[NetworkInterface] = js.native
  def isHostConnectable(host: java.lang.String, port: scala.Double): js.Promise[scala.Boolean] = js.native
  def isHostConnectable(host: java.lang.String, port: scala.Double, hasTimeout: atIonicUtilsDashNetworkLib.Anon_Timeout): js.Promise[scala.Boolean] = js.native
  def isPortAvailable(port: scala.Double): js.Promise[scala.Boolean] = js.native
  def isPortAvailableForHost(host: java.lang.String, port: scala.Double): js.Promise[scala.Boolean] = js.native
}

