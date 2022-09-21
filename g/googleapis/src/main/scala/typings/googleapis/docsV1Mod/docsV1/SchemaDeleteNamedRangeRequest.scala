package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteNamedRangeRequest extends StObject {
  
  /**
    * The name of the range(s) to delete. All named ranges with the given name will be deleted.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamedRangeId(value: String): Self = StObject.set(x, "namedRangeId", value.asInstanceOf[js.Any])
    
    inline def setNamedRangeIdNull: Self = StObject.set(x, "namedRangeId", null)
    
    inline def setNamedRangeIdUndefined: Self = StObject.set(x, "namedRangeId", js.undefined)
  }
}
