package typings.googleapis.policysimulatorV1Mod.policysimulatorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership extends StObject {
  
  /**
    * Indicates whether the binding includes the principal.
    */
  var membership: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relevance of the principal's status to the overall determination for the binding.
    */
  var relevance: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership {
  
  inline def apply(): SchemaGoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership]
  }
  
  extension [Self <: SchemaGoogleCloudPolicysimulatorV1BindingExplanationAnnotatedMembership](x: Self) {
    
    inline def setMembership(value: String): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipNull: Self = StObject.set(x, "membership", null)
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
    
    inline def setRelevance(value: String): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceNull: Self = StObject.set(x, "relevance", null)
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
  }
}
