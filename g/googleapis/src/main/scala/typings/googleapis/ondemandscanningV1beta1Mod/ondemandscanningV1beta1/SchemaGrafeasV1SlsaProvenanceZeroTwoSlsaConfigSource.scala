package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource extends StObject {
  
  var digest: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var entryPoint: js.UndefOr[String | Null] = js.undefined
  
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource {
  
  inline def apply(): SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource]
  }
  
  extension [Self <: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaConfigSource](x: Self) {
    
    inline def setDigest(value: StringDictionary[String]): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestNull: Self = StObject.set(x, "digest", null)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointNull: Self = StObject.set(x, "entryPoint", null)
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
