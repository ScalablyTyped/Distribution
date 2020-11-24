package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SslCerts create ephemeral certificate request.
  */
@js.native
trait SchemaSslCertsCreateEphemeralRequest extends js.Object {
  
  /**
    * PEM encoded public key to include in the signed certificate.
    */
  var public_key: js.UndefOr[String] = js.native
}
object SchemaSslCertsCreateEphemeralRequest {
  
  @scala.inline
  def apply(): SchemaSslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsCreateEphemeralRequest]
  }
  
  @scala.inline
  implicit class SchemaSslCertsCreateEphemeralRequestOps[Self <: SchemaSslCertsCreateEphemeralRequest] (val x: Self) extends AnyVal {
    
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
    def setPublic_key(value: String): Self = this.set("public_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic_key: Self = this.set("public_key", js.undefined)
  }
}
