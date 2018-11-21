package typings
package jqueryDotContextmenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JQueryContextMenuOptions extends js.Object {
  var animation: js.UndefOr[Anon_Hide] = js.undefined
  var appendTo: js.UndefOr[java.lang.String] = js.undefined
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  var build: js.UndefOr[js.Function2[/* triggerElement */ JQuery, /* e */ stdLib.Event, _]] = js.undefined
  var callback: js.UndefOr[js.Function2[/* key */ js.Any, /* options */ js.Any, _]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var determinePosition: js.UndefOr[js.Function1[/* menu */ JQuery, scala.Unit]] = js.undefined
  var events: js.UndefOr[Anon_HideOptions] = js.undefined
  var itemClickEvent: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Any] = js.undefined
  var position: js.UndefOr[
    js.Function3[/* opt */ JQuery, /* x */ scala.Double, /* y */ scala.Double, scala.Unit]
  ] = js.undefined
  var positionSubmenu: js.UndefOr[js.Function1[/* menu */ JQuery, scala.Unit]] = js.undefined
  var reposition: js.UndefOr[scala.Boolean] = js.undefined
  var selector: java.lang.String
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

