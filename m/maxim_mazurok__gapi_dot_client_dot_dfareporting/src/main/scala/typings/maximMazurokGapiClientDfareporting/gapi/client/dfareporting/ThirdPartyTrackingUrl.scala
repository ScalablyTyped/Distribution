package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyTrackingUrl extends StObject {
  
  /** Third-party URL type for in-stream video and in-stream audio creatives. */
  var thirdPartyUrlType: js.UndefOr[String] = js.undefined
  
  /** URL for the specified third-party URL type. */
  var url: js.UndefOr[String] = js.undefined
}
object ThirdPartyTrackingUrl {
  
  @scala.inline
  def apply(): ThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyTrackingUrl]
  }
  
  @scala.inline
  implicit class ThirdPartyTrackingUrlMutableBuilder[Self <: ThirdPartyTrackingUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThirdPartyUrlType(value: String): Self = StObject.set(x, "thirdPartyUrlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyUrlTypeUndefined: Self = StObject.set(x, "thirdPartyUrlType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
