package typings.jointjs.mod.dia.Paper

import typings.jointjs.jointjsStrings.any
import typings.jointjs.jointjsStrings.negative
import typings.jointjs.jointjsStrings.positive
import typings.jointjs.mod.dia.BBox
import typings.jointjs.mod.dia.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FitToContentOptions extends js.Object {
  
  var allowNewOrigin: js.UndefOr[negative | positive | any] = js.native
  
  var contentArea: js.UndefOr[BBox] = js.native
  
  var gridHeight: js.UndefOr[Double] = js.native
  
  var gridWidth: js.UndefOr[Double] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var useModelGeometry: js.UndefOr[Boolean] = js.native
}
object FitToContentOptions {
  
  @scala.inline
  def apply(): FitToContentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitToContentOptions]
  }
  
  @scala.inline
  implicit class FitToContentOptionsOps[Self <: FitToContentOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowNewOrigin(value: negative | positive | any): Self = this.set("allowNewOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNewOrigin: Self = this.set("allowNewOrigin", js.undefined)
    
    @scala.inline
    def setContentArea(value: BBox): Self = this.set("contentArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentArea: Self = this.set("contentArea", js.undefined)
    
    @scala.inline
    def setGridHeight(value: Double): Self = this.set("gridHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridHeight: Self = this.set("gridHeight", js.undefined)
    
    @scala.inline
    def setGridWidth(value: Double): Self = this.set("gridWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridWidth: Self = this.set("gridWidth", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setUseModelGeometry(value: Boolean): Self = this.set("useModelGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseModelGeometry: Self = this.set("useModelGeometry", js.undefined)
  }
}
