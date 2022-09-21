package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteDuplicatesResponse extends StObject {
  
  /**
    * The number of duplicate rows removed.
    */
  var duplicatesRemovedCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDeleteDuplicatesResponse {
  
  inline def apply(): SchemaDeleteDuplicatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDuplicatesResponse]
  }
  
  extension [Self <: SchemaDeleteDuplicatesResponse](x: Self) {
    
    inline def setDuplicatesRemovedCount(value: Double): Self = StObject.set(x, "duplicatesRemovedCount", value.asInstanceOf[js.Any])
    
    inline def setDuplicatesRemovedCountNull: Self = StObject.set(x, "duplicatesRemovedCount", null)
    
    inline def setDuplicatesRemovedCountUndefined: Self = StObject.set(x, "duplicatesRemovedCount", js.undefined)
  }
}
