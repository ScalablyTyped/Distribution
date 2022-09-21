package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness extends StObject {
  
  var environment: js.UndefOr[Boolean | Null] = js.undefined
  
  var materials: js.UndefOr[Boolean | Null] = js.undefined
  
  var parameters: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness {
  
  inline def apply(): SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness]
  }
  
  extension [Self <: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaCompleteness](x: Self) {
    
    inline def setEnvironment(value: Boolean): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setMaterials(value: Boolean): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsNull: Self = StObject.set(x, "materials", null)
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setParameters(value: Boolean): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
