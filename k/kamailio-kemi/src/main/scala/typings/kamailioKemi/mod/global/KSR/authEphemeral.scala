package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authEphemeral {
  
  @JSGlobal("KSR.auth_ephemeral")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def authephAuthenticate(susername: String, spassword: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("autheph_authenticate")(susername.asInstanceOf[js.Any], spassword.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def authephCheck(srealm: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("autheph_check")(srealm.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def authephProxy(srealm: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("autheph_proxy")(srealm.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def authephWww(srealm: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("autheph_www")(srealm.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def authephWwwMethod(srealm: String, smethod: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("autheph_www_method")(srealm.asInstanceOf[js.Any], smethod.asInstanceOf[js.Any])).asInstanceOf[Double]
}
