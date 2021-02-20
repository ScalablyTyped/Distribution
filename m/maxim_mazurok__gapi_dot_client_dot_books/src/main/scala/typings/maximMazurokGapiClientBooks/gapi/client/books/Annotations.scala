package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotations extends StObject {
  
  /** A list of annotations. */
  var items: js.UndefOr[js.Array[Annotation]] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Total number of annotations found. This may be greater than the number of notes returned in this response if results have been paginated. */
  var totalItems: js.UndefOr[Double] = js.native
}
object Annotations {
  
  @scala.inline
  def apply(): Annotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotations]
  }
  
  @scala.inline
  implicit class AnnotationsMutableBuilder[Self <: Annotations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Annotation]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Annotation*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
