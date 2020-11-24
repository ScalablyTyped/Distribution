package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/NativeSelect.NativeSelectClassKey>> */
@js.native
trait PartialStyleRulesNativeSe extends js.Object {
  
  var disabled: js.UndefOr[CSSProperties] = js.native
  
  var filled: js.UndefOr[CSSProperties] = js.native
  
  var icon: js.UndefOr[CSSProperties] = js.native
  
  var outlined: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var select: js.UndefOr[CSSProperties] = js.native
  
  var selectMenu: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesNativeSe {
  
  @scala.inline
  def apply(): PartialStyleRulesNativeSe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesNativeSe]
  }
  
  @scala.inline
  implicit class PartialStyleRulesNativeSeOps[Self <: PartialStyleRulesNativeSe] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFilled(value: CSSProperties): Self = this.set("filled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    
    @scala.inline
    def setIcon(value: CSSProperties): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOutlined(value: CSSProperties): Self = this.set("outlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlined: Self = this.set("outlined", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSelect(value: CSSProperties): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectMenu(value: CSSProperties): Self = this.set("selectMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectMenu: Self = this.set("selectMenu", js.undefined)
  }
}
