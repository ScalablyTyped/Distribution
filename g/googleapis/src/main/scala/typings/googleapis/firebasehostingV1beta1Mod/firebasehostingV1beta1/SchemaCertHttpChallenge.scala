package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an HTTP certificate challenge.
  */
@js.native
trait SchemaCertHttpChallenge extends js.Object {
  
  /**
    * The URL path on which to serve the specified token to satisfy the
    * certificate challenge.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The token to serve at the specified URL path to satisfy the certificate
    * challenge.
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaCertHttpChallenge {
  
  @scala.inline
  def apply(): SchemaCertHttpChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertHttpChallenge]
  }
  
  @scala.inline
  implicit class SchemaCertHttpChallengeOps[Self <: SchemaCertHttpChallenge] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
