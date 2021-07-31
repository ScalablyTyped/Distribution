package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sca {
  
  @JSGlobal("KSR.sca")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def callInfoUpdate(update_mask: Double, uri_to: String, uri_from: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("call_info_update")(update_mask.asInstanceOf[js.Any], uri_to.asInstanceOf[js.Any], uri_from.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def callInfoUpdateDefault(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("call_info_update_default")().asInstanceOf[Double]
  
  @scala.inline
  def callInfoUpdateMask(umask: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("call_info_update_mask")(umask.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def callInfoUpdateTuri(umask: Double, sto: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("call_info_update_turi")(umask.asInstanceOf[js.Any], sto.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def handleSubscribe(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_subscribe")().asInstanceOf[Double]
}
