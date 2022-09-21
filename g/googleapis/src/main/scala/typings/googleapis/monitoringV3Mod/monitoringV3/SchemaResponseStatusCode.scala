package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponseStatusCode extends StObject {
  
  /**
    * A class of status codes to accept.
    */
  var statusClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A status code to accept.
    */
  var statusValue: js.UndefOr[Double | Null] = js.undefined
}
object SchemaResponseStatusCode {
  
  inline def apply(): SchemaResponseStatusCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseStatusCode]
  }
  
  extension [Self <: SchemaResponseStatusCode](x: Self) {
    
    inline def setStatusClass(value: String): Self = StObject.set(x, "statusClass", value.asInstanceOf[js.Any])
    
    inline def setStatusClassNull: Self = StObject.set(x, "statusClass", null)
    
    inline def setStatusClassUndefined: Self = StObject.set(x, "statusClass", js.undefined)
    
    inline def setStatusValue(value: Double): Self = StObject.set(x, "statusValue", value.asInstanceOf[js.Any])
    
    inline def setStatusValueNull: Self = StObject.set(x, "statusValue", null)
    
    inline def setStatusValueUndefined: Self = StObject.set(x, "statusValue", js.undefined)
  }
}
