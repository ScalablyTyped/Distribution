package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  @JSGlobal("KSR.auth.auth_challenge")
  @js.native
  def authChallenge(realm: String, flags: Double): Double = js.native
  
  @JSGlobal("KSR.auth.consume_credentials")
  @js.native
  def consumeCredentials(): Double = js.native
  
  @JSGlobal("KSR.auth.has_credentials")
  @js.native
  def hasCredentials(srealm: String): Double = js.native
  
  @JSGlobal("KSR.auth.pv_auth_check")
  @js.native
  def pvAuthCheck(srealm: String, spasswd: String, vflags: Double, vchecks: Double): Double = js.native
}
