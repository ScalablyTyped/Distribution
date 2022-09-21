package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIntegerGauge extends StObject {
  
  /**
    * The time at which this value was measured. Measured as msecs from epoch.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the variable represented by this gauge.
    */
  var value: js.UndefOr[SchemaSplitInt64] = js.undefined
}
object SchemaIntegerGauge {
  
  inline def apply(): SchemaIntegerGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerGauge]
  }
  
  extension [Self <: SchemaIntegerGauge](x: Self) {
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setValue(value: SchemaSplitInt64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
