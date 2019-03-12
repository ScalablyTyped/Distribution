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
    activate: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    beforeActivate: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    beforeExpand: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    beforeSelect: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    blur: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    blurTree: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    click: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    collapse: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    create: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    createNode: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    dblclick: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    deactivate: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    expand: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    focus: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    focusTree: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    init: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    keydown: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    keypress: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    lazyLoad: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    loadChildren: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    loadError: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Boolean = null,
    postProcess: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    removeNode: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    renderColumns: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    renderNode: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    renderTitle: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    restore: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    select: (/* event */ jqueryLib.JQueryEventObject, /* data */ EventData) => scala.Unit = null
  ): FancytreeEvents = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(js.Any.fromFunction2(activate))
    if (beforeActivate != null) __obj.updateDynamic("beforeActivate")(js.Any.fromFunction2(beforeActivate))
    if (beforeExpand != null) __obj.updateDynamic("beforeExpand")(js.Any.fromFunction2(beforeExpand))
    if (beforeSelect != null) __obj.updateDynamic("beforeSelect")(js.Any.fromFunction2(beforeSelect))
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction2(blur))
    if (blurTree != null) __obj.updateDynamic("blurTree")(js.Any.fromFunction2(blurTree))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction2(click))
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction2(collapse))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction2(createNode))
    if (dblclick != null) __obj.updateDynamic("dblclick")(js.Any.fromFunction2(dblclick))
    if (deactivate != null) __obj.updateDynamic("deactivate")(js.Any.fromFunction2(deactivate))
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction2(expand))
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction2(focus))
    if (focusTree != null) __obj.updateDynamic("focusTree")(js.Any.fromFunction2(focusTree))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction2(init))
    if (keydown != null) __obj.updateDynamic("keydown")(js.Any.fromFunction2(keydown))
    if (keypress != null) __obj.updateDynamic("keypress")(js.Any.fromFunction2(keypress))
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2(lazyLoad))
    if (loadChildren != null) __obj.updateDynamic("loadChildren")(js.Any.fromFunction2(loadChildren))
    if (loadError != null) __obj.updateDynamic("loadError")(js.Any.fromFunction2(loadError))
    if (postProcess != null) __obj.updateDynamic("postProcess")(js.Any.fromFunction2(postProcess))
    if (removeNode != null) __obj.updateDynamic("removeNode")(js.Any.fromFunction2(removeNode))
    if (renderColumns != null) __obj.updateDynamic("renderColumns")(js.Any.fromFunction2(renderColumns))
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction2(renderNode))
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(js.Any.fromFunction2(renderTitle))
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction2(restore))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    __obj.asInstanceOf[FancytreeEvents]
  }
}

