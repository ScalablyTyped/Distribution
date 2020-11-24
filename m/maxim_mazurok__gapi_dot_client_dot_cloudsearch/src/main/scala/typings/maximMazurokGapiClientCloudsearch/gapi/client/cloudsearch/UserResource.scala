package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserResource extends js.Object {
  
  var searchapplications: SearchapplicationsResource = js.native
}
object UserResource {
  
  @scala.inline
  def apply(searchapplications: SearchapplicationsResource): UserResource = {
    val __obj = js.Dynamic.literal(searchapplications = searchapplications.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserResource]
  }
  
  @scala.inline
  implicit class UserResourceOps[Self <: UserResource] (val x: Self) extends AnyVal {
    
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
    def setSearchapplications(value: SearchapplicationsResource): Self = this.set("searchapplications", value.asInstanceOf[js.Any])
  }
}
