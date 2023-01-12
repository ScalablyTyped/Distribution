package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#posListResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[PosStore]] = js.undefined
}
object PosListResponse {
  
  inline def apply(): PosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PosListResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResources(value: js.Array[PosStore]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: PosStore*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
