package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation extends StObject {
  
  var configSource: js.UndefOr[GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource] = js.undefined
  
  var environment: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation & TopLevel[Any]
  ] = js.undefined
  
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation & TopLevel[Any]
  ] = js.undefined
}
object GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation {
  
  inline def apply(): GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation]
  }
  
  extension [Self <: GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation](x: Self) {
    
    inline def setConfigSource(value: GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    inline def setConfigSourceUndefined: Self = StObject.set(x, "configSource", js.undefined)
    
    inline def setEnvironment(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation & TopLevel[Any]
    ): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.GrafeasV1SlsaProvenanceZeroTwoSlsaInvocation & TopLevel[Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
