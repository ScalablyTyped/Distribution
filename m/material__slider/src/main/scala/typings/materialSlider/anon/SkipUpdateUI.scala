package typings.materialSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipUpdateUI extends js.Object {
  
  var skipUpdateUI: js.UndefOr[Boolean] = js.native
}
object SkipUpdateUI {
  
  @scala.inline
  def apply(): SkipUpdateUI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipUpdateUI]
  }
  
  @scala.inline
  implicit class SkipUpdateUIOps[Self <: SkipUpdateUI] (val x: Self) extends AnyVal {
    
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
    def setSkipUpdateUI(value: Boolean): Self = this.set("skipUpdateUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipUpdateUI: Self = this.set("skipUpdateUI", js.undefined)
  }
}
