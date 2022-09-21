package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchUpdatePhotosRequest extends StObject {
  
  /**
    * Required. List of UpdatePhotoRequests.
    */
  var updatePhotoRequests: js.UndefOr[js.Array[SchemaUpdatePhotoRequest]] = js.undefined
}
object SchemaBatchUpdatePhotosRequest {
  
  inline def apply(): SchemaBatchUpdatePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePhotosRequest]
  }
  
  extension [Self <: SchemaBatchUpdatePhotosRequest](x: Self) {
    
    inline def setUpdatePhotoRequests(value: js.Array[SchemaUpdatePhotoRequest]): Self = StObject.set(x, "updatePhotoRequests", value.asInstanceOf[js.Any])
    
    inline def setUpdatePhotoRequestsUndefined: Self = StObject.set(x, "updatePhotoRequests", js.undefined)
    
    inline def setUpdatePhotoRequestsVarargs(value: SchemaUpdatePhotoRequest*): Self = StObject.set(x, "updatePhotoRequests", js.Array(value*))
  }
}
