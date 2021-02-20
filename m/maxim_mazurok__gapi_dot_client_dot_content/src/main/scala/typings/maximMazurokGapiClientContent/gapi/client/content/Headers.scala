package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Headers extends StObject {
  
  /** A list of location ID sets. Must be non-empty. Can only be set if all other fields are not set. */
  var locations: js.UndefOr[js.Array[LocationIdSet]] = js.native
  
  /**
    * A list of inclusive number of items upper bounds. The last value can be `"infinity"`. For example `["10", "50", "infinity"]` represents the headers "<= 10 items", "<= 50 items", and
    * "> 50 items". Must be non-empty. Can only be set if all other fields are not set.
    */
  var numberOfItems: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of postal group names. The last value can be `"all other locations"`. Example: `["zone 1", "zone 2", "all other locations"]`. The referred postal code groups must match the
    * delivery country of the service. Must be non-empty. Can only be set if all other fields are not set.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of inclusive order price upper bounds. The last price's value can be `"infinity"`. For example `[{"value": "10", "currency": "USD"}, {"value": "500", "currency": "USD"},
    * {"value": "infinity", "currency": "USD"}]` represents the headers "<= $10", "<= $500", and "> $500". All prices within a service must have the same currency. Must be non-empty. Can
    * only be set if all other fields are not set.
    */
  var prices: js.UndefOr[js.Array[Price]] = js.native
  
  /**
    * A list of inclusive order weight upper bounds. The last weight's value can be `"infinity"`. For example `[{"value": "10", "unit": "kg"}, {"value": "50", "unit": "kg"}, {"value":
    * "infinity", "unit": "kg"}]` represents the headers "<= 10kg", "<= 50kg", and "> 50kg". All weights within a service must have the same unit. Must be non-empty. Can only be set if
    * all other fields are not set.
    */
  var weights: js.UndefOr[js.Array[Weight]] = js.native
}
object Headers {
  
  @scala.inline
  def apply(): Headers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headers]
  }
  
  @scala.inline
  implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[LocationIdSet]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: LocationIdSet*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setNumberOfItems(value: js.Array[String]): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfItemsUndefined: Self = StObject.set(x, "numberOfItems", js.undefined)
    
    @scala.inline
    def setNumberOfItemsVarargs(value: String*): Self = StObject.set(x, "numberOfItems", js.Array(value :_*))
    
    @scala.inline
    def setPostalCodeGroupNames(value: js.Array[String]): Self = StObject.set(x, "postalCodeGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeGroupNamesUndefined: Self = StObject.set(x, "postalCodeGroupNames", js.undefined)
    
    @scala.inline
    def setPostalCodeGroupNamesVarargs(value: String*): Self = StObject.set(x, "postalCodeGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setPrices(value: js.Array[Price]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
    
    @scala.inline
    def setPricesVarargs(value: Price*): Self = StObject.set(x, "prices", js.Array(value :_*))
    
    @scala.inline
    def setWeights(value: js.Array[Weight]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
    
    @scala.inline
    def setWeightsVarargs(value: Weight*): Self = StObject.set(x, "weights", js.Array(value :_*))
  }
}
