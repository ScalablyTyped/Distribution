package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IModel, 'name'>> */
@js.native
trait PartialPickIModelname extends StObject {
  
  var name: js.UndefOr[String] = js.native
}
object PartialPickIModelname {
  
  @scala.inline
  def apply(): PartialPickIModelname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickIModelname]
  }
  
  @scala.inline
  implicit class PartialPickIModelnameMutableBuilder[Self <: PartialPickIModelname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
