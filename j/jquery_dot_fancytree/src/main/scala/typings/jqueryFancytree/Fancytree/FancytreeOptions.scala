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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class FancytreeOptionsMutableBuilder[Self <: FancytreeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveVisible(value: Boolean): Self = StObject.set(x, "activeVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveVisibleUndefined: Self = StObject.set(x, "activeVisible", js.undefined)
    
    @scala.inline
    def setAjax(value: Cache): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
    
    @scala.inline
    def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    @scala.inline
    def setAutoActivate(value: Boolean): Self = StObject.set(x, "autoActivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoActivateUndefined: Self = StObject.set(x, "autoActivate", js.undefined)
    
    @scala.inline
    def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
    
    @scala.inline
    def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    @scala.inline
    def setCheckbox(
      value: Boolean | String | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean])
    ): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = StObject.set(x, "checkbox", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    @scala.inline
    def setClickFolderMode(value: FancytreeClickFolderMode): Self = StObject.set(x, "clickFolderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickFolderModeUndefined: Self = StObject.set(x, "clickFolderMode", js.undefined)
    
    @scala.inline
    def setDebugLevel(value: `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugLevelUndefined: Self = StObject.set(x, "debugLevel", js.undefined)
    
    @scala.inline
    def setDefaultKey(value: /* node */ FancytreeNode => String): Self = StObject.set(x, "defaultKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultKeyUndefined: Self = StObject.set(x, "defaultKey", js.undefined)
    
    @scala.inline
    def setDnd5(value: DragAndDrop5): Self = StObject.set(x, "dnd5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnd5Undefined: Self = StObject.set(x, "dnd5", js.undefined)
    
    @scala.inline
    def setEnableAspx(value: Boolean): Self = StObject.set(x, "enableAspx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAspxUndefined: Self = StObject.set(x, "enableAspx", js.undefined)
    
    @scala.inline
    def setEnableTitles(value: Boolean): Self = StObject.set(x, "enableTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTitlesUndefined: Self = StObject.set(x, "enableTitles", js.undefined)
    
    @scala.inline
    def setExtensions(value: js.Array[dnd5 | filter | table | String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: (dnd5 | filter | table | String)*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFocusOnSelect(value: Boolean): Self = StObject.set(x, "focusOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOnSelectUndefined: Self = StObject.set(x, "focusOnSelect", js.undefined)
    
    @scala.inline
    def setGenerateIds(value: Boolean): Self = StObject.set(x, "generateIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateIdsUndefined: Self = StObject.set(x, "generateIds", js.undefined)
    
    @scala.inline
    def setIcon(value: Boolean | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    @scala.inline
    def setImagePath(value: String): Self = StObject.set(x, "imagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePathUndefined: Self = StObject.set(x, "imagePath", js.undefined)
    
    @scala.inline
    def setKeyPathSeparator(value: String): Self = StObject.set(x, "keyPathSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathSeparatorUndefined: Self = StObject.set(x, "keyPathSeparator", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setMinExpandLevel(value: Double): Self = StObject.set(x, "minExpandLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExpandLevelUndefined: Self = StObject.set(x, "minExpandLevel", js.undefined)
    
    @scala.inline
    def setQuicksearch(value: Boolean): Self = StObject.set(x, "quicksearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuicksearchUndefined: Self = StObject.set(x, "quicksearch", js.undefined)
    
    @scala.inline
    def setScrollOfs(value: Bottom): Self = StObject.set(x, "scrollOfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOfsUndefined: Self = StObject.set(x, "scrollOfs", js.undefined)
    
    @scala.inline
    def setScrollParent(value: JQuery): Self = StObject.set(x, "scrollParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollParentNull: Self = StObject.set(x, "scrollParent", null)
    
    @scala.inline
    def setScrollParentUndefined: Self = StObject.set(x, "scrollParent", js.undefined)
    
    @scala.inline
    def setSelectMode(value: FancytreeSelectMode): Self = StObject.set(x, "selectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectModeUndefined: Self = StObject.set(x, "selectMode", js.undefined)
    
    @scala.inline
    def setSource(value: js.Array[_] | js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: js.Any*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setStrings(value: TranslationTable): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    @scala.inline
    def setTabbable(value: Boolean): Self = StObject.set(x, "tabbable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabbableUndefined: Self = StObject.set(x, "tabbable", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setTitlesTabbable(value: Boolean): Self = StObject.set(x, "titlesTabbable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlesTabbableUndefined: Self = StObject.set(x, "titlesTabbable", js.undefined)
    
    @scala.inline
    def setToggleEffect(value: `false` | EffectOptions): Self = StObject.set(x, "toggleEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleEffectUndefined: Self = StObject.set(x, "toggleEffect", js.undefined)
    
    @scala.inline
    def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setUnselectable(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = StObject.set(x, "unselectable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnselectableIgnore(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = StObject.set(x, "unselectableIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableIgnoreFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = StObject.set(x, "unselectableIgnore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnselectableIgnoreUndefined: Self = StObject.set(x, "unselectableIgnore", js.undefined)
    
    @scala.inline
    def setUnselectableStatus(
      value: Boolean | (js.Function2[/* event */ JQueryEventObject, /* data */ EventData, js.UndefOr[Boolean]])
    ): Self = StObject.set(x, "unselectableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectableStatusFunction2(value: (/* event */ JQueryEventObject, /* data */ EventData) => js.UndefOr[Boolean]): Self = StObject.set(x, "unselectableStatus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnselectableStatusUndefined: Self = StObject.set(x, "unselectableStatus", js.undefined)
    
    @scala.inline
    def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
  }
}
