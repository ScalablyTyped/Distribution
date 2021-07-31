package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Click Tag.
  */
trait SchemaClickTag extends StObject {
  
  /**
    * Parameter value for the specified click tag. This field contains a
    * click-through url.
    */
  var clickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.undefined
  
  /**
    * Advertiser event name associated with the click tag. This field is used
    * by DISPLAY_IMAGE_GALLERY and HTML5_BANNER creatives. Applicable to
    * DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var eventName: js.UndefOr[String] = js.undefined
  
  /**
    * Parameter name for the specified click tag. For DISPLAY_IMAGE_GALLERY
    * creative assets, this field must match the value of the creative
    * asset&#39;s creativeAssetId.name field.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaClickTag {
  
  @scala.inline
  def apply(): SchemaClickTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClickTag]
  }
  
  @scala.inline
  implicit class SchemaClickTagMutableBuilder[Self <: SchemaClickTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
