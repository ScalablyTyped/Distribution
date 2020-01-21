package typings.jqueryColorpicker

import typings.jqueryColorpicker.JQueryColorpickerStatic.CMYK
import typings.jqueryColorpicker.JQueryColorpickerStatic.HSL
import typings.jqueryColorpicker.JQueryColorpickerStatic.HSV
import typings.jqueryColorpicker.JQueryColorpickerStatic.LAB
import typings.jqueryColorpicker.JQueryColorpickerStatic.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCmyk extends js.Object {
  var cmyk: CMYK
  var hsl: HSL
  var hsv: HSV
  var lab: LAB
  var rgb: RGB
}

object AnonCmyk {
  @scala.inline
  def apply(cmyk: CMYK, hsl: HSL, hsv: HSV, lab: LAB, rgb: RGB): AnonCmyk = {
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCmyk]
  }
}

