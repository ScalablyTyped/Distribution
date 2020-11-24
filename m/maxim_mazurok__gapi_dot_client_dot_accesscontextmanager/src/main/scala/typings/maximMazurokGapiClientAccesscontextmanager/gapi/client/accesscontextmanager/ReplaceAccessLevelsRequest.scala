package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAccessLevelsRequest extends js.Object {
  
  /** Required. The desired Access Levels that should replace all existing Access Levels in the Access Policy. */
  var accessLevels: js.UndefOr[js.Array[AccessLevel]] = js.native
  
  /**
    * Optional. The etag for the version of the Access Policy that this replace operation is to be performed on. If, at the time of replace, the etag for the Access Policy stored in
    * Access Context Manager is different from the specified etag, then the replace operation will not be performed and the call will fail. This field is not required. If etag is not
    * provided, the operation will be performed as if a valid etag is provided.
    */
  var etag: js.UndefOr[String] = js.native
}
object ReplaceAccessLevelsRequest {
  
  @scala.inline
  def apply(): ReplaceAccessLevelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAccessLevelsRequest]
  }
  
  @scala.inline
  implicit class ReplaceAccessLevelsRequestOps[Self <: ReplaceAccessLevelsRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessLevelsVarargs(value: AccessLevel*): Self = this.set("accessLevels", js.Array(value :_*))
    
    @scala.inline
    def setAccessLevels(value: js.Array[AccessLevel]): Self = this.set("accessLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLevels: Self = this.set("accessLevels", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
  }
}
