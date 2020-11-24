package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey>> */
@js.native
trait PartialClassNameMapCollap extends js.Object {
  
  var container: js.UndefOr[String] = js.native
  
  var entered: js.UndefOr[String] = js.native
  
  var wrapper: js.UndefOr[String] = js.native
  
  var wrapperInner: js.UndefOr[String] = js.native
}
object PartialClassNameMapCollap {
  
  @scala.inline
  def apply(): PartialClassNameMapCollap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCollap]
  }
  
  @scala.inline
  implicit class PartialClassNameMapCollapOps[Self <: PartialClassNameMapCollap] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setEntered(value: String): Self = this.set("entered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntered: Self = this.set("entered", js.undefined)
    
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
    
    @scala.inline
    def setWrapperInner(value: String): Self = this.set("wrapperInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperInner: Self = this.set("wrapperInner", js.undefined)
  }
}
