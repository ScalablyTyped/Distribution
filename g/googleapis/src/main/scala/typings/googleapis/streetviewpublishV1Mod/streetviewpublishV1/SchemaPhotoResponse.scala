package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhotoResponse extends StObject {
  
  /**
    * The Photo resource, if the request was successful.
    */
  var photo: js.UndefOr[SchemaPhoto] = js.undefined
  
  /**
    * The status for the operation to get or update a single photo in the batch request.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaPhotoResponse {
  
  inline def apply(): SchemaPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhotoResponse]
  }
  
  extension [Self <: SchemaPhotoResponse](x: Self) {
    
    inline def setPhoto(value: SchemaPhoto): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
