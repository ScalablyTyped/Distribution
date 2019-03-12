package typings
package atIonicDiscoverLib.distPublisherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/discover/dist/publisher", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeBroadcastAddress(address: java.lang.String, netmask: java.lang.String): java.lang.String = js.native
  def newSilentPublisher(namespace: java.lang.String, name: java.lang.String, port: scala.Double): Publisher = js.native
  def prepareInterfaces(
    interfaces: org.scalablytyped.runtime.StringDictionary[js.Array[nodeLib.osMod.NetworkInterfaceInfo]]
  ): js.Array[Interface] = js.native
}

