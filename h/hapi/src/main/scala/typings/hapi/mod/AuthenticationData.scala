package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationData extends js.Object {
  
  var artifacts: js.UndefOr[js.Object] = js.native
  
  var credentials: AuthCredentials = js.native
}
object AuthenticationData {
  
  @scala.inline
  def apply(credentials: AuthCredentials): AuthenticationData = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
  
  @scala.inline
  implicit class AuthenticationDataOps[Self <: AuthenticationData] (val x: Self) extends AnyVal {
    
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
    def setCredentials(value: AuthCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifacts(value: js.Object): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifacts: Self = this.set("artifacts", js.undefined)
  }
}
