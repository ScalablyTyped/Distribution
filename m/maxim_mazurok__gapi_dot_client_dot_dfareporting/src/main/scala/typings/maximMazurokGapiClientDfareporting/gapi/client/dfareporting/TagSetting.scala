package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagSetting extends StObject {
  
  /**
    * Additional key-values to be included in tags. Each key-value pair must be of the form key=value, and pairs must be separated by a semicolon (;). Keys and values must not contain
    * commas. For example, id=2;color=red is a valid value for this field.
    */
  var additionalKeyValues: js.UndefOr[String] = js.undefined
  
  /** Whether static landing page URLs should be included in the tags. This setting applies only to placements. */
  var includeClickThroughUrls: js.UndefOr[Boolean] = js.undefined
  
  /** Whether click-tracking string should be included in the tags. */
  var includeClickTracking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Option specifying how keywords are embedded in ad tags. This setting can be used to specify whether keyword placeholders are inserted in placement tags for this site. Publishers can
    * then add keywords to those placeholders.
    */
  var keywordOption: js.UndefOr[String] = js.undefined
}
object TagSetting {
  
  inline def apply(): TagSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagSetting] (val x: Self) extends AnyVal {
    
    inline def setAdditionalKeyValues(value: String): Self = StObject.set(x, "additionalKeyValues", value.asInstanceOf[js.Any])
    
    inline def setAdditionalKeyValuesUndefined: Self = StObject.set(x, "additionalKeyValues", js.undefined)
    
    inline def setIncludeClickThroughUrls(value: Boolean): Self = StObject.set(x, "includeClickThroughUrls", value.asInstanceOf[js.Any])
    
    inline def setIncludeClickThroughUrlsUndefined: Self = StObject.set(x, "includeClickThroughUrls", js.undefined)
    
    inline def setIncludeClickTracking(value: Boolean): Self = StObject.set(x, "includeClickTracking", value.asInstanceOf[js.Any])
    
    inline def setIncludeClickTrackingUndefined: Self = StObject.set(x, "includeClickTracking", js.undefined)
    
    inline def setKeywordOption(value: String): Self = StObject.set(x, "keywordOption", value.asInstanceOf[js.Any])
    
    inline def setKeywordOptionUndefined: Self = StObject.set(x, "keywordOption", js.undefined)
  }
}
