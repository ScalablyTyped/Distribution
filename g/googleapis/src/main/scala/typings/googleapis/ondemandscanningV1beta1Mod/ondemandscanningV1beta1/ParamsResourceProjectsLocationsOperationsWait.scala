package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsOperationsWait
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the operation resource to wait on.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum duration to wait before timing out. If left blank, the wait will be at most the time permitted by the underlying HTTP/RPC protocol. If RPC context deadline is also specified, the shorter one will be used.
    */
  var timeout: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsOperationsWait {
  
  inline def apply(): ParamsResourceProjectsLocationsOperationsWait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsOperationsWait]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsOperationsWait](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
