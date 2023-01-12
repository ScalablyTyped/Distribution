package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1SlsaProvenanceZeroTwoSlsaMaterial extends StObject {
  
  var digest: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
}
object GrafeasV1SlsaProvenanceZeroTwoSlsaMaterial {
  
  inline def apply(): GrafeasV1SlsaProvenanceZeroTwoSlsaMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1SlsaProvenanceZeroTwoSlsaMaterial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrafeasV1SlsaProvenanceZeroTwoSlsaMaterial] (val x: Self) extends AnyVal {
    
    inline def setDigest(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
