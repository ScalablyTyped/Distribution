package typings.jointjs.mod.shapes

import typings.jointjs.mod.attributes.SVGPolygonAttributes
import typings.jointjs.mod.dia.Cell.Selectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPolygonSelector extends Selectors {
  
  var polygon: js.UndefOr[SVGPolygonAttributes] = js.native
}
object SVGPolygonSelector {
  
  @scala.inline
  def apply(): SVGPolygonSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGPolygonSelector]
  }
  
  @scala.inline
  implicit class SVGPolygonSelectorOps[Self <: SVGPolygonSelector] (val x: Self) extends AnyVal {
    
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
    def setPolygon(value: SVGPolygonAttributes): Self = this.set("polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygon: Self = this.set("polygon", js.undefined)
  }
}
