package typings.jupyterlabServices.anon

import typings.jupyterlabServices.libKernelRestapiMod.IModel
import typings.jupyterlabServices.libSessionRestapiMod.DeepPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jupyterlab/services.@jupyterlab/services/lib/session.Session.IModel, 'id'> & @jupyterlab/services.@jupyterlab/services/lib/session/restapi.DeepPartial<std.Omit<@jupyterlab/services.@jupyterlab/services/lib/session.Session.IModel, 'id'>> */
trait PickIModelidDeepPartialOm extends StObject {
  
  var id: String
  
  var kernel: js.UndefOr[DeepPartial[js.UndefOr[IModel | Null]]] = js.undefined
  
  var name: js.UndefOr[DeepPartial[String]] = js.undefined
  
  var path: js.UndefOr[DeepPartial[String]] = js.undefined
  
  var `type`: js.UndefOr[DeepPartial[String]] = js.undefined
}
object PickIModelidDeepPartialOm {
  
  inline def apply(id: String): PickIModelidDeepPartialOm = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIModelidDeepPartialOm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickIModelidDeepPartialOm] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKernel(value: DeepPartial[js.UndefOr[IModel | Null]]): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    inline def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
    
    inline def setName(value: DeepPartial[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: DeepPartial[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: DeepPartial[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
