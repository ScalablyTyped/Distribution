package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnpolicyListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#returnpolicyListResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[ReturnPolicy]] = js.undefined
}
object ReturnpolicyListResponse {
  
  inline def apply(): ReturnpolicyListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnpolicyListResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResources(value: js.Array[ReturnPolicy]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: ReturnPolicy*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
