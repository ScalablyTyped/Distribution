package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsProductsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The information to be included in the response. Only sections listed here will be returned.
    */
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Name in the format `{target_country\}:{content_language\}:{product_id\}`. `target_country` - The target country of the product as a CLDR territory code (for example, US). `content_language` - The content language of the product as a two-letter ISO 639-1 language code (for example, en). `product_id` - The ID of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#id.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Parent ID in the format `accounts/{account_id\}`. `account_id` - The ID of the Manufacturer Center account.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsProductsGet {
  
  inline def apply(): ParamsResourceAccountsProductsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsProductsGet]
  }
  
  extension [Self <: ParamsResourceAccountsProductsGet](x: Self) {
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
