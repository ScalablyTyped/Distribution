package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volumes extends StObject {
  
  /** A list of volumes. */
  var items: js.UndefOr[js.Array[Volume]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Total number of volumes found. This might be greater than the number of volumes returned in this response if results have been paginated. */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object Volumes {
  
  inline def apply(): Volumes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volumes]
  }
  
  extension [Self <: Volumes](x: Self) {
    
    inline def setItems(value: js.Array[Volume]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Volume*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
