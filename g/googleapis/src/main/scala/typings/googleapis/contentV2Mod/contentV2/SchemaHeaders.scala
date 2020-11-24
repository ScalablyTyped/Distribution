package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A non-empty list of row or column headers for a table. Exactly one of
  * prices, weights, numItems, postalCodeGroupNames, or location must be set.
  */
@js.native
trait SchemaHeaders extends js.Object {
  
  /**
    * A list of location ID sets. Must be non-empty. Can only be set if all
    * other fields are not set.
    */
  var locations: js.UndefOr[js.Array[SchemaLocationIdSet]] = js.native
  
  /**
    * A list of inclusive number of items upper bounds. The last value can be
    * &quot;infinity&quot;. For example [&quot;10&quot;, &quot;50&quot;,
    * &quot;infinity&quot;] represents the headers &quot;&lt;= 10 items&quot;,
    * &quot; 50 items&quot;. Must be non-empty. Can only be set if all other
    * fields are not set.
    */
  var numberOfItems: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of postal group names. The last value can be &quot;all other
    * locations&quot;. Example: [&quot;zone 1&quot;, &quot;zone 2&quot;,
    * &quot;all other locations&quot;]. The referred postal code groups must
    * match the delivery country of the service. Must be non-empty. Can only be
    * set if all other fields are not set.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  
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
  var prices: js.UndefOr[js.Array[SchemaPrice]] = js.native
  
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
  var weights: js.UndefOr[js.Array[SchemaWeight]] = js.native
}
object SchemaHeaders {
  
  @scala.inline
  def apply(): SchemaHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeaders]
  }
  
  @scala.inline
  implicit class SchemaHeadersOps[Self <: SchemaHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationsVarargs(value: SchemaLocationIdSet*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[SchemaLocationIdSet]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setNumberOfItemsVarargs(value: String*): Self = this.set("numberOfItems", js.Array(value :_*))
    
    @scala.inline
    def setNumberOfItems(value: js.Array[String]): Self = this.set("numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfItems: Self = this.set("numberOfItems", js.undefined)
    
    @scala.inline
    def setPostalCodeGroupNamesVarargs(value: String*): Self = this.set("postalCodeGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setPostalCodeGroupNames(value: js.Array[String]): Self = this.set("postalCodeGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCodeGroupNames: Self = this.set("postalCodeGroupNames", js.undefined)
    
    @scala.inline
    def setPricesVarargs(value: SchemaPrice*): Self = this.set("prices", js.Array(value :_*))
    
    @scala.inline
    def setPrices(value: js.Array[SchemaPrice]): Self = this.set("prices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrices: Self = this.set("prices", js.undefined)
    
    @scala.inline
    def setWeightsVarargs(value: SchemaWeight*): Self = this.set("weights", js.Array(value :_*))
    
    @scala.inline
    def setWeights(value: js.Array[SchemaWeight]): Self = this.set("weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeights: Self = this.set("weights", js.undefined)
  }
}
