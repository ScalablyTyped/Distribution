package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    locations: js.Array[SchemaLocationIdSet] = null,
    numberOfItems: js.Array[String] = null,
    postalCodeGroupNames: js.Array[String] = null,
    prices: js.Array[SchemaPrice] = null,
    weights: js.Array[SchemaWeight] = null
  ): SchemaHeaders = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (numberOfItems != null) __obj.updateDynamic("numberOfItems")(numberOfItems.asInstanceOf[js.Any])
    if (postalCodeGroupNames != null) __obj.updateDynamic("postalCodeGroupNames")(postalCodeGroupNames.asInstanceOf[js.Any])
    if (prices != null) __obj.updateDynamic("prices")(prices.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHeaders]
  }
}

