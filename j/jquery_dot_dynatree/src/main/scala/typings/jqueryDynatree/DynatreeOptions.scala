package typings.jqueryDynatree

import typings.jquery.JQueryAjaxSettings
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynatreeOptions extends js.Object {
   // 1:activate, 2:expand, 3:activate and expand
  var activeVisible: js.UndefOr[Boolean] = js.undefined
    // Drag'n'drop support
  var ajaxDefaults: js.UndefOr[DynaTreeAjaxOptions] = js.undefined
   // Persist expand-status to a cookie
  var autoCollapse: js.UndefOr[Boolean] = js.undefined
   // Ajax options used to initialize the tree strucuture.
  var autoFocus: js.UndefOr[Boolean] = js.undefined
   // Make sure, active nodes are visible (expanded).
  var checkbox: js.UndefOr[Boolean] = js.undefined
   // Path to a folder containing icons. Defaults to 'skin/' subdirectory.
  var children: js.UndefOr[js.Array[DynaTreeDataModel]] = js.undefined
  // Class names used, when rendering the HTML markup.
  // Note: if only single entries are passed for options.classNames, all other
  // values are still set to default.
  var classNames: js.UndefOr[DynatreeClassNamesOptions] = js.undefined
   // Automatically collapse all siblings, when a node is expanded.
  var clickFolderMode: js.UndefOr[Double] = js.undefined
  var cookie: js.UndefOr[DynaTreeCookieOptions] = js.undefined
   // Used by node.getKeyPath() and tree.loadKeyPath().
  var cookieId: js.UndefOr[String] = js.undefined
   // Use <span> instead of <a> tags for all nodes
  var debugLevel: js.UndefOr[Double] = js.undefined
   // Choose a more unique name, to allow multiple trees.
  var dnd: js.UndefOr[DynaTreeDNDOptions] = js.undefined
   // 1:single, 2:multi, 3:multi-hier
  var fx: js.UndefOr[js.Any] = js.undefined
   // 0:quiet, 1:normal, 2:debug
  var generateIds: js.UndefOr[Boolean] = js.undefined
   // Generate id attributes like <span id='dynatree-id-KEY'>
  var idPrefix: js.UndefOr[String] = js.undefined
   // 1: root node is not collapsible
  var imagePath: js.UndefOr[String] = js.undefined
   // Init tree structure from a <ul> element with this ID.
  var initAjax: js.UndefOr[JQueryAjaxSettings] = js.undefined
   // Init tree structure from this object array.
  var initId: js.UndefOr[String] = js.undefined
   // Used to generate node id's like <span id="dynatree-id-<key>">.
  var keyPathSeparator: js.UndefOr[String] = js.undefined
   // Set focus to first child, when expanding or lazy-loading.
  var keyboard: js.UndefOr[Boolean] = js.undefined
   // Tree's name (only used for debug outpu)
  var minExpandLevel: js.UndefOr[Double] = js.undefined
   // Animations, e.g. null or { height: "toggle", duration: 200 }
  var noLink: js.UndefOr[Boolean] = js.undefined
  // Callback(isReloading, isError) when tree was (re)loaded.
  var onActivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.undefined
   // null: set focus to node.
  var onBlur: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.undefined
  // Low level event handlers: onEvent(dtnode, event): return false, to stop default processing
  var onClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.undefined
   // Callback(dtnode) before a node is rendered. Return a HTML string to override.
  var onCreate: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, Unit]] = js.undefined
   // Callback(dtnode) when a lazy node is expanded for the first time.
  var onCustomRender: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.undefined
   // null: generate focus, expand, activate, select events.
  var onDblClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.undefined
   // Callback(dtnode) when a node is activated.
  var onDeactivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.undefined
   // Callback(flag, dtnode) when a node is (de)selected.
  var onExpand: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.undefined
   // (No default actions.)
  var onFocus: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.undefined
   // (No default actions.)
  var onKeydown: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.undefined
   // null: generate keyboard navigation (focus, expand, activate).
  var onKeypress: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event_, Boolean]] = js.undefined
   // Callback(flag, dtnode) when a node is expanded/collapsed.
  var onLazyRead: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.undefined
  // Callback(flag, dtnode) before a node is expanded/collpsed.
  // High level event handlers
  var onPostInit: js.UndefOr[js.Function2[/* isReloading */ Boolean, /* isError */ Boolean, Unit]] = js.undefined
   // null: remove focus from node.
  // Pre-event handlers onQueryEvent(flag, dtnode): return false, to stop processing
  var onQueryActivate: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.undefined
  // Callback(flag, dtnode) before a node is (de)selected.
  var onQueryExpand: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.undefined
   // Callback(flag, dtnode) before a node is (de)activated.
  var onQuerySelect: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.undefined
   // Callback(dtnode, nodeSpan) after a node was rendered for the first time.
  var onRender: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, Unit]] = js.undefined
   // Callback(dtnode) when a node is deactivated.
  var onSelect: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.undefined
   // Support keyboard navigation.
  var persist: js.UndefOr[Boolean] = js.undefined
   // Callback(dtnode, nodeSpan) after a node was rendered.
  var postProcess: js.UndefOr[js.Function2[/* data */ js.Any, /* dataType */ js.Any, Unit]] = js.undefined
   // Show checkboxes.
  var selectMode: js.UndefOr[Double] = js.undefined
  // Used by initAjax option
  var strings: js.UndefOr[DynaTreeStringsOptions] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DynatreeOptions {
  @scala.inline
  def apply(
    activeVisible: js.UndefOr[Boolean] = js.undefined,
    ajaxDefaults: DynaTreeAjaxOptions = null,
    autoCollapse: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    checkbox: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[DynaTreeDataModel] = null,
    classNames: DynatreeClassNamesOptions = null,
    clickFolderMode: Int | Double = null,
    cookie: DynaTreeCookieOptions = null,
    cookieId: String = null,
    debugLevel: Int | Double = null,
    dnd: DynaTreeDNDOptions = null,
    fx: js.Any = null,
    generateIds: js.UndefOr[Boolean] = js.undefined,
    idPrefix: String = null,
    imagePath: String = null,
    initAjax: JQueryAjaxSettings = null,
    initId: String = null,
    keyPathSeparator: String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    minExpandLevel: Int | Double = null,
    noLink: js.UndefOr[Boolean] = js.undefined,
    onActivate: /* dtnode */ DynaTreeNode => Unit = null,
    onBlur: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean = null,
    onClick: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean = null,
    onCreate: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit = null,
    onCustomRender: /* dtnode */ DynaTreeNode => Unit = null,
    onDblClick: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean = null,
    onDeactivate: /* dtnode */ DynaTreeNode => Unit = null,
    onExpand: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit = null,
    onFocus: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean = null,
    onKeydown: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean = null,
    onKeypress: (/* dtnode */ DynaTreeNode, /* event */ Event_) => Boolean = null,
    onLazyRead: /* dtnode */ DynaTreeNode => Unit = null,
    onPostInit: (/* isReloading */ Boolean, /* isError */ Boolean) => Unit = null,
    onQueryActivate: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit = null,
    onQueryExpand: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit = null,
    onQuerySelect: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit = null,
    onRender: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit = null,
    onSelect: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    postProcess: (/* data */ js.Any, /* dataType */ js.Any) => Unit = null,
    selectMode: Int | Double = null,
    strings: DynaTreeStringsOptions = null,
    title: String = null
  ): DynatreeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeVisible)) __obj.updateDynamic("activeVisible")(activeVisible.asInstanceOf[js.Any])
    if (ajaxDefaults != null) __obj.updateDynamic("ajaxDefaults")(ajaxDefaults.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCollapse)) __obj.updateDynamic("autoCollapse")(autoCollapse.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(checkbox)) __obj.updateDynamic("checkbox")(checkbox.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (clickFolderMode != null) __obj.updateDynamic("clickFolderMode")(clickFolderMode.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (cookieId != null) __obj.updateDynamic("cookieId")(cookieId.asInstanceOf[js.Any])
    if (debugLevel != null) __obj.updateDynamic("debugLevel")(debugLevel.asInstanceOf[js.Any])
    if (dnd != null) __obj.updateDynamic("dnd")(dnd.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (!js.isUndefined(generateIds)) __obj.updateDynamic("generateIds")(generateIds.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (imagePath != null) __obj.updateDynamic("imagePath")(imagePath.asInstanceOf[js.Any])
    if (initAjax != null) __obj.updateDynamic("initAjax")(initAjax.asInstanceOf[js.Any])
    if (initId != null) __obj.updateDynamic("initId")(initId.asInstanceOf[js.Any])
    if (keyPathSeparator != null) __obj.updateDynamic("keyPathSeparator")(keyPathSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (minExpandLevel != null) __obj.updateDynamic("minExpandLevel")(minExpandLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(noLink)) __obj.updateDynamic("noLink")(noLink.asInstanceOf[js.Any])
    if (onActivate != null) __obj.updateDynamic("onActivate")(js.Any.fromFunction1(onActivate))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction2(onCreate))
    if (onCustomRender != null) __obj.updateDynamic("onCustomRender")(js.Any.fromFunction1(onCustomRender))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction2(onDblClick))
    if (onDeactivate != null) __obj.updateDynamic("onDeactivate")(js.Any.fromFunction1(onDeactivate))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2(onFocus))
    if (onKeydown != null) __obj.updateDynamic("onKeydown")(js.Any.fromFunction2(onKeydown))
    if (onKeypress != null) __obj.updateDynamic("onKeypress")(js.Any.fromFunction2(onKeypress))
    if (onLazyRead != null) __obj.updateDynamic("onLazyRead")(js.Any.fromFunction1(onLazyRead))
    if (onPostInit != null) __obj.updateDynamic("onPostInit")(js.Any.fromFunction2(onPostInit))
    if (onQueryActivate != null) __obj.updateDynamic("onQueryActivate")(js.Any.fromFunction2(onQueryActivate))
    if (onQueryExpand != null) __obj.updateDynamic("onQueryExpand")(js.Any.fromFunction2(onQueryExpand))
    if (onQuerySelect != null) __obj.updateDynamic("onQuerySelect")(js.Any.fromFunction2(onQuerySelect))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction2(onRender))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction2(postProcess))
    if (selectMode != null) __obj.updateDynamic("selectMode")(selectMode.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatreeOptions]
  }
}

