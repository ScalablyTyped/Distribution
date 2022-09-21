package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSortOptions extends StObject {
  
  /**
    * The name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
    */
  var operatorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ascending is the default sort order
    */
  var sortOrder: js.UndefOr[String | Null] = js.undefined
}
object SchemaSortOptions {
  
  inline def apply(): SchemaSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortOptions]
  }
  
  extension [Self <: SchemaSortOptions](x: Self) {
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameNull: Self = StObject.set(x, "operatorName", null)
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
