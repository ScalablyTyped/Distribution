package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A holder for any type of filter.
  */
@js.native
trait SchemaFilter extends StObject {
  
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  
  /**
    * A filter on a property.
    */
  var propertyFilter: js.UndefOr[SchemaPropertyFilter] = js.native
}
object SchemaFilter {
  
  @scala.inline
  def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  @scala.inline
  implicit class SchemaFilterMutableBuilder[Self <: SchemaFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompositeFilter(value: SchemaCompositeFilter): Self = StObject.set(x, "compositeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeFilterUndefined: Self = StObject.set(x, "compositeFilter", js.undefined)
    
    @scala.inline
    def setPropertyFilter(value: SchemaPropertyFilter): Self = StObject.set(x, "propertyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyFilterUndefined: Self = StObject.set(x, "propertyFilter", js.undefined)
  }
}
