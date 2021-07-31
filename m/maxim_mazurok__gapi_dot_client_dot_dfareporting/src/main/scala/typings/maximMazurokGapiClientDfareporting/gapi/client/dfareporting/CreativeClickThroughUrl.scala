package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeClickThroughUrl extends StObject {
  
  /**
    * Read-only convenience field representing the actual URL that will be used for this click-through. The URL is computed as follows: - If landingPageId is specified then that landing
    * page's URL is assigned to this field. - Otherwise, the customClickThroughUrl is assigned to this field.
    */
  var computedClickThroughUrl: js.UndefOr[String] = js.undefined
  
  /** Custom click-through URL. Applicable if the landingPageId field is left unset. */
  var customClickThroughUrl: js.UndefOr[String] = js.undefined
  
  /** ID of the landing page for the click-through URL. */
  var landingPageId: js.UndefOr[String] = js.undefined
}
object CreativeClickThroughUrl {
  
  @scala.inline
  def apply(): CreativeClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeClickThroughUrl]
  }
  
  @scala.inline
  implicit class CreativeClickThroughUrlMutableBuilder[Self <: CreativeClickThroughUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputedClickThroughUrl(value: String): Self = StObject.set(x, "computedClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedClickThroughUrlUndefined: Self = StObject.set(x, "computedClickThroughUrl", js.undefined)
    
    @scala.inline
    def setCustomClickThroughUrl(value: String): Self = StObject.set(x, "customClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomClickThroughUrlUndefined: Self = StObject.set(x, "customClickThroughUrl", js.undefined)
    
    @scala.inline
    def setLandingPageId(value: String): Self = StObject.set(x, "landingPageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandingPageIdUndefined: Self = StObject.set(x, "landingPageId", js.undefined)
  }
}
