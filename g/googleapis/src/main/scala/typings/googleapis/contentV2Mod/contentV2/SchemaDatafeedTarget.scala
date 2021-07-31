package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedTarget extends StObject {
  
  /**
    * The country where the items in the feed will be included in the search
    * index, represented as a  CLDR territory code.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The list of destinations to exclude for this target (corresponds to
    * unchecked check boxes in Merchant Center).
    */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of destinations to include for this target (corresponds to
    * checked check boxes in Merchant Center). Default destinations are always
    * included unless provided in the excluded_destination field.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The two-letter ISO 639-1 language of the items in the feed. Must be a
    * valid language for targets[].country.
    */
  var language: js.UndefOr[String] = js.undefined
}
object SchemaDatafeedTarget {
  
  @scala.inline
  def apply(): SchemaDatafeedTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedTarget]
  }
  
  @scala.inline
  implicit class SchemaDatafeedTargetMutableBuilder[Self <: SchemaDatafeedTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setExcludedDestinations(value: js.Array[String]): Self = StObject.set(x, "excludedDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedDestinationsUndefined: Self = StObject.set(x, "excludedDestinations", js.undefined)
    
    @scala.inline
    def setExcludedDestinationsVarargs(value: String*): Self = StObject.set(x, "excludedDestinations", js.Array(value :_*))
    
    @scala.inline
    def setIncludedDestinations(value: js.Array[String]): Self = StObject.set(x, "includedDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedDestinationsUndefined: Self = StObject.set(x, "includedDestinations", js.undefined)
    
    @scala.inline
    def setIncludedDestinationsVarargs(value: String*): Self = StObject.set(x, "includedDestinations", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
