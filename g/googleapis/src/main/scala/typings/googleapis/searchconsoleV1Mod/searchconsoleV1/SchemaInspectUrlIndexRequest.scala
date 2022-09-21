package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInspectUrlIndexRequest extends StObject {
  
  /**
    * Required. URL to inspect. Must be under the property specified in "site_url".
    */
  var inspectionUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An [IETF BCP-47](https://en.wikipedia.org/wiki/IETF_language_tag) language code representing the requested language for translated issue messages, e.g. "en-US", "or "de-CH". Default value is "en-US".
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The URL of the property as defined in Search Console. **Examples:** `http://www.example.com/` for a URL-prefix property, or `sc-domain:example.com` for a Domain property.
    */
  var siteUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaInspectUrlIndexRequest {
  
  inline def apply(): SchemaInspectUrlIndexRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInspectUrlIndexRequest]
  }
  
  extension [Self <: SchemaInspectUrlIndexRequest](x: Self) {
    
    inline def setInspectionUrl(value: String): Self = StObject.set(x, "inspectionUrl", value.asInstanceOf[js.Any])
    
    inline def setInspectionUrlNull: Self = StObject.set(x, "inspectionUrl", null)
    
    inline def setInspectionUrlUndefined: Self = StObject.set(x, "inspectionUrl", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlNull: Self = StObject.set(x, "siteUrl", null)
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
