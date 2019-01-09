package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancytreeOptions
  extends FancytreeEvents
     with /** Options for misc extensions - see docs for typings */
/* extension */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** Make sure that the active node is always visible, i.e. its parents are expanded (default: true). */
  var activeVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** Default options for ajax requests. */
  var ajax: js.UndefOr[jqueryDotFancytreeLib.Anon_Cache] = js.undefined
  /** (default: false) Add WAI-ARIA attributes to markup */
  var aria: js.UndefOr[scala.Boolean] = js.undefined
  /** Activate a node when focused with the keyboard (default: true) */
  var autoActivate: js.UndefOr[scala.Boolean] = js.undefined
  /** Automatically collapse all siblings, when a node is expanded (default: false). */
  var autoCollapse: js.UndefOr[scala.Boolean] = js.undefined
  /** Scroll node into visible area, when focused by keyboard (default: false). */
  var autoScroll: js.UndefOr[scala.Boolean] = js.undefined
  /** Display checkboxes to allow selection (default: false) */
  var checkbox: js.UndefOr[
    scala.Boolean | java.lang.String | (js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean])
  ] = js.undefined
  /** Defines what happens, when the user click a folder node. (default: activate_dblclick_expands) */
  var clickFolderMode: js.UndefOr[FancytreeClickFolderMode] = js.undefined
  /** 0..4 (null: use global setting $.ui.fancytree.debugInfo) */
  var debugLevel: js.UndefOr[
    jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`0` | jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`1` | jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`2` | jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`3` | jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`4`
  ] = js.undefined
  /** callback(node) is called for new nodes without a key. Must return a new unique key. (default null: generates default keys like that: "_" + counter) */
  var defaultKey: js.UndefOr[js.Function1[/* node */ FancytreeNode, java.lang.String]] = js.undefined
  ////////////////
  // EXTENSIONS //
  ////////////////
  var dnd5: js.UndefOr[jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs.DragAndDrop5] = js.undefined
  /** Accept passing ajax data in a property named `d` (default: true). */
  var enableAspx: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable titles (default: false) */
  var enableTitles: js.UndefOr[scala.Boolean] = js.undefined
  /** List of active extensions (default: []) */
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var filter: js.UndefOr[jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs.Filter] = js.undefined
  /** Set focus when node is checked by a mouse click (default: false) */
  var focusOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /** Add `id="..."` to node markup (default: true). */
  var generateIds: js.UndefOr[scala.Boolean] = js.undefined
  /** Node icon url, if only filename, please use imagePath to set the path */
  var icon: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** Prefix (default: "ft_") */
  var idPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** Path to a folder containing icons (default: null, using 'skin/' subdirectory). */
  var imagePath: js.UndefOr[java.lang.String] = js.undefined
  /** (default: "/") */
  var keyPathSeparator: js.UndefOr[java.lang.String] = js.undefined
  /** Support keyboard navigation (default: true). */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /** 2: top-level nodes are not collapsible (default: 1) */
  var minExpandLevel: js.UndefOr[scala.Double] = js.undefined
  /** navigate to next node by typing the first letters (default: false) */
  var quicksearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Right to left mode (default: false) */
  @JSName("rtl")
  var rtl_FancytreeOptions: js.UndefOr[jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`false`] = js.undefined
  /** optional margins for node.scrollIntoView() (default: {top: 0, bottom: 0}) */
  var scrollOfs: js.UndefOr[jqueryDotFancytreeLib.Anon_Bottom] = js.undefined
  /** scrollable container for node.scrollIntoView() (default: $container) */
  var scrollParent: js.UndefOr[jqueryDotFancytreeLib.JQuery | scala.Null] = js.undefined
  /** default: multi_hier */
  var selectMode: js.UndefOr[FancytreeSelectMode] = js.undefined
  /** Used to Initialize the tree. */
  var source: js.UndefOr[js.Array[_] | js.Any] = js.undefined
  /** Translation table */
  var strings: js.UndefOr[TranslationTable] = js.undefined
  /** Add tabindex='0' to container, so tree can be reached using TAB */
  var tabbable: js.UndefOr[scala.Boolean] = js.undefined
  var table: js.UndefOr[jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs.Table] = js.undefined
  /** Add tabindex='0' to node title span, so it can receive keyboard focus */
  var titlesTabbable: js.UndefOr[scala.Boolean] = js.undefined
  /** Animation options, false:off (default: { effect: "blind", options: {direction: "vertical", scale: "box"}, duration: 200 }) */
  var toggleEffect: js.UndefOr[jqueryuiLib.JQueryUINs.EffectOptions] = js.undefined
  /** Tooltips */
  var tooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** (dynamic Option)Prevent (de-)selection using mouse or keyboard. */
  var unselectable: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* data */ EventData, 
      js.UndefOr[scala.Boolean]
    ])
  ] = js.undefined
  /** (dynamic Option)Ignore this node when calculating the partsel status of parent nodes in selectMode 3 propagation. */
  var unselectableIgnore: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* data */ EventData, 
      js.UndefOr[scala.Boolean]
    ])
  ] = js.undefined
  /** (dynamic Option)Use this as constant selected value (overriding selectMode 3 propagation). */
  var unselectableStatus: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* data */ EventData, 
      js.UndefOr[scala.Boolean]
    ])
  ] = js.undefined
}

