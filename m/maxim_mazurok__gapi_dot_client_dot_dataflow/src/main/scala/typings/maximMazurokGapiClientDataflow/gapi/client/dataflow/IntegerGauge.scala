package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerGauge extends StObject {
  
  /** The time at which this value was measured. Measured as msecs from epoch. */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /** The value of the variable represented by this gauge. */
  var value: js.UndefOr[SplitInt64] = js.undefined
}
object IntegerGauge {
  
  inline def apply(): IntegerGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerGauge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerGauge] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setValue(value: SplitInt64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
