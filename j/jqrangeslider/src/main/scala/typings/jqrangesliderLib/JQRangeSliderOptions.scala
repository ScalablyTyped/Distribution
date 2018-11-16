package typings
package jqrangesliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JQRangeSliderOptions extends js.Object {
   // speed of the wheel scrolling
  var arrows: js.UndefOr[scala.Boolean] = js.undefined
   // fade out length when displaying value labels (only when valueLabels = "change")
  var delayOut: js.UndefOr[scala.Double] = js.undefined
   // when to show value labels: "show" (always), "hide" (never) and "change" (only if slider changed)
  var durationIn: js.UndefOr[scala.Double] = js.undefined
   // fade in length when displaying value labels (only when valueLabels = "change")
  var durationOut: js.UndefOr[scala.Double] = js.undefined
   // show handles and make them clearly select the range. Warning: must be used with 'minimum' and must not be used with 'scale'
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
   // duration labels are shown after the user changed its values (only when valueLabels = "change")
  var range: js.UndefOr[scala.Boolean | JQRangeSliderRangeLength] = js.undefined
   // configure a read-only slider
  var scales: js.UndefOr[js.Array[jQRangeSliderScale]] = js.undefined
   // lets you specify minimum and/or maximum range length
  var symmetricPositionning: js.UndefOr[scala.Boolean] = js.undefined
   // hide the arrows or not
  var valueLabels: js.UndefOr[java.lang.String] = js.undefined
  var wheelMode: js.UndefOr[java.lang.String] = js.undefined
   // function of the wheel, "zoom", "scroll" or null
  var wheelSpeed: js.UndefOr[scala.Double] = js.undefined
}

