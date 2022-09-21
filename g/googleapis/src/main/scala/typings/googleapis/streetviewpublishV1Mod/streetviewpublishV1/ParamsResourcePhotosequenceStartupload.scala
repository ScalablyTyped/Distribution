package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotosequenceStartupload
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEmpty] = js.undefined
}
object ParamsResourcePhotosequenceStartupload {
  
  inline def apply(): ParamsResourcePhotosequenceStartupload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosequenceStartupload]
  }
  
  extension [Self <: ParamsResourcePhotosequenceStartupload](x: Self) {
    
    inline def setRequestBody(value: SchemaEmpty): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
