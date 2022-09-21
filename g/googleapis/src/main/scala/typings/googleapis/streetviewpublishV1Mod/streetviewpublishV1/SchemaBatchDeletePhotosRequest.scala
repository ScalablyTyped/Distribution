package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeletePhotosRequest extends StObject {
  
  /**
    * Required. IDs of the Photos. HTTP GET requests require the following syntax for the URL query parameter: `photoIds=&photoIds=&...`.
    */
  var photoIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchDeletePhotosRequest {
  
  inline def apply(): SchemaBatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePhotosRequest]
  }
  
  extension [Self <: SchemaBatchDeletePhotosRequest](x: Self) {
    
    inline def setPhotoIds(value: js.Array[String]): Self = StObject.set(x, "photoIds", value.asInstanceOf[js.Any])
    
    inline def setPhotoIdsNull: Self = StObject.set(x, "photoIds", null)
    
    inline def setPhotoIdsUndefined: Self = StObject.set(x, "photoIds", js.undefined)
    
    inline def setPhotoIdsVarargs(value: String*): Self = StObject.set(x, "photoIds", js.Array(value*))
  }
}
