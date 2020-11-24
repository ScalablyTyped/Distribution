package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchFor extends js.Object {
  
  /*Whether to match the font size for the HTML-CSS output.*/
  var `HTML-CSS`: js.UndefOr[Boolean] = js.native
  
  /*Whether to match the font size for the NativeMML output.*/
  var NativeMML: js.UndefOr[Boolean] = js.native
  
  /*Whether to match the font size for the SVG output.*/
  var SVG: js.UndefOr[Boolean] = js.native
}
object MatchFor {
  
  @scala.inline
  def apply(): MatchFor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchFor]
  }
  
  @scala.inline
  implicit class MatchForOps[Self <: MatchFor] (val x: Self) extends AnyVal {
    
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
    def `setHTML-CSS`(value: Boolean): Self = this.set("HTML-CSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteHTML-CSS`: Self = this.set("HTML-CSS", js.undefined)
    
    @scala.inline
    def setNativeMML(value: Boolean): Self = this.set("NativeMML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeMML: Self = this.set("NativeMML", js.undefined)
    
    @scala.inline
    def setSVG(value: Boolean): Self = this.set("SVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSVG: Self = this.set("SVG", js.undefined)
  }
}
