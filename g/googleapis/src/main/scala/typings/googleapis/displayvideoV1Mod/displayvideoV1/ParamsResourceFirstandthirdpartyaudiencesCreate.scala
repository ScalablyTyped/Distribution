package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirstandthirdpartyaudiencesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the advertiser under whom the FirstAndThirdPartyAudience will be created.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFirstAndThirdPartyAudience] = js.undefined
}
object ParamsResourceFirstandthirdpartyaudiencesCreate {
  
  inline def apply(): ParamsResourceFirstandthirdpartyaudiencesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirstandthirdpartyaudiencesCreate]
  }
  
  extension [Self <: ParamsResourceFirstandthirdpartyaudiencesCreate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setRequestBody(value: SchemaFirstAndThirdPartyAudience): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
