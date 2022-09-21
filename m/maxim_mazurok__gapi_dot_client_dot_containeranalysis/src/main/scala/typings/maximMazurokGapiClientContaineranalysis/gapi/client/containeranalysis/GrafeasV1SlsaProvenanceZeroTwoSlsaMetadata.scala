package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1SlsaProvenanceZeroTwoSlsaMetadata extends StObject {
  
  var buildFinishedOn: js.UndefOr[String] = js.undefined
  
  var buildInvocationId: js.UndefOr[String] = js.undefined
  
  var buildStartedOn: js.UndefOr[String] = js.undefined
  
  var completeness: js.UndefOr[GrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness] = js.undefined
  
  var reproducible: js.UndefOr[Boolean] = js.undefined
}
object GrafeasV1SlsaProvenanceZeroTwoSlsaMetadata {
  
  inline def apply(): GrafeasV1SlsaProvenanceZeroTwoSlsaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1SlsaProvenanceZeroTwoSlsaMetadata]
  }
  
  extension [Self <: GrafeasV1SlsaProvenanceZeroTwoSlsaMetadata](x: Self) {
    
    inline def setBuildFinishedOn(value: String): Self = StObject.set(x, "buildFinishedOn", value.asInstanceOf[js.Any])
    
    inline def setBuildFinishedOnUndefined: Self = StObject.set(x, "buildFinishedOn", js.undefined)
    
    inline def setBuildInvocationId(value: String): Self = StObject.set(x, "buildInvocationId", value.asInstanceOf[js.Any])
    
    inline def setBuildInvocationIdUndefined: Self = StObject.set(x, "buildInvocationId", js.undefined)
    
    inline def setBuildStartedOn(value: String): Self = StObject.set(x, "buildStartedOn", value.asInstanceOf[js.Any])
    
    inline def setBuildStartedOnUndefined: Self = StObject.set(x, "buildStartedOn", js.undefined)
    
    inline def setCompleteness(value: GrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness): Self = StObject.set(x, "completeness", value.asInstanceOf[js.Any])
    
    inline def setCompletenessUndefined: Self = StObject.set(x, "completeness", js.undefined)
    
    inline def setReproducible(value: Boolean): Self = StObject.set(x, "reproducible", value.asInstanceOf[js.Any])
    
    inline def setReproducibleUndefined: Self = StObject.set(x, "reproducible", js.undefined)
  }
}
