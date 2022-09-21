package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestrictionEvaluations extends StObject {
  
  /** Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation. */
  var memberRestrictionEvaluation: js.UndefOr[MembershipRoleRestrictionEvaluation] = js.undefined
}
object RestrictionEvaluations {
  
  inline def apply(): RestrictionEvaluations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestrictionEvaluations]
  }
  
  extension [Self <: RestrictionEvaluations](x: Self) {
    
    inline def setMemberRestrictionEvaluation(value: MembershipRoleRestrictionEvaluation): Self = StObject.set(x, "memberRestrictionEvaluation", value.asInstanceOf[js.Any])
    
    inline def setMemberRestrictionEvaluationUndefined: Self = StObject.set(x, "memberRestrictionEvaluation", js.undefined)
  }
}
