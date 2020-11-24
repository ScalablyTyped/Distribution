package typings.materialTab.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTabDimensions extends js.Object {
  
  var contentLeft: Double = js.native
  
  var contentRight: Double = js.native
  
  var rootLeft: Double = js.native
  
  var rootRight: Double = js.native
}
object MDCTabDimensions {
  
  @scala.inline
  def apply(contentLeft: Double, contentRight: Double, rootLeft: Double, rootRight: Double): MDCTabDimensions = {
    val __obj = js.Dynamic.literal(contentLeft = contentLeft.asInstanceOf[js.Any], contentRight = contentRight.asInstanceOf[js.Any], rootLeft = rootLeft.asInstanceOf[js.Any], rootRight = rootRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTabDimensions]
  }
  
  @scala.inline
  implicit class MDCTabDimensionsOps[Self <: MDCTabDimensions] (val x: Self) extends AnyVal {
    
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
    def setContentLeft(value: Double): Self = this.set("contentLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRight(value: Double): Self = this.set("contentRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootLeft(value: Double): Self = this.set("rootLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootRight(value: Double): Self = this.set("rootRight", value.asInstanceOf[js.Any])
  }
}
