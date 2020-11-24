package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Tab/Tab.TabClassKey>> */
@js.native
trait PartialClassNameMapTabCla extends js.Object {
  
  var disabled: js.UndefOr[String] = js.native
  
  var fullWidth: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelContainer: js.UndefOr[String] = js.native
  
  var labelIcon: js.UndefOr[String] = js.native
  
  var labelWrapped: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[String] = js.native
  
  var textColorInherit: js.UndefOr[String] = js.native
  
  var textColorPrimary: js.UndefOr[String] = js.native
  
  var textColorSecondary: js.UndefOr[String] = js.native
  
  var wrapper: js.UndefOr[String] = js.native
}
object PartialClassNameMapTabCla {
  
  @scala.inline
  def apply(): PartialClassNameMapTabCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTabCla]
  }
  
  @scala.inline
  implicit class PartialClassNameMapTabClaOps[Self <: PartialClassNameMapTabCla] (val x: Self) extends AnyVal {
    
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
    def setFullWidth(value: String): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelContainer(value: String): Self = this.set("labelContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelContainer: Self = this.set("labelContainer", js.undefined)
    
    @scala.inline
    def setLabelIcon(value: String): Self = this.set("labelIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelIcon: Self = this.set("labelIcon", js.undefined)
    
    @scala.inline
    def setLabelWrapped(value: String): Self = this.set("labelWrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelWrapped: Self = this.set("labelWrapped", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setTextColorInherit(value: String): Self = this.set("textColorInherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColorInherit: Self = this.set("textColorInherit", js.undefined)
    
    @scala.inline
    def setTextColorPrimary(value: String): Self = this.set("textColorPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColorPrimary: Self = this.set("textColorPrimary", js.undefined)
    
    @scala.inline
    def setTextColorSecondary(value: String): Self = this.set("textColorSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColorSecondary: Self = this.set("textColorSecondary", js.undefined)
    
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
