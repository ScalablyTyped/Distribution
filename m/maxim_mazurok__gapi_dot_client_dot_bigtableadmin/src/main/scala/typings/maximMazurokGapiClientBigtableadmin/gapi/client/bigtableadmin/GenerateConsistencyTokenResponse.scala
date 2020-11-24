package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateConsistencyTokenResponse extends js.Object {
  
  /** The generated consistency token. */
  var consistencyToken: js.UndefOr[String] = js.native
}
object GenerateConsistencyTokenResponse {
  
  @scala.inline
  def apply(): GenerateConsistencyTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConsistencyTokenResponse]
  }
  
  @scala.inline
  implicit class GenerateConsistencyTokenResponseOps[Self <: GenerateConsistencyTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setConsistencyToken(value: String): Self = this.set("consistencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistencyToken: Self = this.set("consistencyToken", js.undefined)
  }
}
