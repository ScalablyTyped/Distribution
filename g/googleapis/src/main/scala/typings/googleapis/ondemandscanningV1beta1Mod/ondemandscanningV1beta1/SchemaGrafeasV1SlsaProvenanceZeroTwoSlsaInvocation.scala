package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaInvocation extends StObject {
  
  var configSource: js.UndefOr[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource] = js.undefined
  
  var environment: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  var parameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaInvocation {
  
  inline def apply(): SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaInvocation]
  }
  
  extension [Self <: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaInvocation](x: Self) {
    
    inline def setConfigSource(value: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    inline def setConfigSourceUndefined: Self = StObject.set(x, "configSource", js.undefined)
    
    inline def setEnvironment(value: StringDictionary[Any]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
