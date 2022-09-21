package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteNamedRangeRequest extends StObject {
  
  /**
    * The ID of the named range to delete.
    */
  var namedRangeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeleteNamedRangeRequest {
  
  inline def apply(): SchemaDeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteNamedRangeRequest]
  }
  
  extension [Self <: SchemaDeleteNamedRangeRequest](x: Self) {
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdNull: Self = StObject.set(x, "namedRangeId", null)
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
  }
}
