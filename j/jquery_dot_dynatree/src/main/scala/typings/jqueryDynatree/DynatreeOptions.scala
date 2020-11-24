package typings.jqueryDynatree

import typings.jquery.JQueryAjaxSettings
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynatreeOptions extends js.Object {
  
   // 1:activate, 2:expand, 3:activate and expand
  var activeVisible: js.UndefOr[Boolean] = js.native
  
    // Drag'n'drop support
  var ajaxDefaults: js.UndefOr[DynaTreeAjaxOptions] = js.native
  
   // Persist expand-status to a cookie
  var autoCollapse: js.UndefOr[Boolean] = js.native
  
   // Ajax options used to initialize the tree strucuture.
  var autoFocus: js.UndefOr[Boolean] = js.native
  
   // Make sure, active nodes are visible (expanded).
  var checkbox: js.UndefOr[Boolean] = js.native
  
   // Path to a folder containing icons. Defaults to 'skin/' subdirectory.
  var children: js.UndefOr[js.Array[DynaTreeDataModel]] = js.native
  
  // Class names used, when rendering the HTML markup.
  // Note: if only single entries are passed for options.classNames, all other
  // values are still set to default.
  var classNames: js.UndefOr[DynatreeClassNamesOptions] = js.native
  
   // Automatically collapse all siblings, when a node is expanded.
  var clickFolderMode: js.UndefOr[Double] = js.native
  
  var cookie: js.UndefOr[DynaTreeCookieOptions] = js.native
  
   // Used by node.getKeyPath() and tree.loadKeyPath().
  var cookieId: js.UndefOr[String] = js.native
  
   // Use <span> instead of <a> tags for all nodes
  var debugLevel: js.UndefOr[Double] = js.native
  
   // Choose a more unique name, to allow multiple trees.
  var dnd: js.UndefOr[DynaTreeDNDOptions] = js.native
  
   // 1:single, 2:multi, 3:multi-hier
  var fx: js.UndefOr[js.Any] = js.native
  
   // 0:quiet, 1:normal, 2:debug
  var generateIds: js.UndefOr[Boolean] = js.native
  
   // Generate id attributes like <span id='dynatree-id-KEY'>
  var idPrefix: js.UndefOr[String] = js.native
  
   // 1: root node is not collapsible
  var imagePath: js.UndefOr[String] = js.native
  
   // Init tree structure from a <ul> element with this ID.
  var initAjax: js.UndefOr[JQueryAjaxSettings] = js.native
  
   // Init tree structure from this object array.
  var initId: js.UndefOr[String] = js.native
  
   // Used to generate node id's like <span id="dynatree-id-<key>">.
  var keyPathSeparator: js.UndefOr[String] = js.native
  
   // Set focus to first child, when expanding or lazy-loading.
  var keyboard: js.UndefOr[Boolean] = js.native
  
   // Tree's name (only used for debug outpu)
  var minExpandLevel: js.UndefOr[Double] = js.native
  
   // Animations, e.g. null or { height: "toggle", duration: 200 }
  var noLink: js.UndefOr[Boolean] = js.native
  
  // Callback(isReloading, isError) when tree was (re)loaded.
  var onActivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
  
   // null: set focus to node.
  var onBlur: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
  // Low level event handlers: onEvent(dtnode, event): return false, to stop default processing
  var onClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
   // Callback(dtnode) before a node is rendered. Return a HTML string to override.
  var onCreate: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, Unit]] = js.native
  
   // Callback(dtnode) when a lazy node is expanded for the first time.
  var onCustomRender: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
  
   // null: generate focus, expand, activate, select events.
  var onDblClick: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
   // Callback(dtnode) when a node is activated.
  var onDeactivate: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
  
   // Callback(flag, dtnode) when a node is (de)selected.
  var onExpand: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
  
   // (No default actions.)
  var onFocus: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
   // (No default actions.)
  var onKeydown: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
   // null: generate keyboard navigation (focus, expand, activate).
  var onKeypress: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* event */ Event, Boolean]] = js.native
  
   // Callback(flag, dtnode) when a node is expanded/collapsed.
  var onLazyRead: js.UndefOr[js.Function1[/* dtnode */ DynaTreeNode, Unit]] = js.native
  
  // Callback(flag, dtnode) before a node is expanded/collpsed.
  // High level event handlers
  var onPostInit: js.UndefOr[js.Function2[/* isReloading */ Boolean, /* isError */ Boolean, Unit]] = js.native
  
   // null: remove focus from node.
  // Pre-event handlers onQueryEvent(flag, dtnode): return false, to stop processing
  var onQueryActivate: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
  
  // Callback(flag, dtnode) before a node is (de)selected.
  var onQueryExpand: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
  
   // Callback(flag, dtnode) before a node is (de)activated.
  var onQuerySelect: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
  
   // Callback(dtnode, nodeSpan) after a node was rendered for the first time.
  var onRender: js.UndefOr[js.Function2[/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any, Unit]] = js.native
  
   // Callback(dtnode) when a node is deactivated.
  var onSelect: js.UndefOr[js.Function2[/* flag */ String, /* dtnode */ DynaTreeNode, Unit]] = js.native
  
   // Support keyboard navigation.
  var persist: js.UndefOr[Boolean] = js.native
  
   // Callback(dtnode, nodeSpan) after a node was rendered.
  var postProcess: js.UndefOr[js.Function2[/* data */ js.Any, /* dataType */ js.Any, Unit]] = js.native
  
   // Show checkboxes.
  var selectMode: js.UndefOr[Double] = js.native
  
  // Used by initAjax option
  var strings: js.UndefOr[DynaTreeStringsOptions] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object DynatreeOptions {
  
  @scala.inline
  def apply(): DynatreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynatreeOptions]
  }
  
  @scala.inline
  implicit class DynatreeOptionsOps[Self <: DynatreeOptions] (val x: Self) extends AnyVal {
    
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
    def setAjaxDefaults(value: DynaTreeAjaxOptions): Self = this.set("ajaxDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjaxDefaults: Self = this.set("ajaxDefaults", js.undefined)
    
    @scala.inline
    def setAutoCollapse(value: Boolean): Self = this.set("autoCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCollapse: Self = this.set("autoCollapse", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setCheckbox(value: Boolean): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: DynaTreeDataModel*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[DynaTreeDataModel]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassNames(value: DynatreeClassNamesOptions): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setClickFolderMode(value: Double): Self = this.set("clickFolderMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickFolderMode: Self = this.set("clickFolderMode", js.undefined)
    
    @scala.inline
    def setCookie(value: DynaTreeCookieOptions): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setCookieId(value: String): Self = this.set("cookieId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieId: Self = this.set("cookieId", js.undefined)
    
    @scala.inline
    def setDebugLevel(value: Double): Self = this.set("debugLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugLevel: Self = this.set("debugLevel", js.undefined)
    
    @scala.inline
    def setDnd(value: DynaTreeDNDOptions): Self = this.set("dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnd: Self = this.set("dnd", js.undefined)
    
    @scala.inline
    def setFx(value: js.Any): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    
    @scala.inline
    def setGenerateIds(value: Boolean): Self = this.set("generateIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateIds: Self = this.set("generateIds", js.undefined)
    
    @scala.inline
    def setIdPrefix(value: String): Self = this.set("idPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdPrefix: Self = this.set("idPrefix", js.undefined)
    
    @scala.inline
    def setImagePath(value: String): Self = this.set("imagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePath: Self = this.set("imagePath", js.undefined)
    
    @scala.inline
    def setInitAjax(value: JQueryAjaxSettings): Self = this.set("initAjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitAjax: Self = this.set("initAjax", js.undefined)
    
    @scala.inline
    def setInitId(value: String): Self = this.set("initId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitId: Self = this.set("initId", js.undefined)
    
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
    def setNoLink(value: Boolean): Self = this.set("noLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoLink: Self = this.set("noLink", js.undefined)
    
    @scala.inline
    def setOnActivate(value: /* dtnode */ DynaTreeNode => Unit): Self = this.set("onActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActivate: Self = this.set("onActivate", js.undefined)
    
    @scala.inline
    def setOnBlur(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = this.set("onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnCreate(value: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit): Self = this.set("onCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
    
    @scala.inline
    def setOnCustomRender(value: /* dtnode */ DynaTreeNode => Unit): Self = this.set("onCustomRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCustomRender: Self = this.set("onCustomRender", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = this.set("onDblClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    
    @scala.inline
    def setOnDeactivate(value: /* dtnode */ DynaTreeNode => Unit): Self = this.set("onDeactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDeactivate: Self = this.set("onDeactivate", js.undefined)
    
    @scala.inline
    def setOnExpand(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = this.set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setOnFocus(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = this.set("onFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeydown(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = this.set("onKeydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeydown: Self = this.set("onKeydown", js.undefined)
    
    @scala.inline
    def setOnKeypress(value: (/* dtnode */ DynaTreeNode, /* event */ Event) => Boolean): Self = this.set("onKeypress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeypress: Self = this.set("onKeypress", js.undefined)
    
    @scala.inline
    def setOnLazyRead(value: /* dtnode */ DynaTreeNode => Unit): Self = this.set("onLazyRead", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLazyRead: Self = this.set("onLazyRead", js.undefined)
    
    @scala.inline
    def setOnPostInit(value: (/* isReloading */ Boolean, /* isError */ Boolean) => Unit): Self = this.set("onPostInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPostInit: Self = this.set("onPostInit", js.undefined)
    
    @scala.inline
    def setOnQueryActivate(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = this.set("onQueryActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnQueryActivate: Self = this.set("onQueryActivate", js.undefined)
    
    @scala.inline
    def setOnQueryExpand(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = this.set("onQueryExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnQueryExpand: Self = this.set("onQueryExpand", js.undefined)
    
    @scala.inline
    def setOnQuerySelect(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = this.set("onQuerySelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnQuerySelect: Self = this.set("onQuerySelect", js.undefined)
    
    @scala.inline
    def setOnRender(value: (/* dtnode */ DynaTreeNode, /* nodeSpan */ js.Any) => Unit): Self = this.set("onRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* flag */ String, /* dtnode */ DynaTreeNode) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setPostProcess(value: (/* data */ js.Any, /* dataType */ js.Any) => Unit): Self = this.set("postProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostProcess: Self = this.set("postProcess", js.undefined)
    
    @scala.inline
    def setSelectMode(value: Double): Self = this.set("selectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectMode: Self = this.set("selectMode", js.undefined)
    
    @scala.inline
    def setStrings(value: DynaTreeStringsOptions): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
