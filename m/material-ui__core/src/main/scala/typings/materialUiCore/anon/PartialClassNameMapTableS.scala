package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableSortLabel/TableSortLabel.TableSortLabelClassKey>> */
@js.native
trait PartialClassNameMapTableS extends js.Object {
  
  var active: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var iconDirectionAsc: js.UndefOr[String] = js.native
  
  var iconDirectionDesc: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapTableS {
  
  @scala.inline
  def apply(): PartialClassNameMapTableS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTableS]
  }
  
  @scala.inline
  implicit class PartialClassNameMapTableSOps[Self <: PartialClassNameMapTableS] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconDirectionAsc(value: String): Self = this.set("iconDirectionAsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconDirectionAsc: Self = this.set("iconDirectionAsc", js.undefined)
    
    @scala.inline
    def setIconDirectionDesc(value: String): Self = this.set("iconDirectionDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconDirectionDesc: Self = this.set("iconDirectionDesc", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
