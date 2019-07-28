package typings.ipDashAddress

import typings.ipDashAddress.ipDashAddressMod.IPv6Scope
import typings.ipDashAddress.ipDashAddressMod.IPv6Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ipDashAddressStrings {
  @js.native
  sealed trait `Admin local` extends IPv6Scope
  
  @js.native
  sealed trait Global extends IPv6Scope
  
  @js.native
  sealed trait `Interface local` extends IPv6Scope
  
  @js.native
  sealed trait `Link local` extends IPv6Scope
  
  @js.native
  sealed trait `Link-local unicast` extends IPv6Type
  
  @js.native
  sealed trait Loopback extends IPv6Type
  
  @js.native
  sealed trait Multicast extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All DHCP servers and relay agents in this site)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All DHCP servers and relay agents on this link)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All DHCP servers in this site)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All DHCP servers on this link)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All nodes on this interface)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All nodes on this link)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All routers in this site)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All routers on this interface)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (All routers on this link)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (EIGRP routers)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (MLDv2 reports)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (OSPFv3 AllDR routers)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (OSPFv3 AllSPF routers)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (PIM routers)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (RIP routers)` extends IPv6Type
  
  @js.native
  sealed trait `Multicast (mDNSv6)` extends IPv6Type
  
  @js.native
  sealed trait `Organization local` extends IPv6Scope
  
  @js.native
  sealed trait Reserved extends IPv6Scope
  
  @js.native
  sealed trait `Site local` extends IPv6Scope
  
  @js.native
  sealed trait Unspecified extends IPv6Type
  
  @scala.inline
  def `Admin local`: `Admin local` = "Admin local".asInstanceOf[`Admin local`]
  @scala.inline
  def Global: Global = "Global".asInstanceOf[Global]
  @scala.inline
  def `Interface local`: `Interface local` = "Interface local".asInstanceOf[`Interface local`]
  @scala.inline
  def `Link local`: `Link local` = "Link local".asInstanceOf[`Link local`]
  @scala.inline
  def `Link-local unicast`: `Link-local unicast` = "Link-local unicast".asInstanceOf[`Link-local unicast`]
  @scala.inline
  def Loopback: Loopback = "Loopback".asInstanceOf[Loopback]
  @scala.inline
  def Multicast: Multicast = "Multicast".asInstanceOf[Multicast]
  @scala.inline
  def `Multicast (All DHCP servers and relay agents in this site)`: `Multicast (All DHCP servers and relay agents in this site)` = "Multicast (All DHCP servers and relay agents in this site)".asInstanceOf[`Multicast (All DHCP servers and relay agents in this site)`]
  @scala.inline
  def `Multicast (All DHCP servers and relay agents on this link)`: `Multicast (All DHCP servers and relay agents on this link)` = "Multicast (All DHCP servers and relay agents on this link)".asInstanceOf[`Multicast (All DHCP servers and relay agents on this link)`]
  @scala.inline
  def `Multicast (All DHCP servers in this site)`: `Multicast (All DHCP servers in this site)` = "Multicast (All DHCP servers in this site)".asInstanceOf[`Multicast (All DHCP servers in this site)`]
  @scala.inline
  def `Multicast (All DHCP servers on this link)`: `Multicast (All DHCP servers on this link)` = "Multicast (All DHCP servers on this link)".asInstanceOf[`Multicast (All DHCP servers on this link)`]
  @scala.inline
  def `Multicast (All nodes on this interface)`: `Multicast (All nodes on this interface)` = "Multicast (All nodes on this interface)".asInstanceOf[`Multicast (All nodes on this interface)`]
  @scala.inline
  def `Multicast (All nodes on this link)`: `Multicast (All nodes on this link)` = "Multicast (All nodes on this link)".asInstanceOf[`Multicast (All nodes on this link)`]
  @scala.inline
  def `Multicast (All routers in this site)`: `Multicast (All routers in this site)` = "Multicast (All routers in this site)".asInstanceOf[`Multicast (All routers in this site)`]
  @scala.inline
  def `Multicast (All routers on this interface)`: `Multicast (All routers on this interface)` = "Multicast (All routers on this interface)".asInstanceOf[`Multicast (All routers on this interface)`]
  @scala.inline
  def `Multicast (All routers on this link)`: `Multicast (All routers on this link)` = "Multicast (All routers on this link)".asInstanceOf[`Multicast (All routers on this link)`]
  @scala.inline
  def `Multicast (EIGRP routers)`: `Multicast (EIGRP routers)` = "Multicast (EIGRP routers)".asInstanceOf[`Multicast (EIGRP routers)`]
  @scala.inline
  def `Multicast (MLDv2 reports)`: `Multicast (MLDv2 reports)` = "Multicast (MLDv2 reports)".asInstanceOf[`Multicast (MLDv2 reports)`]
  @scala.inline
  def `Multicast (OSPFv3 AllDR routers)`: `Multicast (OSPFv3 AllDR routers)` = "Multicast (OSPFv3 AllDR routers)".asInstanceOf[`Multicast (OSPFv3 AllDR routers)`]
  @scala.inline
  def `Multicast (OSPFv3 AllSPF routers)`: `Multicast (OSPFv3 AllSPF routers)` = "Multicast (OSPFv3 AllSPF routers)".asInstanceOf[`Multicast (OSPFv3 AllSPF routers)`]
  @scala.inline
  def `Multicast (PIM routers)`: `Multicast (PIM routers)` = "Multicast (PIM routers)".asInstanceOf[`Multicast (PIM routers)`]
  @scala.inline
  def `Multicast (RIP routers)`: `Multicast (RIP routers)` = "Multicast (RIP routers)".asInstanceOf[`Multicast (RIP routers)`]
  @scala.inline
  def `Multicast (mDNSv6)`: `Multicast (mDNSv6)` = "Multicast (mDNSv6)".asInstanceOf[`Multicast (mDNSv6)`]
  @scala.inline
  def `Organization local`: `Organization local` = "Organization local".asInstanceOf[`Organization local`]
  @scala.inline
  def Reserved: Reserved = "Reserved".asInstanceOf[Reserved]
  @scala.inline
  def `Site local`: `Site local` = "Site local".asInstanceOf[`Site local`]
  @scala.inline
  def Unspecified: Unspecified = "Unspecified".asInstanceOf[Unspecified]
}

