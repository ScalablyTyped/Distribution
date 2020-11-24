package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcquirePermission extends js.Object {
  
  /** Restrictions on user buying and acquiring content. */
  var acquirePermission: js.UndefOr[String] = js.native
  
  /** The age group of the user. */
  var ageGroup: js.UndefOr[String] = js.native
  
  /** The maximum allowed maturity rating for the user. */
  var allowedMaturityRating: js.UndefOr[String] = js.native
  
  var isInFamily: js.UndefOr[Boolean] = js.native
  
  /** The role of the user in the family. */
  var role: js.UndefOr[String] = js.native
}
object AcquirePermission {
  
  @scala.inline
  def apply(): AcquirePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquirePermission]
  }
  
  @scala.inline
  implicit class AcquirePermissionOps[Self <: AcquirePermission] (val x: Self) extends AnyVal {
    
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
    def setAcquirePermission(value: String): Self = this.set("acquirePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquirePermission: Self = this.set("acquirePermission", js.undefined)
    
    @scala.inline
    def setAgeGroup(value: String): Self = this.set("ageGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeGroup: Self = this.set("ageGroup", js.undefined)
    
    @scala.inline
    def setAllowedMaturityRating(value: String): Self = this.set("allowedMaturityRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedMaturityRating: Self = this.set("allowedMaturityRating", js.undefined)
    
    @scala.inline
    def setIsInFamily(value: Boolean): Self = this.set("isInFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInFamily: Self = this.set("isInFamily", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
