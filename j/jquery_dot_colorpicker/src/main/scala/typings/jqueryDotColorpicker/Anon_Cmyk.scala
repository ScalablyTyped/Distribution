package typings.jqueryDotColorpicker

import typings.jqueryDotColorpicker.JQueryColorpickerStaticNs.CMYK
import typings.jqueryDotColorpicker.JQueryColorpickerStaticNs.HSL
import typings.jqueryDotColorpicker.JQueryColorpickerStaticNs.HSV
import typings.jqueryDotColorpicker.JQueryColorpickerStaticNs.LAB
import typings.jqueryDotColorpicker.JQueryColorpickerStaticNs.RGB
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
    val __obj = js.Dynamic.literal(cmyk = cmyk, hsl = hsl, hsv = hsv, lab = lab, rgb = rgb)
  
    __obj.asInstanceOf[Anon_Cmyk]
  }
}

