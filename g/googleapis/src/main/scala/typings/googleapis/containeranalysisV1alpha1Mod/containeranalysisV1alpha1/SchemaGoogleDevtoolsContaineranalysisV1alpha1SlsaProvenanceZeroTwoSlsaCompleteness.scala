package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness extends StObject {
  
  /**
    * If true, the builder claims that invocation.environment is complete.
    */
  var environment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, the builder claims that materials is complete.
    */
  var materials: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, the builder claims that invocation.parameters is complete.
    */
  var parameters: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaCompleteness](x: Self) {
    
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
