package typings.jqueryColorpicker.anon

import typings.jqueryColorpicker.JQueryColorpickerStatic.CMYK
import typings.jqueryColorpicker.JQueryColorpickerStatic.HSL
import typings.jqueryColorpicker.JQueryColorpickerStatic.HSV
import typings.jqueryColorpicker.JQueryColorpickerStatic.LAB
import typings.jqueryColorpicker.JQueryColorpickerStatic.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cmyk extends js.Object {
  
  var cmyk: CMYK = js.native
  
  var hsl: HSL = js.native
  
  var hsv: HSV = js.native
  
  var lab: LAB = js.native
  
  var rgb: RGB = js.native
}
object Cmyk {
  
  @scala.inline
  def apply(cmyk: CMYK, hsl: HSL, hsv: HSV, lab: LAB, rgb: RGB): Cmyk = {
    val __obj = js.Dynamic.literal(cmyk = cmyk.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cmyk]
  }
  
  @scala.inline
  implicit class CmykOps[Self <: Cmyk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCmyk(value: CMYK): Self = this.set("cmyk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsl(value: HSL): Self = this.set("hsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsv(value: HSV): Self = this.set("hsv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLab(value: LAB): Self = this.set("lab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgb(value: RGB): Self = this.set("rgb", value.asInstanceOf[js.Any])
  }
}
