package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ButtonBase/ButtonBase.ButtonBaseClassKey>> */
@js.native
trait PartialClassNameMapButtonDisabled extends js.Object {
  
  var disabled: js.UndefOr[String] = js.native
  
  var focusVisible: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapButtonDisabled {
  
  @scala.inline
  def apply(): PartialClassNameMapButtonDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapButtonDisabled]
  }
  
  @scala.inline
  implicit class PartialClassNameMapButtonDisabledOps[Self <: PartialClassNameMapButtonDisabled] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFocusVisible(value: String): Self = this.set("focusVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusVisible: Self = this.set("focusVisible", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
