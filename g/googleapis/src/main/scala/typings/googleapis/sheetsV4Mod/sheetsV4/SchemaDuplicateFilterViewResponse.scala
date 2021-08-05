package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of a filter view being duplicated.
  */
trait SchemaDuplicateFilterViewResponse extends StObject {
  
  /**
    * The newly created filter.
    */
  var filter: js.UndefOr[SchemaFilterView] = js.undefined
}
object SchemaDuplicateFilterViewResponse {
  
  inline def apply(): SchemaDuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateFilterViewResponse]
  }
  
  extension [Self <: SchemaDuplicateFilterViewResponse](x: Self) {
    
    inline def setFilter(value: SchemaFilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
