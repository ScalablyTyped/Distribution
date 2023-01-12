package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageNote extends StObject {
  
  /** Required. Immutable. The fingerprint of the base image. */
  var fingerprint: js.UndefOr[Fingerprint] = js.undefined
  
  /** Required. Immutable. The resource_url for the resource representing the basis of associated occurrence images. */
  var resourceUrl: js.UndefOr[String] = js.undefined
}
object ImageNote {
  
  inline def apply(): ImageNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageNote] (val x: Self) extends AnyVal {
    
    inline def setFingerprint(value: Fingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
  }
}
