package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventFilter extends StObject {
  
  /**
    * Filter on a dimension.
    */
  var dimensionFilter: js.UndefOr[SchemaPathQueryOptionsFilter] = js.undefined
}
object SchemaEventFilter {
  
  inline def apply(): SchemaEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventFilter]
  }
  
  extension [Self <: SchemaEventFilter](x: Self) {
    
    inline def setDimensionFilter(value: SchemaPathQueryOptionsFilter): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
  }
}
