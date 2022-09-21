package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCvssv3 extends StObject {
  
  /**
    * This metric describes the conditions beyond the attacker's control that must exist in order to exploit the vulnerability.
    */
  var attackComplexity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments. This metric reflects the context by which vulnerability exploitation is possible.
    */
  var attackVector: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This metric measures the impact to the availability of the impacted component resulting from a successfully exploited vulnerability.
    */
  var availabilityImpact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The base score is a function of the base metric scores.
    */
  var baseScore: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * This metric measures the impact to the confidentiality of the information resources managed by a software component due to a successfully exploited vulnerability.
    */
  var confidentialityImpact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This metric measures the impact to integrity of a successfully exploited vulnerability.
    */
  var integrityImpact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This metric describes the level of privileges an attacker must possess before successfully exploiting the vulnerability.
    */
  var privilegesRequired: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Scope metric captures whether a vulnerability in one vulnerable component impacts resources in components beyond its security scope.
    */
  var scope: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This metric captures the requirement for a human user, other than the attacker, to participate in the successful compromise of the vulnerable component.
    */
  var userInteraction: js.UndefOr[String | Null] = js.undefined
}
object SchemaCvssv3 {
  
  inline def apply(): SchemaCvssv3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCvssv3]
  }
  
  extension [Self <: SchemaCvssv3](x: Self) {
    
    inline def setAttackComplexity(value: String): Self = StObject.set(x, "attackComplexity", value.asInstanceOf[js.Any])
    
    inline def setAttackComplexityNull: Self = StObject.set(x, "attackComplexity", null)
    
    inline def setAttackComplexityUndefined: Self = StObject.set(x, "attackComplexity", js.undefined)
    
    inline def setAttackVector(value: String): Self = StObject.set(x, "attackVector", value.asInstanceOf[js.Any])
    
    inline def setAttackVectorNull: Self = StObject.set(x, "attackVector", null)
    
    inline def setAttackVectorUndefined: Self = StObject.set(x, "attackVector", js.undefined)
    
    inline def setAvailabilityImpact(value: String): Self = StObject.set(x, "availabilityImpact", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityImpactNull: Self = StObject.set(x, "availabilityImpact", null)
    
    inline def setAvailabilityImpactUndefined: Self = StObject.set(x, "availabilityImpact", js.undefined)
    
    inline def setBaseScore(value: Double): Self = StObject.set(x, "baseScore", value.asInstanceOf[js.Any])
    
    inline def setBaseScoreNull: Self = StObject.set(x, "baseScore", null)
    
    inline def setBaseScoreUndefined: Self = StObject.set(x, "baseScore", js.undefined)
    
    inline def setConfidentialityImpact(value: String): Self = StObject.set(x, "confidentialityImpact", value.asInstanceOf[js.Any])
    
    inline def setConfidentialityImpactNull: Self = StObject.set(x, "confidentialityImpact", null)
    
    inline def setConfidentialityImpactUndefined: Self = StObject.set(x, "confidentialityImpact", js.undefined)
    
    inline def setIntegrityImpact(value: String): Self = StObject.set(x, "integrityImpact", value.asInstanceOf[js.Any])
    
    inline def setIntegrityImpactNull: Self = StObject.set(x, "integrityImpact", null)
    
    inline def setIntegrityImpactUndefined: Self = StObject.set(x, "integrityImpact", js.undefined)
    
    inline def setPrivilegesRequired(value: String): Self = StObject.set(x, "privilegesRequired", value.asInstanceOf[js.Any])
    
    inline def setPrivilegesRequiredNull: Self = StObject.set(x, "privilegesRequired", null)
    
    inline def setPrivilegesRequiredUndefined: Self = StObject.set(x, "privilegesRequired", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setUserInteraction(value: String): Self = StObject.set(x, "userInteraction", value.asInstanceOf[js.Any])
    
    inline def setUserInteractionNull: Self = StObject.set(x, "userInteraction", null)
    
    inline def setUserInteractionUndefined: Self = StObject.set(x, "userInteraction", js.undefined)
  }
}
