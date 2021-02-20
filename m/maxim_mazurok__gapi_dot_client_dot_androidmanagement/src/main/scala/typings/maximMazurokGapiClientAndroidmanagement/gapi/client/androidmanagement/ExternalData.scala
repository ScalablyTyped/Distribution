package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalData extends StObject {
  
  /** The base-64 encoded SHA-256 hash of the content hosted at url. If the content doesn't match this hash, Android Device Policy won't use the data. */
  var sha256Hash: js.UndefOr[String] = js.native
  
  /**
    * The absolute URL to the data, which must use either the http or https scheme. Android Device Policy doesn't provide any credentials in the GET request, so the URL must be publicly
    * accessible. Including a long, random component in the URL may be used to prevent attackers from discovering the URL.
    */
  var url: js.UndefOr[String] = js.native
}
object ExternalData {
  
  @scala.inline
  def apply(): ExternalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalData]
  }
  
  @scala.inline
  implicit class ExternalDataMutableBuilder[Self <: ExternalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha256Hash(value: String): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256HashUndefined: Self = StObject.set(x, "sha256Hash", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
