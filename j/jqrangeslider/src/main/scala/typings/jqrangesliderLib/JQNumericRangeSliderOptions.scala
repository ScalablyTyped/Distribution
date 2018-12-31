package typings
package jqrangesliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQNumericRangeSliderOptions extends JQRangeSliderOptions {
  var bounds: js.UndefOr[JQRangeSliderNumericRange] = js.undefined
   // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderNumericRange] = js.undefined
   // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* int */ scala.Double, java.lang.String]] = js.undefined
   // customize displayed label text
  var step: js.UndefOr[scala.Double] = js.undefined
}

