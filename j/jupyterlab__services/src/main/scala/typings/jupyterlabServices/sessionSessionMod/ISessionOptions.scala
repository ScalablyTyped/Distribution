package typings.jupyterlabServices.sessionSessionMod

import typings.jupyterlabServices.anon.PartialPickIModelname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/session/session.IModel, 'path' | 'type' | 'name'> & {  kernel :std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IModel, 'name'>> | undefined} */
@js.native
trait ISessionOptions extends js.Object {
  
  var kernel: js.UndefOr[PartialPickIModelname] = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  var `type`: String = js.native
}
object ISessionOptions {
  
  @scala.inline
  def apply(name: String, path: String, `type`: String): ISessionOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionOptions]
  }
  
  @scala.inline
  implicit class ISessionOptionsOps[Self <: ISessionOptions] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernel(value: PartialPickIModelname): Self = this.set("kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernel: Self = this.set("kernel", js.undefined)
  }
}
