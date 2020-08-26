package typings.jqueryFancytree.Fancytree.Extensions

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryFancytree.jqueryFancytreeStrings.dimm
import typings.jqueryFancytree.jqueryFancytreeStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define filter-extension options
  */
@js.native
trait Filter
  extends /* extension */ StringDictionary[js.Any] {
  /**
    * Re-apply last filter if lazy data is loaded
    */
  var autoApply: js.UndefOr[Boolean] = js.native
  /**
    * Expand all branches that contain matches while filtered
    */
  var autoExpand: js.UndefOr[Boolean] = js.native
  /**
    * Show a badge with number of matching child nodes near parent icons
    */
  var counter: js.UndefOr[Boolean] = js.native
  /**
    * Match single characters in order, e.g. 'fb' will match 'FooBar'
    */
  var fuzzy: js.UndefOr[Boolean] = js.native
  /**
    * Hide counter badge if parent is expanded
    */
  var hideExpandedCounter: js.UndefOr[Boolean] = js.native
  /**
    * Hide expanders if all child nodes are hidden by filter
    */
  var hideExpanders: js.UndefOr[Boolean] = js.native
  /**
    * Highlight matches by wrapping inside <mark> tags
    */
  var highlight: js.UndefOr[Boolean] = js.native
  /**
    * Match end nodes only
    */
  var leavesOnly: js.UndefOr[Boolean] = js.native
  /**
    * Grayout unmatched nodes (pass "hide" to remove unmatched node instead); default 'dimm'
    */
  var mode: js.UndefOr[dimm | hide] = js.native
  /**
    * Display a 'no data' status node if result is empty
    */
  var nodata: js.UndefOr[Boolean] = js.native
}

object Filter {
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setAutoApply(value: Boolean): Self = this.set("autoApply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoApply: Self = this.set("autoApply", js.undefined)
    @scala.inline
    def setAutoExpand(value: Boolean): Self = this.set("autoExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoExpand: Self = this.set("autoExpand", js.undefined)
    @scala.inline
    def setCounter(value: Boolean): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    @scala.inline
    def setFuzzy(value: Boolean): Self = this.set("fuzzy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuzzy: Self = this.set("fuzzy", js.undefined)
    @scala.inline
    def setHideExpandedCounter(value: Boolean): Self = this.set("hideExpandedCounter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideExpandedCounter: Self = this.set("hideExpandedCounter", js.undefined)
    @scala.inline
    def setHideExpanders(value: Boolean): Self = this.set("hideExpanders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideExpanders: Self = this.set("hideExpanders", js.undefined)
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setLeavesOnly(value: Boolean): Self = this.set("leavesOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeavesOnly: Self = this.set("leavesOnly", js.undefined)
    @scala.inline
    def setMode(value: dimm | hide): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNodata(value: Boolean): Self = this.set("nodata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodata: Self = this.set("nodata", js.undefined)
  }
  
}

