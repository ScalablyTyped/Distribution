package typings.maximMazurokGapiClientAdsense.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdsAppearOn extends StObject {
  
  /** The name used to describe this channel externally. */
  var adsAppearOn: js.UndefOr[String] = js.undefined
  
  /** The external description of the channel. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The locations in which ads appear. (Only valid for content and mobile content ads (deprecated)). Acceptable values for content ads are: TOP_LEFT, TOP_CENTER, TOP_RIGHT,
    * MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT, MULTIPLE_LOCATIONS. Acceptable values for mobile content ads (deprecated) are: TOP, MIDDLE,
    * BOTTOM, MULTIPLE_LOCATIONS.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /** The language of the sites ads will be displayed on. */
  var siteLanguage: js.UndefOr[String] = js.undefined
}
object AdsAppearOn {
  
  inline def apply(): AdsAppearOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsAppearOn]
  }
  
  extension [Self <: AdsAppearOn](x: Self) {
    
    inline def setAdsAppearOn(value: String): Self = StObject.set(x, "adsAppearOn", value.asInstanceOf[js.Any])
    
    inline def setAdsAppearOnUndefined: Self = StObject.set(x, "adsAppearOn", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSiteLanguage(value: String): Self = StObject.set(x, "siteLanguage", value.asInstanceOf[js.Any])
    
    inline def setSiteLanguageUndefined: Self = StObject.set(x, "siteLanguage", js.undefined)
  }
}
