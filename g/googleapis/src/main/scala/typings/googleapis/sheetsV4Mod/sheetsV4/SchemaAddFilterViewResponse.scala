package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of adding a filter view.
  */
trait SchemaAddFilterViewResponse extends StObject {
  
  /**
    * The newly added filter view.
    */
  var filter: js.UndefOr[SchemaFilterView] = js.undefined
}
object SchemaAddFilterViewResponse {
  
  inline def apply(): SchemaAddFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddFilterViewResponse]
  }
  
  extension [Self <: SchemaAddFilterViewResponse](x: Self) {
    
    inline def setFilter(value: SchemaFilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
