package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IModel> */
@js.native
trait PartialIModelId extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object PartialIModelId {
  
  @scala.inline
  def apply(): PartialIModelId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIModelId]
  }
  
  @scala.inline
  implicit class PartialIModelIdMutableBuilder[Self <: PartialIModelId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
