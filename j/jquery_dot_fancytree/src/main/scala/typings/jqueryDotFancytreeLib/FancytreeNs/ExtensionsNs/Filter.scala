package typings
package jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs

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
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Re-apply last filter if lazy data is loaded
    */
  var autoApply: scala.Boolean
  /**
    * Expand all branches that contain matches while filtered
    */
  var autoExpand: scala.Boolean
  /**
    * Show a badge with number of matching child nodes near parent icons
    */
  var counter: scala.Boolean
  /**
    * Match single characters in order, e.g. 'fb' will match 'FooBar'
    */
  var fuzzy: scala.Boolean
  /**
    * Hide counter badge if parent is expanded
    */
  var hideExpandedCounter: scala.Boolean
  /**
    * Hide expanders if all child nodes are hidden by filter
    */
  var hideExpanders: scala.Boolean
  /**
    * Highlight matches by wrapping inside <mark> tags
    */
  var highlight: scala.Boolean
  /**
    * Match end nodes only
    */
  var leavesOnly: scala.Boolean
  /**
    * Grayout unmatched nodes (pass "hide" to remove unmatched node instead); default 'dimm'
    */
  var mode: jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.dimm | jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.string
  /**
    * Display a 'no data' status node if result is empty
    */
  var nodata: scala.Boolean
}

object Filter {
  @scala.inline
  def apply(
    autoApply: scala.Boolean,
    autoExpand: scala.Boolean,
    counter: scala.Boolean,
    fuzzy: scala.Boolean,
    hideExpandedCounter: scala.Boolean,
    hideExpanders: scala.Boolean,
    highlight: scala.Boolean,
    leavesOnly: scala.Boolean,
    mode: jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.dimm | jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.string,
    nodata: scala.Boolean,
    StringDictionary: /**
    * Support misc options
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoApply")(autoApply)
    __obj.updateDynamic("autoExpand")(autoExpand)
    __obj.updateDynamic("counter")(counter)
    __obj.updateDynamic("fuzzy")(fuzzy)
    __obj.updateDynamic("hideExpandedCounter")(hideExpandedCounter)
    __obj.updateDynamic("hideExpanders")(hideExpanders)
    __obj.updateDynamic("highlight")(highlight)
    __obj.updateDynamic("leavesOnly")(leavesOnly)
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.updateDynamic("nodata")(nodata)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Filter]
  }
}

