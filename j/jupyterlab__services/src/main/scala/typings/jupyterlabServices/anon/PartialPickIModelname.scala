package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IModel, 'name'>> */
@js.native
trait PartialPickIModelname extends js.Object {
  
  var name: js.UndefOr[String] = js.native
}
object PartialPickIModelname {
  
  @scala.inline
  def apply(): PartialPickIModelname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickIModelname]
  }
  
  @scala.inline
  implicit class PartialPickIModelnameOps[Self <: PartialPickIModelname] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
