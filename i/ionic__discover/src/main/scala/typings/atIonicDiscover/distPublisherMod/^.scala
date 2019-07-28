package typings.atIonicDiscover.distPublisherMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.osMod.NetworkInterfaceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover/dist/publisher", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeBroadcastAddress(address: String, netmask: String): String = js.native
  def newSilentPublisher(namespace: String, name: String, port: Double): Publisher = js.native
  def prepareInterfaces(interfaces: StringDictionary[js.Array[NetworkInterfaceInfo]]): js.Array[Interface] = js.native
}

