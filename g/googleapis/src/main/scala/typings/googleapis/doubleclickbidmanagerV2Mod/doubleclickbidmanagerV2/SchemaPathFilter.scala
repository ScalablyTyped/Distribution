package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathFilter extends StObject {
  
  /**
    * Filter on an event to be applied to some part of the path.
    */
  var eventFilters: js.UndefOr[js.Array[SchemaEventFilter]] = js.undefined
  
  /**
    * The position of the path the filter should match to (first, last, or any event in path).
    */
  var pathMatchPosition: js.UndefOr[String | Null] = js.undefined
}
object SchemaPathFilter {
  
  inline def apply(): SchemaPathFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathFilter]
  }
  
  extension [Self <: SchemaPathFilter](x: Self) {
    
    inline def setEventFilters(value: js.Array[SchemaEventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    inline def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    inline def setEventFiltersVarargs(value: SchemaEventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value*))
    
    inline def setPathMatchPosition(value: String): Self = StObject.set(x, "pathMatchPosition", value.asInstanceOf[js.Any])
    
    inline def setPathMatchPositionNull: Self = StObject.set(x, "pathMatchPosition", null)
    
    inline def setPathMatchPositionUndefined: Self = StObject.set(x, "pathMatchPosition", js.undefined)
  }
}
