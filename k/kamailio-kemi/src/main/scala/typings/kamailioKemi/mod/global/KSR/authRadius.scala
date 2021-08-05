package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authRadius {
  
  @JSGlobal("KSR.auth_radius")
  @js.native
  val ^ : js.Any = js.native
  
  inline def proxyAuthorize(srealm: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("proxy_authorize")(srealm.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def proxyAuthorizeUser(srealm: String, suser: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy_authorize_user")(srealm.asInstanceOf[js.Any], suser.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def wwwAuthorize(srealm: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("www_authorize")(srealm.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def wwwAuthorizeUser(srealm: String, suser: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("www_authorize_user")(srealm.asInstanceOf[js.Any], suser.asInstanceOf[js.Any])).asInstanceOf[Double]
}
