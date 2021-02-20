package typings.maximMazurokGapiClientAdsense.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdsAppearOn extends StObject {
  
  /** The name used to describe this channel externally. */
  var adsAppearOn: js.UndefOr[String] = js.native
  
  /** The external description of the channel. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The locations in which ads appear. (Only valid for content and mobile content ads (deprecated)). Acceptable values for content ads are: TOP_LEFT, TOP_CENTER, TOP_RIGHT,
    * MIDDLE_LEFT, MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT, MULTIPLE_LOCATIONS. Acceptable values for mobile content ads (deprecated) are: TOP, MIDDLE,
    * BOTTOM, MULTIPLE_LOCATIONS.
    */
  var location: js.UndefOr[String] = js.native
  
  /** The language of the sites ads will be displayed on. */
  var siteLanguage: js.UndefOr[String] = js.native
}
object AdsAppearOn {
  
  @scala.inline
  def apply(): AdsAppearOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdsAppearOn]
  }
  
  @scala.inline
  implicit class AdsAppearOnMutableBuilder[Self <: AdsAppearOn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdsAppearOn(value: String): Self = StObject.set(x, "adsAppearOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdsAppearOnUndefined: Self = StObject.set(x, "adsAppearOn", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSiteLanguage(value: String): Self = StObject.set(x, "siteLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteLanguageUndefined: Self = StObject.set(x, "siteLanguage", js.undefined)
  }
}
