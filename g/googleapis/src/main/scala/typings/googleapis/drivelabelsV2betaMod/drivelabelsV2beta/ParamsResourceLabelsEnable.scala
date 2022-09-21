package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsEnable
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Label resource name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaEnableLabelRequest] = js.undefined
}
object ParamsResourceLabelsEnable {
  
  inline def apply(): ParamsResourceLabelsEnable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsEnable]
  }
  
  extension [Self <: ParamsResourceLabelsEnable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAppsDriveLabelsV2betaEnableLabelRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
