package typings.jointjs.mod.dia.Paper

import typings.jointjs.mod.dia.BBox
import typings.jointjs.mod.dia.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleContentOptions extends js.Object {
  
  var contentArea: js.UndefOr[BBox] = js.native
  
  var fittingBBox: js.UndefOr[BBox] = js.native
  
  var maxScale: js.UndefOr[Double] = js.native
  
  var maxScaleX: js.UndefOr[Double] = js.native
  
  var maxScaleY: js.UndefOr[Double] = js.native
  
  var minScale: js.UndefOr[Double] = js.native
  
  var minScaleX: js.UndefOr[Double] = js.native
  
  var minScaleY: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var preserveAspectRatio: js.UndefOr[Boolean] = js.native
  
  var scaleGrid: js.UndefOr[Double] = js.native
  
  var useModelGeometry: js.UndefOr[Boolean] = js.native
}
object ScaleContentOptions {
  
  @scala.inline
  def apply(): ScaleContentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleContentOptions]
  }
  
  @scala.inline
  implicit class ScaleContentOptionsOps[Self <: ScaleContentOptions] (val x: Self) extends AnyVal {
    
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
    def setContentArea(value: BBox): Self = this.set("contentArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentArea: Self = this.set("contentArea", js.undefined)
    
    @scala.inline
    def setFittingBBox(value: BBox): Self = this.set("fittingBBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFittingBBox: Self = this.set("fittingBBox", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScale: Self = this.set("maxScale", js.undefined)
    
    @scala.inline
    def setMaxScaleX(value: Double): Self = this.set("maxScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScaleX: Self = this.set("maxScaleX", js.undefined)
    
    @scala.inline
    def setMaxScaleY(value: Double): Self = this.set("maxScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScaleY: Self = this.set("maxScaleY", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScale: Self = this.set("minScale", js.undefined)
    
    @scala.inline
    def setMinScaleX(value: Double): Self = this.set("minScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScaleX: Self = this.set("minScaleX", js.undefined)
    
    @scala.inline
    def setMinScaleY(value: Double): Self = this.set("minScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScaleY: Self = this.set("minScaleY", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: Boolean): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setScaleGrid(value: Double): Self = this.set("scaleGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleGrid: Self = this.set("scaleGrid", js.undefined)
    
    @scala.inline
    def setUseModelGeometry(value: Boolean): Self = this.set("useModelGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseModelGeometry: Self = this.set("useModelGeometry", js.undefined)
  }
}
