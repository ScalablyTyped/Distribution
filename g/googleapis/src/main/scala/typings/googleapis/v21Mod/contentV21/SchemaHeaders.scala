package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A non-empty list of row or column headers for a table. Exactly one of
  * prices, weights, numItems, postalCodeGroupNames, or location must be set.
  */
trait SchemaHeaders extends StObject {
  
  /**
    * A list of location ID sets. Must be non-empty. Can only be set if all
    * other fields are not set.
    */
  var locations: js.UndefOr[js.Array[SchemaLocationIdSet]] = js.undefined
  
  /**
    * A list of inclusive number of items upper bounds. The last value can be
    * &quot;infinity&quot;. For example [&quot;10&quot;, &quot;50&quot;,
    * &quot;infinity&quot;] represents the headers &quot;&lt;= 10 items&quot;,
    * &quot; 50 items&quot;. Must be non-empty. Can only be set if all other
    * fields are not set.
    */
  var numberOfItems: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of postal group names. The last value can be &quot;all other
    * locations&quot;. Example: [&quot;zone 1&quot;, &quot;zone 2&quot;,
    * &quot;all other locations&quot;]. The referred postal code groups must
    * match the delivery country of the service. Must be non-empty. Can only be
    * set if all other fields are not set.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of inclusive order price upper bounds. The last price&#39;s value
    * can be &quot;infinity&quot;. For example [{&quot;value&quot;:
    * &quot;10&quot;, &quot;currency&quot;: &quot;USD&quot;},
    * {&quot;value&quot;: &quot;500&quot;, &quot;currency&quot;:
    * &quot;USD&quot;}, {&quot;value&quot;: &quot;infinity&quot;,
    * &quot;currency&quot;: &quot;USD&quot;}] represents the headers
    * &quot;&lt;= $10&quot;, &quot; $500&quot;. All prices within a service
    * must have the same currency. Must be non-empty. Can only be set if all
    * other fields are not set.
    */
  var prices: js.UndefOr[js.Array[SchemaPrice]] = js.undefined
  
  /**
    * A list of inclusive order weight upper bounds. The last weight&#39;s
    * value can be &quot;infinity&quot;. For example [{&quot;value&quot;:
    * &quot;10&quot;, &quot;unit&quot;: &quot;kg&quot;}, {&quot;value&quot;:
    * &quot;50&quot;, &quot;unit&quot;: &quot;kg&quot;}, {&quot;value&quot;:
    * &quot;infinity&quot;, &quot;unit&quot;: &quot;kg&quot;}] represents the
    * headers &quot;&lt;= 10kg&quot;, &quot; 50kg&quot;. All weights within a
    * service must have the same unit. Must be non-empty. Can only be set if
    * all other fields are not set.
    */
  var weights: js.UndefOr[js.Array[SchemaWeight]] = js.undefined
}
object SchemaHeaders {
  
  inline def apply(): SchemaHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeaders]
  }
  
  extension [Self <: SchemaHeaders](x: Self) {
    
    inline def setLocations(value: js.Array[SchemaLocationIdSet]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: SchemaLocationIdSet*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    inline def setNumberOfItems(value: js.Array[String]): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    inline def setNumberOfItemsUndefined: Self = StObject.set(x, "numberOfItems", js.undefined)
    
    inline def setNumberOfItemsVarargs(value: String*): Self = StObject.set(x, "numberOfItems", js.Array(value :_*))
    
    inline def setPostalCodeGroupNames(value: js.Array[String]): Self = StObject.set(x, "postalCodeGroupNames", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeGroupNamesUndefined: Self = StObject.set(x, "postalCodeGroupNames", js.undefined)
    
    inline def setPostalCodeGroupNamesVarargs(value: String*): Self = StObject.set(x, "postalCodeGroupNames", js.Array(value :_*))
    
    inline def setPrices(value: js.Array[SchemaPrice]): Self = StObject.set(x, "prices", value.asInstanceOf[js.Any])
    
    inline def setPricesUndefined: Self = StObject.set(x, "prices", js.undefined)
    
    inline def setPricesVarargs(value: SchemaPrice*): Self = StObject.set(x, "prices", js.Array(value :_*))
    
    inline def setWeights(value: js.Array[SchemaWeight]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
    
    inline def setWeightsVarargs(value: SchemaWeight*): Self = StObject.set(x, "weights", js.Array(value :_*))
  }
}
