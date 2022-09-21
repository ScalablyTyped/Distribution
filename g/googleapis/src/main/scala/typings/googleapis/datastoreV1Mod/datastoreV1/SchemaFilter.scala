package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilter extends StObject {
  
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.undefined
  
  /**
    * A filter on a property.
    */
  var propertyFilter: js.UndefOr[SchemaPropertyFilter] = js.undefined
}
object SchemaFilter {
  
  inline def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  extension [Self <: SchemaFilter](x: Self) {
    
    inline def setCompositeFilter(value: SchemaCompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    inline def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    inline def setPropertyFilter(value: SchemaPropertyFilter): Self = StObject.set(x, "propertyFilter", value.asInstanceOf[js.Any])
    
    inline def setPropertyFilterUndefined: Self = StObject.set(x, "propertyFilter", js.undefined)
  }
}
