package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscRadius {
  
  @JSGlobal("KSR.misc_radius")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def doesUriExist(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("does_uri_exist")().asInstanceOf[Double]
  
  @scala.inline
  def doesUriExistUval(suri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("does_uri_exist_uval")(suri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def doesUriUserExist(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("does_uri_user_exist")().asInstanceOf[Double]
  
  @scala.inline
  def doesUriUserExistUval(user: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("does_uri_user_exist_uval")(user.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isUserIn(user: String, group: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("is_user_in")(user.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def loadCalleeAvps(user: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("load_callee_avps")(user.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def loadCallerAvps(user: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("load_caller_avps")(user.asInstanceOf[js.Any]).asInstanceOf[Double]
}
