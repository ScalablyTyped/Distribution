package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for querying Drive activity.
  */
@js.native
trait SchemaQueryDriveActivityRequest extends js.Object {
  /**
    * Return activities for this Drive folder and all children and descendants.
    * The format is &quot;items/ITEM_ID&quot;.
    */
  var ancestorName: js.UndefOr[String] = js.native
  /**
    * Details on how to consolidate related actions that make up the activity.
    * If not set, then related actions will not be consolidated.
    */
  var consolidationStrategy: js.UndefOr[SchemaConsolidationStrategy] = js.native
  /**
    * The filtering for items returned from this query request. The format of
    * the filter string is a sequence of expressions, joined by an optional
    * &quot;AND&quot;, where each expression is of the form &quot;field
    * operator value&quot;.  Supported fields:    - &lt;tt&gt;time&lt;/tt&gt;:
    * Uses numerical operators on date values either in     terms of
    * milliseconds since Jan 1, 1970 or in RFC 3339 format.     Examples: -
    * &lt;tt&gt;time &gt; 1452409200000 AND time &lt;= 1492812924310&lt;/tt&gt;
    * - &lt;tt&gt;time &gt;= &quot;2016-01-10T01:02:03-05:00&quot;&lt;/tt&gt;
    * - &lt;tt&gt;detail.action_detail_case&lt;/tt&gt;: Uses the
    * &quot;has&quot; operator (:) and     either a singular value or a list of
    * allowed action types enclosed in     parentheses.     Examples:       -
    * &lt;tt&gt;detail.action_detail_case: RENAME&lt;/tt&gt;       -
    * &lt;tt&gt;detail.action_detail_case:(CREATE UPLOAD)&lt;/tt&gt;       -
    * &lt;tt&gt;-detail.action_detail_case:MOVE&lt;/tt&gt;
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Return activities for this Drive item. The format is
    * &quot;items/ITEM_ID&quot;.
    */
  var itemName: js.UndefOr[String] = js.native
  /**
    * The requested number of activity to return. If not set, a default value
    * will be used.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous QueryDriveActivity
    * request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SchemaQueryDriveActivityRequest {
  @scala.inline
  def apply(
    ancestorName: String = null,
    consolidationStrategy: SchemaConsolidationStrategy = null,
    filter: String = null,
    itemName: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null
  ): SchemaQueryDriveActivityRequest = {
    val __obj = js.Dynamic.literal()
    if (ancestorName != null) __obj.updateDynamic("ancestorName")(ancestorName.asInstanceOf[js.Any])
    if (consolidationStrategy != null) __obj.updateDynamic("consolidationStrategy")(consolidationStrategy.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (itemName != null) __obj.updateDynamic("itemName")(itemName.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryDriveActivityRequest]
  }
}

