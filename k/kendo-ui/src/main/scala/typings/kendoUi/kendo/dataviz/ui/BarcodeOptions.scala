package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarcodeOptions extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[BarcodeBorder] = js.native
  
  var checksum: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[BarcodePadding] = js.native
  
  var renderAs: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[BarcodeText] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object BarcodeOptions {
  
  @scala.inline
  def apply(): BarcodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarcodeOptions]
  }
  
  @scala.inline
  implicit class BarcodeOptionsOps[Self <: BarcodeOptions] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: BarcodeBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setChecksum(value: Boolean): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPadding(value: BarcodePadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRenderAs(value: String): Self = this.set("renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAs: Self = this.set("renderAs", js.undefined)
    
    @scala.inline
    def setText(value: BarcodeText): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
