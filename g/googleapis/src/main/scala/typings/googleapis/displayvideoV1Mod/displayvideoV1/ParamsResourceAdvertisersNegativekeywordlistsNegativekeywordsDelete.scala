package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the DV360 advertiser to which the parent negative keyword list belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The keyword value of the negative keyword to delete.
    */
  var keywordValue: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the parent negative keyword list to which the negative keyword belongs.
    */
  var negativeKeywordListId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete {
  
  inline def apply(): ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete]
  }
  
  extension [Self <: ParamsResourceAdvertisersNegativekeywordlistsNegativekeywordsDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setKeywordValue(value: String): Self = StObject.set(x, "keywordValue", value.asInstanceOf[js.Any])
    
    inline def setKeywordValueUndefined: Self = StObject.set(x, "keywordValue", js.undefined)
    
    inline def setNegativeKeywordListId(value: String): Self = StObject.set(x, "negativeKeywordListId", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListIdUndefined: Self = StObject.set(x, "negativeKeywordListId", js.undefined)
  }
}
