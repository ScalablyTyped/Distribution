package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the Annotations in the specified Annotation store.
  */
trait SchemaListAnnotationsResponse extends StObject {
  
  /**
    * The returned Annotations names. Won&#39;t be more values than the value
    * of page_size in the request.
    */
  var annotations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListAnnotationsResponse {
  
  inline def apply(): SchemaListAnnotationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAnnotationsResponse]
  }
  
  extension [Self <: SchemaListAnnotationsResponse](x: Self) {
    
    inline def setAnnotations(value: js.Array[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: String*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
