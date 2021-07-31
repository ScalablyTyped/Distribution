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
  
  @scala.inline
  def apply(): SchemaListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFiltersResponse]
  }
  
  @scala.inline
  implicit class SchemaListFiltersResponseMutableBuilder[Self <: SchemaListFiltersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: js.Array[SchemaFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: SchemaFilter*): Self = StObject.set(x, "filter", js.Array(value :_*))
  }
}
