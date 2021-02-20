package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FamilyRole extends StObject {
  
  /** The role of the user in the family. */
  var familyRole: js.UndefOr[String] = js.native
  
  /**
    * Whether or not this volume can be shared with the family by the user. This includes sharing eligibility of both the volume and the user. If the value is true, the user can
    * initiate a family sharing action.
    */
  var isSharingAllowed: js.UndefOr[Boolean] = js.native
  
  /** Whether or not sharing this volume is temporarily disabled due to issues with the Family Wallet. */
  var isSharingDisabledByFop: js.UndefOr[Boolean] = js.native
}
object FamilyRole {
  
  @scala.inline
  def apply(): FamilyRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyRole]
  }
  
  @scala.inline
  implicit class FamilyRoleMutableBuilder[Self <: FamilyRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyRole(value: String): Self = StObject.set(x, "familyRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyRoleUndefined: Self = StObject.set(x, "familyRole", js.undefined)
    
    @scala.inline
    def setIsSharingAllowed(value: Boolean): Self = StObject.set(x, "isSharingAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharingAllowedUndefined: Self = StObject.set(x, "isSharingAllowed", js.undefined)
    
    @scala.inline
    def setIsSharingDisabledByFop(value: Boolean): Self = StObject.set(x, "isSharingDisabledByFop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharingDisabledByFopUndefined: Self = StObject.set(x, "isSharingDisabledByFop", js.undefined)
  }
}
