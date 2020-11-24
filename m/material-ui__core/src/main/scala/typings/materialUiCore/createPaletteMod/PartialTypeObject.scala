package typings.materialUiCore.createPaletteMod

import typings.materialUiCore.anon.PartialTypeAction
import typings.materialUiCore.anon.PartialTypeBackground
import typings.materialUiCore.anon.PartialTypeText
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof @material-ui/core.@material-ui/core/styles/createPalette.TypeObject ]:? std.Partial<@material-ui/core.@material-ui/core/styles/createPalette.TypeObject[P]>} */
@js.native
trait PartialTypeObject extends js.Object {
  
  var action: js.UndefOr[PartialTypeAction] = js.native
  
  var background: js.UndefOr[PartialTypeBackground] = js.native
  
  var divider: js.UndefOr[Partial[TypeDivider]] = js.native
  
  var text: js.UndefOr[PartialTypeText] = js.native
}
object PartialTypeObject {
  
  @scala.inline
  def apply(): PartialTypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeObject]
  }
  
  @scala.inline
  implicit class PartialTypeObjectOps[Self <: PartialTypeObject] (val x: Self) extends AnyVal {
    
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
    def setAction(value: PartialTypeAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setBackground(value: PartialTypeBackground): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setDivider(value: Partial[TypeDivider]): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setText(value: PartialTypeText): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
