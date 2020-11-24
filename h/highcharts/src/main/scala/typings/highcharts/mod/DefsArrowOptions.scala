package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefsArrowOptions extends js.Object {
  
  var children: js.UndefOr[js.Array[DefsOptions]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var markerHeight: js.UndefOr[Double] = js.native
  
  var markerWidth: js.UndefOr[Double] = js.native
  
  var refX: js.UndefOr[Double] = js.native
  
  var refY: js.UndefOr[Double] = js.native
  
  var render: js.UndefOr[Boolean] = js.native
  
  var tagName: js.UndefOr[String] = js.native
}
object DefsArrowOptions {
  
  @scala.inline
  def apply(): DefsArrowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefsArrowOptions]
  }
  
  @scala.inline
  implicit class DefsArrowOptionsOps[Self <: DefsArrowOptions] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: DefsOptions*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[DefsOptions]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMarkerHeight(value: Double): Self = this.set("markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerHeight: Self = this.set("markerHeight", js.undefined)
    
    @scala.inline
    def setMarkerWidth(value: Double): Self = this.set("markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkerWidth: Self = this.set("markerWidth", js.undefined)
    
    @scala.inline
    def setRefX(value: Double): Self = this.set("refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefX: Self = this.set("refX", js.undefined)
    
    @scala.inline
    def setRefY(value: Double): Self = this.set("refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefY: Self = this.set("refY", js.undefined)
    
    @scala.inline
    def setRender(value: Boolean): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
  }
}
