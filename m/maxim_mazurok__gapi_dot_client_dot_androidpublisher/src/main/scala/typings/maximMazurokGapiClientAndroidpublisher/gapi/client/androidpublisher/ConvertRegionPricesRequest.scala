package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertRegionPricesRequest extends StObject {
  
  /** The intital price to convert other regions from. Tax exclusive. */
  var price: js.UndefOr[Money] = js.undefined
}
object ConvertRegionPricesRequest {
  
  inline def apply(): ConvertRegionPricesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertRegionPricesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConvertRegionPricesRequest] (val x: Self) extends AnyVal {
    
    inline def setPrice(value: Money): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
