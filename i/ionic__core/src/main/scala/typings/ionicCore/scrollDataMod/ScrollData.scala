package typings.ionicCore.scrollDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollData extends js.Object {
  
  var inputSafeY: Double = js.native
  
  var scrollAmount: Double = js.native
  
  var scrollDuration: Double = js.native
  
  var scrollPadding: Double = js.native
}
object ScrollData {
  
  @scala.inline
  def apply(inputSafeY: Double, scrollAmount: Double, scrollDuration: Double, scrollPadding: Double): ScrollData = {
    val __obj = js.Dynamic.literal(inputSafeY = inputSafeY.asInstanceOf[js.Any], scrollAmount = scrollAmount.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], scrollPadding = scrollPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollData]
  }
  
  @scala.inline
  implicit class ScrollDataOps[Self <: ScrollData] (val x: Self) extends AnyVal {
    
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
    def setInputSafeY(value: Double): Self = this.set("inputSafeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollAmount(value: Double): Self = this.set("scrollAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDuration(value: Double): Self = this.set("scrollDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPadding(value: Double): Self = this.set("scrollPadding", value.asInstanceOf[js.Any])
  }
}
