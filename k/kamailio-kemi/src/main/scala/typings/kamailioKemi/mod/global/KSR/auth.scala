package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  @JSGlobal("KSR.auth")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def authChallenge(realm: String, flags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("auth_challenge")(realm.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def consumeCredentials(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("consume_credentials")().asInstanceOf[Double]
  
  @scala.inline
  def hasCredentials(srealm: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("has_credentials")(srealm.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def pvAuthCheck(srealm: String, spasswd: String, vflags: Double, vchecks: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pv_auth_check")(srealm.asInstanceOf[js.Any], spasswd.asInstanceOf[js.Any], vflags.asInstanceOf[js.Any], vchecks.asInstanceOf[js.Any])).asInstanceOf[Double]
}
