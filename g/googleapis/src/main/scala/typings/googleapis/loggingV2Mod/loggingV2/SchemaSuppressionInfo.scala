package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuppressionInfo extends StObject {
  
  /**
    * The reason that entries were omitted from the session.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A lower bound on the count of entries omitted due to reason.
    */
  var suppressedCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSuppressionInfo {
  
  inline def apply(): SchemaSuppressionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuppressionInfo]
  }
  
  extension [Self <: SchemaSuppressionInfo](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSuppressedCount(value: Double): Self = StObject.set(x, "suppressedCount", value.asInstanceOf[js.Any])
    
    inline def setSuppressedCountNull: Self = StObject.set(x, "suppressedCount", null)
    
    inline def setSuppressedCountUndefined: Self = StObject.set(x, "suppressedCount", js.undefined)
  }
}
