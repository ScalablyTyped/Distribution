package typings.jsreportScripts.mod.jsreportCoreAugmentingMod

import typings.jsreportScripts.mod.TemplateScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends js.Object {
  
  var scripts: js.UndefOr[js.Array[TemplateScript]] = js.native
}
object Template {
  
  @scala.inline
  def apply(): Template = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Template]
  }
  
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
    
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
    def setScriptsVarargs(value: TemplateScript*): Self = this.set("scripts", js.Array(value :_*))
    
    @scala.inline
    def setScripts(value: js.Array[TemplateScript]): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScripts: Self = this.set("scripts", js.undefined)
  }
}
