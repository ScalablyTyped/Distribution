package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authRadius {
  
  @JSGlobal("KSR.auth_radius.proxy_authorize")
  @js.native
  def proxyAuthorize(srealm: String): Double = js.native
  
  @JSGlobal("KSR.auth_radius.proxy_authorize_user")
  @js.native
  def proxyAuthorizeUser(srealm: String, suser: String): Double = js.native
  
  @JSGlobal("KSR.auth_radius.www_authorize")
  @js.native
  def wwwAuthorize(srealm: String): Double = js.native
  
  @JSGlobal("KSR.auth_radius.www_authorize_user")
  @js.native
  def wwwAuthorizeUser(srealm: String, suser: String): Double = js.native
}
