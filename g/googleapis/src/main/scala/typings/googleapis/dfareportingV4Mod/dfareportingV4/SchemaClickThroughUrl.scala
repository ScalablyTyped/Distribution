package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClickThroughUrl extends StObject {
  
  /**
    * Read-only convenience field representing the actual URL that will be used for this click-through. The URL is computed as follows: - If defaultLandingPage is enabled then the campaign's default landing page URL is assigned to this field. - If defaultLandingPage is not enabled and a landingPageId is specified then that landing page's URL is assigned to this field. - If neither of the above cases apply, then the customClickThroughUrl is assigned to this field.
    */
  var computedClickThroughUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom click-through URL. Applicable if the defaultLandingPage field is set to false and the landingPageId field is left unset.
    */
  var customClickThroughUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the campaign default landing page is used.
    */
  var defaultLandingPage: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * ID of the landing page for the click-through URL. Applicable if the defaultLandingPage field is set to false.
    */
  var landingPageId: js.UndefOr[String | Null] = js.undefined
}
object SchemaClickThroughUrl {
  
  inline def apply(): SchemaClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClickThroughUrl]
  }
  
  extension [Self <: SchemaClickThroughUrl](x: Self) {
    
    inline def setComputedClickThroughUrl(value: String): Self = StObject.set(x, "computedClickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setComputedClickThroughUrlNull: Self = StObject.set(x, "computedClickThroughUrl", null)
    
    inline def setComputedClickThroughUrlUndefined: Self = StObject.set(x, "computedClickThroughUrl", js.undefined)
    
    inline def setCustomClickThroughUrl(value: String): Self = StObject.set(x, "customClickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setCustomClickThroughUrlNull: Self = StObject.set(x, "customClickThroughUrl", null)
    
    inline def setCustomClickThroughUrlUndefined: Self = StObject.set(x, "customClickThroughUrl", js.undefined)
    
    inline def setDefaultLandingPage(value: Boolean): Self = StObject.set(x, "defaultLandingPage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLandingPageNull: Self = StObject.set(x, "defaultLandingPage", null)
    
    inline def setDefaultLandingPageUndefined: Self = StObject.set(x, "defaultLandingPage", js.undefined)
    
    inline def setLandingPageId(value: String): Self = StObject.set(x, "landingPageId", value.asInstanceOf[js.Any])
    
    inline def setLandingPageIdNull: Self = StObject.set(x, "landingPageId", null)
    
    inline def setLandingPageIdUndefined: Self = StObject.set(x, "landingPageId", js.undefined)
  }
}
