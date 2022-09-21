package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClickTag extends StObject {
  
  /**
    * Parameter value for the specified click tag. This field contains a click-through url.
    */
  var clickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.undefined
  
  /**
    * Advertiser event name associated with the click tag. This field is used by DISPLAY_IMAGE_GALLERY and HTML5_BANNER creatives. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var eventName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameter name for the specified click tag. For DISPLAY_IMAGE_GALLERY creative assets, this field must match the value of the creative asset's creativeAssetId.name field.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaClickTag {
  
  inline def apply(): SchemaClickTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClickTag]
  }
  
  extension [Self <: SchemaClickTag](x: Self) {
    
    inline def setClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameNull: Self = StObject.set(x, "eventName", null)
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
