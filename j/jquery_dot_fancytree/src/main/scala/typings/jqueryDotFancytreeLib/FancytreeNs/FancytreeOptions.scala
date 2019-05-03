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
  var extensions: js.UndefOr[
    js.Array[
      jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.dnd5 | jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.filter | jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.table | java.lang.String
    ]
  ] = js.undefined
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

object FancytreeOptions {
  @scala.inline
  def apply(
    StringDictionary: /** Options for misc extensions - see docs for typings */
  /* extension */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activate: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    activeVisible: js.UndefOr[scala.Boolean] = js.undefined,
    ajax: jqueryDotFancytreeLib.Anon_Cache = null,
    aria: js.UndefOr[scala.Boolean] = js.undefined,
    autoActivate: js.UndefOr[scala.Boolean] = js.undefined,
    autoCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    autoScroll: js.UndefOr[scala.Boolean] = js.undefined,
    beforeActivate: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    beforeExpand: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    beforeSelect: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    blur: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    blurTree: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    checkbox: scala.Boolean | java.lang.String | (js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean]) = null,
    click: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    clickFolderMode: FancytreeClickFolderMode = null,
    collapse: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    create: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    createNode: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    dblclick: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    deactivate: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    debugLevel: jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`0` | jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`1` | jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`2` | jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`3` | jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`4` = null,
    defaultKey: /* node */ FancytreeNode => java.lang.String = null,
    dnd5: jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs.DragAndDrop5 = null,
    enableAspx: js.UndefOr[scala.Boolean] = js.undefined,
    enableTitles: js.UndefOr[scala.Boolean] = js.undefined,
    expand: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    extensions: js.Array[
      jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.dnd5 | jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.filter | jqueryDotFancytreeLib.jqueryDotFancytreeLibStrings.table | java.lang.String
    ] = null,
    filter: jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs.Filter = null,
    focus: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    focusOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    focusTree: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    generateIds: js.UndefOr[scala.Boolean] = js.undefined,
    icon: scala.Boolean | java.lang.String = null,
    idPrefix: java.lang.String = null,
    imagePath: java.lang.String = null,
    init: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    keyPathSeparator: java.lang.String = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    keydown: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    keypress: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    lazyLoad: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    loadChildren: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    loadError: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    minExpandLevel: scala.Int | scala.Double = null,
    postProcess: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    quicksearch: js.UndefOr[scala.Boolean] = js.undefined,
    removeNode: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    renderColumns: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    renderNode: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    renderTitle: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    restore: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    rtl: jqueryDotFancytreeLib.jqueryDotFancytreeLibNumbers.`false` = null,
    scrollOfs: jqueryDotFancytreeLib.Anon_Bottom = null,
    scrollParent: jqueryDotFancytreeLib.JQuery = null,
    select: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    selectMode: FancytreeSelectMode = null,
    source: js.Array[_] | js.Any = null,
    strings: TranslationTable = null,
    tabbable: js.UndefOr[scala.Boolean] = js.undefined,
    table: jqueryDotFancytreeLib.FancytreeNs.ExtensionsNs.Table = null,
    titlesTabbable: js.UndefOr[scala.Boolean] = js.undefined,
    toggleEffect: jqueryuiLib.JQueryUINs.EffectOptions = null,
    tooltip: js.UndefOr[scala.Boolean] = js.undefined,
    unselectable: scala.Boolean | (js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* data */ EventData, 
      js.UndefOr[scala.Boolean]
    ]) = null,
    unselectableIgnore: scala.Boolean | (js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* data */ EventData, 
      js.UndefOr[scala.Boolean]
    ]) = null,
    unselectableStatus: scala.Boolean | (js.Function2[
      /* event */ jqueryLib.JQueryEventObject, 
      /* data */ EventData, 
      js.UndefOr[scala.Boolean]
    ]) = null
  ): FancytreeOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (!js.isUndefined(activeVisible)) __obj.updateDynamic("activeVisible")(activeVisible)
    if (ajax != null) __obj.updateDynamic("ajax")(ajax)
    if (!js.isUndefined(aria)) __obj.updateDynamic("aria")(aria)
    if (!js.isUndefined(autoActivate)) __obj.updateDynamic("autoActivate")(autoActivate)
    if (!js.isUndefined(autoCollapse)) __obj.updateDynamic("autoCollapse")(autoCollapse)
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll)
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2(beforeActivate))
    if (beforeExpand != null) __obj.updateDynamic("beforeExpand")(js.Any.fromFunction2(beforeExpand))
    if (beforeSelect != null) __obj.updateDynamic("beforeSelect")(js.Any.fromFunction2(beforeSelect))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2(blur))
    if (blurTree != null) __obj.updateDynamic("blurTree")(js.Any.fromFunction2(blurTree))
    if (checkbox != null) __obj.updateDynamic("checkbox")(checkbox.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2(click))
    if (clickFolderMode != null) __obj.updateDynamic("clickFolderMode")(clickFolderMode)
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2(collapse))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction2(createNode))
    if (dblclick != null) __obj.updateDynamic("dblclick")(js.Any.fromFunction2(dblclick))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2(deactivate))
    if (debugLevel != null) __obj.updateDynamic("debugLevel")(debugLevel.asInstanceOf[js.Any])
    if (defaultKey != null) __obj.updateDynamic("defaultKey")(js.Any.fromFunction1(defaultKey))
    if (dnd5 != null) __obj.updateDynamic("dnd5")(dnd5)
    if (!js.isUndefined(enableAspx)) __obj.updateDynamic("enableAspx")(enableAspx)
    if (!js.isUndefined(enableTitles)) __obj.updateDynamic("enableTitles")(enableTitles)
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction2(expand))
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect)
    if (focusTree != null) __obj.updateDynamic("focusTree")(js.Any.fromFunction2(focusTree))
    if (!js.isUndefined(generateIds)) __obj.updateDynamic("generateIds")(generateIds)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix)
    if (imagePath != null) __obj.updateDynamic("imagePath")(imagePath)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction2(init))
    if (keyPathSeparator != null) __obj.updateDynamic("keyPathSeparator")(keyPathSeparator)
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction2(keydown))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction2(keypress))
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2(lazyLoad))
    if (loadChildren != null) __obj.updateDynamic("loadChildren")(js.Any.fromFunction2(loadChildren))
    if (loadError != null) __obj.updateDynamic("loadError")(js.Any.fromFunction2(loadError))
    if (minExpandLevel != null) __obj.updateDynamic("minExpandLevel")(minExpandLevel.asInstanceOf[js.Any])
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction2(postProcess))
    if (!js.isUndefined(quicksearch)) __obj.updateDynamic("quicksearch")(quicksearch)
    if (removeNode != null) __obj.updateDynamic("removeNode")(js.Any.fromFunction2(removeNode))
    if (renderColumns != null) __obj.updateDynamic("renderColumns")(js.Any.fromFunction2(renderColumns))
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction2(renderNode))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction2(renderTitle))
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction2(restore))
    if (rtl != null) __obj.updateDynamic("rtl")(rtl)
    if (scrollOfs != null) __obj.updateDynamic("scrollOfs")(scrollOfs)
    if (scrollParent != null) __obj.updateDynamic("scrollParent")(scrollParent)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (selectMode != null) __obj.updateDynamic("selectMode")(selectMode)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings)
    if (!js.isUndefined(tabbable)) __obj.updateDynamic("tabbable")(tabbable)
    if (table != null) __obj.updateDynamic("table")(table)
    if (!js.isUndefined(titlesTabbable)) __obj.updateDynamic("titlesTabbable")(titlesTabbable)
    if (toggleEffect != null) __obj.updateDynamic("toggleEffect")(toggleEffect)
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (unselectableIgnore != null) __obj.updateDynamic("unselectableIgnore")(unselectableIgnore.asInstanceOf[js.Any])
    if (unselectableStatus != null) __obj.updateDynamic("unselectableStatus")(unselectableStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancytreeOptions]
  }
}

