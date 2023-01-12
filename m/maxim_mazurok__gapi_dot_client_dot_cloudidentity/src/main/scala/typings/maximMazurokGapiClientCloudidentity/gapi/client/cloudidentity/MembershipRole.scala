package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipRole extends StObject {
  
  /**
    * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any
    * other value.
    */
  var expiryDetail: js.UndefOr[ExpiryDetail] = js.undefined
  
  /** The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Evaluations of restrictions applied to parent group on this membership. */
  var restrictionEvaluations: js.UndefOr[RestrictionEvaluations] = js.undefined
}
object MembershipRole {
  
  inline def apply(): MembershipRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MembershipRole] (val x: Self) extends AnyVal {
    
    inline def setExpiryDetail(value: ExpiryDetail): Self = StObject.set(x, "expiryDetail", value.asInstanceOf[js.Any])
    
    inline def setExpiryDetailUndefined: Self = StObject.set(x, "expiryDetail", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestrictionEvaluations(value: RestrictionEvaluations): Self = StObject.set(x, "restrictionEvaluations", value.asInstanceOf[js.Any])
    
    inline def setRestrictionEvaluationsUndefined: Self = StObject.set(x, "restrictionEvaluations", js.undefined)
  }
}
