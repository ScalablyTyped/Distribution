package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accesstoken extends KiiSocialConnectOptions {
  
  var access_token: String = js.native
  
  var openID: js.UndefOr[String] = js.native
}
object Accesstoken {
  
  @scala.inline
  def apply(access_token: String): Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
  
  @scala.inline
  implicit class AccesstokenMutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenID(value: String): Self = StObject.set(x, "openID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIDUndefined: Self = StObject.set(x, "openID", js.undefined)
  }
}
