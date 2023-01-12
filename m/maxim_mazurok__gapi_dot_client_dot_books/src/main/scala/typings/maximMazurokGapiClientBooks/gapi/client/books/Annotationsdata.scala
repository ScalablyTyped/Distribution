package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotationsdata extends StObject {
  
  /** A list of Annotation Data. */
  var items: js.UndefOr[js.Array[GeoAnnotationdata]] = js.undefined
  
  /** Resource type */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of volume annotations found. */
  var totalItems: js.UndefOr[Double] = js.undefined
}
object Annotationsdata {
  
  inline def apply(): Annotationsdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotationsdata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotationsdata] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[GeoAnnotationdata]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GeoAnnotationdata*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
