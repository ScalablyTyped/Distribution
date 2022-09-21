package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLineitemsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser to list line items for.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Allows filtering by line item properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator used on `flight.dateRange.endDate` must be LESS THAN (<). * The operator used on `updateTime` must be `GREATER THAN OR EQUAL TO (\>=)` or `LESS THAN OR EQUAL TO (<=)`. * The operator used on `warningMessages` must be `HAS (:)`. * The operators used on all other fields must be `EQUALS (=)`. * Supported properties: - `campaignId` - `displayName` - `insertionOrderId` - `entityStatus` - `lineItemId` - `lineItemType` - `flight.dateRange.endDate` (input formatted as YYYY-MM-DD) - `warningMessages` - `flight.triggerId` - `updateTime` (input in ISO 8601 format, or YYYY-MM-DDTHH:MM:SSZ) - `targetedChannelId` - `targetedNegativeKeywordListId` Examples: * All line items under an insertion order: `insertionOrderId="1234"` * All `ENTITY_STATUS_ACTIVE` or `ENTITY_STATUS_PAUSED` and `LINE_ITEM_TYPE_DISPLAY_DEFAULT` line items under an advertiser: `(entityStatus="ENTITY_STATUS_ACTIVE" OR entityStatus="ENTITY_STATUS_PAUSED") AND lineItemType="LINE_ITEM_TYPE_DISPLAY_DEFAULT"` * All line items whose flight dates end before March 28, 2019: `flight.dateRange.endDate<"2019-03-28"` * All line items that have `NO_VALID_CREATIVE` in `warningMessages`: `warningMessages:"NO_VALID_CREATIVE"` * All line items with an update time less than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime<="2020-11-04T18:54:47Z"` * All line items with an update time greater than or equal to `2020-11-04T18:54:47Z (format of ISO 8601)`: `updateTime\>="2020-11-04T18:54:47Z"` * All line items that are using both the specified channel and specified negative keyword list in their targeting: `targetedNegativeKeywordListId=789 AND targetedChannelId=12345` The length of this field should be no more than 500 characters.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Field by which to sort the list. Acceptable values are: * `displayName` (default) * `entityStatus` * `flight.dateRange.endDate` * `updateTime` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. Example: `displayName desc`.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. Must be between `1` and `100`. If unspecified will default to `100`. Returns error code `INVALID_ARGUMENT` if an invalid value is specified.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListLineItems` method. If not specified, the first page of results will be returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersLineitemsList {
  
  inline def apply(): ParamsResourceAdvertisersLineitemsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLineitemsList]
  }
  
  extension [Self <: ParamsResourceAdvertisersLineitemsList](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
