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
  
  @scala.inline
  def apply(): Layersummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layersummaries]
  }
  
  @scala.inline
  implicit class LayersummariesMutableBuilder[Self <: Layersummaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Layersummary]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Layersummary*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
