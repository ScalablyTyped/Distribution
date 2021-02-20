package typings.japanPostalCode

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("japan-postal-code", JSImport.Namespace)
  @js.native
  val ^ : API = js.native
  
  @js.native
  trait API extends StObject {
    
    def get(stringifiedPostalCode: String, callback: Callback): Unit = js.native
    @JSName("get")
    var get_Original: FetchPostalCodeMethod = js.native
  }
  
  @js.native
  trait AddressData extends StObject {
    
    var area: String = js.native
    
    var city: String = js.native
    
    var prefecture: String = js.native
    
    var street: String = js.native
  }
  object AddressData {
    
    @scala.inline
    def apply(area: String, city: String, prefecture: String, street: String): AddressData = {
      val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], prefecture = prefecture.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressData]
    }
    
    @scala.inline
    implicit class AddressDataMutableBuilder[Self <: AddressData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefecture(value: String): Self = StObject.set(x, "prefecture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function1[/* addressData */ AddressData, Unit]
  
  type FetchPostalCodeMethod = js.Function2[/* stringifiedPostalCode */ String, /* callback */ Callback, Unit]
  
  type _To = API
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: API = ^
}
