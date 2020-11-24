package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslPolicyReference extends js.Object {
  
  /** URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy associated with the target proxy resource. */
  var sslPolicy: js.UndefOr[String] = js.native
}
object SslPolicyReference {
  
  @scala.inline
  def apply(): SslPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPolicyReference]
  }
  
  @scala.inline
  implicit class SslPolicyReferenceOps[Self <: SslPolicyReference] (val x: Self) extends AnyVal {
    
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
    def setSslPolicy(value: String): Self = this.set("sslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslPolicy: Self = this.set("sslPolicy", js.undefined)
  }
}
