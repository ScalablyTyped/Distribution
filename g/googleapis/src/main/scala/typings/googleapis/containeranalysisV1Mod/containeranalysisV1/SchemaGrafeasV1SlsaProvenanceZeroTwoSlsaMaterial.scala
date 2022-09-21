package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMaterial extends StObject {
  
  var digest: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMaterial {
  
  inline def apply(): SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMaterial]
  }
  
  extension [Self <: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaMaterial](x: Self) {
    
    inline def setDigest(value: StringDictionary[String]): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestNull: Self = StObject.set(x, "digest", null)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
