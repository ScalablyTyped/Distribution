package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGetPublisherProfilesByAccountIdResponse extends js.Object {
  
  /**
    * Profiles for the requested publisher
    */
  var profiles: js.UndefOr[js.Array[SchemaPublisherProfileApiProto]] = js.native
}
object SchemaGetPublisherProfilesByAccountIdResponse {
  
  @scala.inline
  def apply(): SchemaGetPublisherProfilesByAccountIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetPublisherProfilesByAccountIdResponse]
  }
  
  @scala.inline
  implicit class SchemaGetPublisherProfilesByAccountIdResponseOps[Self <: SchemaGetPublisherProfilesByAccountIdResponse] (val x: Self) extends AnyVal {
    
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
    def setProfilesVarargs(value: SchemaPublisherProfileApiProto*): Self = this.set("profiles", js.Array(value :_*))
    
    @scala.inline
    def setProfiles(value: js.Array[SchemaPublisherProfileApiProto]): Self = this.set("profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfiles: Self = this.set("profiles", js.undefined)
  }
}
