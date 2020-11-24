package typings.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrowOverlayOptions extends OverlayOptions {
  
   // 0.5
  var direction: js.UndefOr[Double] = js.native
  
   // 1
  var foldback: js.UndefOr[Double] = js.native
  
   // 20
  var length: js.UndefOr[Double] = js.native
  
   // 20
  var location: js.UndefOr[Double] = js.native
  
   // 0.623
  var paintStyle: js.UndefOr[PaintStyle] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ArrowOverlayOptions {
  
  @scala.inline
  def apply(): ArrowOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowOverlayOptions]
  }
  
  @scala.inline
  implicit class ArrowOverlayOptionsOps[Self <: ArrowOverlayOptions] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setFoldback(value: Double): Self = this.set("foldback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldback: Self = this.set("foldback", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPaintStyle(value: PaintStyle): Self = this.set("paintStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaintStyle: Self = this.set("paintStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
