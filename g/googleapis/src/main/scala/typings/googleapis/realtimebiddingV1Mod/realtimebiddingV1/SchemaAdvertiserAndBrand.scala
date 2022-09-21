package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdvertiserAndBrand extends StObject {
  
  /**
    * See https://storage.googleapis.com/adx-rtb-dictionaries/advertisers.txt for the list of possible values. Can be used to filter the response of the creatives.list method.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Advertiser name. Can be used to filter the response of the creatives.list method.
    */
  var advertiserName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Detected brand ID or zero if no brand has been detected. See https://storage.googleapis.com/adx-rtb-dictionaries/brands.txt for the list of possible values. Can be used to filter the response of the creatives.list method.
    */
  var brandId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Brand name. Can be used to filter the response of the creatives.list method.
    */
  var brandName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdvertiserAndBrand {
  
  inline def apply(): SchemaAdvertiserAndBrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiserAndBrand]
  }
  
  extension [Self <: SchemaAdvertiserAndBrand](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserNameNull: Self = StObject.set(x, "advertiserName", null)
    
    inline def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    inline def setBrandId(value: String): Self = StObject.set(x, "brandId", value.asInstanceOf[js.Any])
    
    inline def setBrandIdNull: Self = StObject.set(x, "brandId", null)
    
    inline def setBrandIdUndefined: Self = StObject.set(x, "brandId", js.undefined)
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setBrandNameNull: Self = StObject.set(x, "brandName", null)
    
    inline def setBrandNameUndefined: Self = StObject.set(x, "brandName", js.undefined)
  }
}
