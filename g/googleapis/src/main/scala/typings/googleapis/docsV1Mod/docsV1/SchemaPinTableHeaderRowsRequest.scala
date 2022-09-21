package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPinTableHeaderRowsRequest extends StObject {
  
  /**
    * The number of table rows to pin, where 0 implies that all rows are unpinned.
    */
  var pinnedHeaderRowsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The location where the table starts in the document.
    */
  var tableStartLocation: js.UndefOr[SchemaLocation] = js.undefined
}
object SchemaPinTableHeaderRowsRequest {
  
  inline def apply(): SchemaPinTableHeaderRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPinTableHeaderRowsRequest]
  }
  
  extension [Self <: SchemaPinTableHeaderRowsRequest](x: Self) {
    
    inline def setPinnedHeaderRowsCount(value: Double): Self = StObject.set(x, "pinnedHeaderRowsCount", value.asInstanceOf[js.Any])
    
    inline def setPinnedHeaderRowsCountNull: Self = StObject.set(x, "pinnedHeaderRowsCount", null)
    
    inline def setPinnedHeaderRowsCountUndefined: Self = StObject.set(x, "pinnedHeaderRowsCount", js.undefined)
    
    inline def setTableStartLocation(value: SchemaLocation): Self = StObject.set(x, "tableStartLocation", value.asInstanceOf[js.Any])
    
    inline def setTableStartLocationUndefined: Self = StObject.set(x, "tableStartLocation", js.undefined)
  }
}
