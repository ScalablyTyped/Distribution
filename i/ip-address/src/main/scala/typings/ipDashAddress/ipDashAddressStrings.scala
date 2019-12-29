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
  sealed trait `Multicast LeftparenthesisAll DHCP servers and relay agents in this siteRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisAll DHCP servers and relay agents on this linkRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisAll DHCP servers in this siteRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisAll DHCP servers on this linkRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisAll nodes on this interfaceRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisAll nodes on this linkRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisAll routers in this siteRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisAll routers on this interfaceRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisAll routers on this linkRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisEIGRP routersRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisMLDv2 reportsRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisOSPFv3 AllDR routersRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisOSPFv3 AllSPF routersRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisPIM routersRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesisRIP routersRightparenthesis` extends IPv6Type
  
  @js.native
  sealed trait `Multicast LeftparenthesismDNSv6Rightparenthesis` extends IPv6Type
  
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
  def `Multicast LeftparenthesisAll DHCP servers and relay agents in this siteRightparenthesis`: `Multicast LeftparenthesisAll DHCP servers and relay agents in this siteRightparenthesis` = "Multicast (All DHCP servers and relay agents in this site)".asInstanceOf[`Multicast LeftparenthesisAll DHCP servers and relay agents in this siteRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisAll DHCP servers and relay agents on this linkRightparenthesis`: `Multicast LeftparenthesisAll DHCP servers and relay agents on this linkRightparenthesis` = "Multicast (All DHCP servers and relay agents on this link)".asInstanceOf[`Multicast LeftparenthesisAll DHCP servers and relay agents on this linkRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisAll DHCP servers in this siteRightparenthesis`: `Multicast LeftparenthesisAll DHCP servers in this siteRightparenthesis` = "Multicast (All DHCP servers in this site)".asInstanceOf[`Multicast LeftparenthesisAll DHCP servers in this siteRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisAll DHCP servers on this linkRightparenthesis`: `Multicast LeftparenthesisAll DHCP servers on this linkRightparenthesis` = "Multicast (All DHCP servers on this link)".asInstanceOf[`Multicast LeftparenthesisAll DHCP servers on this linkRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisAll nodes on this interfaceRightparenthesis`: `Multicast LeftparenthesisAll nodes on this interfaceRightparenthesis` = "Multicast (All nodes on this interface)".asInstanceOf[`Multicast LeftparenthesisAll nodes on this interfaceRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisAll nodes on this linkRightparenthesis`: `Multicast LeftparenthesisAll nodes on this linkRightparenthesis` = "Multicast (All nodes on this link)".asInstanceOf[`Multicast LeftparenthesisAll nodes on this linkRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisAll routers in this siteRightparenthesis`: `Multicast LeftparenthesisAll routers in this siteRightparenthesis` = "Multicast (All routers in this site)".asInstanceOf[`Multicast LeftparenthesisAll routers in this siteRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisAll routers on this interfaceRightparenthesis`: `Multicast LeftparenthesisAll routers on this interfaceRightparenthesis` = "Multicast (All routers on this interface)".asInstanceOf[`Multicast LeftparenthesisAll routers on this interfaceRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisAll routers on this linkRightparenthesis`: `Multicast LeftparenthesisAll routers on this linkRightparenthesis` = "Multicast (All routers on this link)".asInstanceOf[`Multicast LeftparenthesisAll routers on this linkRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisEIGRP routersRightparenthesis`: `Multicast LeftparenthesisEIGRP routersRightparenthesis` = "Multicast (EIGRP routers)".asInstanceOf[`Multicast LeftparenthesisEIGRP routersRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisMLDv2 reportsRightparenthesis`: `Multicast LeftparenthesisMLDv2 reportsRightparenthesis` = "Multicast (MLDv2 reports)".asInstanceOf[`Multicast LeftparenthesisMLDv2 reportsRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisOSPFv3 AllDR routersRightparenthesis`: `Multicast LeftparenthesisOSPFv3 AllDR routersRightparenthesis` = "Multicast (OSPFv3 AllDR routers)".asInstanceOf[`Multicast LeftparenthesisOSPFv3 AllDR routersRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisOSPFv3 AllSPF routersRightparenthesis`: `Multicast LeftparenthesisOSPFv3 AllSPF routersRightparenthesis` = "Multicast (OSPFv3 AllSPF routers)".asInstanceOf[`Multicast LeftparenthesisOSPFv3 AllSPF routersRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisPIM routersRightparenthesis`: `Multicast LeftparenthesisPIM routersRightparenthesis` = "Multicast (PIM routers)".asInstanceOf[`Multicast LeftparenthesisPIM routersRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesisRIP routersRightparenthesis`: `Multicast LeftparenthesisRIP routersRightparenthesis` = "Multicast (RIP routers)".asInstanceOf[`Multicast LeftparenthesisRIP routersRightparenthesis`]
  @scala.inline
  def `Multicast LeftparenthesismDNSv6Rightparenthesis`: `Multicast LeftparenthesismDNSv6Rightparenthesis` = "Multicast (mDNSv6)".asInstanceOf[`Multicast LeftparenthesismDNSv6Rightparenthesis`]
  @scala.inline
  def `Organization local`: `Organization local` = "Organization local".asInstanceOf[`Organization local`]
  @scala.inline
  def Reserved: Reserved = "Reserved".asInstanceOf[Reserved]
  @scala.inline
  def `Site local`: `Site local` = "Site local".asInstanceOf[`Site local`]
  @scala.inline
  def Unspecified: Unspecified = "Unspecified".asInstanceOf[Unspecified]
}

