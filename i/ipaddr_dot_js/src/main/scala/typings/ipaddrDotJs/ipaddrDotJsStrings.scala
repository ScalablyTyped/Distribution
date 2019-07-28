package typings.ipaddrDotJs

import typings.ipaddrDotJs.ipaddrDotJsMod.IPv4Range
import typings.ipaddrDotJs.ipaddrDotJsMod.IPv6Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ipaddrDotJsStrings {
  @js.native
  sealed trait `6to4` extends IPv6Range
  
  @js.native
  sealed trait broadcast extends IPv4Range
  
  @js.native
  sealed trait carrierGradeNat extends IPv4Range
  
  @js.native
  sealed trait ipv4 extends js.Object
  
  @js.native
  sealed trait ipv4Mapped extends IPv6Range
  
  @js.native
  sealed trait ipv6 extends js.Object
  
  @js.native
  sealed trait linkLocal
    extends IPv4Range
       with IPv6Range
  
  @js.native
  sealed trait loopback
    extends IPv4Range
       with IPv6Range
  
  @js.native
  sealed trait multicast
    extends IPv4Range
       with IPv6Range
  
  @js.native
  sealed trait `private` extends IPv4Range
  
  @js.native
  sealed trait reserved
    extends IPv4Range
       with IPv6Range
  
  @js.native
  sealed trait rfc6052 extends IPv6Range
  
  @js.native
  sealed trait rfc6145 extends IPv6Range
  
  @js.native
  sealed trait teredo extends IPv6Range
  
  @js.native
  sealed trait unicast
    extends IPv4Range
       with IPv6Range
  
  @js.native
  sealed trait uniqueLocal extends IPv6Range
  
  @js.native
  sealed trait unspecified
    extends IPv4Range
       with IPv6Range
  
  @scala.inline
  def `6to4`: `6to4` = "6to4".asInstanceOf[`6to4`]
  @scala.inline
  def broadcast: broadcast = "broadcast".asInstanceOf[broadcast]
  @scala.inline
  def carrierGradeNat: carrierGradeNat = "carrierGradeNat".asInstanceOf[carrierGradeNat]
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  @scala.inline
  def ipv4Mapped: ipv4Mapped = "ipv4Mapped".asInstanceOf[ipv4Mapped]
  @scala.inline
  def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  @scala.inline
  def linkLocal: linkLocal = "linkLocal".asInstanceOf[linkLocal]
  @scala.inline
  def loopback: loopback = "loopback".asInstanceOf[loopback]
  @scala.inline
  def multicast: multicast = "multicast".asInstanceOf[multicast]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def reserved: reserved = "reserved".asInstanceOf[reserved]
  @scala.inline
  def rfc6052: rfc6052 = "rfc6052".asInstanceOf[rfc6052]
  @scala.inline
  def rfc6145: rfc6145 = "rfc6145".asInstanceOf[rfc6145]
  @scala.inline
  def teredo: teredo = "teredo".asInstanceOf[teredo]
  @scala.inline
  def unicast: unicast = "unicast".asInstanceOf[unicast]
  @scala.inline
  def uniqueLocal: uniqueLocal = "uniqueLocal".asInstanceOf[uniqueLocal]
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
}

