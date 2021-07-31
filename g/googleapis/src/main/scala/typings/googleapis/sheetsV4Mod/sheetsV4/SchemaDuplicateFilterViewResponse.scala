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
  
  @scala.inline
  def apply(): SchemaDuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateFilterViewResponse]
  }
  
  @scala.inline
  implicit class SchemaDuplicateFilterViewResponseMutableBuilder[Self <: SchemaDuplicateFilterViewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: SchemaFilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
