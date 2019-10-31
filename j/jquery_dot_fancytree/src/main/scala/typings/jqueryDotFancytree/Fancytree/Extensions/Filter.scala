package typings.jqueryDotFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryDotFancytree.jqueryDotFancytreeStrings.dimm
import typings.jqueryDotFancytree.jqueryDotFancytreeStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define filter-extension options
  */
trait Filter
  extends /**
  * Support misc options
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Re-apply last filter if lazy data is loaded
    */
  var autoApply: js.UndefOr[Boolean] = js.undefined
  /**
    * Expand all branches that contain matches while filtered
    */
  var autoExpand: js.UndefOr[Boolean] = js.undefined
  /**
    * Show a badge with number of matching child nodes near parent icons
    */
  var counter: js.UndefOr[Boolean] = js.undefined
  /**
    * Match single characters in order, e.g. 'fb' will match 'FooBar'
    */
  var fuzzy: js.UndefOr[Boolean] = js.undefined
  /**
    * Hide counter badge if parent is expanded
    */
  var hideExpandedCounter: js.UndefOr[Boolean] = js.undefined
  /**
    * Hide expanders if all child nodes are hidden by filter
    */
  var hideExpanders: js.UndefOr[Boolean] = js.undefined
  /**
    * Highlight matches by wrapping inside <mark> tags
    */
  var highlight: js.UndefOr[Boolean] = js.undefined
  /**
    * Match end nodes only
    */
  var leavesOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Grayout unmatched nodes (pass "hide" to remove unmatched node instead); default 'dimm'
    */
  var mode: js.UndefOr[dimm | hide] = js.undefined
  /**
    * Display a 'no data' status node if result is empty
    */
  var nodata: js.UndefOr[Boolean] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Support misc options
    */
  /* key */ StringDictionary[js.Any] = null,
    autoApply: js.UndefOr[Boolean] = js.undefined,
    autoExpand: js.UndefOr[Boolean] = js.undefined,
    counter: js.UndefOr[Boolean] = js.undefined,
    fuzzy: js.UndefOr[Boolean] = js.undefined,
    hideExpandedCounter: js.UndefOr[Boolean] = js.undefined,
    hideExpanders: js.UndefOr[Boolean] = js.undefined,
    highlight: js.UndefOr[Boolean] = js.undefined,
    leavesOnly: js.UndefOr[Boolean] = js.undefined,
    mode: dimm | hide = null,
    nodata: js.UndefOr[Boolean] = js.undefined
  ): Filter = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply)
    if (!js.isUndefined(autoExpand)) __obj.updateDynamic("autoExpand")(autoExpand)
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter)
    if (!js.isUndefined(fuzzy)) __obj.updateDynamic("fuzzy")(fuzzy)
    if (!js.isUndefined(hideExpandedCounter)) __obj.updateDynamic("hideExpandedCounter")(hideExpandedCounter)
    if (!js.isUndefined(hideExpanders)) __obj.updateDynamic("hideExpanders")(hideExpanders)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (!js.isUndefined(leavesOnly)) __obj.updateDynamic("leavesOnly")(leavesOnly)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(nodata)) __obj.updateDynamic("nodata")(nodata)
    __obj.asInstanceOf[Filter]
  }
}

