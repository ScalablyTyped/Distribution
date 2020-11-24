package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListItem/ListItem.ListItemClassKey>> */
@js.native
trait PartialClassNameMapListIt extends js.Object {
  
  var button: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var default: js.UndefOr[String] = js.native
  
  var dense: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var divider: js.UndefOr[String] = js.native
  
  var focusVisible: js.UndefOr[String] = js.native
  
  var gutters: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var secondaryAction: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[String] = js.native
}
object PartialClassNameMapListIt {
  
  @scala.inline
  def apply(): PartialClassNameMapListIt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapListIt]
  }
  
  @scala.inline
  implicit class PartialClassNameMapListItOps[Self <: PartialClassNameMapListIt] (val x: Self) extends AnyVal {
    
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDense(value: String): Self = this.set("dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDivider(value: String): Self = this.set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    
    @scala.inline
    def setFocusVisible(value: String): Self = this.set("focusVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusVisible: Self = this.set("focusVisible", js.undefined)
    
    @scala.inline
    def setGutters(value: String): Self = this.set("gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSecondaryAction(value: String): Self = this.set("secondaryAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryAction: Self = this.set("secondaryAction", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
