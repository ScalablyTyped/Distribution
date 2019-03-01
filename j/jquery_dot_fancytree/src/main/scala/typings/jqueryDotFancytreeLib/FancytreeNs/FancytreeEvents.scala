package typings
package jqueryDotFancytreeLib.FancytreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The `this` context of any event function is set to tree's the HTMLDivElement  */
trait FancytreeEvents extends js.Object {
  /** 'data.node' was deactivated. */
  var activate: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** Return false to prevent default processing */
  var beforeActivate: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean]
  ] = js.undefined
  /** Return `false` to prevent default processing */
  var beforeExpand: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean]
  ] = js.undefined
  /** Return `false` to prevent default processing */
  var beforeSelect: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean]
  ] = js.undefined
  /** `data.node` lost keyboard focus */
  var blur: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** `data.tree` lost keyboard focus */
  var blurTree: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** `data.node` was clicked. `data.targetType` contains the region ("title", "expander", ...). Return `false` to prevent default processing, i.e. activating, etc. */
  var click: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean]
  ] = js.undefined
  /** `data.node` was collapsed */
  var collapse: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** Widget was created (called only once, even if re-initialized). */
  var create: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** Allow tweaking and binding, after node was created for the first time (NOTE: this event is only available as callback, but not for bind()) */
  var createNode: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** `data.node` was double-clicked. `data.targetType` contains the region ("title", "expander", ...). Return `false` to prevent default processing, i.e. expanding, etc. */
  var dblclick: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean]
  ] = js.undefined
  /** `data.node` was deactivated */
  var deactivate: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** `data.node` was expanded */
  var expand: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** `data.node` received keyboard focus */
  var focus: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /**`data.tree` received keyboard focus */
  var focusTree: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** Widget was (re-)initialized. */
  var init: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** `data.node` received key. `event.which` contains the key. Return `false` to prevent default processing, i.e. navigation. Call `data.result = "preventNav";` to prevent navigation but still allow default handling inside embedded input controls. */
  var keydown: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean]
  ] = js.undefined
  /** (currently unused) */
  var keypress: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** `data.node` is a lazy node that is expanded for the first time. The new child data must be returned in the `data.result` property (see `source` option for available formats). */
  var lazyLoad: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** Node data was loaded, i.e. `node.nodeLoadChildren()` finished */
  var loadChildren: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** A load error occured. Return `false` to prevent default processing. */
  var loadError: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean]
  ] = js.undefined
  /** Allows to modify the ajax response. */
  var postProcess: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** `data.node` was removed (NOTE: this event is only available as callback, but not for bind()) */
  var removeNode: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** (used by table extension) */
  var renderColumns: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** Allow tweaking after node state was rendered (NOTE: this event is only available as callback, but not for bind()) */
  var renderNode: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** Allow replacing the `<span class='fancytree-title'>` markup (NOTE: this event is only available as callback, but not for bind()) */
  var renderTitle: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** ext-persist has expanded, selected, and activated the previous state */
  var restore: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
  /** Enable RTL version, default is false */
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  /** `data.node` was selected */
  var select: js.UndefOr[
    js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit]
  ] = js.undefined
}

object FancytreeEvents {
  @scala.inline
  def apply(
    activate: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    beforeActivate: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean] = null,
    beforeExpand: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean] = null,
    beforeSelect: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean] = null,
    blur: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    blurTree: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    click: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean] = null,
    collapse: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    create: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    createNode: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    dblclick: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean] = null,
    deactivate: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    expand: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    focus: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    focusTree: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    init: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    keydown: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean] = null,
    keypress: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    lazyLoad: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    loadChildren: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    loadError: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Boolean] = null,
    postProcess: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    removeNode: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    renderColumns: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    renderNode: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    renderTitle: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    restore: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.Function2[/* event */ jqueryLib.JQueryEventObject, /* data */ EventData, scala.Unit] = null
  ): FancytreeEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate)
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(beforeActivate)
    if (beforeExpand != null) __obj.updateDynamic("beforeExpand")(beforeExpand)
    if (beforeSelect != null) __obj.updateDynamic("beforeSelect")(beforeSelect)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (blurTree != null) __obj.updateDynamic("blurTree")(blurTree)
    if (click != null) __obj.updateDynamic("click")(click)
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (create != null) __obj.updateDynamic("create")(create)
    if (createNode != null) __obj.updateDynamic("createNode")(createNode)
    if (dblclick != null) __obj.updateDynamic("dblclick")(dblclick)
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (focusTree != null) __obj.updateDynamic("focusTree")(focusTree)
    if (init != null) __obj.updateDynamic("init")(init)
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (keypress != null) __obj.updateDynamic("keypress")(keypress)
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (loadChildren != null) __obj.updateDynamic("loadChildren")(loadChildren)
    if (loadError != null) __obj.updateDynamic("loadError")(loadError)
    if (postProcess != null) __obj.updateDynamic("postProcess")(postProcess)
    if (removeNode != null) __obj.updateDynamic("removeNode")(removeNode)
    if (renderColumns != null) __obj.updateDynamic("renderColumns")(renderColumns)
    if (renderNode != null) __obj.updateDynamic("renderNode")(renderNode)
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(renderTitle)
    if (restore != null) __obj.updateDynamic("restore")(restore)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (select != null) __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[FancytreeEvents]
  }
}

