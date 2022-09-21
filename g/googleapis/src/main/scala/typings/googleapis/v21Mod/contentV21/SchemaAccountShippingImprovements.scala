package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountShippingImprovements extends StObject {
  
  /**
    * Enables automatic shipping improvements.
    */
  var allowShippingImprovements: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAccountShippingImprovements {
  
  inline def apply(): SchemaAccountShippingImprovements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountShippingImprovements]
  }
  
  extension [Self <: SchemaAccountShippingImprovements](x: Self) {
    
    inline def setAllowShippingImprovements(value: Boolean): Self = StObject.set(x, "allowShippingImprovements", value.asInstanceOf[js.Any])
    
    inline def setAllowShippingImprovementsNull: Self = StObject.set(x, "allowShippingImprovements", null)
    
    inline def setAllowShippingImprovementsUndefined: Self = StObject.set(x, "allowShippingImprovements", js.undefined)
  }
}
