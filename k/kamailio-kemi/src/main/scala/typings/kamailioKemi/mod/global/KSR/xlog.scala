package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xlog {
  
  @JSGlobal("KSR.xlog")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def xalert(lmsg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("xalert")(lmsg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def xcrit(lmsg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("xcrit")(lmsg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def xdbg(lmsg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("xdbg")(lmsg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def xerr(lmsg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("xerr")(lmsg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def xinfo(lmsg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("xinfo")(lmsg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def xlog(slevel: String, lmsg: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xlog")(slevel.asInstanceOf[js.Any], lmsg.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def xnotice(lmsg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("xnotice")(lmsg.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def xwarn(lmsg: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("xwarn")(lmsg.asInstanceOf[js.Any]).asInstanceOf[Double]
}
