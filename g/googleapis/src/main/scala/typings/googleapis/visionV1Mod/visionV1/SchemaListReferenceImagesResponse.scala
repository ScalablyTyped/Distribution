package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `ListReferenceImages` method.
  */
trait SchemaListReferenceImagesResponse extends StObject {
  
  /**
    * The next_page_token returned from a previous List request, if any.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of items to return. Default 10, maximum 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The list of reference images.
    */
  var referenceImages: js.UndefOr[js.Array[SchemaReferenceImage]] = js.undefined
}
object SchemaListReferenceImagesResponse {
  
  inline def apply(): SchemaListReferenceImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReferenceImagesResponse]
  }
  
  extension [Self <: SchemaListReferenceImagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setReferenceImages(value: js.Array[SchemaReferenceImage]): Self = StObject.set(x, "referenceImages", value.asInstanceOf[js.Any])
    
    inline def setReferenceImagesUndefined: Self = StObject.set(x, "referenceImages", js.undefined)
    
    inline def setReferenceImagesVarargs(value: SchemaReferenceImage*): Self = StObject.set(x, "referenceImages", js.Array(value :_*))
  }
}
