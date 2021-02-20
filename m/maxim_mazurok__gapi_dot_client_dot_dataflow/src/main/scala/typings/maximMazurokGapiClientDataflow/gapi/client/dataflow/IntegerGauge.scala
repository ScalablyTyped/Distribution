package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerGauge extends StObject {
  
  /** The time at which this value was measured. Measured as msecs from epoch. */
  var timestamp: js.UndefOr[String] = js.native
  
  /** The value of the variable represented by this gauge. */
  var value: js.UndefOr[SplitInt64] = js.native
}
object IntegerGauge {
  
  @scala.inline
  def apply(): IntegerGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerGauge]
  }
  
  @scala.inline
  implicit class IntegerGaugeMutableBuilder[Self <: IntegerGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: SplitInt64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
