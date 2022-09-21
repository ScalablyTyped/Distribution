package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetGoogleUpdatedLodgingResponse extends StObject {
  
  /**
    * Required. The fields in the Lodging that have been updated by Google. Repeated field items are not individually specified.
    */
  var diffMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The Google updated Lodging.
    */
  var lodging: js.UndefOr[SchemaLodging] = js.undefined
}
object SchemaGetGoogleUpdatedLodgingResponse {
  
  inline def apply(): SchemaGetGoogleUpdatedLodgingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetGoogleUpdatedLodgingResponse]
  }
  
  extension [Self <: SchemaGetGoogleUpdatedLodgingResponse](x: Self) {
    
    inline def setDiffMask(value: String): Self = StObject.set(x, "diffMask", value.asInstanceOf[js.Any])
    
    inline def setDiffMaskNull: Self = StObject.set(x, "diffMask", null)
    
    inline def setDiffMaskUndefined: Self = StObject.set(x, "diffMask", js.undefined)
    
    inline def setLodging(value: SchemaLodging): Self = StObject.set(x, "lodging", value.asInstanceOf[js.Any])
    
    inline def setLodgingUndefined: Self = StObject.set(x, "lodging", js.undefined)
  }
}
