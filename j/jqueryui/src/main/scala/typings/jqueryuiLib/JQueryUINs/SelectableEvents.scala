package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectableEvents extends js.Object {
  var selected: js.UndefOr[
    js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selected, scala.Unit]
  ] = js.undefined
  var selecting: js.UndefOr[
    js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Selecting, scala.Unit]
  ] = js.undefined
  var start: js.UndefOr[js.Function2[/* event */ stdLib.Event, /* ui */ js.Any, scala.Unit]] = js.undefined
  var stop: js.UndefOr[js.Function2[/* event */ stdLib.Event, /* ui */ js.Any, scala.Unit]] = js.undefined
  var unselected: js.UndefOr[
    js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselected, scala.Unit]
  ] = js.undefined
  var unselecting: js.UndefOr[
    js.Function2[/* event */ stdLib.Event, /* ui */ jqueryuiLib.Anon_Unselecting, scala.Unit]
  ] = js.undefined
}

