package typings.jointjs.mod.dia.Element

import typings.jointjs.mod.dia.BBox
import typings.jointjs.mod.dia.Cell.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateOptions extends js.Object {
  
  var restrictedArea: js.UndefOr[BBox] = js.native
  
  var transition: js.UndefOr[TransitionOptions] = js.native
}
object TranslateOptions {
  
  @scala.inline
  def apply(): TranslateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateOptions]
  }
  
  @scala.inline
  implicit class TranslateOptionsOps[Self <: TranslateOptions] (val x: Self) extends AnyVal {
    
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
    def setRestrictedArea(value: BBox): Self = this.set("restrictedArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedArea: Self = this.set("restrictedArea", js.undefined)
    
    @scala.inline
    def setTransition(value: TransitionOptions): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
