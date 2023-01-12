package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IKernelConnection.IOptions, 'model' | 'username' | 'clientId' | 'serverSettings'> */
trait OmitIOptionsmodelusername extends StObject {
  
  var handleComms: js.UndefOr[Boolean] = js.undefined
}
object OmitIOptionsmodelusername {
  
  inline def apply(): OmitIOptionsmodelusername = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitIOptionsmodelusername]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitIOptionsmodelusername] (val x: Self) extends AnyVal {
    
    inline def setHandleComms(value: Boolean): Self = StObject.set(x, "handleComms", value.asInstanceOf[js.Any])
    
    inline def setHandleCommsUndefined: Self = StObject.set(x, "handleComms", js.undefined)
  }
}
