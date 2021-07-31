package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shared request options for all RPC methods.
  */
trait SchemaRequestOptions extends StObject {
  
  /**
    * Debug options of the request
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For
    * translations.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the application created using SearchApplicationsService.
    */
  var searchApplicationId: js.UndefOr[String] = js.undefined
  
  /**
    * Current user&#39;s time zone id, such as &quot;America/Los_Angeles&quot;
    * or &quot;Australia/Sydney&quot;. These IDs are defined by [Unicode Common
    * Locale Data Repository (CLDR)](http://cldr.unicode.org/) project, and
    * currently available in the file
    * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml)
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object SchemaRequestOptions {
  
  @scala.inline
  def apply(): SchemaRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestOptions]
  }
  
  @scala.inline
  implicit class SchemaRequestOptionsMutableBuilder[Self <: SchemaRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
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
