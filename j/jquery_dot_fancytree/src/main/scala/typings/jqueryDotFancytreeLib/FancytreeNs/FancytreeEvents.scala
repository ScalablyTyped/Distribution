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

