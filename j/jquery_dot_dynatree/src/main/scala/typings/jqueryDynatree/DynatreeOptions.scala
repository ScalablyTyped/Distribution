package typings.jqueryDynatree

import typings.jquery.JQueryAjaxSettings
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynatreeOptions extends StObject {
  
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
  var onBlur: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.undefined
  
  // Low level event handlers: onEvent(dtnode, event): return false, to stop default processing
  var onClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.undefined
  
  // Callback(dtnode) before a node is rendered. Return a HTML string to override.
  var onCreate: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, Unit]] = js.undefined
  
  // Callback(dtnode) when a lazy node is expanded for the first time.
  var onCustomRender: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.undefined
  
  // null: generate focus, expand, activate, select events.
  var onDblClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.undefined
  
  // Callback(dtnode) when a node is activated.
  var onDeactivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.undefined
  
  // Callback(flag, dtnode) when a node is (de)selected.
  var onExpand: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.undefined
  
  // (No default actions.)
  var onFocus: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.undefined
  
  // (No default actions.)
  var onKeydown: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.undefined
  
  // null: generate keyboard navigation (focus, expand, activate).
  var onKeypress: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.undefined
  
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
  
  inline def apply(): DynatreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynatreeOptions]
  }
  
  extension [Self <: DynatreeOptions](x: Self) {
    
    inline def setActiveVisible(value: Boolean): Self = StObject.set(x, "activeVisible", value.asInstanceOf[js.Any])
    
    inline def setActiveVisibleUndefined: Self = StObject.set(x, "activeVisible", js.undefined)
    
    inline def setAjaxDefaults(value: DynaTreeAjaxOptions): Self = StObject.set(x, "ajaxDefaults", value.asInstanceOf[js.Any])
    
    inline def setAjaxDefaultsUndefined: Self = StObject.set(x, "ajaxDefaults", js.undefined)
    
    inline def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
    
    inline def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    inline def setChildren(value: js.Array[DynaTreeDataModel]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DynaTreeDataModel*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setClassNames(value: DynatreeClassNamesOptions): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setClickFolderMode(value: Double): Self = StObject.set(x, "clickFolderMode", value.asInstanceOf[js.Any])
    
    inline def setClickFolderModeUndefined: Self = StObject.set(x, "clickFolderMode", js.undefined)
    
    inline def setCookie(value: DynaTreeCookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setCookieId(value: String): Self = StObject.set(x, "cookieId", value.asInstanceOf[js.Any])
    
    inline def setCookieIdUndefined: Self = StObject.set(x, "cookieId", js.undefined)
    
    inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    inline def setDebugLevel(value: Double): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
    
    inline def setDebugLevelUndefined: Self = StObject.set(x, "debugLevel", js.undefined)
    
    inline def setDnd(value: DynaTreeDNDOptions): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    inline def setFx(value: js.Any): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    inline def setGenerateIds(value: Boolean): Self = StObject.set(x, "generateIds", value.asInstanceOf[js.Any])
    
    inline def setGenerateIdsUndefined: Self = StObject.set(x, "generateIds", js.undefined)
    
    inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    inline def setImagePath(value: String): Self = StObject.set(x, "imagePath", value.asInstanceOf[js.Any])
    
    inline def setImagePathUndefined: Self = StObject.set(x, "imagePath", js.undefined)
    
    inline def setInitAjax(value: JQueryAjaxSettings): Self = StObject.set(x, "initAjax", value.asInstanceOf[js.Any])
    
    inline def setInitAjaxUndefined: Self = StObject.set(x, "initAjax", js.undefined)
    
    inline def setInitId(value: String): Self = StObject.set(x, "initId", value.asInstanceOf[js.Any])
    
    inline def setInitIdUndefined: Self = StObject.set(x, "initId", js.undefined)
    
    inline def setKeyPathSeparator(value: String): Self = StObject.set(x, "keyPathSeparator", value.asInstanceOf[js.Any])
    
    inline def setKeyPathSeparatorUndefined: Self = StObject.set(x, "keyPathSeparator", js.undefined)
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setMinExpandLevel(value: Double): Self = StObject.set(x, "minExpandLevel", value.asInstanceOf[js.Any])
    
    inline def setMinExpandLevelUndefined: Self = StObject.set(x, "minExpandLevel", js.undefined)
    
    inline def setNoLink(value: Boolean): Self = StObject.set(x, "noLink", value.asInstanceOf[js.Any])
    
    inline def setNoLinkUndefined: Self = StObject.set(x, "noLink", js.undefined)
    
    inline def setOnActivate(value: /* dtnode */ DynaTreeNode => Unit): Self = StObject.set(x, "onActivate", js.Any.fromFunction1(value))
    
    inline def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
    
    inline def setOnBlur(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnCreate(value: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction2(value))
    
    inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
    
    inline def setOnCustomRender(value: /* dtnode */ DynaTreeNode => Unit): Self = StObject.set(x, "onCustomRender", js.Any.fromFunction1(value))
    
    inline def setOnCustomRenderUndefined: Self = StObject.set(x, "onCustomRender", js.undefined)
    
    inline def setOnDblClick(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onDblClick", js.Any.fromFunction2(value))
    
    inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    inline def setOnDeactivate(value: /* dtnode */ DynaTreeNode => Unit): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction1(value))
    
    inline def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
    
    inline def setOnExpand(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setOnFocus(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeydown(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onKeydown", js.Any.fromFunction2(value))
    
    inline def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
    
    inline def setOnKeypress(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = StObject.set(x, "onKeypress", js.Any.fromFunction2(value))
    
    inline def setOnKeypressUndefined: Self = StObject.set(x, "onKeypress", js.undefined)
    
    inline def setOnLazyRead(value: /* dtnode */ DynaTreeNode => Unit): Self = StObject.set(x, "onLazyRead", js.Any.fromFunction1(value))
    
    inline def setOnLazyReadUndefined: Self = StObject.set(x, "onLazyRead", js.undefined)
    
    inline def setOnPostInit(value: (/* isReloading */ Boolean, /* isError */ Boolean) => Unit): Self = StObject.set(x, "onPostInit", js.Any.fromFunction2(value))
    
    inline def setOnPostInitUndefined: Self = StObject.set(x, "onPostInit", js.undefined)
    
    inline def setOnQueryActivate(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onQueryActivate", js.Any.fromFunction2(value))
    
    inline def setOnQueryActivateUndefined: Self = StObject.set(x, "onQueryActivate", js.undefined)
    
    inline def setOnQueryExpand(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onQueryExpand", js.Any.fromFunction2(value))
    
    inline def setOnQueryExpandUndefined: Self = StObject.set(x, "onQueryExpand", js.undefined)
    
    inline def setOnQuerySelect(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onQuerySelect", js.Any.fromFunction2(value))
    
    inline def setOnQuerySelectUndefined: Self = StObject.set(x, "onQuerySelect", js.undefined)
    
    inline def setOnRender(value: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit): Self = StObject.set(x, "onRender", js.Any.fromFunction2(value))
    
    inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    inline def setOnSelect(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setPostProcess(value: (/* data */ js.Any, /* dataType */ js.Any) => Unit): Self = StObject.set(x, "postProcess", js.Any.fromFunction2(value))
    
    inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    inline def setSelectMode(value: Double): Self = StObject.set(x, "selectMode", value.asInstanceOf[js.Any])
    
    inline def setSelectModeUndefined: Self = StObject.set(x, "selectMode", js.undefined)
    
    inline def setStrings(value: DynaTreeStringsOptions): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
