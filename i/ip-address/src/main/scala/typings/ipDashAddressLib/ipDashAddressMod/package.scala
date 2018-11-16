package typings
package ipDashAddressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ipDashAddressMod {
  type IPv6Scope = ipDashAddressLib.ipDashAddressLibStrings.Reserved | (ipDashAddressLib.ipDashAddressLibStrings.`Interface local`) | (ipDashAddressLib.ipDashAddressLibStrings.`Link local`) | (ipDashAddressLib.ipDashAddressLibStrings.`Admin local`) | (ipDashAddressLib.ipDashAddressLibStrings.`Site local`) | (ipDashAddressLib.ipDashAddressLibStrings.`Organization local`) | ipDashAddressLib.ipDashAddressLibStrings.Global
  type IPv6Type = (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All nodes on this interface)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All routers on this interface)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All nodes on this link)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All routers on this link)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All routers in this site)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (OSPFv3 AllSPF routers)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (OSPFv3 AllDR routers)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (RIP routers)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (EIGRP routers)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (PIM routers)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (MLDv2 reports)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (mDNSv6)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All DHCP servers and relay agents on this link)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All DHCP servers and relay agents in this site)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All DHCP servers on this link)`) | (ipDashAddressLib.ipDashAddressLibStrings.`Multicast (All DHCP servers in this site)`) | ipDashAddressLib.ipDashAddressLibStrings.Unspecified | ipDashAddressLib.ipDashAddressLibStrings.Loopback | ipDashAddressLib.ipDashAddressLibStrings.Multicast | (ipDashAddressLib.ipDashAddressLibStrings.`Link-local unicast`)
}
