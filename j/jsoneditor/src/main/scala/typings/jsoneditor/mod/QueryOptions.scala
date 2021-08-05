package typings.jsoneditor.mod

import typings.jsoneditor.anon.Direction
import typings.jsoneditor.anon.Field
import typings.jsoneditor.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  var filter: js.UndefOr[Field] = js.undefined
  
  var projection: js.UndefOr[Fields] = js.undefined
  
  var sort: js.UndefOr[Direction] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  extension [Self <: QueryOptions](x: Self) {
    
    inline def setFilter(value: Field): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setProjection(value: Fields): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setSort(value: Direction): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
