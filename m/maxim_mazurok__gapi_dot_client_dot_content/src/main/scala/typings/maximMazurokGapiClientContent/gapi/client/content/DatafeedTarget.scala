package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedTarget extends StObject {
  
  /** The country where the items in the feed will be included in the search index, represented as a CLDR territory code. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The list of destinations to exclude for this target (corresponds to cleared check boxes in Merchant Center). */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of destinations to include for this target (corresponds to checked check boxes in Merchant Center). Default destinations are always included unless provided in
    * `excludedDestinations`.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The two-letter ISO 639-1 language of the items in the feed. Must be a valid language for `targets[].country`. */
  var language: js.UndefOr[String] = js.undefined
}
object DatafeedTarget {
  
  inline def apply(): DatafeedTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedTarget]
  }
  
  extension [Self <: DatafeedTarget](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setExcludedDestinations(value: js.Array[String]): Self = StObject.set(x, "excludedDestinations", value.asInstanceOf[js.Any])
    
    inline def setExcludedDestinationsUndefined: Self = StObject.set(x, "excludedDestinations", js.undefined)
    
    inline def setExcludedDestinationsVarargs(value: String*): Self = StObject.set(x, "excludedDestinations", js.Array(value*))
    
    inline def setIncludedDestinations(value: js.Array[String]): Self = StObject.set(x, "includedDestinations", value.asInstanceOf[js.Any])
    
    inline def setIncludedDestinationsUndefined: Self = StObject.set(x, "includedDestinations", js.undefined)
    
    inline def setIncludedDestinationsVarargs(value: String*): Self = StObject.set(x, "includedDestinations", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
