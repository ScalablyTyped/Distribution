package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerBinding extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ServerBinding {
  
  @scala.inline
  def apply(): ServerBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerBinding]
  }
  
  @scala.inline
  implicit class ServerBindingMutableBuilder[Self <: ServerBinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
