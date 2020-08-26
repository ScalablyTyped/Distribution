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
  def apply(): SchemaFilterSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterSet]
  }
  @scala.inline
  implicit class SchemaFilterSetOps[Self <: SchemaFilterSet] (val x: Self) extends AnyVal {
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
    def setAbsoluteDateRange(value: SchemaAbsoluteDateRange): Self = this.set("absoluteDateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteDateRange: Self = this.set("absoluteDateRange", js.undefined)
    @scala.inline
    def setBreakdownDimensionsVarargs(value: String*): Self = this.set("breakdownDimensions", js.Array(value :_*))
    @scala.inline
    def setBreakdownDimensions(value: js.Array[String]): Self = this.set("breakdownDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakdownDimensions: Self = this.set("breakdownDimensions", js.undefined)
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    @scala.inline
    def setDealId(value: String): Self = this.set("dealId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealId: Self = this.set("dealId", js.undefined)
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setFormatsVarargs(value: String*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: js.Array[String]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlatformsVarargs(value: String*): Self = this.set("platforms", js.Array(value :_*))
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = this.set("platforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
    @scala.inline
    def setPublisherIdentifiersVarargs(value: String*): Self = this.set("publisherIdentifiers", js.Array(value :_*))
    @scala.inline
    def setPublisherIdentifiers(value: js.Array[String]): Self = this.set("publisherIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherIdentifiers: Self = this.set("publisherIdentifiers", js.undefined)
    @scala.inline
    def setRealtimeTimeRange(value: SchemaRealtimeTimeRange): Self = this.set("realtimeTimeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealtimeTimeRange: Self = this.set("realtimeTimeRange", js.undefined)
    @scala.inline
    def setRelativeDateRange(value: SchemaRelativeDateRange): Self = this.set("relativeDateRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeDateRange: Self = this.set("relativeDateRange", js.undefined)
    @scala.inline
    def setSellerNetworkIdsVarargs(value: Double*): Self = this.set("sellerNetworkIds", js.Array(value :_*))
    @scala.inline
    def setSellerNetworkIds(value: js.Array[Double]): Self = this.set("sellerNetworkIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerNetworkIds: Self = this.set("sellerNetworkIds", js.undefined)
    @scala.inline
    def setTimeSeriesGranularity(value: String): Self = this.set("timeSeriesGranularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSeriesGranularity: Self = this.set("timeSeriesGranularity", js.undefined)
  }
  
}

