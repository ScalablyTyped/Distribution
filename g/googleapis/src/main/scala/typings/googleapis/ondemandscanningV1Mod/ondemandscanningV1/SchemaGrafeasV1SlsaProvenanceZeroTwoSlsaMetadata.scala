package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMetadata extends StObject {
  
  var buildFinishedOn: js.UndefOr[String | Null] = js.undefined
  
  var buildInvocationId: js.UndefOr[String | Null] = js.undefined
  
  var buildStartedOn: js.UndefOr[String | Null] = js.undefined
  
  var completeness: js.UndefOr[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness] = js.undefined
  
  var reproducible: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMetadata {
  
  inline def apply(): SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMetadata]
  }
  
  extension [Self <: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMetadata](x: Self) {
    
    inline def setBuildFinishedOn(value: String): Self = StObject.set(x, "buildFinishedOn", value.asInstanceOf[js.Any])
    
    inline def setBuildFinishedOnNull: Self = StObject.set(x, "buildFinishedOn", null)
    
    inline def setBuildFinishedOnUndefined: Self = StObject.set(x, "buildFinishedOn", js.undefined)
    
    inline def setBuildInvocationId(value: String): Self = StObject.set(x, "buildInvocationId", value.asInstanceOf[js.Any])
    
    inline def setBuildInvocationIdNull: Self = StObject.set(x, "buildInvocationId", null)
    
    inline def setBuildInvocationIdUndefined: Self = StObject.set(x, "buildInvocationId", js.undefined)
    
    inline def setBuildStartedOn(value: String): Self = StObject.set(x, "buildStartedOn", value.asInstanceOf[js.Any])
    
    inline def setBuildStartedOnNull: Self = StObject.set(x, "buildStartedOn", null)
    
    inline def setBuildStartedOnUndefined: Self = StObject.set(x, "buildStartedOn", js.undefined)
    
    inline def setCompleteness(value: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness): Self = StObject.set(x, "completeness", value.asInstanceOf[js.Any])
    
    inline def setCompletenessUndefined: Self = StObject.set(x, "completeness", js.undefined)
    
    inline def setReproducible(value: Boolean): Self = StObject.set(x, "reproducible", value.asInstanceOf[js.Any])
    
    inline def setReproducibleNull: Self = StObject.set(x, "reproducible", null)
    
    inline def setReproducibleUndefined: Self = StObject.set(x, "reproducible", js.undefined)
  }
}
