package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volumeannotations extends StObject {
  
  /** A list of volume annotations. */
  var items: js.UndefOr[js.Array[Volumeannotation]] = js.undefined
  
  /** Resource type */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Token to pass in for pagination for the next page. This will not be present if this request does not have more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of volume annotations found. */
  var totalItems: js.UndefOr[Double] = js.undefined
  
  /**
    * The version string for all of the volume annotations in this layer (not just the ones in this response). Note: the version string doesn't apply to the annotation data, just the
    * information in this response (e.g. the location of annotations in the book).
    */
  var version: js.UndefOr[String] = js.undefined
}
object Volumeannotations {
  
  inline def apply(): Volumeannotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volumeannotations]
  }
  
  extension [Self <: Volumeannotations](x: Self) {
    
    inline def setItems(value: js.Array[Volumeannotation]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Volumeannotation*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
