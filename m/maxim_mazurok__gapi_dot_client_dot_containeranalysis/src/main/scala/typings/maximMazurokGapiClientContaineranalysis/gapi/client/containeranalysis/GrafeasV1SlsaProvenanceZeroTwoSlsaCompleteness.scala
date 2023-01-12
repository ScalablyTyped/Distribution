package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness extends StObject {
  
  var environment: js.UndefOr[Boolean] = js.undefined
  
  var materials: js.UndefOr[Boolean] = js.undefined
  
  var parameters: js.UndefOr[Boolean] = js.undefined
}
object GrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness {
  
  inline def apply(): GrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: Boolean): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setMaterials(value: Boolean): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setParameters(value: Boolean): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
