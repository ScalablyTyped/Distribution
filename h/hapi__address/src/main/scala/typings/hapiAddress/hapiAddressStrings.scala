package typings.hapiAddress

import typings.hapiAddress.mod.ip.Cidr
import typings.hapiAddress.mod.ip.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hapiAddressStrings {
  @js.native
  sealed trait forbidden extends Cidr
  
  @js.native
  sealed trait ipv4 extends Version
  
  @js.native
  sealed trait ipv6 extends Version
  
  @js.native
  sealed trait ipvfuture extends Version
  
  @js.native
  sealed trait optional extends Cidr
  
  @js.native
  sealed trait required extends Cidr
  
  @scala.inline
  def forbidden: forbidden = "forbidden".asInstanceOf[forbidden]
  @scala.inline
  def ipv4: ipv4 = "ipv4".asInstanceOf[ipv4]
  @scala.inline
  def ipv6: ipv6 = "ipv6".asInstanceOf[ipv6]
  @scala.inline
  def ipvfuture: ipvfuture = "ipvfuture".asInstanceOf[ipvfuture]
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  @scala.inline
  def required: required = "required".asInstanceOf[required]
}

