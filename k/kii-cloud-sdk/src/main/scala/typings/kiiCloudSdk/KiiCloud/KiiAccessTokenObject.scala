package typings.kiiCloudSdk.KiiCloud

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KiiAccessTokenObject extends js.Object {
  
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
  implicit class KiiAccessTokenObjectOps[Self <: KiiAccessTokenObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_at(value: Date): Self = this.set("expires_at", value.asInstanceOf[js.Any])
  }
}
