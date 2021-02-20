package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter.
  */
@js.native
trait SchemaFilter extends StObject {
  
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  
  /**
    * A filter on a document field.
    */
  var fieldFilter: js.UndefOr[SchemaFieldFilter] = js.native
  
  /**
    * A filter that takes exactly one argument.
    */
  var unaryFilter: js.UndefOr[SchemaUnaryFilter] = js.native
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
    def setFieldFilter(value: SchemaFieldFilter): Self = StObject.set(x, "fieldFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldFilterUndefined: Self = StObject.set(x, "fieldFilter", js.undefined)
    
    @scala.inline
    def setUnaryFilter(value: SchemaUnaryFilter): Self = StObject.set(x, "unaryFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnaryFilterUndefined: Self = StObject.set(x, "unaryFilter", js.undefined)
  }
}
