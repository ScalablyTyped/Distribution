package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of filters that is applied to a request for data. Within a filter
  * set, an AND operation is performed across the filters represented by each
  * field. An OR operation is performed across the filters represented by the
  * multiple values of a repeated field, e.g., &quot;format=VIDEO AND
  * deal_id=12 AND (seller_network_id=34 OR seller_network_id=56)&quot;.
  */
@js.native
trait SchemaFilterSet extends StObject {
  
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
  implicit class SchemaFilterSetMutableBuilder[Self <: SchemaFilterSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteDateRange(value: SchemaAbsoluteDateRange): Self = StObject.set(x, "absoluteDateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteDateRangeUndefined: Self = StObject.set(x, "absoluteDateRange", js.undefined)
    
    @scala.inline
    def setBreakdownDimensions(value: js.Array[String]): Self = StObject.set(x, "breakdownDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakdownDimensionsUndefined: Self = StObject.set(x, "breakdownDimensions", js.undefined)
    
    @scala.inline
    def setBreakdownDimensionsVarargs(value: String*): Self = StObject.set(x, "breakdownDimensions", js.Array(value :_*))
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value :_*))
    
    @scala.inline
    def setPublisherIdentifiers(value: js.Array[String]): Self = StObject.set(x, "publisherIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherIdentifiersUndefined: Self = StObject.set(x, "publisherIdentifiers", js.undefined)
    
    @scala.inline
    def setPublisherIdentifiersVarargs(value: String*): Self = StObject.set(x, "publisherIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setRealtimeTimeRange(value: SchemaRealtimeTimeRange): Self = StObject.set(x, "realtimeTimeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealtimeTimeRangeUndefined: Self = StObject.set(x, "realtimeTimeRange", js.undefined)
    
    @scala.inline
    def setRelativeDateRange(value: SchemaRelativeDateRange): Self = StObject.set(x, "relativeDateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeDateRangeUndefined: Self = StObject.set(x, "relativeDateRange", js.undefined)
    
    @scala.inline
    def setSellerNetworkIds(value: js.Array[Double]): Self = StObject.set(x, "sellerNetworkIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerNetworkIdsUndefined: Self = StObject.set(x, "sellerNetworkIds", js.undefined)
    
    @scala.inline
    def setSellerNetworkIdsVarargs(value: Double*): Self = StObject.set(x, "sellerNetworkIds", js.Array(value :_*))
    
    @scala.inline
    def setTimeSeriesGranularity(value: String): Self = StObject.set(x, "timeSeriesGranularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeriesGranularityUndefined: Self = StObject.set(x, "timeSeriesGranularity", js.undefined)
  }
}
