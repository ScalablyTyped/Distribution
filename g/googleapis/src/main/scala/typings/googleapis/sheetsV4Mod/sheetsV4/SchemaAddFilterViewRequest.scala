package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds a filter view.
  */
trait SchemaAddFilterViewRequest extends StObject {
  
  /**
    * The filter to add. The filterViewId field is optional; if one is not set,
    * an id will be randomly generated. (It is an error to specify the ID of a
    * filter that already exists.)
    */
  var filter: js.UndefOr[SchemaFilterView] = js.undefined
}
object SchemaAddFilterViewRequest {
  
  @scala.inline
  def apply(): SchemaAddFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddFilterViewRequest]
  }
  
  @scala.inline
  implicit class SchemaAddFilterViewRequestMutableBuilder[Self <: SchemaAddFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: SchemaFilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
