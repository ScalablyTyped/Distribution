package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotosequenceCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The input form of PhotoSequence.
    */
  var inputType: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPhotoSequence] = js.undefined
}
object ParamsResourcePhotosequenceCreate {
  
  inline def apply(): ParamsResourcePhotosequenceCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosequenceCreate]
  }
  
  extension [Self <: ParamsResourcePhotosequenceCreate](x: Self) {
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setRequestBody(value: SchemaPhotoSequence): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
