package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List AccountUsers Response.
  */
@js.native
trait SchemaListAccountUsersResponse extends js.Object {
  
  /**
    * All GTM AccountUsers of a GTM Account.
    */
  var userAccess: js.UndefOr[js.Array[SchemaUserAccess]] = js.native
}
object SchemaListAccountUsersResponse {
  
  @scala.inline
  def apply(): SchemaListAccountUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountUsersResponse]
  }
  
  @scala.inline
  implicit class SchemaListAccountUsersResponseOps[Self <: SchemaListAccountUsersResponse] (val x: Self) extends AnyVal {
    
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
    def setUserAccessVarargs(value: SchemaUserAccess*): Self = this.set("userAccess", js.Array(value :_*))
    
    @scala.inline
    def setUserAccess(value: js.Array[SchemaUserAccess]): Self = this.set("userAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAccess: Self = this.set("userAccess", js.undefined)
  }
}
