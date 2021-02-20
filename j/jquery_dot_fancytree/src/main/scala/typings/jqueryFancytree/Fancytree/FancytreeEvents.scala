package typings.jqueryFancytree.Fancytree

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The `this` context of any event function is set to tree's the HTMLDivElement  */
@js.native
trait FancytreeEvents extends StObject {
  
  /** 'data.node' was deactivated. */
  var activate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** Return false to prevent default processing */
  var beforeActivate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  
  /** Return `false` to prevent default processing */
  var beforeExpand: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  
  /** Return `false` to prevent default processing */
  var beforeSelect: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  
  /** `data.node` lost keyboard focus */
  var blur: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** `data.tree` lost keyboard focus */
  var blurTree: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** `data.node` was clicked. `data.targetType` contains the region ("title", "expander", ...). Return `false` to prevent default processing, i.e. activating, etc. */
  var click: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  
  /** `data.node` was collapsed */
  var collapse: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** Widget was created (called only once, even if re-initialized). */
  var create: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** Allow tweaking and binding, after node was created for the first time (NOTE: this event is only available as callback, but not for bind()) */
  var createNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** `data.node` was double-clicked. `data.targetType` contains the region ("title", "expander", ...). Return `false` to prevent default processing, i.e. expanding, etc. */
  var dblclick: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  
  /** `data.node` was deactivated */
  var deactivate: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** `data.node` was expanded */
  var expand: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** `data.node` received keyboard focus */
  var focus: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /**`data.tree` received keyboard focus */
  var focusTree: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** Widget was (re-)initialized. */
  var init: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** `data.node` received key. `event.which` contains the key. Return `false` to prevent default processing, i.e. navigation. Call `data.result = "preventNav";` to prevent navigation but still allow default handling inside embedded input controls. */
  var keydown: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  
  /** (currently unused) */
  var keypress: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** `data.node` is a lazy node that is expanded for the first time. The new child data must be returned in the `data.result` property (see `source` option for available formats). */
  var lazyLoad: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** Node data was loaded, i.e. `node.nodeLoadChildren()` finished */
  var loadChildren: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** A load error occured. Return `false` to prevent default processing. */
  var loadError: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Boolean]] = js.native
  
  /** Allows to modify the ajax response. */
  var postProcess: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** `data.node` was removed (NOTE: this event is only available as callback, but not for bind()) */
  var removeNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** (used by table extension) */
  var renderColumns: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** Allow tweaking after node state was rendered (NOTE: this event is only available as callback, but not for bind()) */
  var renderNode: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** Allow replacing the `<span class='fancytree-title'>` markup (NOTE: this event is only available as callback, but not for bind()) */
  var renderTitle: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** ext-persist has expanded, selected, and activated the previous state */
  var restore: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
  
  /** Enable RTL version, default is false */
  var rtl: js.UndefOr[Boolean] = js.native
  
  /** `data.node` was selected */
  var select: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* data */ EventData, Unit]] = js.native
}
object FancytreeEvents {
  
  @scala.inline
  def apply(): FancytreeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancytreeEvents]
  }
  
  @scala.inline
  implicit class FancytreeEventsMutableBuilder[Self <: FancytreeEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setBeforeActivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = StObject.set(x, "beforeActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeActivateUndefined: Self = StObject.set(x, "beforeActivate", js.undefined)
    
    @scala.inline
    def setBeforeExpand(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = StObject.set(x, "beforeExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeExpandUndefined: Self = StObject.set(x, "beforeExpand", js.undefined)
    
    @scala.inline
    def setBeforeSelect(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = StObject.set(x, "beforeSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeSelectUndefined: Self = StObject.set(x, "beforeSelect", js.undefined)
    
    @scala.inline
    def setBlur(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlurTree(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "blurTree", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlurTreeUndefined: Self = StObject.set(x, "blurTree", js.undefined)
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setClick(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setCollapse(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "createNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDblclick(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = StObject.set(x, "dblclick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
    
    @scala.inline
    def setDeactivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    @scala.inline
    def setExpand(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusTree(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "focusTree", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusTreeUndefined: Self = StObject.set(x, "focusTree", js.undefined)
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setInit(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setKeydown(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = StObject.set(x, "keydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    @scala.inline
    def setKeypress(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "keypress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
    
    @scala.inline
    def setLazyLoad(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "lazyLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
    
    @scala.inline
    def setLoadChildren(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "loadChildren", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadChildrenUndefined: Self = StObject.set(x, "loadChildren", js.undefined)
    
    @scala.inline
    def setLoadError(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = StObject.set(x, "loadError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadErrorUndefined: Self = StObject.set(x, "loadError", js.undefined)
    
    @scala.inline
    def setPostProcess(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "postProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    @scala.inline
    def setRemoveNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "removeNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveNodeUndefined: Self = StObject.set(x, "removeNode", js.undefined)
    
    @scala.inline
    def setRenderColumns(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "renderColumns", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderColumnsUndefined: Self = StObject.set(x, "renderColumns", js.undefined)
    
    @scala.inline
    def setRenderNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "renderNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderNodeUndefined: Self = StObject.set(x, "renderNode", js.undefined)
    
    @scala.inline
    def setRenderTitle(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "renderTitle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderTitleUndefined: Self = StObject.set(x, "renderTitle", js.undefined)
    
    @scala.inline
    def setRestore(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
