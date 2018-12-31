package typings
package jqrangesliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQDateRangeSliderOptions extends JQRangeSliderOptions {
  var bounds: js.UndefOr[JQRangeSliderDateRange] = js.undefined
   // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderDateRange] = js.undefined
   // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* date */ stdLib.Date, java.lang.String]] = js.undefined
   // customize displayed label text
  var step: js.UndefOr[JQRangeSliderDateSteps] = js.undefined
}

