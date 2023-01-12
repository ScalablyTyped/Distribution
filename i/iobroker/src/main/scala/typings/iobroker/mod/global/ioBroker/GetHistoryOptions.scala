package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.average
import typings.iobroker.iobrokerStrings.count
import typings.iobroker.iobrokerStrings.max
import typings.iobroker.iobrokerStrings.min
import typings.iobroker.iobrokerStrings.minmax
import typings.iobroker.iobrokerStrings.none
import typings.iobroker.iobrokerStrings.total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHistoryOptions extends StObject {
  
  var ack: js.UndefOr[Boolean] = js.undefined
  
  var addID: js.UndefOr[Boolean] = js.undefined
  
  var aggregate: js.UndefOr[minmax | min | max | average | total | count | none] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var end: js.UndefOr[Double] = js.undefined
  
  var from: js.UndefOr[Boolean] = js.undefined
  
  var ignoreNull: js.UndefOr[Boolean] = js.undefined
  
  var instance: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var q: js.UndefOr[Boolean] = js.undefined
  
  var sessionId: js.UndefOr[Any] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
}
object GetHistoryOptions {
  
  inline def apply(): GetHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHistoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetHistoryOptions] (val x: Self) extends AnyVal {
    
    inline def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setAckUndefined: Self = StObject.set(x, "ack", js.undefined)
    
    inline def setAddID(value: Boolean): Self = StObject.set(x, "addID", value.asInstanceOf[js.Any])
    
    inline def setAddIDUndefined: Self = StObject.set(x, "addID", js.undefined)
    
    inline def setAggregate(value: minmax | min | max | average | total | count | none): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFrom(value: Boolean): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setIgnoreNull(value: Boolean): Self = StObject.set(x, "ignoreNull", value.asInstanceOf[js.Any])
    
    inline def setIgnoreNullUndefined: Self = StObject.set(x, "ignoreNull", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setQ(value: Boolean): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setSessionId(value: Any): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
