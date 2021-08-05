package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /** A composite filter. */
  var compositeFilter: js.UndefOr[CompositeFilter] = js.undefined
  
  /** A filter on a property. */
  var propertyFilter: js.UndefOr[PropertyFilter] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setCompositeFilter(value: CompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    inline def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    inline def setPropertyFilter(value: PropertyFilter): Self = StObject.set(x, "propertyFilter", value.asInstanceOf[js.Any])
    
    inline def setPropertyFilterUndefined: Self = StObject.set(x, "propertyFilter", js.undefined)
  }
}
