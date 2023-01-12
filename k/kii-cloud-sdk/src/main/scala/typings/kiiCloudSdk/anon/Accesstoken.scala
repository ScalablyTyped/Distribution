package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accesstoken
  extends StObject
     with KiiSocialConnectOptions {
  
  var access_token: String
  
  var openID: js.UndefOr[String] = js.undefined
}
object Accesstoken {
  
  inline def apply(access_token: String): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setOpenID(value: String): Self = StObject.set(x, "openID", value.asInstanceOf[js.Any])
    
    inline def setOpenIDUndefined: Self = StObject.set(x, "openID", js.undefined)
  }
}
