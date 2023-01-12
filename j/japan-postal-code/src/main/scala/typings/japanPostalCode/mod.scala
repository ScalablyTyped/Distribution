package typings.japanPostalCode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("japan-postal-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("japan-postal-code", "get")
  @js.native
  def get: js.Function2[/* zip_code */ String, /* callback */ Callback, Unit] = js.native
  inline def get(zip_code: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(zip_code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get_=(x: js.Function2[/* zip_code */ String, /* callback */ Callback, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddressData] (val x: Self) extends AnyVal {
      
      inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setPrefecture(value: String): Self = StObject.set(x, "prefecture", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function1[/* address */ AddressData, Unit]
}
