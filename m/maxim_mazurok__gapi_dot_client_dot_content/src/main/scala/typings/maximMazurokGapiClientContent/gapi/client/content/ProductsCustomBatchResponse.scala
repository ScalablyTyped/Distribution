package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductsCustomBatchResponse extends StObject {
  
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[ProductsCustomBatchResponseEntry]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#productsCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object ProductsCustomBatchResponse {
  
  @scala.inline
  def apply(): ProductsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsCustomBatchResponse]
  }
  
  @scala.inline
  implicit class ProductsCustomBatchResponseMutableBuilder[Self <: ProductsCustomBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ProductsCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: ProductsCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
