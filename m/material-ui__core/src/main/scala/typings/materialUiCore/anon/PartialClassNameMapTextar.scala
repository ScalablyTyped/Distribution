package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputBase/Textarea.TextareaClassKey>> */
@js.native
trait PartialClassNameMapTextar extends js.Object {
  
  var root: js.UndefOr[String] = js.native
  
  var shadow: js.UndefOr[String] = js.native
  
  var textarea: js.UndefOr[String] = js.native
}
object PartialClassNameMapTextar {
  
  @scala.inline
  def apply(): PartialClassNameMapTextar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapTextar]
  }
  
  @scala.inline
  implicit class PartialClassNameMapTextarOps[Self <: PartialClassNameMapTextar] (val x: Self) extends AnyVal {
    
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
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setShadow(value: String): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setTextarea(value: String): Self = this.set("textarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextarea: Self = this.set("textarea", js.undefined)
  }
}
