package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typingsModelsCountryAuthorizationMod.countryAuthorization.AuthorizationData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/countryAuthorization.countryAuthorization.CountryAuthorizationData> */
trait PartialCountryAuthorizati extends StObject {
  
  var Authorization: js.UndefOr[AuthorizationData] = js.undefined
  
  var CountryCode: js.UndefOr[CountryISO] = js.undefined
  
  var CountryName: js.UndefOr[String] = js.undefined
  
  var LastUpdate: js.UndefOr[Double] = js.undefined
}
object PartialCountryAuthorizati {
  
  inline def apply(): PartialCountryAuthorizati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCountryAuthorizati]
  }
  
  extension [Self <: PartialCountryAuthorizati](x: Self) {
    
    inline def setAuthorization(value: AuthorizationData): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    inline def setCountryCode(value: CountryISO): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setCountryName(value: String): Self = StObject.set(x, "CountryName", value.asInstanceOf[js.Any])
    
    inline def setCountryNameUndefined: Self = StObject.set(x, "CountryName", js.undefined)
    
    inline def setLastUpdate(value: Double): Self = StObject.set(x, "LastUpdate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateUndefined: Self = StObject.set(x, "LastUpdate", js.undefined)
  }
}
