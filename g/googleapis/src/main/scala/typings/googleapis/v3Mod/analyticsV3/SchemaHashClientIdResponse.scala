package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a hash Client Id response resource.
  */
@js.native
trait SchemaHashClientIdResponse extends js.Object {
  
  var clientId: js.UndefOr[String] = js.native
  
  var hashedClientId: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var webPropertyId: js.UndefOr[String] = js.native
}
object SchemaHashClientIdResponse {
  
  @scala.inline
  def apply(): SchemaHashClientIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHashClientIdResponse]
  }
  
  @scala.inline
  implicit class SchemaHashClientIdResponseOps[Self <: SchemaHashClientIdResponse] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setHashedClientId(value: String): Self = this.set("hashedClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashedClientId: Self = this.set("hashedClientId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
}
