package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A sort order associated with a specific column or row.
  */
trait SchemaSortSpec extends StObject {
  
  /**
    * The dimension the sort should be applied to.
    */
  var dimensionIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The order data should be sorted.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
}
object SchemaSortSpec {
  
  inline def apply(): SchemaSortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortSpec]
  }
  
  extension [Self <: SchemaSortSpec](x: Self) {
    
    inline def setDimensionIndex(value: Double): Self = StObject.set(x, "dimensionIndex", value.asInstanceOf[js.Any])
    
    inline def setDimensionIndexUndefined: Self = StObject.set(x, "dimensionIndex", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
