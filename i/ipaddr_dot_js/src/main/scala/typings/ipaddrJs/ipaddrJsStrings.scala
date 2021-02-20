package typings.ipaddrJs

import typings.ipaddrJs.mod.IPv4Range
import typings.ipaddrJs.mod.IPv6Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ipaddrJsStrings {
  
  @js.native
  sealed trait `6to4` extends IPv6Range
  @scala.inline
  def `6to4`: `6to4` = "6to4".asInstanceOf[`6to4`]
  
  @js.native
  sealed trait broadcast extends IPv4Range
  @scala.inline
  def broadcast: broadcast = "broadcast".asInstanceOf[broadcast]
  
  @js.native
  sealed trait carrierGradeNat extends IPv4Range
  @scala.inline
  def carrierGradeNat: carrierGradeNat = "carrierGradeNat".asInstanceOf[carrierGradeNat]
  
  @js.native
  sealed trait ipv4 extends StObject
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  
  @js.native
  sealed trait ipv4Mapped extends IPv6Range
  @scala.inline
  def ipv4Mapped: ipv4Mapped = "ipv4Mapped".asInstanceOf[ipv4Mapped]
  
  @js.native
  sealed trait ipv6 extends StObject
  @scala.inline
  def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  
  @js.native
  sealed trait linkLocal
    extends IPv4Range
       with IPv6Range
  @scala.inline
  def linkLocal: linkLocal = "linkLocal".asInstanceOf[linkLocal]
  
  @js.native
  sealed trait loopback
    extends IPv4Range
       with IPv6Range
  @scala.inline
  def loopback: loopback = "loopback".asInstanceOf[loopback]
  
  @js.native
  sealed trait multicast
    extends IPv4Range
       with IPv6Range
  @scala.inline
  def multicast: multicast = "multicast".asInstanceOf[multicast]
  
  @js.native
  sealed trait `private` extends IPv4Range
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait reserved
    extends IPv4Range
       with IPv6Range
  @scala.inline
  def reserved: reserved = "reserved".asInstanceOf[reserved]
  
  @js.native
  sealed trait rfc6052 extends IPv6Range
  @scala.inline
  def rfc6052: rfc6052 = "rfc6052".asInstanceOf[rfc6052]
  
  @js.native
  sealed trait rfc6145 extends IPv6Range
  @scala.inline
  def rfc6145: rfc6145 = "rfc6145".asInstanceOf[rfc6145]
  
  @js.native
  sealed trait teredo extends IPv6Range
  @scala.inline
  def teredo: teredo = "teredo".asInstanceOf[teredo]
  
  @js.native
  sealed trait unicast
    extends IPv4Range
       with IPv6Range
  @scala.inline
  def unicast: unicast = "unicast".asInstanceOf[unicast]
  
  @js.native
  sealed trait uniqueLocal extends IPv6Range
  @scala.inline
  def uniqueLocal: uniqueLocal = "uniqueLocal".asInstanceOf[uniqueLocal]
  
  @js.native
  sealed trait unspecified
    extends IPv4Range
       with IPv6Range
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
}
