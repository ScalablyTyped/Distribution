package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeolocation extends StObject {
  
  /**
    * A CLDR.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGeolocation {
  
  inline def apply(): SchemaGeolocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeolocation]
  }
  
  extension [Self <: SchemaGeolocation](x: Self) {
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
