package typings.japanPostalCode

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("japan-postal-code", JSImport.Namespace)
  @js.native
  val ^ : API = js.native
  
  trait API extends StObject {
    
    def get(stringifiedPostalCode: String, callback: Callback): Unit
    @JSName("get")
    var get_Original: FetchPostalCodeMethod
  }
  object API {
    
    inline def apply(get: (/* stringifiedPostalCode */ String, /* callback */ Callback) => Unit): API = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[API]
    }
    
    extension [Self <: API](x: Self) {
      
      inline def setGet(value: (/* stringifiedPostalCode */ String, /* callback */ Callback) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
  
  trait AddressData extends StObject {
    
    var area: String
    
    var city: String
    
    var prefecture: String
    
    var street: String
  }
  object AddressData {
    
    inline def apply(area: String, city: String, prefecture: String, street: String): AddressData = {
      val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], prefecture = prefecture.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressData]
    }
    
    extension [Self <: AddressData](x: Self) {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setPrefecture(value: String): Self = StObject.set(x, "prefecture", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function1[/* addressData */ AddressData, Unit]
  
  type FetchPostalCodeMethod = js.Function2[/* stringifiedPostalCode */ String, /* callback */ Callback, Unit]
  
  type _To = API
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: API = ^
}
