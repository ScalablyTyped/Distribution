package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipRoleRestrictionEvaluation extends StObject {
  
  /** Output only. The current state of the restriction */
  var state: js.UndefOr[String] = js.undefined
}
object MembershipRoleRestrictionEvaluation {
  
  inline def apply(): MembershipRoleRestrictionEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipRoleRestrictionEvaluation]
  }
  
  extension [Self <: MembershipRoleRestrictionEvaluation](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
