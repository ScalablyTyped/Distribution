package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of filters that is applied to a request for data. Within a filter
  * set, an AND operation is performed across the filters represented by each
  * field. An OR operation is performed across the filters represented by the
  * multiple values of a repeated field, e.g., &quot;format=VIDEO AND
  * deal_id=12 AND (seller_network_id=34 OR seller_network_id=56)&quot;.
  */
@js.native
trait SchemaFilterSet extends js.Object {
  /**
    * An absolute date range, defined by a start date and an end date.
    * Interpreted relative to Pacific time zone.
    */
  var absoluteDateRange: js.UndefOr[SchemaAbsoluteDateRange] = js.native
  /**
    * The set of dimensions along which to break down the response; may be
    * empty. If multiple dimensions are requested, the breakdown is along the
    * Cartesian product of the requested dimensions.
    */
  var breakdownDimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the creative on which to filter; optional. This field may be
    * set only for a filter set that accesses account-level troubleshooting
    * data, i.e., one whose name matches the `bidders/x/accounts/x/filterSets/x
    * pattern.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * The ID of the deal on which to filter; optional. This field may be set
    * only for a filter set that accesses account-level troubleshooting data,
    * i.e., one whose name matches the `bidders/x/accounts/x/filterSets/x
    * pattern.
    */
  var dealId: js.UndefOr[String] = js.native
  /**
    * The environment on which to filter; optional.
    */
  var environment: js.UndefOr[String] = js.native
  /**
    * The list of formats on which to filter; may be empty. The filters
    * represented by multiple formats are ORed together (i.e., if non-empty,
    * results must match any one of the formats).
    */
  var formats: js.UndefOr[js.Array[String]] = js.native
  /**
    * A user-defined name of the filter set. Filter set names must be unique
    * globally and match one of the patterns:  - `bidders/x/filterSets/x (for
    * accessing bidder-level troubleshooting data) -
    * `bidders/x/accounts/x/filterSets/x (for accessing account-level
    * troubleshooting data)  This field is required in create operations.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of platforms on which to filter; may be empty. The filters
    * represented by multiple platforms are ORed together (i.e., if non-empty,
    * results must match any one of the platforms).
    */
  var platforms: js.UndefOr[js.Array[String]] = js.native
  /**
    * For Open Bidding partners only. The list of publisher identifiers on
    * which to filter; may be empty. The filters represented by multiple
    * publisher identifiers are ORed together.
    */
  var publisherIdentifiers: js.UndefOr[js.Array[String]] = js.native
  /**
    * An open-ended realtime time range, defined by the aggregation start
    * timestamp.
    */
  var realtimeTimeRange: js.UndefOr[SchemaRealtimeTimeRange] = js.native
  /**
    * A relative date range, defined by an offset from today and a duration.
    * Interpreted relative to Pacific time zone.
    */
  var relativeDateRange: js.UndefOr[SchemaRelativeDateRange] = js.native
  /**
    * For Authorized Buyers only. The list of IDs of the seller (publisher)
    * networks on which to filter; may be empty. The filters represented by
    * multiple seller network IDs are ORed together (i.e., if non-empty,
    * results must match any one of the publisher networks). See
    * [seller-network-ids](https://developers.google.com/authorized-buyers/rtb/downloads/seller-network-ids)
    * file for the set of existing seller network IDs.
    */
  var sellerNetworkIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The granularity of time intervals if a time series breakdown is desired;
    * optional.
    */
  var timeSeriesGranularity: js.UndefOr[String] = js.native
}

object SchemaFilterSet {
  @scala.inline
  def apply(
    absoluteDateRange: SchemaAbsoluteDateRange = null,
    breakdownDimensions: js.Array[String] = null,
    creativeId: String = null,
    dealId: String = null,
    environment: String = null,
    formats: js.Array[String] = null,
    name: String = null,
    platforms: js.Array[String] = null,
    publisherIdentifiers: js.Array[String] = null,
    realtimeTimeRange: SchemaRealtimeTimeRange = null,
    relativeDateRange: SchemaRelativeDateRange = null,
    sellerNetworkIds: js.Array[Double] = null,
    timeSeriesGranularity: String = null
  ): SchemaFilterSet = {
    val __obj = js.Dynamic.literal()
    if (absoluteDateRange != null) __obj.updateDynamic("absoluteDateRange")(absoluteDateRange.asInstanceOf[js.Any])
    if (breakdownDimensions != null) __obj.updateDynamic("breakdownDimensions")(breakdownDimensions.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (publisherIdentifiers != null) __obj.updateDynamic("publisherIdentifiers")(publisherIdentifiers.asInstanceOf[js.Any])
    if (realtimeTimeRange != null) __obj.updateDynamic("realtimeTimeRange")(realtimeTimeRange.asInstanceOf[js.Any])
    if (relativeDateRange != null) __obj.updateDynamic("relativeDateRange")(relativeDateRange.asInstanceOf[js.Any])
    if (sellerNetworkIds != null) __obj.updateDynamic("sellerNetworkIds")(sellerNetworkIds.asInstanceOf[js.Any])
    if (timeSeriesGranularity != null) __obj.updateDynamic("timeSeriesGranularity")(timeSeriesGranularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFilterSet]
  }
}

