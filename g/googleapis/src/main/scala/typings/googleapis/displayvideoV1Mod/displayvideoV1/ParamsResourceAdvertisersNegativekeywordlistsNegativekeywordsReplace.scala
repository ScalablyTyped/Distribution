package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the DV360 advertiser to which the parent negative keyword list belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the parent negative keyword list to which the negative keywords belong.
    */
  var negativeKeywordListId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReplaceNegativeKeywordsRequest] = js.undefined
}
object ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace {
  
  inline def apply(): ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace]
  }
  
  extension [Self <: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsReplace](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setNegativeKeywordListId(value: String): Self = StObject.set(x, "negativeKeywordListId", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListIdUndefined: Self = StObject.set(x, "negativeKeywordListId", js.undefined)
    
    inline def setRequestBody(value: SchemaReplaceNegativeKeywordsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
