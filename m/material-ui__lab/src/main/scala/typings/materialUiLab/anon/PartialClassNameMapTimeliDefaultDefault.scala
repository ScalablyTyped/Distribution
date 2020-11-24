package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/TimelineDot/TimelineDot.TimelineDotClassKey>> */
@js.native
trait PartialClassNameMapTimeliDefaultDefault extends js.Object {
  
  var defaultDefault: js.UndefOr[String] = js.native
  
  var defaultPrimary: js.UndefOr[String] = js.native
  
  var defaultSecondary: js.UndefOr[String] = js.native
  
  var outlinedDefault: js.UndefOr[String] = js.native
  
  var outlinedPrimary: js.UndefOr[String] = js.native
  
  var outlinedSecondary: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapTimeliDefaultDefault {
  
  @scala.inline
  def apply(): PartialClassNameMapTimeliDefaultDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTimeliDefaultDefault]
  }
  
  @scala.inline
  implicit class PartialClassNameMapTimeliDefaultDefaultOps[Self <: PartialClassNameMapTimeliDefaultDefault] (val x: Self) extends AnyVal {
    
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
    def setDefaultDefault(value: String): Self = this.set("defaultDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDefault: Self = this.set("defaultDefault", js.undefined)
    
    @scala.inline
    def setDefaultPrimary(value: String): Self = this.set("defaultPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPrimary: Self = this.set("defaultPrimary", js.undefined)
    
    @scala.inline
    def setDefaultSecondary(value: String): Self = this.set("defaultSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSecondary: Self = this.set("defaultSecondary", js.undefined)
    
    @scala.inline
    def setOutlinedDefault(value: String): Self = this.set("outlinedDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlinedDefault: Self = this.set("outlinedDefault", js.undefined)
    
    @scala.inline
    def setOutlinedPrimary(value: String): Self = this.set("outlinedPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlinedPrimary: Self = this.set("outlinedPrimary", js.undefined)
    
    @scala.inline
    def setOutlinedSecondary(value: String): Self = this.set("outlinedSecondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlinedSecondary: Self = this.set("outlinedSecondary", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
