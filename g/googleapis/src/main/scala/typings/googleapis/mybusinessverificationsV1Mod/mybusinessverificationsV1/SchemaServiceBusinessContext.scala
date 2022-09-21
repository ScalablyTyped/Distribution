package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceBusinessContext extends StObject {
  
  /**
    * The verification address of the location. It is used to either enable more verification options or send a postcard.
    */
  var address: js.UndefOr[SchemaPostalAddress] = js.undefined
}
object SchemaServiceBusinessContext {
  
  inline def apply(): SchemaServiceBusinessContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceBusinessContext]
  }
  
  extension [Self <: SchemaServiceBusinessContext](x: Self) {
    
    inline def setAddress(value: SchemaPostalAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
  }
}
