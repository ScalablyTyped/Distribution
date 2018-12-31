package typings
package jqueryDotDynatreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynatreeOptions extends js.Object {
   // 1:activate, 2:expand, 3:activate and expand
  var activeVisible: js.UndefOr[scala.Boolean] = js.undefined
    // Drag'n'drop support
  var ajaxDefaults: js.UndefOr[DynaTreeAjaxOptions] = js.undefined
   // Persist expand-status to a cookie
  var autoCollapse: js.UndefOr[scala.Boolean] = js.undefined
   // Ajax options used to initialize the tree strucuture.
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
   // Make sure, active nodes are visible (expanded).
  var checkbox: js.UndefOr[scala.Boolean] = js.undefined
   // Path to a folder containing icons. Defaults to 'skin/' subdirectory.
  var children: js.UndefOr[js.Array[DynaTreeDataModel]] = js.undefined
  // Class names used, when rendering the HTML markup.
  // Note: if only single entries are passed for options.classNames, all other
  // values are still set to default.
  var classNames: js.UndefOr[DynatreeClassNamesOptions] = js.undefined
   // Automatically collapse all siblings, when a node is expanded.
  var clickFolderMode: js.UndefOr[scala.Double] = js.undefined
  var cookie: js.UndefOr[DynaTreeCookieOptions] = js.undefined
   // Used by node.getKeyPath() and tree.loadKeyPath().
  var cookieId: js.UndefOr[java.lang.String] = js.undefined
   // Use <span> instead of <a> tags for all nodes
  var debugLevel: js.UndefOr[scala.Double] = js.undefined
   // Choose a more unique name, to allow multiple trees.
  var dnd: js.UndefOr[DynaTreeDNDOptions] = js.undefined
   // 1:single, 2:multi, 3:multi-hier
  var fx: js.UndefOr[js.Any] = js.undefined
   // 0:quiet, 1:normal, 2:debug
  var generateIds: js.UndefOr[scala.Boolean] = js.undefined
   // Generate id attributes like <span id='dynatree-id-KEY'>
  var idPrefix: js.UndefOr[java.lang.String] = js.undefined
   // 1: root node is not collapsible
  var imagePath: js.UndefOr[java.lang.String] = js.undefined
   // Init tree structure from a <ul> element with this ID.
  var initAjax: js.UndefOr[jqueryLib.JQueryAjaxSettings] = js.undefined
   // Init tree structure from this object array.
  var initId: js.UndefOr[java.lang.String] = js.undefined
   // Used to generate node id's like <span id="dynatree-id-<key>">.
  var keyPathSeparator: js.UndefOr[java.lang.String] = js.undefined
   // Set focus to first child, when expanding or lazy-loading.
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
   // Tree's name (only used for debug outpu)
  var minExpandLevel: js.UndefOr[scala.Double] = js.undefined
   // Animations, e.g. null or { height: "toggle", duration: 200 }
  var noLink: js.UndefOr[scala.Boolean] = js.undefined
  // Callback(isReloading, isError) when tree was (re)loaded.
  var onActivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
   // null: set focus to node.
  var onBlur: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ stdLib.Event, scala.Boolean]] = js.undefined
  // Low level event handlers: onEvent(dtnode, event): return false, to stop default processing
  var onClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ stdLib.Event, scala.Boolean]] = js.undefined
   // Callback(dtnode) before a node is rendered. Return a HTML string to override.
  var onCreate: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, scala.Unit]] = js.undefined
   // Callback(dtnode) when a lazy node is expanded for the first time.
  var onCustomRender: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
   // null: generate focus, expand, activate, select events.
  var onDblClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ stdLib.Event, scala.Boolean]] = js.undefined
   // Callback(dtnode) when a node is activated.
  var onDeactivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
   // Callback(flag, dtnode) when a node is (de)selected.
  var onExpand: js.UndefOr[js.Function2[/* flag */ java.lang.String, /* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
   // (No default actions.)
  var onFocus: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ stdLib.Event, scala.Boolean]] = js.undefined
   // (No default actions.)
  var onKeydown: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ stdLib.Event, scala.Boolean]] = js.undefined
   // null: generate keyboard navigation (focus, expand, activate).
  var onKeypress: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ stdLib.Event, scala.Boolean]] = js.undefined
   // Callback(flag, dtnode) when a node is expanded/collapsed.
  var onLazyRead: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
  // Callback(flag, dtnode) before a node is expanded/collpsed.
  // High level event handlers
  var onPostInit: js.UndefOr[
    js.Function2[/* isReloading */ scala.Boolean, /* isError */ scala.Boolean, scala.Unit]
  ] = js.undefined
   // null: remove focus from node.
  // Pre-event handlers onQueryEvent(flag, dtnode): return false, to stop processing
  var onQueryActivate: js.UndefOr[js.Function2[/* flag */ java.lang.String, /* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
  // Callback(flag, dtnode) before a node is (de)selected.
  var onQueryExpand: js.UndefOr[js.Function2[/* flag */ java.lang.String, /* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
   // Callback(flag, dtnode) before a node is (de)activated.
  var onQuerySelect: js.UndefOr[js.Function2[/* flag */ java.lang.String, /* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
   // Callback(dtnode, nodeSpan) after a node was rendered for the first time.
  var onRender: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, scala.Unit]] = js.undefined
   // Callback(dtnode) when a node is deactivated.
  var onSelect: js.UndefOr[js.Function2[/* flag */ java.lang.String, /* dtnode */ DynaTreeNode, scala.Unit]] = js.undefined
   // Support keyboard navigation.
  var persist: js.UndefOr[scala.Boolean] = js.undefined
   // Callback(dtnode, nodeSpan) after a node was rendered.
  var postProcess: js.UndefOr[js.Function2[/* data */ js.Any, /* dataType */ js.Any, scala.Unit]] = js.undefined
   // Show checkboxes.
  var selectMode: js.UndefOr[scala.Double] = js.undefined
  // Used by initAjax option
  var strings: js.UndefOr[DynaTreeStringsOptions] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

