package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsBirthplaceMod {
  
  object birthplace {
    
    trait Birthplace extends StObject {
      
      var City: String
      
      var Country: CountryISO
    }
    object Birthplace {
      
      inline def apply(City: String, Country: CountryISO): Birthplace = {
        val __obj = js.Dynamic.literal(City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any])
        __obj.asInstanceOf[Birthplace]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Birthplace] (val x: Self) extends AnyVal {
        
        inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
        
        inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      }
    }
  }
}
