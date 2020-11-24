package typings.jqueryFancytree.Fancytree

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The `this` context of any event function is set to tree's the HTMLDivElement  */
@js.native
trait FancytreeEvents extends js.Object {
  
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
  implicit class FancytreeEventsOps[Self <: FancytreeEvents] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("activate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setBeforeActivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = this.set("beforeActivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeActivate: Self = this.set("beforeActivate", js.undefined)
    
    @scala.inline
    def setBeforeExpand(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = this.set("beforeExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeExpand: Self = this.set("beforeExpand", js.undefined)
    
    @scala.inline
    def setBeforeSelect(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = this.set("beforeSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeSelect: Self = this.set("beforeSelect", js.undefined)
    
    @scala.inline
    def setBlur(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("blur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setBlurTree(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("blurTree", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBlurTree: Self = this.set("blurTree", js.undefined)
    
    @scala.inline
    def setClick(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = this.set("click", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setCollapse(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("collapse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCreateNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("createNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateNode: Self = this.set("createNode", js.undefined)
    
    @scala.inline
    def setDblclick(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = this.set("dblclick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDblclick: Self = this.set("dblclick", js.undefined)
    
    @scala.inline
    def setDeactivate(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("deactivate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDeactivate: Self = this.set("deactivate", js.undefined)
    
    @scala.inline
    def setExpand(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("expand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFocusTree(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("focusTree", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFocusTree: Self = this.set("focusTree", js.undefined)
    
    @scala.inline
    def setInit(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("init", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setKeydown(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = this.set("keydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setKeypress(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("keypress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeypress: Self = this.set("keypress", js.undefined)
    
    @scala.inline
    def setLazyLoad(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("lazyLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    
    @scala.inline
    def setLoadChildren(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("loadChildren", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadChildren: Self = this.set("loadChildren", js.undefined)
    
    @scala.inline
    def setLoadError(value: (/* event */ JQueryEventObject, /* data */ EventData) => Boolean): Self = this.set("loadError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadError: Self = this.set("loadError", js.undefined)
    
    @scala.inline
    def setPostProcess(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("postProcess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostProcess: Self = this.set("postProcess", js.undefined)
    
    @scala.inline
    def setRemoveNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("removeNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveNode: Self = this.set("removeNode", js.undefined)
    
    @scala.inline
    def setRenderColumns(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("renderColumns", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderColumns: Self = this.set("renderColumns", js.undefined)
    
    @scala.inline
    def setRenderNode(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("renderNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderNode: Self = this.set("renderNode", js.undefined)
    
    @scala.inline
    def setRenderTitle(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("renderTitle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderTitle: Self = this.set("renderTitle", js.undefined)
    
    @scala.inline
    def setRestore(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("restore", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* event */ JQueryEventObject, /* data */ EventData) => Unit): Self = this.set("select", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
}
