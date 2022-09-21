package typings.googleapis.policytroubleshooterV1betaMod.policytroubleshooterV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanationAnnotatedMembership extends StObject {
  
  /**
    * Indicates whether the binding includes the member.
    */
  var membership: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relevance of the member's status to the overall determination for the binding.
    */
  var relevance: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanationAnnotatedMembership {
  
  inline def apply(): SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanationAnnotatedMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanationAnnotatedMembership]
  }
  
  extension [Self <: SchemaGoogleCloudPolicytroubleshooterV1betaBindingExplanationAnnotatedMembership](x: Self) {
    
    inline def setMembership(value: String): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    inline def setMembershipNull: Self = StObject.set(x, "membership", null)
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
    
    inline def setRelevance(value: String): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setRelevanceNull: Self = StObject.set(x, "relevance", null)
    
    inline def setRelevanceUndefined: Self = StObject.set(x, "relevance", js.undefined)
  }
}
