package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CVSSv3 extends StObject {
  
  var attackComplexity: js.UndefOr[String] = js.undefined
  
  /** Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments. */
  var attackVector: js.UndefOr[String] = js.undefined
  
  var availabilityImpact: js.UndefOr[String] = js.undefined
  
  /** The base score is a function of the base metric scores. */
  var baseScore: js.UndefOr[Double] = js.undefined
  
  var confidentialityImpact: js.UndefOr[String] = js.undefined
  
  var exploitabilityScore: js.UndefOr[Double] = js.undefined
  
  var impactScore: js.UndefOr[Double] = js.undefined
  
  var integrityImpact: js.UndefOr[String] = js.undefined
  
  var privilegesRequired: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var userInteraction: js.UndefOr[String] = js.undefined
}
object CVSSv3 {
  
  inline def apply(): CVSSv3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CVSSv3]
  }
  
  extension [Self <: CVSSv3](x: Self) {
    
    inline def setAttackComplexity(value: String): Self = StObject.set(x, "attackComplexity", value.asInstanceOf[js.Any])
    
    inline def setAttackComplexityUndefined: Self = StObject.set(x, "attackComplexity", js.undefined)
    
    inline def setAttackVector(value: String): Self = StObject.set(x, "attackVector", value.asInstanceOf[js.Any])
    
    inline def setAttackVectorUndefined: Self = StObject.set(x, "attackVector", js.undefined)
    
    inline def setAvailabilityImpact(value: String): Self = StObject.set(x, "availabilityImpact", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityImpactUndefined: Self = StObject.set(x, "availabilityImpact", js.undefined)
    
    inline def setBaseScore(value: Double): Self = StObject.set(x, "baseScore", value.asInstanceOf[js.Any])
    
    inline def setBaseScoreUndefined: Self = StObject.set(x, "baseScore", js.undefined)
    
    inline def setConfidentialityImpact(value: String): Self = StObject.set(x, "confidentialityImpact", value.asInstanceOf[js.Any])
    
    inline def setConfidentialityImpactUndefined: Self = StObject.set(x, "confidentialityImpact", js.undefined)
    
    inline def setExploitabilityScore(value: Double): Self = StObject.set(x, "exploitabilityScore", value.asInstanceOf[js.Any])
    
    inline def setExploitabilityScoreUndefined: Self = StObject.set(x, "exploitabilityScore", js.undefined)
    
    inline def setImpactScore(value: Double): Self = StObject.set(x, "impactScore", value.asInstanceOf[js.Any])
    
    inline def setImpactScoreUndefined: Self = StObject.set(x, "impactScore", js.undefined)
    
    inline def setIntegrityImpact(value: String): Self = StObject.set(x, "integrityImpact", value.asInstanceOf[js.Any])
    
    inline def setIntegrityImpactUndefined: Self = StObject.set(x, "integrityImpact", js.undefined)
    
    inline def setPrivilegesRequired(value: String): Self = StObject.set(x, "privilegesRequired", value.asInstanceOf[js.Any])
    
    inline def setPrivilegesRequiredUndefined: Self = StObject.set(x, "privilegesRequired", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setUserInteraction(value: String): Self = StObject.set(x, "userInteraction", value.asInstanceOf[js.Any])
    
    inline def setUserInteractionUndefined: Self = StObject.set(x, "userInteraction", js.undefined)
  }
}
