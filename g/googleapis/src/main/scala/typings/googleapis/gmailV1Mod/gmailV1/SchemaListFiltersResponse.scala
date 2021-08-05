package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the ListFilters method.
  */
trait SchemaListFiltersResponse extends StObject {
  
  /**
    * List of a user&#39;s filters.
    */
  var filter: js.UndefOr[js.Array[SchemaFilter]] = js.undefined
}
object SchemaListFiltersResponse {
  
  inline def apply(): SchemaListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFiltersResponse]
  }
  
  extension [Self <: SchemaListFiltersResponse](x: Self) {
    
    inline def setFilter(value: js.Array[SchemaFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: SchemaFilter*): Self = StObject.set(x, "filter", js.Array(value :_*))
  }
}
