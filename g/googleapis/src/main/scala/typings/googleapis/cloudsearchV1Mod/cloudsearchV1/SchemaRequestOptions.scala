package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestOptions extends StObject {
  
  /**
    * Debug options of the request
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For translations. Set this field using the language set in browser or for the page. In the event that the user's language preference is known, set this field to the known user language. When specified, the documents in search results are biased towards the specified language. The suggest API does not use this parameter. Instead, suggest autocompletes only based on characters in the query.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID generated when you create a search application using the [admin console](https://support.google.com/a/answer/9043922).
    */
  var searchApplicationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current user's time zone id, such as "America/Los_Angeles" or "Australia/Sydney". These IDs are defined by [Unicode Common Locale Data Repository (CLDR)](http://cldr.unicode.org/) project, and currently available in the file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml). This field is used to correctly interpret date and time queries. If this field is not specified, the default time zone (UTC) is used.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaRequestOptions {
  
  inline def apply(): SchemaRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestOptions]
  }
  
  extension [Self <: SchemaRequestOptions](x: Self) {
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setSearchApplicationId(value: String): Self = StObject.set(x, "searchApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSearchApplicationIdNull: Self = StObject.set(x, "searchApplicationId", null)
    
    inline def setSearchApplicationIdUndefined: Self = StObject.set(x, "searchApplicationId", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
