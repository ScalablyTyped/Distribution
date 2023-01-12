package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcquirePermission extends StObject {
  
  /** Restrictions on user buying and acquiring content. */
  var acquirePermission: js.UndefOr[String] = js.undefined
  
  /** The age group of the user. */
  var ageGroup: js.UndefOr[String] = js.undefined
  
  /** The maximum allowed maturity rating for the user. */
  var allowedMaturityRating: js.UndefOr[String] = js.undefined
  
  var isInFamily: js.UndefOr[Boolean] = js.undefined
  
  /** The role of the user in the family. */
  var role: js.UndefOr[String] = js.undefined
}
object AcquirePermission {
  
  inline def apply(): AcquirePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquirePermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcquirePermission] (val x: Self) extends AnyVal {
    
    inline def setAcquirePermission(value: String): Self = StObject.set(x, "acquirePermission", value.asInstanceOf[js.Any])
    
    inline def setAcquirePermissionUndefined: Self = StObject.set(x, "acquirePermission", js.undefined)
    
    inline def setAgeGroup(value: String): Self = StObject.set(x, "ageGroup", value.asInstanceOf[js.Any])
    
    inline def setAgeGroupUndefined: Self = StObject.set(x, "ageGroup", js.undefined)
    
    inline def setAllowedMaturityRating(value: String): Self = StObject.set(x, "allowedMaturityRating", value.asInstanceOf[js.Any])
    
    inline def setAllowedMaturityRatingUndefined: Self = StObject.set(x, "allowedMaturityRating", js.undefined)
    
    inline def setIsInFamily(value: Boolean): Self = StObject.set(x, "isInFamily", value.asInstanceOf[js.Any])
    
    inline def setIsInFamilyUndefined: Self = StObject.set(x, "isInFamily", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
