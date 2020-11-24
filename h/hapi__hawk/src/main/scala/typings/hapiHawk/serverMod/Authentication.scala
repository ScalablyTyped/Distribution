package typings.hapiHawk.serverMod

import typings.hapiHawk.cryptoMod.Artifacts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authentication extends js.Object {
  
  var artifacts: Artifacts = js.native
  
  var credentials: Credentials = js.native
}
object Authentication {
  
  @scala.inline
  def apply(artifacts: Artifacts, credentials: Credentials): Authentication = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
  
  @scala.inline
  implicit class AuthenticationOps[Self <: Authentication] (val x: Self) extends AnyVal {
    
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
    def setArtifacts(value: Artifacts): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentials(value: Credentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
  }
}
