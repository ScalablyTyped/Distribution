package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissions {
  
  @JSGlobal("KSR.permissions")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def allowAddress(addr_group: Double, ips: String, port: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("allow_address")(addr_group.asInstanceOf[js.Any], ips.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def allowAddressGroup(_addr: String, _port: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("allow_address_group")(_addr.asInstanceOf[js.Any], _port.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def allowSourceAddress(addr_group: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("allow_source_address")(addr_group.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def allowSourceAddressGroup(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("allow_source_address_group")().asInstanceOf[Double]
}
