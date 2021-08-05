package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickTag extends StObject {
  
  /** Parameter value for the specified click tag. This field contains a click-through url. */
  var clickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.undefined
  
  /**
    * Advertiser event name associated with the click tag. This field is used by DISPLAY_IMAGE_GALLERY and HTML5_BANNER creatives. Applicable to DISPLAY when the primary asset type is not
    * HTML_IMAGE.
    */
  var eventName: js.UndefOr[String] = js.undefined
  
  /** Parameter name for the specified click tag. For DISPLAY_IMAGE_GALLERY creative assets, this field must match the value of the creative asset's creativeAssetId.name field. */
  var name: js.UndefOr[String] = js.undefined
}
object ClickTag {
  
  inline def apply(): ClickTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickTag]
  }
  
  extension [Self <: ClickTag](x: Self) {
    
    inline def setClickThroughUrl(value: CreativeClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
