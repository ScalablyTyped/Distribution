package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesDeleteAllResponse extends StObject {
  
  /** The deleted images. */
  var deleted: js.UndefOr[js.Array[Image]] = js.undefined
}
object ImagesDeleteAllResponse {
  
  inline def apply(): ImagesDeleteAllResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesDeleteAllResponse]
  }
  
  extension [Self <: ImagesDeleteAllResponse](x: Self) {
    
    inline def setDeleted(value: js.Array[Image]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDeletedVarargs(value: Image*): Self = StObject.set(x, "deleted", js.Array(value :_*))
  }
}
