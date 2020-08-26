package typings.jqueryFancytree.Fancytree

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.jqueryFancytree.Fancytree.Extensions.DragAndDrop5
import typings.jqueryFancytree.Fancytree.Extensions.Filter
import typings.jqueryFancytree.Fancytree.Extensions.Table
import typings.jqueryFancytree.JQuery
import typings.jqueryFancytree.anon.Bottom
import typings.jqueryFancytree.anon.Cache
import typings.jqueryFancytree.jqueryFancytreeBooleans.`false`
import typings.jqueryFancytree.jqueryFancytreeNumbers.`0`
import typings.jqueryFancytree.jqueryFancytreeNumbers.`1`
import typings.jqueryFancytree.jqueryFancytreeNumbers.`2`
import typings.jqueryFancytree.jqueryFancytreeNumbers.`3`
import typings.jqueryFancytree.jqueryFancytreeNumbers.`4`
import typings.jqueryFancytree.jqueryFancytreeStrings.dnd5
import typings.jqueryFancytree.jqueryFancytreeStrings.filter
import typings.jqueryFancytree.jqueryFancytreeStrings.table
import typings.jqueryui.JQueryUI.EffectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancytreeOptions
  extends FancytreeEvents
     with /** Options for misc extensions - see docs for typings */
/* extension */ StringDictionary[js.Any] {
  /** Make sure that the active node is always visible, i.e. its parents are expanded (default: true). */
  var activeVisible: js.UndefOr[Boolean] = js.native
  /** Default options for ajax requests. */
  var ajax: js.UndefOr[Cache] = js.native
  /** (default: false) Add WAI-ARIA attributes to markup */
  var aria: js.UndefOr[Boolean] = js.native
  /** Activate a node when focused with the keyboard (default: true) */
  var autoActivate: js.UndefOr[Boolean] = js.native
  /** Automatically collapse all siblings, when a node is expanded (default: false). */
  var autoCollapse: js.UndefOr[Boolean] = js.native
  /** Scroll node into visible area, when focused by keyboard (default: false). */
  var autoScroll: js.UndefOr[Boolean] = js.native
  /** Display checkboxes to allow selection (default: false) */
  var checkbox: js.UndefOr[
    Boolean | String | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean])
  ] = js.native
  /** Defines what happens, when the user click a folder node. (default: activate_dblclick_expands) */
  var clickFolderMode: js.UndefOr[FancytreeClickFolderMode] = js.native
  /** 0..4 (null: use global setting $.ui.fancytree.debugInfo) */
  var debugLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.native
  /** callback(node) is called for new nodes without a key. Must return a new unique key. (default null: generates default keys like that: "_" + counter) */
  var defaultKey: js.UndefOr[js.Function1[/* node */ FancytreeNode, String]] = js.native
  ////////////////
  // EXTENSIONS //
  ////////////////
  var dnd5: js.UndefOr[DragAndDrop5] = js.native
  /** Accept passing ajax data in a property named `d` (default: true). */
  var enableAspx: js.UndefOr[Boolean] = js.native
  /** Enable titles (default: false) */
  var enableTitles: js.UndefOr[Boolean] = js.native
  /** List of active extensions (default: []) */
  var extensions: js.UndefOr[js.Array[dnd5 | filter | table | String]] = js.native
  var filter: js.UndefOr[Filter] = js.native
  /** Set focus when node is checked by a mouse click (default: false) */
  var focusOnSelect: js.UndefOr[Boolean] = js.native
  /** Add `id="..."` to node markup (default: true). */
  var generateIds: js.UndefOr[Boolean] = js.native
  /** Node icon url, if only filename, please use imagePath to set the path */
  var icon: js.UndefOr[Boolean | String] = js.native
  /** Prefix (default: "ft_") */
  var idPrefix: js.UndefOr[String] = js.native
  /** Path to a folder containing icons (default: null, using 'skin/' subdirectory). */
  var imagePath: js.UndefOr[String] = js.native
  /** (default: "/") */
  var keyPathSeparator: js.UndefOr[String] = js.native
  /** Support keyboard navigation (default: true). */
  var keyboard: js.UndefOr[Boolean] = js.native
  /** 2: top-level nodes are not collapsible (default: 1) */
  var minExpandLevel: js.UndefOr[Double] = js.native
  /** navigate to next node by typing the first letters (default: false) */
  var quicksearch: js.UndefOr[Boolean] = js.native
  /** optional margins for node.scrollIntoView() (default: {top: 0, bottom: 0}) */
  var scrollOfs: js.UndefOr[Bottom] = js.native
  /** scrollable container for node.scrollIntoView() (default: $container) */
  var scrollParent: js.UndefOr[JQuery | Null] = js.native
  /** default: multi_hier */
  var selectMode: js.UndefOr[FancytreeSelectMode] = js.native
  /** Used to Initialize the tree. */
  var source: js.UndefOr[js.Array[_] | js.Any] = js.native
  /** Translation table */
  var strings: js.UndefOr[TranslationTable] = js.native
  /** Add tabindex='0' to container, so tree can be reached using TAB */
  var tabbable: js.UndefOr[Boolean] = js.native
  var table: js.UndefOr[Table] = js.native
  /** Add tabindex='0' to node title span, so it can receive keyboard focus */
  var titlesTabbable: js.UndefOr[Boolean] = js.native
  /** Animation options, false:off (default: { effect: "blind", options: {direction: "vertical", scale: "box"}, duration: 200 }) */
  var toggleEffect: js.UndefOr[`false` | EffectOptions] = js.native
  /** Tooltips */
  var tooltip: js.UndefOr[Boolean] = js.native
  /** (dynamic Option)Prevent (de-)selection using mouse or keyboard. */
  var unselectable: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.native
  /** (dynamic Option)Ignore this node when calculating the partsel status of parent nodes in selectMode 3 propagation. */
  var unselectableIgnore: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.native
  /** (dynamic Option)Use this as constant selected value (overriding selectMode 3 propagation). */
  var unselectableStatus: js.UndefOr[
    Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
  ] = js.native
}

object FancytreeOptions {
  @scala.inline
  def apply(): FancytreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancytreeOptions]
  }
  @scala.inline
  implicit class FancytreeOptionsOps[Self <: FancytreeOptions] (val x: Self) extends AnyVal {
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
    def setActiveVisible(value: Boolean): Self = this.set("activeVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveVisible: Self = this.set("activeVisible", js.undefined)
    @scala.inline
    def setAjax(value: Cache): Self = this.set("ajax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    @scala.inline
    def setAria(value: Boolean): Self = this.set("aria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    @scala.inline
    def setAutoActivate(value: Boolean): Self = this.set("autoActivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoActivate: Self = this.set("autoActivate", js.undefined)
    @scala.inline
    def setAutoCollapse(value: Boolean): Self = this.set("autoCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCollapse: Self = this.set("autoCollapse", js.undefined)
    @scala.inline
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    @scala.inline
    def setCheckboxFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = this.set("checkbox", js.Any.fromFunction2(value))
    @scala.inline
    def setCheckbox(
      value: Boolean | String | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean])
    ): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    @scala.inline
    def setClickFolderMode(value: FancytreeClickFolderMode): Self = this.set("clickFolderMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickFolderMode: Self = this.set("clickFolderMode", js.undefined)
    @scala.inline
    def setDebugLevel(value: `0` | `1` | `2` | `3` | `4`): Self = this.set("debugLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugLevel: Self = this.set("debugLevel", js.undefined)
    @scala.inline
    def setDefaultKey(value: /* node */ FancytreeNode => String): Self = this.set("defaultKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDefaultKey: Self = this.set("defaultKey", js.undefined)
    @scala.inline
    def setDnd5(value: DragAndDrop5): Self = this.set("dnd5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnd5: Self = this.set("dnd5", js.undefined)
    @scala.inline
    def setEnableAspx(value: Boolean): Self = this.set("enableAspx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAspx: Self = this.set("enableAspx", js.undefined)
    @scala.inline
    def setEnableTitles(value: Boolean): Self = this.set("enableTitles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTitles: Self = this.set("enableTitles", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: (dnd5 | filter | table | String)*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[dnd5 | filter | table | String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFilter(value: Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFocusOnSelect(value: Boolean): Self = this.set("focusOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnSelect: Self = this.set("focusOnSelect", js.undefined)
    @scala.inline
    def setGenerateIds(value: Boolean): Self = this.set("generateIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateIds: Self = this.set("generateIds", js.undefined)
    @scala.inline
    def setIcon(value: Boolean | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdPrefix: Self = this.set("idPrefix", js.undefined)
    @scala.inline
    def setImagePath(value: String): Self = this.set("imagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePath: Self = this.set("imagePath", js.undefined)
    @scala.inline
    def setKeyPathSeparator(value: String): Self = this.set("keyPathSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPathSeparator: Self = this.set("keyPathSeparator", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMinExpandLevel(value: Double): Self = this.set("minExpandLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinExpandLevel: Self = this.set("minExpandLevel", js.undefined)
    @scala.inline
    def setQuicksearch(value: Boolean): Self = this.set("quicksearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuicksearch: Self = this.set("quicksearch", js.undefined)
    @scala.inline
    def setScrollOfs(value: Bottom): Self = this.set("scrollOfs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOfs: Self = this.set("scrollOfs", js.undefined)
    @scala.inline
    def setScrollParent(value: JQuery): Self = this.set("scrollParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollParent: Self = this.set("scrollParent", js.undefined)
    @scala.inline
    def setScrollParentNull: Self = this.set("scrollParent", null)
    @scala.inline
    def setSelectMode(value: FancytreeSelectMode): Self = this.set("selectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectMode: Self = this.set("selectMode", js.undefined)
    @scala.inline
    def setSourceVarargs(value: js.Any*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: js.Array[_] | js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStrings(value: TranslationTable): Self = this.set("strings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    @scala.inline
    def setTabbable(value: Boolean): Self = this.set("tabbable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabbable: Self = this.set("tabbable", js.undefined)
    @scala.inline
    def setTable(value: Table): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTitlesTabbable(value: Boolean): Self = this.set("titlesTabbable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlesTabbable: Self = this.set("titlesTabbable", js.undefined)
    @scala.inline
    def setToggleEffect(value: `false` | EffectOptions): Self = this.set("toggleEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleEffect: Self = this.set("toggleEffect", js.undefined)
    @scala.inline
    def setTooltip(value: Boolean): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setUnselectableFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = this.set("unselectable", js.Any.fromFunction2(value))
    @scala.inline
    def setUnselectable(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
    @scala.inline
    def setUnselectableIgnoreFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = this.set("unselectableIgnore", js.Any.fromFunction2(value))
    @scala.inline
    def setUnselectableIgnore(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = this.set("unselectableIgnore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectableIgnore: Self = this.set("unselectableIgnore", js.undefined)
    @scala.inline
    def setUnselectableStatusFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = this.set("unselectableStatus", js.Any.fromFunction2(value))
    @scala.inline
    def setUnselectableStatus(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = this.set("unselectableStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectableStatus: Self = this.set("unselectableStatus", js.undefined)
  }
  
}

