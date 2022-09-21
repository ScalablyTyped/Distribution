package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaError extends StObject {
  
  /**
    * The number of points that couldn't be written because of status.
    */
  var pointCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The status of the requested write operation.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaError {
  
  inline def apply(): SchemaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaError]
  }
  
  extension [Self <: SchemaError](x: Self) {
    
    inline def setPointCount(value: Double): Self = StObject.set(x, "pointCount", value.asInstanceOf[js.Any])
    
    inline def setPointCountNull: Self = StObject.set(x, "pointCount", null)
    
    inline def setPointCountUndefined: Self = StObject.set(x, "pointCount", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
