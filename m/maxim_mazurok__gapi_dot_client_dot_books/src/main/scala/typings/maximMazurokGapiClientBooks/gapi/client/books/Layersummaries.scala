package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layersummaries extends StObject {
  
  /** A list of layer summary items. */
  var items: js.UndefOr[js.Array[Layersummary]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The total number of layer summaries found. */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object Layersummaries {
  
  inline def apply(): Layersummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layersummaries]
  }
  
  extension [Self <: Layersummaries](x: Self) {
    
    inline def setItems(value: js.Array[Layersummary]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Layersummary*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
