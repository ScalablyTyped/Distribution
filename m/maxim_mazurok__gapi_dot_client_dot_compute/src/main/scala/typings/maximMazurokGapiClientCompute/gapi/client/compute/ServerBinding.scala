package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerBinding extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ServerBinding {
  
  inline def apply(): ServerBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerBinding] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
