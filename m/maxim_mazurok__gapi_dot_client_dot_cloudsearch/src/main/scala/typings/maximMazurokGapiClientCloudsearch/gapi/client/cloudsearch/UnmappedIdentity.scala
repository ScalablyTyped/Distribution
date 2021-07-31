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
  
  @scala.inline
  def apply(): UnmappedIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmappedIdentity]
  }
  
  @scala.inline
  implicit class UnmappedIdentityMutableBuilder[Self <: UnmappedIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalIdentity(value: Principal): Self = StObject.set(x, "externalIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdentityUndefined: Self = StObject.set(x, "externalIdentity", js.undefined)
    
    @scala.inline
    def setResolutionStatusCode(value: String): Self = StObject.set(x, "resolutionStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionStatusCodeUndefined: Self = StObject.set(x, "resolutionStatusCode", js.undefined)
  }
}
