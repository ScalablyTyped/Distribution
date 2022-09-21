package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource extends StObject {
  
  var digest: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource & TopLevel[Any]
  ] = js.undefined
  
  var entryPoint: js.UndefOr[String] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
}
object GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource {
  
  inline def apply(): GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource]
  }
  
  extension [Self <: GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource](x: Self) {
    
    inline def setDigest(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.GrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource & TopLevel[Any]
    ): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
