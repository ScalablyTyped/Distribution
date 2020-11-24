package typings.jqueryTools.JQueryTools.overlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskOptions extends js.Object {
  
  /** CSS color string (i.e. hex value) */
  var color: js.UndefOr[String] = js.native
  
  /** load speed in milliseconds */
  var loadSpeed: js.UndefOr[Double] = js.native
  
  /** Opacity of mask.  Between 0 and 1. */
  var opacity: js.UndefOr[Double] = js.native
}
object MaskOptions {
  
  @scala.inline
  def apply(): MaskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskOptions]
  }
  
  @scala.inline
  implicit class MaskOptionsOps[Self <: MaskOptions] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setLoadSpeed(value: Double): Self = this.set("loadSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadSpeed: Self = this.set("loadSpeed", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
}
