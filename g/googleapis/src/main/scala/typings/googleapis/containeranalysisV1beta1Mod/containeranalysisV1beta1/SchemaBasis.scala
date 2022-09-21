package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasis extends StObject {
  
  /**
    * Required. Immutable. The fingerprint of the base image.
    */
  var fingerprint: js.UndefOr[SchemaFingerprint] = js.undefined
  
  /**
    * Required. Immutable. The resource_url for the resource representing the basis of associated occurrence images.
    */
  var resourceUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaBasis {
  
  inline def apply(): SchemaBasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasis]
  }
  
  extension [Self <: SchemaBasis](x: Self) {
    
    inline def setFingerprint(value: SchemaFingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceUrlNull: Self = StObject.set(x, "resourceUrl", null)
    
    inline def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
