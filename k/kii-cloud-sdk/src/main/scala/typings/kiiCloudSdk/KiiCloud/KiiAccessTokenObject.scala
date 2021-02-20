package typings.kiiCloudSdk.KiiCloud

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KiiAccessTokenObject extends StObject {
  
  var access_token: String = js.native
  
  var expires_at: Date = js.native
}
object KiiAccessTokenObject {
  
  @scala.inline
  def apply(access_token: String, expires_at: Date): KiiAccessTokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiAccessTokenObject]
  }
  
  @scala.inline
  implicit class KiiAccessTokenObjectMutableBuilder[Self <: KiiAccessTokenObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_at(value: Date): Self = StObject.set(x, "expires_at", value.asInstanceOf[js.Any])
  }
}
