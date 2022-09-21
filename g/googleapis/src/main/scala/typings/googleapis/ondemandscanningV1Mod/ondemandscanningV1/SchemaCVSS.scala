package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCVSS extends StObject {
  
  var attackComplexity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments.
    */
  var attackVector: js.UndefOr[String | Null] = js.undefined
  
  var authentication: js.UndefOr[String | Null] = js.undefined
  
  var availabilityImpact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The base score is a function of the base metric scores.
    */
  var baseScore: js.UndefOr[Double | Null] = js.undefined
  
  var confidentialityImpact: js.UndefOr[String | Null] = js.undefined
  
  var exploitabilityScore: js.UndefOr[Double | Null] = js.undefined
  
  var impactScore: js.UndefOr[Double | Null] = js.undefined
  
  var integrityImpact: js.UndefOr[String | Null] = js.undefined
  
  var privilegesRequired: js.UndefOr[String | Null] = js.undefined
  
  var scope: js.UndefOr[String | Null] = js.undefined
  
  var userInteraction: js.UndefOr[String | Null] = js.undefined
}
object SchemaCVSS {
  
  inline def apply(): SchemaCVSS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCVSS]
  }
  
  extension [Self <: SchemaCVSS](x: Self) {
    
    inline def setAttackComplexity(value: String): Self = StObject.set(x, "attackComplexity", value.asInstanceOf[js.Any])
    
    inline def setAttackComplexityNull: Self = StObject.set(x, "attackComplexity", null)
    
    inline def setAttackComplexityUndefined: Self = StObject.set(x, "attackComplexity", js.undefined)
    
    inline def setAttackVector(value: String): Self = StObject.set(x, "attackVector", value.asInstanceOf[js.Any])
    
    inline def setAttackVectorNull: Self = StObject.set(x, "attackVector", null)
    
    inline def setAttackVectorUndefined: Self = StObject.set(x, "attackVector", js.undefined)
    
    inline def setAuthentication(value: String): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationNull: Self = StObject.set(x, "authentication", null)
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
    
    inline def setAvailabilityImpact(value: String): Self = StObject.set(x, "availabilityImpact", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityImpactNull: Self = StObject.set(x, "availabilityImpact", null)
    
    inline def setAvailabilityImpactUndefined: Self = StObject.set(x, "availabilityImpact", js.undefined)
    
    inline def setBaseScore(value: Double): Self = StObject.set(x, "baseScore", value.asInstanceOf[js.Any])
    
    inline def setBaseScoreNull: Self = StObject.set(x, "baseScore", null)
    
    inline def setBaseScoreUndefined: Self = StObject.set(x, "baseScore", js.undefined)
    
    inline def setConfidentialityImpact(value: String): Self = StObject.set(x, "confidentialityImpact", value.asInstanceOf[js.Any])
    
    inline def setConfidentialityImpactNull: Self = StObject.set(x, "confidentialityImpact", null)
    
    inline def setConfidentialityImpactUndefined: Self = StObject.set(x, "confidentialityImpact", js.undefined)
    
    inline def setExploitabilityScore(value: Double): Self = StObject.set(x, "exploitabilityScore", value.asInstanceOf[js.Any])
    
    inline def setExploitabilityScoreNull: Self = StObject.set(x, "exploitabilityScore", null)
    
    inline def setExploitabilityScoreUndefined: Self = StObject.set(x, "exploitabilityScore", js.undefined)
    
    inline def setImpactScore(value: Double): Self = StObject.set(x, "impactScore", value.asInstanceOf[js.Any])
    
    inline def setImpactScoreNull: Self = StObject.set(x, "impactScore", null)
    
    inline def setImpactScoreUndefined: Self = StObject.set(x, "impactScore", js.undefined)
    
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
