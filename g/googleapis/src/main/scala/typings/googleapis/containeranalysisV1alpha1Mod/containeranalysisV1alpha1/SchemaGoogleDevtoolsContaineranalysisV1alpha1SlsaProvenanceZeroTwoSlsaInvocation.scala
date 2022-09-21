package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaInvocation extends StObject {
  
  /**
    * Describes where the config file that kicked off the build came from.
    */
  var configSource: js.UndefOr[
    SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource
  ] = js.undefined
  
  /**
    * Any other builder-controlled inputs necessary for correctly evaluating the build.
    */
  var environment: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Collection of all external inputs that influenced the build on top of invocation.configSource.
    */
  var parameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaInvocation {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaInvocation]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaInvocation](x: Self) {
    
    inline def setConfigSource(value: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    inline def setConfigSourceUndefined: Self = StObject.set(x, "configSource", js.undefined)
    
    inline def setEnvironment(value: StringDictionary[Any]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
