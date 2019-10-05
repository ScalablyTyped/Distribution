package typings.jqueryDotFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryDotFancytree.jqueryDotFancytreeStrings.dimm
import typings.jqueryDotFancytree.jqueryDotFancytreeStrings.string
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
  var autoApply: Boolean
  /**
    * Expand all branches that contain matches while filtered
    */
  var autoExpand: Boolean
  /**
    * Show a badge with number of matching child nodes near parent icons
    */
  var counter: Boolean
  /**
    * Match single characters in order, e.g. 'fb' will match 'FooBar'
    */
  var fuzzy: Boolean
  /**
    * Hide counter badge if parent is expanded
    */
  var hideExpandedCounter: Boolean
  /**
    * Hide expanders if all child nodes are hidden by filter
    */
  var hideExpanders: Boolean
  /**
    * Highlight matches by wrapping inside <mark> tags
    */
  var highlight: Boolean
  /**
    * Match end nodes only
    */
  var leavesOnly: Boolean
  /**
    * Grayout unmatched nodes (pass "hide" to remove unmatched node instead); default 'dimm'
    */
  var mode: dimm | string
  /**
    * Display a 'no data' status node if result is empty
    */
  var nodata: Boolean
}

object Filter {
  @scala.inline
  def apply(
    autoApply: Boolean,
    autoExpand: Boolean,
    counter: Boolean,
    fuzzy: Boolean,
    hideExpandedCounter: Boolean,
    hideExpanders: Boolean,
    highlight: Boolean,
    leavesOnly: Boolean,
    mode: dimm | string,
    nodata: Boolean,
    StringDictionary: /**
    * Support misc options
    */
  /* key */ StringDictionary[js.Any] = null
  ): Filter = {
    val __obj = js.Dynamic.literal(autoApply = autoApply, autoExpand = autoExpand, counter = counter, fuzzy = fuzzy, hideExpandedCounter = hideExpandedCounter, hideExpanders = hideExpanders, highlight = highlight, leavesOnly = leavesOnly, mode = mode.asInstanceOf[js.Any], nodata = nodata)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Filter]
  }
}

