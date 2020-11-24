package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Button/Button.ButtonClassKey>> */
@js.native
trait PartialClassNameMapButton extends js.Object {
  
  var colorInherit: js.UndefOr[String] = js.native
  
  var contained: js.UndefOr[String] = js.native
  
  var containedPrimary: js.UndefOr[String] = js.native
  
  var containedSecondary: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var extendedFab: js.UndefOr[String] = js.native
  
  var fab: js.UndefOr[String] = js.native
  
  var flat: js.UndefOr[String] = js.native
  
  var flatPrimary: js.UndefOr[String] = js.native
  
  var flatSecondary: js.UndefOr[String] = js.native
  
  var focusVisible: js.UndefOr[String] = js.native
  
  var fullWidth: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var mini: js.UndefOr[String] = js.native
  
  var outlined: js.UndefOr[String] = js.native
  
  var outlinedPrimary: js.UndefOr[String] = js.native
  
  var outlinedSecondary: js.UndefOr[String] = js.native
  
  var raised: js.UndefOr[String] = js.native
  
  var raisedPrimary: js.UndefOr[String] = js.native
  
  var raisedSecondary: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var sizeLarge: js.UndefOr[String] = js.native
  
  var sizeSmall: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var textPrimary: js.UndefOr[String] = js.native
  
  var textSecondary: js.UndefOr[String] = js.native
}
object PartialClassNameMapButton {
  
  @scala.inline
  def apply(): PartialClassNameMapButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapButton]
  }
  
  @scala.inline
  implicit class PartialClassNameMapButtonOps[Self <: PartialClassNameMapButton] (val x: Self) extends AnyVal {
    
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
    def setColorInherit(value: String): Self = this.set("colorInherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorInherit: Self = this.set("colorInherit", js.undefined)
    
    @scala.inline
    def setContained(value: String): Self = this.set("contained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContained: Self = this.set("contained", js.undefined)
    
    @scala.inline
    def setContainedPrimary(value: String): Self = this.set("containedPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainedPrimary: Self = this.set("containedPrimary", js.undefined)
    
    @scala.inline
    def setContainedSecondary(value: String): Self = this.set("containedSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainedSecondary: Self = this.set("containedSecondary", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExtendedFab(value: String): Self = this.set("extendedFab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedFab: Self = this.set("extendedFab", js.undefined)
    
    @scala.inline
    def setFab(value: String): Self = this.set("fab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFab: Self = this.set("fab", js.undefined)
    
    @scala.inline
    def setFlat(value: String): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    
    @scala.inline
    def setFlatPrimary(value: String): Self = this.set("flatPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatPrimary: Self = this.set("flatPrimary", js.undefined)
    
    @scala.inline
    def setFlatSecondary(value: String): Self = this.set("flatSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlatSecondary: Self = this.set("flatSecondary", js.undefined)
    
    @scala.inline
    def setFocusVisible(value: String): Self = this.set("focusVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusVisible: Self = this.set("focusVisible", js.undefined)
    
    @scala.inline
    def setFullWidth(value: String): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMini(value: String): Self = this.set("mini", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    
    @scala.inline
    def setOutlined(value: String): Self = this.set("outlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlined: Self = this.set("outlined", js.undefined)
    
    @scala.inline
    def setOutlinedPrimary(value: String): Self = this.set("outlinedPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlinedPrimary: Self = this.set("outlinedPrimary", js.undefined)
    
    @scala.inline
    def setOutlinedSecondary(value: String): Self = this.set("outlinedSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlinedSecondary: Self = this.set("outlinedSecondary", js.undefined)
    
    @scala.inline
    def setRaised(value: String): Self = this.set("raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    
    @scala.inline
    def setRaisedPrimary(value: String): Self = this.set("raisedPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaisedPrimary: Self = this.set("raisedPrimary", js.undefined)
    
    @scala.inline
    def setRaisedSecondary(value: String): Self = this.set("raisedSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaisedSecondary: Self = this.set("raisedSecondary", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSizeLarge(value: String): Self = this.set("sizeLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeLarge: Self = this.set("sizeLarge", js.undefined)
    
    @scala.inline
    def setSizeSmall(value: String): Self = this.set("sizeSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeSmall: Self = this.set("sizeSmall", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextPrimary(value: String): Self = this.set("textPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextPrimary: Self = this.set("textPrimary", js.undefined)
    
    @scala.inline
    def setTextSecondary(value: String): Self = this.set("textSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSecondary: Self = this.set("textSecondary", js.undefined)
  }
}
