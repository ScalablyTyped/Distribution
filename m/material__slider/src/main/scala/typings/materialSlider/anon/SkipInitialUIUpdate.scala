package typings.materialSlider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipInitialUIUpdate extends js.Object {
  
  var skipInitialUIUpdate: js.UndefOr[Boolean] = js.native
}
object SkipInitialUIUpdate {
  
  @scala.inline
  def apply(): SkipInitialUIUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipInitialUIUpdate]
  }
  
  @scala.inline
  implicit class SkipInitialUIUpdateOps[Self <: SkipInitialUIUpdate] (val x: Self) extends AnyVal {
    
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
    def setSkipInitialUIUpdate(value: Boolean): Self = this.set("skipInitialUIUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipInitialUIUpdate: Self = this.set("skipInitialUIUpdate", js.undefined)
  }
}
