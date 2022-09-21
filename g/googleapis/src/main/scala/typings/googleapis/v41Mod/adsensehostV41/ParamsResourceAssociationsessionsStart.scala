package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAssociationsessionsStart
  extends StObject
     with StandardParameters {
  
  /**
    * The URL to redirect the user to once association is completed. It receives a token parameter that can then be used to retrieve the associated account.
    */
  var callbackUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Products to associate with the user.
    */
  var productCode: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The preferred locale of the user.
    */
  var userLocale: js.UndefOr[String] = js.undefined
  
  /**
    * The locale of the user's hosted website.
    */
  var websiteLocale: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the user's hosted website.
    */
  var websiteUrl: js.UndefOr[String] = js.undefined
}
object ParamsResourceAssociationsessionsStart {
  
  inline def apply(): ParamsResourceAssociationsessionsStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAssociationsessionsStart]
  }
  
  extension [Self <: ParamsResourceAssociationsessionsStart](x: Self) {
    
    inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
    
    inline def setProductCode(value: js.Array[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
    
    inline def setProductCodeVarargs(value: String*): Self = StObject.set(x, "productCode", js.Array(value*))
    
    inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
    
    inline def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
    
    inline def setWebsiteLocale(value: String): Self = StObject.set(x, "websiteLocale", value.asInstanceOf[js.Any])
    
    inline def setWebsiteLocaleUndefined: Self = StObject.set(x, "websiteLocale", js.undefined)
    
    inline def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
    
    inline def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
  }
}
