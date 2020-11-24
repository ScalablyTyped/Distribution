package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAccessLevelsResponse extends js.Object {
  
  /** List of the Access Level instances. */
  var accessLevels: js.UndefOr[js.Array[AccessLevel]] = js.native
}
object ReplaceAccessLevelsResponse {
  
  @scala.inline
  def apply(): ReplaceAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAccessLevelsResponse]
  }
  
  @scala.inline
  implicit class ReplaceAccessLevelsResponseOps[Self <: ReplaceAccessLevelsResponse] (val x: Self) extends AnyVal {
    
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
  }
}
