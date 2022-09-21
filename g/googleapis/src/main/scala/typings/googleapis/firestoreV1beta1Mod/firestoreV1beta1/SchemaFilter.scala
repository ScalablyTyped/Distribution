package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilter extends StObject {
  
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.undefined
  
  /**
    * A filter on a document field.
    */
  var fieldFilter: js.UndefOr[SchemaFieldFilter] = js.undefined
  
  /**
    * A filter that takes exactly one argument.
    */
  var unaryFilter: js.UndefOr[SchemaUnaryFilter] = js.undefined
}
object SchemaFilter {
  
  inline def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  extension [Self <: SchemaFilter](x: Self) {
    
    inline def setCompositeFilter(value: SchemaCompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    inline def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    inline def setFieldFilter(value: SchemaFieldFilter): Self = StObject.set(x, "fieldFilter", value.asInstanceOf[js.Any])
    
    inline def setFieldFilterUndefined: Self = StObject.set(x, "fieldFilter", js.undefined)
    
    inline def setUnaryFilter(value: SchemaUnaryFilter): Self = StObject.set(x, "unaryFilter", value.asInstanceOf[js.Any])
    
    inline def setUnaryFilterUndefined: Self = StObject.set(x, "unaryFilter", js.undefined)
  }
}
