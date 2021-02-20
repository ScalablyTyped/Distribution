package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions extends StObject {
  
  /** Debug options of the request */
  var debugOptions: js.UndefOr[DebugOptions] = js.native
  
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For translations. Set this field
    * using the language set in browser or for the page. In the event that the user's language preference is known, set this field to the known user language. When specified, the
    * documents in search results are biased towards the specified language. The suggest API does not use this parameter. Instead, suggest autocompletes only based on characters in the
    * query.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** The ID generated when you create a search application using the [admin console](https://support.google.com/a/answer/9043922). */
  var searchApplicationId: js.UndefOr[String] = js.native
  
  /**
    * Current user's time zone id, such as "America/Los_Angeles" or "Australia/Sydney". These IDs are defined by [Unicode Common Locale Data Repository (CLDR)](http://cldr.unicode.org/)
    * project, and currently available in the file [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml). This field is used to correctly interpret date and time
    * queries. If this field is not specified, the default time zone (UTC) is used.
    */
  var timeZone: js.UndefOr[String] = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setSearchApplicationId(value: String): Self = StObject.set(x, "searchApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchApplicationIdUndefined: Self = StObject.set(x, "searchApplicationId", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
