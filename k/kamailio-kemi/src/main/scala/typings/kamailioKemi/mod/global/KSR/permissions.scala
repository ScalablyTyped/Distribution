package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissions {
  
  @JSGlobal("KSR.permissions.allow_address")
  @js.native
  def allowAddress(addr_group: Double, ips: String, port: Double): Double = js.native
  
  @JSGlobal("KSR.permissions.allow_address_group")
  @js.native
  def allowAddressGroup(_addr: String, _port: Double): Double = js.native
  
  @JSGlobal("KSR.permissions.allow_source_address")
  @js.native
  def allowSourceAddress(addr_group: Double): Double = js.native
  
  @JSGlobal("KSR.permissions.allow_source_address_group")
  @js.native
  def allowSourceAddressGroup(): Double = js.native
}
