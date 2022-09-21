package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotosBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchUpdatePhotosRequest] = js.undefined
}
object ParamsResourcePhotosBatchupdate {
  
  inline def apply(): ParamsResourcePhotosBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosBatchupdate]
  }
  
  extension [Self <: ParamsResourcePhotosBatchupdate](x: Self) {
    
    inline def setRequestBody(value: SchemaBatchUpdatePhotosRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
