package typings.jupyterlabServices.anon

import typings.jupyterlabServices.kernelRestapiMod.IModel
import typings.jupyterlabServices.sessionRestapiMod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/session.Session.IModel, 'id'> & @jupyterlab/services.@jupyterlab/services/lib/session/restapi.DeepPartial<std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session.Session.IModel, 'id'>> */
@js.native
trait PickIModelidDeepPartialOm extends js.Object {
  
  var id: String = js.native
  
  var kernel: js.UndefOr[DeepPartial[js.UndefOr[IModel | Null]]] = js.native
  
  var name: js.UndefOr[DeepPartial[String]] = js.native
  
  var path: js.UndefOr[DeepPartial[String]] = js.native
  
  var `type`: js.UndefOr[DeepPartial[String]] = js.native
}
object PickIModelidDeepPartialOm {
  
  @scala.inline
  def apply(id: String): PickIModelidDeepPartialOm = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIModelidDeepPartialOm]
  }
  
  @scala.inline
  implicit class PickIModelidDeepPartialOmOps[Self <: PickIModelidDeepPartialOm] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernel(value: DeepPartial[js.UndefOr[IModel | Null]]): Self = this.set("kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernel: Self = this.set("kernel", js.undefined)
    
    @scala.inline
    def setName(value: DeepPartial[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: DeepPartial[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setType(value: DeepPartial[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
