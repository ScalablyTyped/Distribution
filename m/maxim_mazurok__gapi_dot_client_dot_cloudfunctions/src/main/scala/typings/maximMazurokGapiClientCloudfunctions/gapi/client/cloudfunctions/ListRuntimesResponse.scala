package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuntimesResponse extends StObject {
  
  /** The runtimes that match the request. */
  var runtimes: js.UndefOr[js.Array[Runtime]] = js.undefined
}
object ListRuntimesResponse {
  
  inline def apply(): ListRuntimesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuntimesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRuntimesResponse] (val x: Self) extends AnyVal {
    
    inline def setRuntimes(value: js.Array[Runtime]): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    inline def setRuntimesUndefined: Self = StObject.set(x, "runtimes", js.undefined)
    
    inline def setRuntimesVarargs(value: Runtime*): Self = StObject.set(x, "runtimes", js.Array(value*))
  }
}
