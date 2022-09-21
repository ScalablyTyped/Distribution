package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotosBatchdelete
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchDeletePhotosRequest] = js.undefined
}
object ParamsResourcePhotosBatchdelete {
  
  inline def apply(): ParamsResourcePhotosBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosBatchdelete]
  }
  
  extension [Self <: ParamsResourcePhotosBatchdelete](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchDeletePhotosRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
