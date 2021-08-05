package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a particular filter view.
  */
trait SchemaDeleteFilterViewRequest extends StObject {
  
  /**
    * The ID of the filter to delete.
    */
  var filterId: js.UndefOr[Double] = js.undefined
}
object SchemaDeleteFilterViewRequest {
  
  inline def apply(): SchemaDeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteFilterViewRequest]
  }
  
  extension [Self <: SchemaDeleteFilterViewRequest](x: Self) {
    
    inline def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
