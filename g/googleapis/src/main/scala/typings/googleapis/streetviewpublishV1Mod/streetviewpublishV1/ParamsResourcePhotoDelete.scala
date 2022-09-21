package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotoDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the Photo.
    */
  var photoId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePhotoDelete {
  
  inline def apply(): ParamsResourcePhotoDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotoDelete]
  }
  
  extension [Self <: ParamsResourcePhotoDelete](x: Self) {
    
    inline def setPhotoId(value: String): Self = StObject.set(x, "photoId", value.asInstanceOf[js.Any])
    
    inline def setPhotoIdUndefined: Self = StObject.set(x, "photoId", js.undefined)
  }
}
