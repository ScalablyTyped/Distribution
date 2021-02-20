package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@jupyterlab/services.@jupyterlab/services/lib/kernel.Kernel.IKernelConnection.IOptions, 'model' | 'username' | 'clientId' | 'serverSettings'> */
@js.native
trait OmitIOptionsmodelusername extends StObject {
  
  var handleComms: js.UndefOr[Boolean] = js.native
}
object OmitIOptionsmodelusername {
  
  @scala.inline
  def apply(): OmitIOptionsmodelusername = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitIOptionsmodelusername]
  }
  
  @scala.inline
  implicit class OmitIOptionsmodelusernameMutableBuilder[Self <: OmitIOptionsmodelusername] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleComms(value: Boolean): Self = StObject.set(x, "handleComms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleCommsUndefined: Self = StObject.set(x, "handleComms", js.undefined)
  }
}
