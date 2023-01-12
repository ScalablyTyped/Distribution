package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnmappedIdentity extends StObject {
  
  /** The resource name for an external user. */
  var externalIdentity: js.UndefOr[Principal] = js.undefined
  
  /** The resolution status for the external identity. */
  var resolutionStatusCode: js.UndefOr[String] = js.undefined
}
object UnmappedIdentity {
  
  inline def apply(): UnmappedIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmappedIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnmappedIdentity] (val x: Self) extends AnyVal {
    
    inline def setExternalIdentity(value: Principal): Self = StObject.set(x, "externalIdentity", value.asInstanceOf[js.Any])
    
    inline def setExternalIdentityUndefined: Self = StObject.set(x, "externalIdentity", js.undefined)
    
    inline def setResolutionStatusCode(value: String): Self = StObject.set(x, "resolutionStatusCode", value.asInstanceOf[js.Any])
    
    inline def setResolutionStatusCodeUndefined: Self = StObject.set(x, "resolutionStatusCode", js.undefined)
  }
}
