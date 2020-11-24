package typings.mapsjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait styleObj extends js.Object {
  
  var dashArray: js.UndefOr[String] = js.native
  
  var fillColor: js.UndefOr[String] = js.native
  
  var fillOpacity: js.UndefOr[Double] = js.native
  
  var outlineColor: js.UndefOr[String] = js.native
  
  var outlineOpacity: js.UndefOr[Double] = js.native
  
  var outlineThicknessPix: js.UndefOr[Double] = js.native
}
object styleObj {
  
  @scala.inline
  def apply(): styleObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[styleObj]
  }
  
  @scala.inline
  implicit class styleObjOps[Self <: styleObj] (val x: Self) extends AnyVal {
    
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
    def setDashArray(value: String): Self = this.set("dashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashArray: Self = this.set("dashArray", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: String): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineOpacity(value: Double): Self = this.set("outlineOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineOpacity: Self = this.set("outlineOpacity", js.undefined)
    
    @scala.inline
    def setOutlineThicknessPix(value: Double): Self = this.set("outlineThicknessPix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineThicknessPix: Self = this.set("outlineThicknessPix", js.undefined)
  }
}
