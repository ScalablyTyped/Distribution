package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msrp {
  
  @JSGlobal("KSR.msrp")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cmapLookup(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cmap_lookup")().asInstanceOf[Double]
  
  @scala.inline
  def cmapSave(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cmap_save")().asInstanceOf[Double]
  
  @scala.inline
  def isReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_reply")().asInstanceOf[Double]
  
  @scala.inline
  def isRequest(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_request")().asInstanceOf[Double]
  
  @scala.inline
  def relay(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("relay")().asInstanceOf[Double]
  
  @scala.inline
  def relayFlags(rtflags: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("relay_flags")(rtflags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def reply(rcode: String, rtext: String, rhdrs: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(rcode.asInstanceOf[js.Any], rtext.asInstanceOf[js.Any], rhdrs.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def replyFlags(rtflags: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("reply_flags")(rtflags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def setDst(rtaddr: String, rfsock: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("set_dst")(rtaddr.asInstanceOf[js.Any], rfsock.asInstanceOf[js.Any])).asInstanceOf[Double]
}
