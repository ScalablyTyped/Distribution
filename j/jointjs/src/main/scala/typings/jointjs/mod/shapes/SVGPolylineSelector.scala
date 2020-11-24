package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGPolylineAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPolylineSelector extends Selectors {
  
  var polyline: js.UndefOr[SVGPolylineAttributes] = js.native
}
object SVGPolylineSelector {
  
  @scala.inline
  def apply(): SVGPolylineSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolylineSelector]
  }
  
  @scala.inline
  implicit class SVGPolylineSelectorOps[Self <: SVGPolylineSelector] (val x: Self) extends AnyVal {
    
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
    def setPolyline(value: SVGPolylineAttributes): Self = this.set("polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
  }
}
