package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotationsdata extends StObject {
  
  /** A list of Annotation Data. */
  var items: js.UndefOr[js.Array[GeoAnnotationdata]] = js.native
  
  /** Resource type */
  var kind: js.UndefOr[String] = js.native
  
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total number of volume annotations found. */
  var totalItems: js.UndefOr[Double] = js.native
}
object Annotationsdata {
  
  @scala.inline
  def apply(): Annotationsdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotationsdata]
  }
  
  @scala.inline
  implicit class AnnotationsdataMutableBuilder[Self <: Annotationsdata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[GeoAnnotationdata]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GeoAnnotationdata*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
