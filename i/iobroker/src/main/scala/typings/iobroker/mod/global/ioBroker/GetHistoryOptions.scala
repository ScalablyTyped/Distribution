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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHistoryOptions extends StObject {
  
  var ack: js.UndefOr[Boolean] = js.native
  
  var addID: js.UndefOr[Boolean] = js.native
  
  var aggregate: js.UndefOr[minmax | min | max | average | total | count | none] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var from: js.UndefOr[Boolean] = js.native
  
  var ignoreNull: js.UndefOr[Boolean] = js.native
  
  var instance: js.UndefOr[String] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var q: js.UndefOr[Boolean] = js.native
  
  var sessionId: js.UndefOr[js.Any] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object GetHistoryOptions {
  
  @scala.inline
  def apply(): GetHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHistoryOptions]
  }
  
  @scala.inline
  implicit class GetHistoryOptionsMutableBuilder[Self <: GetHistoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAck(value: Boolean): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckUndefined: Self = StObject.set(x, "ack", js.undefined)
    
    @scala.inline
    def setAddID(value: Boolean): Self = StObject.set(x, "addID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddIDUndefined: Self = StObject.set(x, "addID", js.undefined)
    
    @scala.inline
    def setAggregate(value: minmax | min | max | average | total | count | none): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFrom(value: Boolean): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setIgnoreNull(value: Boolean): Self = StObject.set(x, "ignoreNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreNullUndefined: Self = StObject.set(x, "ignoreNull", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setQ(value: Boolean): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setSessionId(value: js.Any): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
