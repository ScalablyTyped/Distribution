package typings.jupyterlabServices.anon

import typings.jupyterlabServices.kernelRestapiMod.IModel
import typings.jupyterlabServices.sessionRestapiMod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/session.Session.IModel, 'id'> & @jupyterlab/services.@jupyterlab/services/lib/session/restapi.DeepPartial<std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session.Session.IModel, 'id'>> */
@js.native
trait PickIModelidDeepPartialOm extends StObject {
  
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
  implicit class PickIModelidDeepPartialOmMutableBuilder[Self <: PickIModelidDeepPartialOm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernel(value: DeepPartial[js.UndefOr[IModel | Null]]): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
    
    @scala.inline
    def setName(value: DeepPartial[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: DeepPartial[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setType(value: DeepPartial[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
