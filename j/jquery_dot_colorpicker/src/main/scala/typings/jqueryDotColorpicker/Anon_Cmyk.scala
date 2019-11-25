package typings.jqueryDotColorpicker

import typings.jqueryDotColorpicker.JQueryColorpickerStatic.CMYK
import typings.jqueryDotColorpicker.JQueryColorpickerStatic.HSL
import typings.jqueryDotColorpicker.JQueryColorpickerStatic.HSV
import typings.jqueryDotColorpicker.JQueryColorpickerStatic.LAB
import typings.jqueryDotColorpicker.JQueryColorpickerStatic.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cmyk extends js.Object {
  var cmyk: CMYK
  var hsl: HSL
  var hsv: HSV
  var lab: LAB
  var rgb: RGB
}

object Anon_Cmyk {
  @scala.inline
  def apply(cmyk: CMYK, hsl: HSL, hsv: HSV, lab: LAB, rgb: RGB): Anon_Cmyk = {
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cmyk]
  }
}

