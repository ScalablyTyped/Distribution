package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestStatus extends StObject {
  
  /**
    * Error details if applicable.
    */
  var details: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the test.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaTestStatus {
  
  inline def apply(): SchemaTestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestStatus]
  }
  
  extension [Self <: SchemaTestStatus](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
